package typings.loopback.mod

import typings.express.mod.NextFunction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for **all models**
  * **Inheriting from `Model`*
  * ```js
  * var properties = {...};
  * var options = {...};
  * var MyModel = loopback.Model.extend('MyModel', properties, options);
  * ``
  * **Options*
  *  - `trackChanges` - If true, changes to the model will be tracked. **Required
  * for replication.*
  * **Events*
  * #### Event: `changed
  * Emitted after a model has been successfully created, saved, or updated.
  * Argument: `inst`, model instance, objec
  * ```js
  * MyModel.on('changed', function(inst) {
  *   console.log('model with id %s has been changed', inst.id);
  *   // => model with id 1 has been changed
  * });
  * ``
  *
  * #### Event: `deleted
  * Emitted after an individual model has been deleted.
  * Argument: `id`, model ID (number)
  * ```js
  * MyModel.on('deleted', function(id) {
  *   console.log('model with id %s has been deleted', id);
  *   // => model with id 1 has been deleted
  * });
  * ``
  * #### Event: `deletedAll
  *
  * Emitted after an individual model has been deleted.
  * Argument: `where` (optional), where filter, JSON object
  * ```js
  * MyModel.on('deletedAll', function(where) {
  *   if (where) {
  *     console.log('all models where ', where, ' have been deleted');
  *     // => all models where
  *     // => {price: {gt: 100}}
  *     // => have been deleted
  *   }
  * });
  * ``
  *
  * #### Event: `attached
  * Emitted after a `Model` has been attached to an `app`
  * #### Event: `dataSourceAttached
  * Emitted after a `Model` has been attached to a `DataSource`
  * #### Event: se
  * Emitted when model property is set.
  * Argument: `inst`, model instance, objec
  * ```js
  * MyModel.on('set', function(inst) {
  *   console.log('model with id %s has been changed', inst.id);
  *   // => model with id 1 has been changed
  * });
  * ``
  *
  * @param {any} data
  * @property {string} Model.modelName The name of the model. Static property.
  * @property {DataSource} Model.dataSource Data source to which the model is connected, if any. Static property.
  * @property {any} Model.sharedMethod The `strong-remoting` [SharedClass](apidocs.strongloop.com/strong-remoting/#sharedclass) that contains remoting (and http) metadata. Static property.
  * @property {any} settings Contains additional model settings.
  * @property {string} settings.http.path Base URL of the model HTTP route.
  * @property [{string}] settings.acls Array of ACLs for the model.
  * @class
  * @constructor
  */
@JSImport("loopback", "Model")
@js.native
class Model protected () extends js.Object {
  def this(data: js.Any) = this()
  
  def afterRemote(
    method: String,
    callback: js.Function3[
      /* ctx */ Context, 
      /* modelInstanceOrNext */ this.type | NextFunction, 
      /* next */ js.UndefOr[NextFunction], 
      Unit
    ]
  ): Unit = js.native
  
  def afterRemoteError(method: String, callback: NextFunction): Unit = js.native
  
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  def beforeRemote(
    method: String,
    callback: js.Function3[
      /* ctx */ Context, 
      /* modelInstanceOrNext */ this.type | NextFunction, 
      /* next */ js.UndefOr[NextFunction], 
      Unit
    ]
  ): Unit = js.native
  
  /** Contains additional model settings. */
  var settings: Settings = js.native
}
/* static members */
@JSImport("loopback", "Model")
@js.native
object Model extends js.Object {
  
  /**
    * Check if the given access token can invoke the specified method
    * @param {AccessToken} token The access token.
    * @param {*} modelId The model ID.
    * @param {any} sharedMethod The method in question.
    * @param {any} ctx The remote invocation context.
    * @callback {() => void} callback The callback function.
    * @param {string|Error} err The error object.
    * @param {boolean} allowed True if the request is allowed; false otherwise
    */
  def checkAccess(
    token: AccessToken,
    modelId: js.Any,
    sharedMethod: js.Any,
    ctx: js.Any,
    callback: js.Function2[/* err */ String | Error, /* allowed */ Boolean, Unit]
  ): Unit = js.native
  
  /** Data source to which the model is connected, if any. */
  var dataSource: js.Any = js.native
  
  /**
    * Disable remote invocation for the method with the given name
    * @param {string} name The name of the method.
    * @param {boolean} isStatic Is the method static (eg. `MyModel.myMethod`)? Pass
    * `false` if the method defined on the prototype (eg.
    * `MyModel.prototype.myMethod`)
    */
  def disableRemoteMethod(name: String, isStatic: Boolean): Unit = js.native
  
  /**
    * Disable remote invocation for the method with the given name.
    * @param {string} name The name of the method.
    * The name of the method (include "prototype." if the method is defined on the prototype).
    */
  def disableRemoteMethodByName(name: String): Unit = js.native
  
  /**
    * Get the `Application` object to which the Model is attached
    * @callback {() => void} callback Callback function called with `(err, app)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Application} app Attached application object.
    * @end
    */
  def getApp(callback: js.Function2[/* err */ Error, /* app */ Application, Unit]): Unit = js.native
  
  /** The name of the model. */
  var modelName: String = js.native
  
  /**
    * Enabled deeply-nested queries of related models via REST API
    * @param {string} relationName Name of the nested relation.
    * @options {any} [options] It is optional. See below.
    * @param {string} pathName The HTTP path (relative to the model) at which your remote method is exposed.
    * @param {string} filterMethod The filter name.
    * @param {string} paramName The argument name that the remote method accepts.
    * @param {string} getterName The getter name.
    * @param {boolean} hooks Whether to inherit before/after hooks.
    * @callback {() => void} filterCallback The Optional filter function.
    * @param {any} SharedMethod object. See [here](apidocs.strongloop.com/strong-remoting/#sharedmethod).
    * @param {any} RelationDefinition object which includes relation `type`, `ModelConstructor` of `modelFrom`, `modelTo`, `keyFrom`, `keyTo` and more relation definitions
    */
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean
  ): Unit = js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean,
    options: js.UndefOr[scala.Nothing],
    filterCallback: js.Function2[/* SharedMethod */ js.Any, /* RelationDefinition */ js.Any, Unit]
  ): Unit = js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean,
    options: js.Object
  ): Unit = js.native
  def nestRemoting(
    relationName: String,
    pathName: String,
    filterMethod: String,
    paramName: String,
    getterName: String,
    hooks: Boolean,
    options: js.Object,
    filterCallback: js.Function2[/* SharedMethod */ js.Any, /* RelationDefinition */ js.Any, Unit]
  ): Unit = js.native
  
  /**
    * Enable remote invocation for the specified method.
    * See [Remote methods](docs.strongloop.com/display/LB/Remote+methods) for more information
    * Static method example:
    * ```js
    * Model.myMethod();
    * Model.remoteMethod('myMethod');
    * ``
    * @param {string} name The name of the method.
    * @param {RemoteMethodOptions} options The remoting options.
    * See [Remote methods - Options](docs.strongloop.com/display/LB/Remote+methods#Remotemethods-Options)
    */
  def remoteMethod(name: String, options: RemoteMethodOptions): Unit = js.native
  
  /**
    * The `loopback.Model.extend()` method calls this when you create a model that extends another model.
    * Add any setup or configuration code you want executed when the model is created.
    * See  [Setting up a custom model](docs.strongloop.com/display/LB/Extending+built-in+models#Extendingbuilt-inmodels-Settingupacustommodel)
    */
  def setup(): Unit = js.native
  
  /** The `strong-remoting` */
  var sharedMethod: js.Any = js.native
}
