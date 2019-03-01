package typings
package loopbackLib.loopbackMod.lNs

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
trait Model extends js.Object {
  /** Contains additional model settings. */
  var settings: Settings
  def afterRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit
  def afterRemoteError(method: java.lang.String, callback: expressLib.expressMod.eNs.NextFunction): scala.Unit
  /**
    * loopback 3.x Remote hooks
    * http://loopback.io/doc/en/lb3/Remote-hooks.html
    * @param method
    * @param backback
    */
  def beforeRemote(
    method: java.lang.String,
    callback: js.Function3[
      /* ctx */ Context, 
      /* modelInstanceOrNext */ this.type | expressLib.expressMod.eNs.NextFunction, 
      /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
      scala.Unit
    ]
  ): scala.Unit
}

object Model {
  @scala.inline
  def apply(
    afterRemote: js.Function2[
      java.lang.String, 
      js.Function3[
        /* ctx */ Context, 
        /* modelInstanceOrNext */ Model | expressLib.expressMod.eNs.NextFunction, 
        /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
        scala.Unit
      ], 
      scala.Unit
    ],
    afterRemoteError: js.Function2[java.lang.String, expressLib.expressMod.eNs.NextFunction, scala.Unit],
    beforeRemote: js.Function2[
      java.lang.String, 
      js.Function3[
        /* ctx */ Context, 
        /* modelInstanceOrNext */ Model | expressLib.expressMod.eNs.NextFunction, 
        /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
        scala.Unit
      ], 
      scala.Unit
    ],
    settings: Settings
  ): Model = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterRemote")(afterRemote)
    __obj.updateDynamic("afterRemoteError")(afterRemoteError)
    __obj.updateDynamic("beforeRemote")(beforeRemote)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Model]
  }
}

