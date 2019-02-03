package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class PersistedModel ()
  extends loopbackLib.loopbackMod.lNs.PersistedModel {
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

/* static members */
@JSImport("loopback", "PersistedModel")
@js.native
object PersistedModel extends js.Object {
  /**
    * Apply an update list
    * **Note: this is not atomic*
    * @param  {Array} updates An updates list, usually from [createUpdates()](#persistedmodel-createupdates).
    * @param {any} options An optional options object to pass to underlying data-access calls.
    * @param  {() => void} callback Callback function
    */
  def bulkUpdate(updates: js.Array[_], options: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Apply an update list
    * **Note: this is not atomic*
    * @param  {Array} updates An updates list, usually from [createUpdates()](#persistedmodel-createupdates).
    * @param {any} options An optional options object to pass to underlying data-access calls.
    * @param  {() => void} callback Callback function
    */
  def bulkUpdate(updates: js.Array[_], options: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithoutResult): scala.Unit = js.native
  /**
    * Get the changes to a model since the specified checkpoint. Provide a filter object
    * to reduce the number of results returned.
    * @param  {number} since Return only changes since this checkpoint.
    * @param  {any}   filter   Include only changes that match this filter, the same as for [#persistedmodel-find](find()).
    * @callback {() => void} callback Callback function called with `(err, changes)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} changes An Array of [Change](#change) objects
    */
  def changes(since: scala.Double, filter: js.Any): js.Promise[js.Array[_]] = js.native
  /**
    * Get the changes to a model since the specified checkpoint. Provide a filter object
    * to reduce the number of results returned.
    * @param  {number} since Return only changes since this checkpoint.
    * @param  {any}   filter   Include only changes that match this filter, the same as for [#persistedmodel-find](find()).
    * @callback {() => void} callback Callback function called with `(err, changes)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} changes An Array of [Change](#change) objects
    */
  def changes(since: scala.Double, filter: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[_]): scala.Unit = js.native
  /**
    * Create a checkpoint
    */
  def checkpoint(): js.Promise[scala.Unit] = js.native
  def checkpoint(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Create a checkpoint
    * @param  {() => void} callback
    */
  @JSName("checkpoint")
  def checkpoint_Unit(): scala.Unit = js.native
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
  def count(): js.Promise[scala.Double] = js.native
  def count(where: js.Any): js.Promise[scala.Double] = js.native
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
  def count(where: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[scala.Double]): scala.Unit = js.native
  /**
    * Create new instance of Model, and save to database
    * @param {any}|[{any}] data Optional data argument.  Can be either a single model instance or an Array of instances
    * @returns {T | T[]} Model instances or null
    */
  def create[T](): js.Promise[T | js.Array[T] | scala.Null] = js.native
  def create[T](data: js.Any): js.Promise[T | js.Array[T] | scala.Null] = js.native
  /**
    * Create new instance of Model, and save to database
    * @param {any}|[{any}] data Optional data argument.  Can be either a single model instance or an Array of instances
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} models Model instances or null
    */
  def create[T](
    data: js.Any,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T | js.Array[T] | scala.Null]
  ): scala.Unit = js.native
  def create[T](data: js.Array[_]): js.Promise[T | js.Array[T] | scala.Null] = js.native
  def create[T](
    data: js.Array[_],
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T | js.Array[T] | scala.Null]
  ): scala.Unit = js.native
  /**
    * Create a change stream. See here for more info http://loopback.io/doc/en/lb2/Realtime-server-sent-events.html
    * @param {any} options Only changes to models matching this where filter will be included in the ChangeStream.
    * @returns {any} changes
    */
  def createChangeStream(options: loopbackLib.Anon_Where): js.Promise[_] = js.native
  /**
    * Create a change stream. See here for more info http://loopback.io/doc/en/lb2/Realtime-server-sent-events.html
    * @param {any} options Only changes to models matching this where filter will be included in the ChangeStream.
    * @param {() => void} callback
    */
  def createChangeStream(options: loopbackLib.Anon_Where, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[_]): scala.Unit = js.native
  /**
    * Create an update list (for `Model.bulkUpdate()`) from a delta list
    * (result of `Change.diff()`)
    * @param  {Array}    deltas
    */
  def createUpdates(deltas: js.Array[_]): js.Promise[scala.Unit] = js.native
  /**
    * Create an update list (for `Model.bulkUpdate()`) from a delta list
    * (result of `Change.diff()`)
    * @param  {Array}    deltas
    * @param  {() => void} callback
    */
  def createUpdates(deltas: js.Array[_], callback: loopbackLib.loopbackMod.lNs.CallbackWithoutResult): scala.Unit = js.native
  /**
    * Get the current checkpoint ID
    * @returns {Promise<number>} resolves to currentCheckpointId
    */
  def currentCheckpoint(): js.Promise[scala.Double] = js.native
  /**
    * Get the current checkpoint ID
    * @callback {() => void} callback Callback function called with `(err, currentCheckpointId)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {number} currentCheckpointId Current checkpoint ID
    */
  def currentCheckpoint(callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[scala.Double]): scala.Unit = js.native
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
  def destroyAll(): js.Promise[loopbackLib.Anon_Info] = js.native
  def destroyAll(where: js.Any): js.Promise[loopbackLib.Anon_Info] = js.native
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
  def destroyAll(where: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithMultipleResults[_, scala.Double]): scala.Unit = js.native
  /**
    * Destroy model instance with the specified ID.
    * @param {*} id The ID value of model instance to delete.
    */
  def destroyById(id: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Destroy model instance with the specified ID.
    * @param {*} id The ID value of model instance to delete.
    * @callback {() => void} callback Callback function called with `(err)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object)
    */
  def destroyById(id: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithoutResult): scala.Unit = js.native
  /**
    * Get a set of deltas and conflicts since the given checkpoint
    * See [Change.diff()](#change-diff) for details
    * @param  {number}  since  Find deltas since this checkpoint.
    * @param  {Array}  remoteChanges  An Array of change objects.
    */
  def diff(since: scala.Double, remoteChanges: js.Array[_]): js.Promise[_] = js.native
  /**
    * Get a set of deltas and conflicts since the given checkpoint
    * See [Change.diff()](#change-diff) for details
    * @param  {number}  since  Find deltas since this checkpoint.
    * @param  {Array}  remoteChanges  An Array of change objects.
    * @callback {() => void} callback Callback function called with `(err, result)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} result any with `deltas` and `conflicts` properties; see [Change.diff()](#change-diff) for details
    */
  def diff(
    since: scala.Double,
    remoteChanges: js.Array[_],
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[_]
  ): scala.Unit = js.native
  /**
    * Enable the tracking of changes made to the model. Usually for replication.
    */
  def enableChangeTracking(): scala.Unit = js.native
  /**
    * Check whether a model instance exists in database
    * @param {id} id Identifier of object (primary key value)
    */
  def exists(id: js.Any): js.Promise[scala.Boolean] = js.native
  /**
    * Check whether a model instance exists in database
    * @param {id} id Identifier of object (primary key value)
    * @callback {() => void} callback Callback function called with `(err, exists)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {boolean} exists True if the instance with the specified ID exists; false otherwise
    */
  def exists(id: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[scala.Boolean]): scala.Unit = js.native
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
  def find[T](): js.Promise[js.Array[T] | scala.Null] = js.native
  def find[T](filter: loopbackLib.Anon_Fields): js.Promise[js.Array[T] | scala.Null] = js.native
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
  def find[T](
    filter: loopbackLib.Anon_Fields,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[js.Array[T]]
  ): scala.Unit = js.native
  /**
    * Find object by ID with an optional filter for include/fields
    * @param {*} id Primary key value
    * @options {any} [filter] Optional Filter JSON object; see below.
    * @property {string|any|Array} fields Identify fields to include in return result.
    * <br/>See [Fields filter](docs.strongloop.com/display/LB/Fields+filter).
    * @property {string|any|Array} include  See PersistedModel.include documentation.
    * <br/>See [Include filter](docs.strongloop.com/display/LB/Include+filter).
    */
  def findById[T](id: js.Any): js.Promise[T | scala.Null] = js.native
  /**
    * Find object by ID with an optional filter for include/fields
    * @param {*} id Primary key value
    * @callback {() => void} callback Callback function called with `(err, instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} instance Model instance matching the specified ID or null if no instance matches
    */
  def findById[T](id: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]): scala.Unit = js.native
  def findById[T](id: js.Any, filter: loopbackLib.Anon_FieldsInclude): js.Promise[T | scala.Null] = js.native
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
  def findById[T](
    id: js.Any,
    filter: loopbackLib.Anon_FieldsInclude,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]
  ): scala.Unit = js.native
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
  def findOne[T](): js.Promise[T | scala.Null] = js.native
  /**
    * Find one model instance that matches `filter` specification.
    * Same as `find`, but limited to one result;
    * Returns object, not collection
    * @callback {() => void} callback Callback function called with `(err, returned-instance)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {Array} model First model instance that matches the filter or null if none found
    */
  def findOne[T](callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]): scala.Unit = js.native
  def findOne[T](filter: loopbackLib.Anon_FieldsIncludeOrder): js.Promise[T | scala.Null] = js.native
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
  def findOne[T](
    filter: loopbackLib.Anon_FieldsIncludeOrder,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]
  ): scala.Unit = js.native
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
  def findOrCreate[T](data: js.Any): js.Promise[loopbackLib.Anon_Created[T] | scala.Null] = js.native
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
  def findOrCreate[T](data: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithMultipleResults[T, scala.Boolean]): scala.Unit = js.native
  def findOrCreate[T](data: js.Any, filter: loopbackLib.Anon_Fields): js.Promise[loopbackLib.Anon_Created[T] | scala.Null] = js.native
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
  def findOrCreate[T](
    data: js.Any,
    filter: loopbackLib.Anon_Fields,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithMultipleResults[T, scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Get the `Change` model.
    * Throws an error if the change model is not correctly setup.
    */
  def getChangeModel(): scala.Unit = js.native
  /**
    * Get the `id` property name of the constructor
    * @returns {string} The `id` property nam
    */
  def getIdName(): java.lang.String = js.native
  /**
    * Get the source identifier for this model or dataSource
    */
  def getSourceId(): js.Promise[java.lang.String] = js.native
  /**
    * Get the source identifier for this model or dataSource
    * @callback {() => void} callback Callback function called with `(err, id)` arguments.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {string} sourceId Source identifier for the model or dataSource
    */
  def getSourceId(callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[java.lang.String]): scala.Unit = js.native
  /**
    * Handle a change error. Override this method in a subclassing model to customize
    * change error handling
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object)
    */
  def handleChangeError(err: nodeLib.Error): scala.Unit = js.native
  /**
    * Specify that a change to the model with the given ID has occurred
    * @param {*} id The ID of the model that has changed.
    */
  def rectifyChange(id: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Specify that a change to the model with the given ID has occurred
    * @param {*} id The ID of the model that has changed.
    * @callback {() => void} callback
    * @param {Error} er
    */
  def rectifyChange(id: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithoutResult): scala.Unit = js.native
  /**
    * Replace attributes for a model instance whose id is the first input
    * argument and persist it into the datasource.
    * Performs validation before replacing
    * @param {*} id The ID value of model instance to replace.
    * @param {any} data Data to replace.
    * @options {any} [options] Options for replace
    * @property {boolean} validate Perform validation before saving.  Default is true.
    */
  def replaceById[T](id: js.Any, data: js.Any): js.Promise[T] = js.native
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
  def replaceById[T](id: js.Any, data: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]): scala.Unit = js.native
  def replaceById[T](id: js.Any, data: js.Any, options: loopbackLib.Anon_Validate): js.Promise[T] = js.native
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
  def replaceById[T](
    id: js.Any,
    data: js.Any,
    options: loopbackLib.Anon_Validate,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]
  ): scala.Unit = js.native
  /**
    * Replace or insert a model instance; replace existing record if one is found,
    * such that parameter `data.id` matches `id` of model instance; otherwise,
    * insert a new record.
    * @param {any} data The model instance data.
    * @options {any} [options] Options for replaceOrCreate
    * @property {boolean} validate Perform validation before saving.  Default is true.
    */
  def replaceOrCreate[T](data: js.Any): js.Promise[T] = js.native
  /**
    * Replace or insert a model instance; replace existing record if one is found,
    * such that parameter `data.id` matches `id` of model instance; otherwise,
    * insert a new record.
    * @param {any} data The model instance data.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Replaced model instance.
    */
  def replaceOrCreate[T](data: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]): scala.Unit = js.native
  def replaceOrCreate[T](data: js.Any, options: loopbackLib.Anon_Validate): js.Promise[T] = js.native
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
  def replaceOrCreate[T](
    data: js.Any,
    options: loopbackLib.Anon_Validate,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]
  ): scala.Unit = js.native
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
  def replicate(): js.Promise[loopbackLib.Anon_Conflicts] | scala.Unit = js.native
  def replicate(since: scala.Double): js.Promise[loopbackLib.Anon_Conflicts] | scala.Unit = js.native
  def replicate(since: scala.Double, targetModel: loopbackLib.loopbackMod.lNs.Model): js.Promise[loopbackLib.Anon_Conflicts] | scala.Unit = js.native
  def replicate(since: scala.Double, targetModel: loopbackLib.loopbackMod.lNs.Model, options: js.Any): js.Promise[loopbackLib.Anon_Conflicts] | scala.Unit = js.native
  def replicate(
    since: scala.Double,
    targetModel: loopbackLib.loopbackMod.lNs.Model,
    options: js.Any,
    optionsFilter: js.Any
  ): js.Promise[loopbackLib.Anon_Conflicts] | scala.Unit = js.native
  def replicate(
    since: scala.Double,
    targetModel: loopbackLib.loopbackMod.lNs.Model,
    options: js.Any,
    optionsFilter: js.Any,
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* conflicts */ js.Array[loopbackLib.loopbackMod.lNs.Conflict], 
      /* param */ js.Any, 
      scala.Unit
    ]
  ): js.Promise[loopbackLib.Anon_Conflicts] | scala.Unit = js.native
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
  def updateAll(): js.Promise[scala.Double] = js.native
  /**
    * Update multiple instances that match the where clause.
    * @callback {() => void} callback Callback function called with `(err, info)` arguments.  Required.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} info Additional information about the command outcome.
    * @param {number} info.count number of instances (rows, documents) updated.
    *
    */
  def updateAll(callback: loopbackLib.loopbackMod.lNs.CallbackWithMultipleResults[_, scala.Double]): scala.Unit = js.native
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
  def updateAll(
    whereOrData: js.Any,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithMultipleResults[_, scala.Double]
  ): scala.Unit = js.native
  def updateAll(where: js.Any): js.Promise[scala.Double] = js.native
  def updateAll(where: js.Any, data: js.Any): js.Promise[scala.Double] = js.native
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
  def updateAll(
    where: js.Any,
    data: js.Any,
    callback: loopbackLib.loopbackMod.lNs.CallbackWithMultipleResults[_, scala.Double]
  ): scala.Unit = js.native
  /**
    * Update or insert a model instance
    * @param {any} data The model instance data to insert.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Updated model instance
    */
  def upsert[T](data: js.Any): js.Promise[T] = js.native
  /**
    * Update or insert a model instance
    * @param {any} data The model instance data to insert.
    * @callback {() => void} callback Callback function called with `cb(err, obj)` signature.
    * @param {Error} err Error object; see [Error object](docs.strongloop.com/display/LB/Error+object).
    * @param {any} model Updated model instance
    */
  def upsert[T](data: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]): scala.Unit = js.native
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
  def upsertWithWhere[T](data: js.Any): js.Promise[T] = js.native
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
  def upsertWithWhere[T](data: js.Any, callback: loopbackLib.loopbackMod.lNs.CallbackWithResult[T]): scala.Unit = js.native
}

