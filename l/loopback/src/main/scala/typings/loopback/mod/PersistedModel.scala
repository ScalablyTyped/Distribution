package typings.loopback.mod

import typings.loopback.anon.Conflicts
import typings.loopback.anon.Created
import typings.loopback.anon.Fields
import typings.loopback.anon.Include
import typings.loopback.anon.Info
import typings.loopback.anon.Order
import typings.loopback.anon.Throws
import typings.loopback.anon.Validate
import typings.loopback.anon.Where
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extends Model with basic query and CRUD support
  * **Change Event*
  * Listen for model changes using the `change` event
  * ```js
  * MyPersistedModel.on('changed', function(obj)
  *    console.log(obj) // => the changed model
  * });
  * ```
  * @class PersistedModel
  */
@JSImport("loopback", "PersistedModel")
@js.native
class PersistedModel protected () extends Model {
  def this(data: js.Any) = this()
  
  /**
    * Deletes the model from persistence.
    * Triggers `destroy` hook (async) before and after destroying object.
    */
  def destroy(): js.Promise[Unit] = js.native
  /**
    * Deletes the model from persistence.
    * Triggers `destroy` hook (async) before and after destroying object.
    * @param {() => void} callback Callback function
    */
  def destroy(callback: CallbackWithoutResult): Unit = js.native
  
  /**
    * Get the `id` value for the `PersistedModel`
    * @returns {*} The `id` valu
    */
  def getId(): js.Any = js.native
  
  /**
    * Get the `id` property name of the constructor
    * @returns {string} The `id` property nam
    */
  def getIdName(): String = js.native
  
  /**
    * Determine if the data model is new.
    * @returns {boolean} Returns true if the data model is new; false otherwise
    */
  def isNewRecord(): Boolean = js.native
  
  /**
    * Reload object from persistence.  Requires `id` member of `object` to be able to call `find`.
    */
  def reload[T](): js.Promise[T] = js.native
  /**
    * Reload object from persistence.  Requires `id` member of `object` to be able to call `find`.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance
    */
  def reload[T](callback: CallbackWithResult[T]): Unit = js.native
  
  /**
    * Replace attributes for a model instance and persist it into the datasource.
    * Performs validation before replacing
    * @param {any} data Data to replace.
    * @options {any} [options] Options for replace
    * @property {boolean} validate Perform validation before saving.  Default is true.
    */
  def replaceAttributes[T](data: js.Any): js.Promise[T] = js.native
  /**
    * Replace attributes for a model instance and persist it into the datasource.
    * Performs validation before replacing
    * @param {any} data Data to replace.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Replaced instance
    */
  def replaceAttributes[T](data: js.Any, callback: CallbackWithResult[T]): Unit = js.native
  def replaceAttributes[T](data: js.Any, options: Validate): js.Promise[T] = js.native
  /**
    * Replace attributes for a model instance and persist it into the datasource.
    * Performs validation before replacing
    * @param {any} data Data to replace.
    * @options {any} [options] Options for replace
    * @property {boolean} validate Perform validation before saving.  Default is true.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Replaced instance
    */
  def replaceAttributes[T](data: js.Any, options: Validate, callback: CallbackWithResult[T]): Unit = js.native
  
  /**
    * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
    * Triggers: validate, save, update, or create.
    * @options {any} [options] See below.
    * @property {boolean} validate Perform validation before saving.  Default is true.
    * @property {boolean} throws If true, throw a validation error; WARNING: This can crash Node.
    * If false, report the error via callback.  Default is false.
    */
  def save[T](): js.Promise[T] = js.native
  /**
    * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
    * Triggers: validate, save, update, or create.
    * @callback {() => void} callback Optional callback function called with `(err, obj)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance saved or created
    */
  def save[T](callback: CallbackWithResult[T]): Unit = js.native
  def save[T](options: Throws): js.Promise[T] = js.native
  /**
    * Save model instance. If the instance doesn't have an ID, then calls [create](#persistedmodelcreatedata-cb) instead.
    * Triggers: validate, save, update, or create.
    * @options {any} [options] See below.
    * @property {boolean} validate Perform validation before saving.  Default is true.
    * @property {boolean} throws If true, throw a validation error; WARNING: This can crash Node.
    * If false, report the error via callback.  Default is false.
    * @callback {() => void} callback Optional callback function called with `(err, obj)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance saved or created
    */
  def save[T](options: Throws, callback: CallbackWithResult[T]): Unit = js.native
  
  /**
    * Set the correct `id` property for the `PersistedModel`. Uses the `setId` method if the model is attached to
    * connector that defines it.  Otherwise, uses the default lookup.
    * Override this method to handle complex IDs
    * @param {*} val The `id` value. Will be converted to the type that the `id` property specifies
    */
  def setId(`val`: js.Any): Unit = js.native
  
  /**
    * Update a single attribute.
    * Equivalent to `updateAttributes({name: 'value'}, cb)
    * @param {string} name Name of property.
    * @param {any} value Value of property.
    */
  def updateAttribute[T](name: String, value: js.Any): js.Promise[T] = js.native
  /**
    * Update a single attribute.
    * Equivalent to `updateAttributes({name: 'value'}, cb)
    * @param {string} name Name of property.
    * @param {any} value Value of property.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Updated instance
    */
  def updateAttribute[T](name: String, value: js.Any, callback: CallbackWithResult[T]): Unit = js.native
  
  /**
    * Update set of attributes.  Performs validation before updating
    * Triggers: `validation`, `save` and `update` hooks
    * @param {any} data Data to update.
    */
  def updateAttributes[T](data: js.Any): js.Promise[T] = js.native
  /**
    * Update set of attributes.  Performs validation before updating
    * Triggers: `validation`, `save` and `update` hooks
    * @param {any} data Data to update.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Updated instance
    */
  def updateAttributes[T](data: js.Any, callback: CallbackWithResult[T]): Unit = js.native
}
object PersistedModel {
  
  @JSImport("loopback", "PersistedModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Apply an update list
    * **Note: this is not atomic*
    * @param  {Array} updates An updates list, usually from [createUpdates()](#persistedmodel-createupdates).
    * @param {any} options An optional options object to pass to underlying data-access calls.
    * @param  {() => void} callback Callback function
    */
  /* static member */
  inline def bulkUpdate(updates: js.Array[js.Any], options: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bulkUpdate")(updates.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /**
    * Apply an update list
    * **Note: this is not atomic*
    * @param  {Array} updates An updates list, usually from [createUpdates()](#persistedmodel-createupdates).
    * @param {any} options An optional options object to pass to underlying data-access calls.
    * @param  {() => void} callback Callback function
    */
  /* static member */
  inline def bulkUpdate(updates: js.Array[js.Any], options: js.Any, callback: CallbackWithoutResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bulkUpdate")(updates.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get the changes to a model since the specified checkpoint. Provide a filter object
    * to reduce the number of results returned.
    * @param  {number} since Return only changes since this checkpoint.
    * @param  {any}   filter   Include only changes that match this filter, the same as for [#persistedmodel-find](find()).
    * @callback {() => void} callback Callback function called with `(err, changes)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} changes An Array of [Change](#change) objects
    */
  /* static member */
  inline def changes(since: Double, filter: js.Any): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("changes")(since.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  /**
    * Get the changes to a model since the specified checkpoint. Provide a filter object
    * to reduce the number of results returned.
    * @param  {number} since Return only changes since this checkpoint.
    * @param  {any}   filter   Include only changes that match this filter, the same as for [#persistedmodel-find](find()).
    * @callback {() => void} callback Callback function called with `(err, changes)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} changes An Array of [Change](#change) objects
    */
  /* static member */
  inline def changes(since: Double, filter: js.Any, callback: CallbackWithResult[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changes")(since.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a checkpoint
    * @param  {() => void} callback
    */
  /* static member */
  inline def checkpoint(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkpoint")().asInstanceOf[Unit]
  inline def checkpoint(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkpoint")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Create a checkpoint
    */
  /* static member */
  inline def checkpoint_Promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkpoint")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Return the number of records that match the optional "where" filter.
    * @param {any} [where] Optional where filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @callback {() => void} callback Callback function called with `(err, count)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {number} count number of instances updated
    */
  /* static member */
  inline def count(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[js.Promise[Double]]
  inline def count(where: js.Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(where.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  /**
    * Return the number of records that match the optional "where" filter.
    * @param {any} [where] Optional where filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @callback {() => void} callback Callback function called with `(err, count)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {number} count number of instances updated
    */
  /* static member */
  inline def count(where: js.Any, callback: CallbackWithResult[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(where.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create new instance of Model, and save to database
    * @param {any}|[{any}] data Optional data argument.  Can be either a single model instance or an Array of instances
    * @returns {T | T[]} Model instances or null
    */
  /* static member */
  inline def create[T](): js.Promise[T | js.Array[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[T | js.Array[T] | Null]]
  inline def create[T](data: js.Any): js.Promise[T | js.Array[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | js.Array[T] | Null]]
  /**
    * Create new instance of Model, and save to database
    * @param {any}|[{any}] data Optional data argument.  Can be either a single model instance or an Array of instances
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} models Model instances or null
    */
  /* static member */
  inline def create[T](data: js.Any, callback: CallbackWithResult[T | js.Array[T] | Null]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create[T](data: js.Array[js.Any]): js.Promise[T | js.Array[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | js.Array[T] | Null]]
  inline def create[T](data: js.Array[js.Any], callback: CallbackWithResult[T | js.Array[T] | Null]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create a change stream. See here for more info http://loopback.io/doc/en/lb2/Realtime-server-sent-events.html
    * @param {any} options Only changes to models matching this where filter will be included in the ChangeStream.
    * @returns {any} changes
    */
  /* static member */
  inline def createChangeStream(options: Where): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangeStream")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  /**
    * Create a change stream. See here for more info http://loopback.io/doc/en/lb2/Realtime-server-sent-events.html
    * @param {any} options Only changes to models matching this where filter will be included in the ChangeStream.
    * @param {() => void} callback
    */
  /* static member */
  inline def createChangeStream(options: Where, callback: CallbackWithResult[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createChangeStream")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create an update list (for `Model.bulkUpdate()`) from a delta list
    * (result of `Change.diff()`)
    * @param  {Array}    deltas
    */
  /* static member */
  inline def createUpdates(deltas: js.Array[js.Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdates")(deltas.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Create an update list (for `Model.bulkUpdate()`) from a delta list
    * (result of `Change.diff()`)
    * @param  {Array}    deltas
    * @param  {() => void} callback
    */
  /* static member */
  inline def createUpdates(deltas: js.Array[js.Any], callback: CallbackWithoutResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUpdates")(deltas.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get the current checkpoint ID
    * @returns {Promise<number>} resolves to currentCheckpointId
    */
  /* static member */
  inline def currentCheckpoint(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("currentCheckpoint")().asInstanceOf[js.Promise[Double]]
  /**
    * Get the current checkpoint ID
    * @callback {() => void} callback Callback function called with `(err, currentCheckpointId)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {number} currentCheckpointId Current checkpoint ID
    */
  /* static member */
  inline def currentCheckpoint(callback: CallbackWithResult[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("currentCheckpoint")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Destroy all model instances that match the optional `where` specification
    * @param {any} [where] Optional where filter, like:
    * ```
    * {key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods)
    *
    * @returns {Promise<{ count: number }>} number of instances (rows, documents) destroyed
    */
  /* static member */
  inline def destroyAll(): js.Promise[Info] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")().asInstanceOf[js.Promise[Info]]
  inline def destroyAll(where: js.Any): js.Promise[Info] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")(where.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Info]]
  /**
    * Destroy all model instances that match the optional `where` specification
    * @param {any} [where] Optional where filter, like:
    * ```
    * {key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods)
    *
    * @callback {() => void} callback Optional callback function called with `(err, info)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} info Additional information about the command outcome.
    * @param {number} info.count number of instances (rows, documents) destroyed
    */
  /* static member */
  inline def destroyAll(where: js.Any, callback: CallbackWithMultipleResults[js.Any, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")(where.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Destroy model instance with the specified ID.
    * @param {*} id The ID value of model instance to delete.
    */
  /* static member */
  inline def destroyById(id: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Destroy model instance with the specified ID.
    * @param {*} id The ID value of model instance to delete.
    * @callback {() => void} callback Callback function called with `(err)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object)
    */
  /* static member */
  inline def destroyById(id: js.Any, callback: CallbackWithoutResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyById")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get a set of deltas and conflicts since the given checkpoint
    * See [Change.diff()](#change-diff) for details
    * @param  {number}  since  Find deltas since this checkpoint.
    * @param  {Array}  remoteChanges  An Array of change objects.
    */
  /* static member */
  inline def diff(since: Double, remoteChanges: js.Array[js.Any]): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(since.asInstanceOf[js.Any], remoteChanges.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  /**
    * Get a set of deltas and conflicts since the given checkpoint
    * See [Change.diff()](#change-diff) for details
    * @param  {number}  since  Find deltas since this checkpoint.
    * @param  {Array}  remoteChanges  An Array of change objects.
    * @callback {() => void} callback Callback function called with `(err, result)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} result any with `deltas` and `conflicts` properties; see [Change.diff()](#change-diff) for details
    */
  /* static member */
  inline def diff(since: Double, remoteChanges: js.Array[js.Any], callback: CallbackWithResult[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(since.asInstanceOf[js.Any], remoteChanges.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Enable the tracking of changes made to the model. Usually for replication.
    */
  /* static member */
  inline def enableChangeTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableChangeTracking")().asInstanceOf[Unit]
  
  /**
    * Check whether a model instance exists in database
    * @param {id} id Identifier of object (primary key value)
    */
  /* static member */
  inline def exists(id: js.Any): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  /**
    * Check whether a model instance exists in database
    * @param {id} id Identifier of object (primary key value)
    * @callback {() => void} callback Callback function called with `(err, exists)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {boolean} exists True if the instance with the specified ID exists; false otherwise
    */
  /* static member */
  inline def exists(id: js.Any, callback: CallbackWithResult[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Find all model instances that match `filter` specification.
    * See [Querying models](docs.strongloop.com/display/LB/Querying+models)
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @property {number} limit Maximum number of instances to return.
    * <br/>See [Limit filter](docs.strongloop.com/display/LB/Limit+filter).
    * @property {string} order Sort order: either "ASC" for ascending or "DESC" for descending.
    * <br/>See [Order filter](docs.strongloop.com/display/LB/Order+filter).
    * @property {number} skip number of results to skip.
    * <br/>See [Skip filter](docs.strongloop.com/display/LB/Skip+filter).
    * @property {any} where Where clause, like
    * ```
    * { where: { key: val, key2: {gt: 'val2'}, ...} }
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforqueries)
    */
  /* static member */
  inline def find[T](): js.Promise[js.Array[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[js.Promise[js.Array[T] | Null]]
  inline def find[T](filter: Fields): js.Promise[js.Array[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T] | Null]]
  /**
    * Find all model instances that match `filter` specification.
    * See [Querying models](docs.strongloop.com/display/LB/Querying+models)
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @property {number} limit Maximum number of instances to return.
    * <br/>See [Limit filter](docs.strongloop.com/display/LB/Limit+filter).
    * @property {string} order Sort order: either "ASC" for ascending or "DESC" for descending.
    * <br/>See [Order filter](docs.strongloop.com/display/LB/Order+filter).
    * @property {number} skip number of results to skip.
    * <br/>See [Skip filter](docs.strongloop.com/display/LB/Skip+filter).
    * @property {any} where Where clause, like
    * ```
    * { where: { key: val, key2: {gt: 'val2'}, ...} }
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforqueries)
    * @callback {() => void} callback Callback function called with `(err, returned-instances)` arguments.    Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} models Model instances matching the filter, or null if none found
    */
  /* static member */
  inline def find[T](filter: Fields, callback: CallbackWithResult[js.Array[T]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Find object by ID with an optional filter for include/fields
    * @param {*} id Primary key value
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    */
  /* static member */
  inline def findById[T](id: js.Any): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  /**
    * Find object by ID with an optional filter for include/fields
    * @param {*} id Primary key value
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance matching the specified ID or null if no instance matches
    */
  /* static member */
  inline def findById[T](id: js.Any, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findById[T](id: js.Any, filter: Include): js.Promise[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Null]]
  /**
    * Find object by ID with an optional filter for include/fields
    * @param {*} id Primary key value
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance matching the specified ID or null if no instance matches
    */
  /* static member */
  inline def findById[T](id: js.Any, filter: Include, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Find one model instance that matches `filter` specification.
    * Same as `find`, but limited to one result;
    * Returns object, not collection
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @property {string} order Sort order: either "ASC" for ascending or "DESC" for descending.
    * <br/>See [Order filter](docs.strongloop.com/display/LB/Order+filter).
    * @property {number} skip number of results to skip.
    * <br/>See [Skip filter](docs.strongloop.com/display/LB/Skip+filter).
    * @property {any} where Where clause, like
    * ```
    * {where: { key: val, key2: {gt: 'val2'}, ...} }
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforqueries)
    */
  /* static member */
  inline def findOne[T](): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")().asInstanceOf[js.Promise[T | Null]]
  /**
    * Find one model instance that matches `filter` specification.
    * Same as `find`, but limited to one result;
    * Returns object, not collection
    * @callback {() => void} callback Callback function called with `(err, returned-instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} model First model instance that matches the filter or null if none found
    */
  /* static member */
  inline def findOne[T](callback: CallbackWithResult[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def findOne[T](filter: Order): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  /**
    * Find one model instance that matches `filter` specification.
    * Same as `find`, but limited to one result;
    * Returns object, not collection
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @property {string} order Sort order: either "ASC" for ascending or "DESC" for descending.
    * <br/>See [Order filter](docs.strongloop.com/display/LB/Order+filter).
    * @property {number} skip number of results to skip.
    * <br/>See [Skip filter](docs.strongloop.com/display/LB/Skip+filter).
    * @property {any} where Where clause, like
    * ```
    * {where: { key: val, key2: {gt: 'val2'}, ...} }
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforqueries)
    * @callback {() => void} callback Callback function called with `(err, returned-instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} model First model instance that matches the filter or null if none found
    */
  /* static member */
  inline def findOne[T](filter: Order, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Finds one record matching the optional filter object. If not found, creates
    * the object using the data provided as second argument. In this sense it is
    * the same as `find`, but limited to one object. Returns an object, not
    * collection. If you don't provide the filter object argument, it tries to
    * locate an existing object that matches the `data` argument
    *
    * @options {any} [filter] Optional Filter object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @property {number} limit Maximum number of instances to return.
    * <br/>See [Limit filter](docs.strongloop.com/display/LB/Limit+filter).
    * @property {string} order Sort order: either "ASC" for ascending or "DESC" for descending.
    * <br/>See [Order filter](docs.strongloop.com/display/LB/Order+filter).
    * @property {number} skip number of results to skip.
    * <br/>See [Skip filter](docs.strongloop.com/display/LB/Skip+filter).
    * @property {any} where Where clause, like
    * ```
    * {where: {key: val, key2: {gt: val2}, ...}}
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforqueries).
    * @param {any} data Data to insert if object matching the `where` filter is not found.
    */
  /* static member */
  inline def findOrCreate[T](data: js.Any): js.Promise[Created[T] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Created[T] | Null]]
  /**
    * Finds one record matching the optional filter object. If not found, creates
    * the object using the data provided as second argument. In this sense it is
    * the same as `find`, but limited to one object. Returns an object, not
    * collection. If you don't provide the filter object argument, it tries to
    * locate an existing object that matches the `data` argument
    *
    * @param {any} data Data to insert if object matching the `where` filter is not found.
    * @callback {() => void} callback Callback function called with `cb(err, instance, created)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance matching the `where` filter, if found.
    * @param {boolean} created True if the instance matching the `where` filter was created
    */
  /* static member */
  inline def findOrCreate[T](data: js.Any, callback: CallbackWithMultipleResults[T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def findOrCreate[T](data: js.Any, filter: Fields): js.Promise[Created[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Created[T] | Null]]
  /**
    * Finds one record matching the optional filter object. If not found, creates
    * the object using the data provided as second argument. In this sense it is
    * the same as `find`, but limited to one object. Returns an object, not
    * collection. If you don't provide the filter object argument, it tries to
    * locate an existing object that matches the `data` argument
    *
    * @options {any} [filter] Optional Filter object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    * @property {number} limit Maximum number of instances to return.
    * <br/>See [Limit filter](docs.strongloop.com/display/LB/Limit+filter).
    * @property {string} order Sort order: either "ASC" for ascending or "DESC" for descending.
    * <br/>See [Order filter](docs.strongloop.com/display/LB/Order+filter).
    * @property {number} skip number of results to skip.
    * <br/>See [Skip filter](docs.strongloop.com/display/LB/Skip+filter).
    * @property {any} where Where clause, like
    * ```
    * {where: {key: val, key2: {gt: val2}, ...}}
    * ```
    * <br/>See
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforqueries).
    * @param {any} data Data to insert if object matching the `where` filter is not found.
    * @callback {() => void} callback Callback function called with `cb(err, instance, created)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance matching the `where` filter, if found.
    * @param {boolean} created True if the instance matching the `where` filter was created
    */
  /* static member */
  inline def findOrCreate[T](data: js.Any, filter: Fields, callback: CallbackWithMultipleResults[T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findOrCreate")(data.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Get the `Change` model.
    * Throws an error if the change model is not correctly setup.
    */
  /* static member */
  inline def getChangeModel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getChangeModel")().asInstanceOf[Unit]
  
  /**
    * Get the `id` property name of the constructor
    * @returns {string} The `id` property nam
    */
  /* static member */
  inline def getIdName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdName")().asInstanceOf[String]
  
  /**
    * Get the source identifier for this model or dataSource
    */
  /* static member */
  inline def getSourceId(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceId")().asInstanceOf[js.Promise[String]]
  /**
    * Get the source identifier for this model or dataSource
    * @callback {() => void} callback Callback function called with `(err, id)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {string} sourceId Source identifier for the model or dataSource
    */
  /* static member */
  inline def getSourceId(callback: CallbackWithResult[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceId")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Handle a change error. Override this method in a subclassing model to customize
    * change error handling
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object)
    */
  /* static member */
  inline def handleChangeError(err: Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleChangeError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Specify that a change to the model with the given ID has occurred
    * @param {*} id The ID of the model that has changed.
    */
  /* static member */
  inline def rectifyChange(id: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rectifyChange")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Specify that a change to the model with the given ID has occurred
    * @param {*} id The ID of the model that has changed.
    * @callback {() => void} callback
    * @param {Error} er
    */
  /* static member */
  inline def rectifyChange(id: js.Any, callback: CallbackWithoutResult): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rectifyChange")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Replace attributes for a model instance whose id is the first input
    * argument and persist it into the datasource.
    * Performs validation before replacing
    * @param {*} id The ID value of model instance to replace.
    * @param {any} data Data to replace.
    * @options {any} [options] Options for replace
    * @property {boolean} validate Perform validation before saving.  Default is true.
    */
  /* static member */
  inline def replaceById[T](id: js.Any, data: js.Any): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceById")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Replace attributes for a model instance whose id is the first input
    * argument and persist it into the datasource.
    * Performs validation before replacing
    * @param {*} id The ID value of model instance to replace.
    * @param {any} data Data to replace.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Replaced instance
    */
  /* static member */
  inline def replaceById[T](id: js.Any, data: js.Any, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceById")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceById[T](id: js.Any, data: js.Any, options: Validate): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceById")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Replace attributes for a model instance whose id is the first input
    * argument and persist it into the datasource.
    * Performs validation before replacing
    * @param {*} id The ID value of model instance to replace.
    * @param {any} data Data to replace.
    * @options {any} [options] Options for replace
    * @property {boolean} validate Perform validation before saving.  Default is true.
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Replaced instance
    */
  /* static member */
  inline def replaceById[T](id: js.Any, data: js.Any, options: Validate, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceById")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Replace or insert a model instance; replace existing record if one is found,
    * such that parameter `data.id` matches `id` of model instance; otherwise,
    * insert a new record.
    * @param {any} data The model instance data.
    * @options {any} [options] Options for replaceOrCreate
    * @property {boolean} validate Perform validation before saving.  Default is true.
    */
  /* static member */
  inline def replaceOrCreate[T](data: js.Any): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceOrCreate")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Replace or insert a model instance; replace existing record if one is found,
    * such that parameter `data.id` matches `id` of model instance; otherwise,
    * insert a new record.
    * @param {any} data The model instance data.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Replaced model instance.
    */
  /* static member */
  inline def replaceOrCreate[T](data: js.Any, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceOrCreate")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def replaceOrCreate[T](data: js.Any, options: Validate): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceOrCreate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  /**
    * Replace or insert a model instance; replace existing record if one is found,
    * such that parameter `data.id` matches `id` of model instance; otherwise,
    * insert a new record.
    * @param {any} data The model instance data.
    * @options {any} [options] Options for replaceOrCreate
    * @property {boolean} validate Perform validation before saving.  Default is true.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Replaced model instance.
    */
  /* static member */
  inline def replaceOrCreate[T](data: js.Any, options: Validate, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceOrCreate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Replicate changes since the given checkpoint to the given target model
    * @param  {number}   [since]  Since this checkpoint
    * @param  {Model} targetModel  Target this model class
    * @param  {any} [options]
    * @param {any} [options.filter] Replicate models that match this filter
    * @callback {() => void} [callback] Callback function called with `(err, conflicts)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Conflict[]} conflicts A list of changes that could not be replicated due to conflicts.
    * @param {any} checkpoints The new checkpoints to use as the "since"
    * argument for the next replication
    */
  /* static member */
  inline def replicate(): js.Promise[Conflicts] | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replicate")().asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double): js.Promise[Conflicts] | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Unit, options: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Unit, options: js.Any, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Unit,
    options: js.Any,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Unit,
    options: js.Any,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Unit, options: Unit, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Unit,
    options: Unit,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Unit,
    options: Unit,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Model): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Model, options: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Model, options: js.Any, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Model,
    options: js.Any,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Model,
    options: js.Any,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Double, targetModel: Model, options: Unit, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Model,
    options: Unit,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Double,
    targetModel: Model,
    options: Unit,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Unit, options: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Unit, options: js.Any, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Unit,
    options: js.Any,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Unit,
    options: js.Any,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Unit, options: Unit, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Unit,
    options: Unit,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Unit,
    options: Unit,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Model): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Model, options: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Model, options: js.Any, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Model,
    options: js.Any,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Model,
    options: js.Any,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(since: Unit, targetModel: Model, options: Unit, optionsFilter: js.Any): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Model,
    options: Unit,
    optionsFilter: js.Any,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  inline def replicate(
    since: Unit,
    targetModel: Model,
    options: Unit,
    optionsFilter: Unit,
    callback: js.Function3[/* err */ Error, /* conflicts */ js.Array[Conflict], /* param */ js.Any, Unit]
  ): js.Promise[Conflicts] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(since.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any], options.asInstanceOf[js.Any], optionsFilter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conflicts] | Unit]
  
  /**
    * Update multiple instances that match the where clause.
    *
    * Example:
    *
    * ```js
    * Employee.updateAll({managerId: 'x001'}, {managerId: 'x002'}, function(err, info) {
    *     ...
    * });
    * ```
    *
    * @param {any} [where] Optional `where` filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>see
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @param {any} data any containing data to replace matching instances, if any.
    */
  /* static member */
  inline def updateAll(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")().asInstanceOf[js.Promise[Double]]
  /**
    * Update multiple instances that match the where clause.
    * @callback {() => void} callback Callback function called with `(err, info)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} info Additional information about the command outcome.
    * @param {number} info.count number of instances (rows, documents) updated.
    *
    */
  /* static member */
  inline def updateAll(callback: CallbackWithMultipleResults[js.Any, Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Update multiple instances that match the where clause.
    *
    * Example:
    *
    * ```js
    * Employee.updateAll({managerId: 'x001'}, {managerId: 'x002'}, function(err, info) {
    *     ...
    * });
    * ```
    *
    * @param {any} [where] Optional `where` filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>see
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @param {any} data any containing data to replace matching instances, if any.
    *
    * @callback {() => void} callback Callback function called with `(err, info)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} info Additional information about the command outcome.
    * @param {number} info.count number of instances (rows, documents) updated.
    *
    */
  /* static member */
  inline def updateAll(whereOrData: js.Any, callback: CallbackWithMultipleResults[js.Any, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")(whereOrData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateAll(where: js.Any): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")(where.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  inline def updateAll(where: js.Any, data: js.Any): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")(where.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  /**
    * Update multiple instances that match the where clause.
    *
    * Example:
    *
    * ```js
    * Employee.updateAll({managerId: 'x001'}, {managerId: 'x002'}, function(err, info) {
    *     ...
    * });
    * ```
    *
    * @param {any} [where] Optional `where` filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>see
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @param {any} data any containing data to replace matching instances, if any.
    *
    * @callback {() => void} callback Callback function called with `(err, info)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} info Additional information about the command outcome.
    * @param {number} info.count number of instances (rows, documents) updated.
    *
    */
  /* static member */
  inline def updateAll(where: js.Any, data: js.Any, callback: CallbackWithMultipleResults[js.Any, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")(where.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateAll(where: Unit, data: js.Any): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAll")(where.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  /**
    * Update or insert a model instance
    * @param {any} data The model instance data to insert.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Updated model instance
    */
  /* static member */
  inline def upsert[T](data: js.Any): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("upsert")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Update or insert a model instance
    * @param {any} data The model instance data to insert.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Updated model instance
    */
  /* static member */
  inline def upsert[T](data: js.Any, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upsert")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Update or insert a model instance based on the search criteria.
    * If there is a single instance retrieved, update the retrieved model.
    * Creates a new model if no model instances were found.
    * Returns an error if multiple instances are found.
    * * @param {any} [where]  `where` filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>see
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @param {any} data The model instance data to insert.
    */
  /* static member */
  inline def upsertWithWhere[T](data: js.Any): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("upsertWithWhere")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /**
    * Update or insert a model instance based on the search criteria.
    * If there is a single instance retrieved, update the retrieved model.
    * Creates a new model if no model instances were found.
    * Returns an error if multiple instances are found.
    * * @param {any} [where]  `where` filter, like
    * ```
    * { key: val, key2: {gt: 'val2'}, ...}
    * ```
    * <br/>see
    * [Where filter](docs.strongloop.com/display/LB/Where+filter#Wherefilter-Whereclauseforothermethods).
    * @param {any} data The model instance data to insert.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Updated model instance
    */
  /* static member */
  inline def upsertWithWhere[T](data: js.Any, callback: CallbackWithResult[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upsertWithWhere")(data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
