package typings.loopback.mod

import typings.loopback.anon.Connector
import typings.loopback.anon.Relations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface CookieOptions extends core.CookieOptions { }
// interface Errback extends core.Errback { }
// interface ErrorRequestHandler extends core.ErrorRequestHandler { }
// interface Express extends core.Express { }
// interface Handler extends core.Handler { }
// interface Route extends core.IRoute { }
// interface Routers<T> extends core.IRouter<T> { }
// interface RouterMatcher<T> extends core.IRouterMatcher<T> { }
// interface MediaType extends core.MediaType { }
// interface NextFunction extends core.NextFunction { }
// interface Request extends core.Request { }
// interface RequestHandler extends core.RequestHandler { }
// interface RequestParamHandler extends core.RequestParamHandler { }
// export interface Response extends core.Response { }
// interface Router extends core.Router { }
// interface Send extends core.Send { }
/**
  * LoopBack core module. It provides static properties and
  * methods to create models and data sources. The module itself is a function
  * that creates loopback `app`. For example:
  *
  * ```js
  * var loopback = require('loopback');
  * var app = loopback();
  * ```
  *
  * @property {string} version Version of LoopBack framework.  Static read-only property.
  * @property {string} mime
  * @property {boolean} isBrowser True if running in a browser environment; false otherwise.  Static read-only property.
  * @property {boolean} isServer True if running in a server environment; false otherwise.  Static read-only property.
  * @property {Registry} registry The global `Registry` object.
  * @property {string} faviconFile Path to a default favicon shipped with LoopBack.
  * Use as follows: `app.use(require('serve-favicon')(loopback.faviconFile));`
  * @class loopback
  * @header loopback
  */
@JSImport("loopback", "loopback")
@js.native
class loopback () extends js.Object {
  /** Path to a default favicon shipped with LoopBack.
    * Use as follows: `app.use(require('serve-favicon')(loopback.faviconFile));`
    */
  var faviconFile: String = js.native
  /** True if running in a browser environment; false otherwise.  Static read-only property. */
  var isBrowser: Boolean = js.native
  /** True if running in a server environment; false otherwise.  Static read-only property. */
  var isServer: Boolean = js.native
  /** Mime */
  var mime: String = js.native
  /** The global `Registry` object. */
  var registry: Registry = js.native
  /** Version of LoopBack framework.  Static read-only property. */
  var version: String = js.native
}

/* static members */
@JSImport("loopback", "loopback")
@js.native
object loopback extends js.Object {
  /**
    * Alter an existing Model class.
    * @param {Model} ModelCtor The model constructor to alter.
    * @options {any} config Additional configuration to apply
    * @property {any} dataSource Attach the model to a dataSource.
    * @property {any} [relations] Model relations to add/update
    * @header loopback.configureModel(ModelCtor, config
    */
  def configureModel(ModelCtor: Model, config: Relations): Unit = js.native
  /**
    * Create a data source with passing the provided options to the connector
    * @param {string} name Optional name.
    * @options {any} options Data Source options
    * @property {any} connector LoopBack connector.
    * @property {*} [*] Other&nbsp;connector properties.
    * See the relevant connector documentation
    */
  def createDataSource(name: String, options: Connector): Unit = js.native
  /**
    * Create a named vanilla JavaScript class constructor with an attached
    * set of properties and options
    * This function comes with two variants:
    *  * `loopback.createModel(name, properties, options)`
    *  * `loopback.createModel(config)
    * In the second variant, the parameters `name`, `properties` and `options`
    * are provided in the config object. Any additional config entries are
    * interpreted as `options`, i.e. the following two configs are identical
    *
    * ```js
    * { name: 'Customer', base: 'User' }
    * { name: 'Customer', options: { base: 'User' } }
    * ``
    * **Example*
    * Create an `Author` model using the three-parameter variant
    * ```js
    * loopback.createModel(
    *   'Author',
    *   {
    *     firstName: 'string',
    *     lastName: 'string'
    *   },
    *   {
    *     relations: {
    *       books: {
    *         model: 'Book',
    *         type: 'hasAndBelongsToMany'
    *       }
    *     }
    *   }
    * );
    * ``
    * Create the same model using a config object
    * ```js
    * loopback.createModel({
    *   name: 'Author',
    *   properties: {
    *     firstName: 'string',
    *     lastName: 'string'
    *   },
    *   relations: {
    *     books: {
    *       model: 'Book',
    *       type: 'hasAndBelongsToMany'
    *     }
    *   }
    * });
    * ``
    * @param {string} name Unique name.
    * @param {any} properties
    * @param {any} options (optional
    * @header loopback.createMode
    */
  def createModel(name: String, properties: js.Any, options: js.Any): Unit = js.native
  /**
    * Look up a model class by name from all models created by
    * `loopback.createModel()`
    * @param {string} modelName The model name
    * @returns {Model} The model clas
    * @header loopback.findModel(modelName
    */
  def findModel(modelName: String): Model = js.native
  /**
    * Look up a model class by name from all models created by
    * `loopback.createModel()`. Throw an error when no such model exists
    * @param {string} modelName The model name
    * @returns {Model} The model clas
    * @header loopback.getModel(modelName
    */
  def getModel(modelName: String): Model = js.native
  /**
    * Look up a model class by the base model class.
    * The method can be used by LoopBack
    * to find configured models in models.json over the base model.
    * @param {Model} modelType The base model class
    * @returns {Model} The subclass if found or the base clas
    * @header loopback.getModelByType(modelType
    */
  def getModelByType(modelType: Model): Model = js.native
  /**
    * Get an in-memory data source. Use one if it already exists
    * @param {string} [name] The name of the data source.
    * If not provided, the `'default'` is used
    */
  def memory(): Unit = js.native
  def memory(name: String): Unit = js.native
  /**
    * Add a remote method to a model.
    * @param {() => void} fn
    * @param {any} options (optional
    */
  def remoteMethod(fn: js.Function0[Unit], options: js.Any): Unit = js.native
  /**
    * Create a template helper
    *     var render = loopback.template('foo.ejs');
    *     var html = render({foo: 'bar'})
    * @param {string} path Path to the template file.
    * @returns {() => void
    */
  def template(path: String): Unit = js.native
}

