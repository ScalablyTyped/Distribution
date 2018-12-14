package typings
package loopbackLib.loopbackMod.lNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
       * The `App` object represents a Loopback application
       * The App object extends [Express](expressjs.com/api.html#express) and
       * supports Express middleware. See
       * [Express documentation](expressjs.com) for details
       * ```js
       * var loopback = require('loopback');
       * var app = loopback()
       * app.get('/', function(req, res){
       *   res.send('hello world');
       * })
       * app.listen(3000);
       * ``
       * @class LoopBackApplication
       * @header var app = loopback();
       */

// interface ILoopbackAplication extends express.Application { };
@js.native
trait LoopBackApplication
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Application {
  /**
               * Register a connector
               * When a new data-source is being added via `app.dataSource`, the connector
               * name is looked up in the registered connectors first
               * Connectors are required to be explicitly registered only for applications
               * using browserify, because browserify does not support dynamic require,
               * which is used by LoopBack to automatically load the connector module
               * @param {string} name Name of the connector, e.g. 'mysql'.
               * @param {any} connector Connector object as returne
               *    by `require('loopback-connector-{name}')`
               */
  def connector(name: java.lang.String, connector: js.Any): scala.Unit = js.native
  /**
               * Define a DataSource
               * @param {string} name The data source name
               * @param {any} config The data source confi
               */
  def dataSource(name: java.lang.String, config: js.Any): scala.Unit = js.native
  /**
               * Register (new) middleware phases.
               *
               * If all names are new, then the phases are added just before "routes" phase.
               * Otherwise the provided list of names is merged with the existing phases
               * in such way that the order of phases is preserved
               *
               * **Examples*
               * ```js
               * // built-in phases:
               * // initial, session, auth, parse, routes, files, fina
               *
               * app.defineMiddlewarePhases('custom');
               * // new list of phases
               * // initial, session, auth, parse, custom, routes, files, fina
               * app.defineMiddlewarePhases([
               * 'initial', 'postinit', 'preauth', 'routes', 'subapps'
               * ]);
               * // new list of phases
               * // initial, postinit, preauth, session, auth, parse, custom,
               * // routes, subapps, files, final
               * ``
               * @param {string|string[]} nameOrArray A phase name or a list of phase
               * names to add
               * @returns {any} this (fluent API
               * @header app.defineMiddlewarePhases(nameOrArray
               */
  def defineMiddlewarePhases(nameOrArray: java.lang.String): js.Any = js.native
  /**
               * Register (new) middleware phases.
               *
               * If all names are new, then the phases are added just before "routes" phase.
               * Otherwise the provided list of names is merged with the existing phases
               * in such way that the order of phases is preserved
               *
               * **Examples*
               * ```js
               * // built-in phases:
               * // initial, session, auth, parse, routes, files, fina
               *
               * app.defineMiddlewarePhases('custom');
               * // new list of phases
               * // initial, session, auth, parse, custom, routes, files, fina
               * app.defineMiddlewarePhases([
               * 'initial', 'postinit', 'preauth', 'routes', 'subapps'
               * ]);
               * // new list of phases
               * // initial, postinit, preauth, session, auth, parse, custom,
               * // routes, subapps, files, final
               * ``
               * @param {string|string[]} nameOrArray A phase name or a list of phase
               * names to add
               * @returns {any} this (fluent API
               * @header app.defineMiddlewarePhases(nameOrArray
               */
  def defineMiddlewarePhases(nameOrArray: js.Array[java.lang.String]): js.Any = js.native
  /**
               *  Enable app wide authentication
               */
  def enableAuth(): scala.Unit = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(name: java.lang.String): js.Any = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(name: java.lang.String, paths: java.lang.String): js.Any = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(
    name: java.lang.String,
    paths: java.lang.String,
    handler: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler
  ): js.Any = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(name: java.lang.String, paths: js.Array[_]): js.Any = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(
    name: java.lang.String,
    paths: js.Array[_],
    handler: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler
  ): js.Any = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(name: java.lang.String, paths: stdLib.RegExp): js.Any = js.native
  /**
               * Register a middleware handler to be executed in a given phase.
               * @param {string} name The phase name, e.g. "init" or "routes".
               * @param {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware.
               *   string paths are interpreted as expressjs path patterns,
               *   regular expressions are used as-is.
               * @param {function} handler The middleware handler, one of
               *   `function(req, res, next)` or
               *   `function(err, req, res, next)`
               * @returns {any} this (fluent API
               * @header app.middleware(name, handler
               */
  def middleware(
    name: java.lang.String,
    paths: stdLib.RegExp,
    handler: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler
  ): js.Any = js.native
  /**
               * Register a middleware using a factory function and a JSON config
               * **Example*
               * ```js
               * app.middlewareFromConfig(compression, {
               *   enabled: true,
               *   phase: 'initial',
               *   params: {
               *     threshold: 128
               *   }
               * });
               * ``
               * @param {function} factory The factory function creating a middleware handler.
               *   Typically a result of `require()` call, e.g. `require('compression')`.
               * @options {any} config The configuration.
               * @property {string} phase The phase to register the middleware in.
               * @property {boolean} [enabled] Whether the middleware is enabled.
               *   Default: `true`.
               * @property {Array|*} [params] The arguments to pass to the factory
               *   function. Either an Array of arguments,
               *   or the value of the first argument when the factory expects
               *   a single argument only.
               * @property {Array|string|RegExp} [paths] Optional list of paths limiting
               *   the scope of the middleware
               * @returns {any} this (fluent API
               * @header app.middlewareFromConfig(factory, config
               */
  def middlewareFromConfig(factory: js.Function0[scala.Unit], config: loopbackLib.Anon_Paths): js.Any = js.native
  /**
               * Listen for connections and update the configured port
               * When there are no parameters or there is only one callback parameter,
               * the server will listen on `app.get('host')` and `app.get('port')`
               * For example, to listen on host/port configured in app config:
               * ```js
               * app.listen();
               * ``
               * Otherwise all arguments are forwarded to `http.Server.listen`
               * For example, to listen on the specified port and all hosts, and ignore app config.
               * ```js
               * app.listen(80);
               * ``
               * The function also installs a `listening` callback that calls
               * `app.set('port')` with the value returned by `server.address().port`.
               * This way the port param contains always the real port number, even when
               * listen was called with port number 0
               * @param {() => void} [cb] If specified, the callback is added as a listener
               *   for the server's "listening" event.
               * @returns {any} http.Server A node `http.Server` with this application configured
               *   as the request handle
               * listen(cb?: () => void):http.Serve
               *
               */
  // listen(port?: number, cb?: () => void): any;
  /**
               * Attach a model to the app. The `Model` will be available on the
               * `app.models` object
               * Example - Attach an existing mode
               * ```js
               * var User = loopback.User;
               * app.model(User)
               * ```
               * Example - Attach an existing model, alter some aspects of the model:
               * ```js
               * var User = loopback.User;
               * app.model(User, { dataSource: 'db' })
               * ``
               * @param {any|string} Model The model to attach
               * @options {any} config The model's configuration
               * @property {string|any} dataSource The `DataSource` to which to attach the model
               * @property {boolean} [public] Whether the model should be exposed via REST API
               * @property {any} [relations] Relations to add/update
               * @en
               * @returns {any} the model clas
               */
  def model(Model: java.lang.String, config: loopbackLib.Anon_RelationsDataSource): js.Any = js.native
  /**
               * Listen for connections and update the configured port
               * When there are no parameters or there is only one callback parameter,
               * the server will listen on `app.get('host')` and `app.get('port')`
               * For example, to listen on host/port configured in app config:
               * ```js
               * app.listen();
               * ``
               * Otherwise all arguments are forwarded to `http.Server.listen`
               * For example, to listen on the specified port and all hosts, and ignore app config.
               * ```js
               * app.listen(80);
               * ``
               * The function also installs a `listening` callback that calls
               * `app.set('port')` with the value returned by `server.address().port`.
               * This way the port param contains always the real port number, even when
               * listen was called with port number 0
               * @param {() => void} [cb] If specified, the callback is added as a listener
               *   for the server's "listening" event.
               * @returns {any} http.Server A node `http.Server` with this application configured
               *   as the request handle
               * listen(cb?: () => void):http.Serve
               *
               */
  // listen(port?: number, cb?: () => void): any;
  /**
               * Attach a model to the app. The `Model` will be available on the
               * `app.models` object
               * Example - Attach an existing mode
               * ```js
               * var User = loopback.User;
               * app.model(User)
               * ```
               * Example - Attach an existing model, alter some aspects of the model:
               * ```js
               * var User = loopback.User;
               * app.model(User, { dataSource: 'db' })
               * ``
               * @param {any|string} Model The model to attach
               * @options {any} config The model's configuration
               * @property {string|any} dataSource The `DataSource` to which to attach the model
               * @property {boolean} [public] Whether the model should be exposed via REST API
               * @property {any} [relations] Relations to add/update
               * @en
               * @returns {any} the model clas
               */
  def model(Model: js.Any, config: loopbackLib.Anon_RelationsDataSource): js.Any = js.native
  /**
               * Get the models exported by the app. Returns only models defined using `app.model()
               * There are two ways to access models
               * 1.  Call `app.models()` to get a list of all models
               * ```js
               * var models = app.models()
               * models.forEach(function(Model) {
               *  console.log(Model.modelName); // color
               * });
               * ```
               * 2. Use `app.model` to access a model by name.
               * `app.models` has properties for all defined models
               * The following example illustrates accessing the `Product` and `CustomerReceipt` models
               * using the `models` object
               * ```js
               * var loopback = require('loopback');
               *  var app = loopback();
               *  app.boot({
               *   dataSources: {
               *     db: {connector: 'memory'}
               *   }
               * })
               * app.model('product', {dataSource: 'db'});
               * app.model('customer-receipt', {dataSource: 'db'})
               * // available based on the given name
               * var Product = app.models.Product
               * // also available as camelCase
               * var product = app.models.product
               * // multi-word models are avaiable as pascal cased
               * var CustomerReceipt = app.models.CustomerReceipt
               * // also available as camelCase
               * var customerReceipt = app.models.customerReceipt;
               * ``
               *  @returns {Array} Array of model classes
               */
  def models(): js.Array[org.scalablytyped.runtime.Instantiable1[/* data */ js.Any, Model]] = js.native
  /**
               * Get all remote objects.
               * @returns {any} [Remote objects](apidocs.strongloop.com/strong-remoting/#remoteObjectsoptions).
               */
  def remoteObjects(): js.Any = js.native
  /**
               * Lazily load a set of [remote objects](apidocs.strongloop.com/strong-remoting/#remoteObjectsoptions).
               *
               * *NOTE:** Calling `app.remotes()` more than once returns only a single set of remote objects.
               * @returns {any} remoteObjects
               */
  def remotes(): js.Any = js.native
  def start(): scala.Unit = js.native
}

