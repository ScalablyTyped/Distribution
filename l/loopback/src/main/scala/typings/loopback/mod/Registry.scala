package typings.loopback.mod

import typings.loopback.AnonConnector
import typings.loopback.AnonDataSourceRelations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define and reference `Models` and `anys`
  * @clas
  */
@JSImport("loopback", "Registry")
@js.native
class Registry () extends js.Object {
  /**
    * Alter an existing Model class.
    * @param {Model} ModelCtor The model constructor to alter.
    * @options {any} config Additional configuration to apply
    * @property {any} dataSource Attach the model to a dataSource.
    * @property {any} [relations] Model relations to add/update
    * @header loopback.configureModel(ModelCtor, config
    */
  def configureModel(ModelCtor: Model, config: AnonDataSourceRelations): Unit = js.native
  /**
    * Create a data source with passing the provided options to the connector
    * @param {string} name Optional name.
    * @options {any} options Data Source options
    * @property {any} connector LoopBack connector.
    * @property {*} [*] Other&nbsp;connector properties.
    *   See the relevant connector documentation
    */
  def createDataSource(name: String, options: AnonConnector): Unit = js.native
  /**
    * Create a named vanilla JavaScript class constructor with an attached
    * set of properties and options
    * This function comes with two variants:
    *  * `loopback.createModel(name, properties, options)`
    *  * `loopback.createModel(config)
    * In the second variant, the parameters `name`, `properties` and `options`
    * are provided in the config object. Any additional config entries are
    * interpreted as `options`, i.e. the following two configs are identical
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
    * @param {string|() => void} modelOrName The model name or a `Model` constructor.
    * @returns {Model} The model clas
    * @header loopback.findModel(modelName
    */
  def findModel(modelOrName: String): Model = js.native
  /**
    * Look up a model class by name from all models created by
    * `loopback.createModel()`. **Throw an error when no such model exists.*
    * @param {string} modelOrName The model name or a `Model` constructor.
    * @returns {Model} The model clas
    * @header loopback.getModel(modelName
    */
  def getModel(modelOrName: String): Model = js.native
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
}

/* static members */
@JSImport("loopback", "Registry")
@js.native
object Registry extends js.Object {
  def addACL(acls: js.Array[_], acl: js.Any): Unit = js.native
}

