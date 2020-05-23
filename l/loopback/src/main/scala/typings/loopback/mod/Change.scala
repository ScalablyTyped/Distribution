package typings.loopback.mod

import typings.loopback.anon.HashAlgorithm
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Change list entry.
  *
  * @property {string} id Hash of the modelName and ID.
  * @property {string} rev The current model revision.
  * @property {string} prev The previous model revision.
  * @property {number} checkpoint The current checkpoint at time of the change.
  * @property {string} modelName Model name.
  * @property {string} modelId Model ID.
  * @property {any} settings Extends the `Model.settings` object.
  * @property {string} settings.hashAlgorithm Algorithm used to create cryptographic hash, used as argument
  * to [crypto.createHash](nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm).  Default is sha1.
  * @property {boolean} settings.ignoreErrors By default, when changes are rectified, an error will throw an exception.
  * However, if this setting is true, then errors will not throw exceptions.
  * @class Change
  * @inherits {PersistedModel}
  */
@JSImport("loopback", "Change")
@js.native
class Change () extends PersistedModel {
  var checkpoint: Double = js.native
  /** Hash of the modelName and ID. */
  var id: String = js.native
  /** Model ID. */
  var modelId: String = js.native
  /** Model name. */
  var modelName: String = js.native
  var prev: String = js.native
  /** The current model revision. */
  var rev: String = js.native
  /**
    * settings Extends the `Model.settings` object.
    * settings.hashAlgorithm Algorithm used to create cryptographic hash, used as argument
    * to [crypto.createHash](nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm).Default is sha1.
    * settings.ignoreErrors By default, when changes are rectified, an error will throw an exception.
    * However, if this setting is true, then errors will not throw exceptions.
    */
  @JSName("settings")
  var settings_Change: HashAlgorithm = js.native
  /**
    * Does this change conflict with the given change.
    * @param  {Change} change
    * @return {boolean
    */
  def conflictsWith(change: Change): Unit = js.native
  /**
    * Get a change's current revision based on current data.
    * @callback  {() => void} callback
    * @param {Error} err
    * @param {string} rev The current revisio
    */
  def currentRevision(callback: js.Function2[/* err */ Error, /* rev */ String, Unit]): Unit = js.native
  /**
    * Compare two changes.
    * @param  {Change} change
    */
  def equals(change: Change): Unit = js.native
  /**
    * Get the `Model` class for `change.modelName`.
    */
  def getModelCtor(): Unit = js.native
  /**
    * Determine if the change is based on the given change.
    * @param  {Change} change
    * @return {boolean
    */
  def isBasedOn(change: Change): Unit = js.native
  /**
    * Update (or create) the change with the current revision
    * @callback {() => void} callback
    * @param {Error} err
    * @param {Change} chang
    */
  def rectify(callback: js.Function2[/* err */ Error, /* change */ this.type, Unit]): Unit = js.native
  /**
    * Get a change's type. Returns one of
    * - `Change.UPDATE`
    * - `Change.CREATE`
    * - `Change.DELETE`
    * - `Change.UNKNOWN
    */
  def `type`(): Unit = js.native
}

/* static members */
@JSImport("loopback", "Change")
@js.native
object Change extends js.Object {
  /**
    * Are both changes deletes?
    * @param  {Change} a
    * @param  {Change} b
    */
  def bothDeleted(a: Change, b: Change): Unit = js.native
  /**
    * Determine the differences for a given model since a given checkpoint.
    *
    * The callback will contain an error or `result`.
    *
    * **result**
    *
    * ```js
    * {
    *   deltas: Array,
    *   conflicts: Array
    * }
    * ```
    *
    * **deltas**
    *
    * An Array of changes that differ from `remoteChanges`.
    *
    * **conflicts**
    *
    * An Array of changes that conflict with `remoteChanges`.
    *
    * @param  {string}   modelName
    * @param  {number}   since         Compare changes after this checkpoint
    * @param  {Change[]} remoteChanges A set of changes to compare
    * @callback  {() => void} callback
    * @param {Error} err
    * @param {any} result See above.
    */
  // static diff(modelName: string, since: number, remoteChanges: Change[], callback: (err: Error, result: any) => void): void;
  /**
    * Find or create a change for the given model
    * @param  {string}   modelName
    * @param  {string}   modelId
    * @callback  {() => void} callback
    * @param {Error} err
    * @param {Change} change
    * @end
    */
  def findOrCreateChange(
    modelName: String,
    modelId: String,
    callback: js.Function2[/* err */ Error, /* change */ this.type, Unit]
  ): Unit = js.native
  /**
    * Get the checkpoint model.
    */
  def getCheckpointModel(): Unit = js.native
  /**
    * Create a hash of the given `string` with the `options.hashAlgorithm`.
    * **Default: `sha1`*
    * @param  {string} str The string to be hashed
    */
  def hash(str: String): Unit = js.native
  /**
    * Get an identifier for a given model
    * @param  {string} modelName
    * @param  {string} modelId
    */
  def idForModel(modelName: String, modelId: String): Unit = js.native
  /**
    * Correct all change list entries.
    * @param {() => void} c
    */
  def rectifyAll(cb: js.Function0[Unit]): Unit = js.native
  /**
    * Track the recent change of the given modelIds
    * @param  {string}   modelName
    * @param  {Array}    modelIds
    * @callback {() => void} callback
    * @param {Error} err
    * @param {Array} changes Changes that were tracke
    */
  def rectifyModelChanges(
    modelName: String,
    modelIds: js.Array[_],
    callback: js.Function2[/* err */ Error, /* changes */ js.Array[_], Unit]
  ): Unit = js.native
  /**
    * Get the revision string for the given object
    * @param  {any} inst The data to get the revision string for
    */
  def revisionForInst(inst: js.Any): Unit = js.native
}

