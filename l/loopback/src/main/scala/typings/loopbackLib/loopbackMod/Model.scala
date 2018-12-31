package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class Model protected ()
  extends loopbackLib.loopbackMod.lNs.Model {
  def this(data: js.Any) = this()
  /** Contains additional model settings. */
  /* CompleteClass */
  override var settings: loopbackLib.loopbackMod.lNs.Settings = js.native
  /* CompleteClass */
  override def afterRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def afterRemoteError(method: java.lang.String, callback: expressLib.expressMod.eNs.NextFunction): scala.Unit = js.native
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  /* CompleteClass */
  override def beforeRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ loopbackLib.loopbackMod.lNs.Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

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
object Model extends js.Object {
  /** Data source to which the model is connected, if any. */
  var dataSource: js.Any = js.native
  /** The name of the model. */
  var modelName: java.lang.String = js.native
  /** The `strong-remoting` */
  var sharedMethod: js.Any = js.native
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
    token: loopbackLib.loopbackMod.lNs.AccessToken,
    modelId: js.Any,
    sharedMethod: js.Any,
    ctx: js.Any,
    callback: js.Function2[/* err */ java.lang.String | nodeLib.Error, /* allowed */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Disable remote invocation for the method with the given name
    * @param {string} name The name of the method.
    * @param {boolean} isStatic Is the method static (eg. `MyModel.myMethod`)? Pass
    * `false` if the method defined on the prototype (eg.
    * `MyModel.prototype.myMethod`)
    */
  def disableRemoteMethod(name: java.lang.String, isStatic: scala.Boolean): scala.Unit = js.native
  /**
    * Disable remote invocation for the method with the given name.
    * @param {string} name The name of the method.
    * The name of the method (include "prototype." if the method is defined on the prototype).
    */
  def disableRemoteMethodByName(name: java.lang.String): scala.Unit = js.native
  /**
    * Get the `Application` object to which the Model is attached
    * @callback {() => void} callback Callback function called with `(err, app)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Application} app Attached application object.
    * @end
    */
  def getApp(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* app */ loopbackLib.loopbackMod.lNs.Application, 
      scala.Unit
    ]
  ): scala.Unit = js.native
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
    relationName: java.lang.String,
    pathName: java.lang.String,
    filterMethod: java.lang.String,
    paramName: java.lang.String,
    getterName: java.lang.String,
    hooks: scala.Boolean
  ): scala.Unit = js.native
  def nestRemoting(
    relationName: java.lang.String,
    pathName: java.lang.String,
    filterMethod: java.lang.String,
    paramName: java.lang.String,
    getterName: java.lang.String,
    hooks: scala.Boolean,
    options: js.Object
  ): scala.Unit = js.native
  def nestRemoting(
    relationName: java.lang.String,
    pathName: java.lang.String,
    filterMethod: java.lang.String,
    paramName: java.lang.String,
    getterName: java.lang.String,
    hooks: scala.Boolean,
    options: js.Object,
    filterCallback: js.Function2[/* SharedMethod */ js.Any, /* RelationDefinition */ js.Any, scala.Unit]
  ): scala.Unit = js.native
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
  def remoteMethod(name: java.lang.String, options: loopbackLib.loopbackMod.lNs.RemoteMethodOptions): scala.Unit = js.native
  /**
    * The `loopback.Model.extend()` method calls this when you create a model that extends another model.
    * Add any setup or configuration code you want executed when the model is created.
    * See  [Setting up a custom model](docs.strongloop.com/display/LB/Extending+built-in+models#Extendingbuilt-inmodels-Settingupacustommodel)
    */
  def setup(): scala.Unit = js.native
}

