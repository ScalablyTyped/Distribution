package typings
package loopbackLib.loopbackMod

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
class Change ()
  extends loopbackLib.loopbackMod.lNs.Change {
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
object Change extends js.Object {
  /**
               * Are both changes deletes?
               * @param  {Change} a
               * @param  {Change} b
               */
  
  def bothDeleted(a: loopbackLib.loopbackMod.lNs.Change, b: loopbackLib.loopbackMod.lNs.Change): scala.Unit = js.native
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
    modelName: java.lang.String,
    modelId: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error, /* change */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /**
               * Get the checkpoint model.
               */
  def getCheckpointModel(): scala.Unit = js.native
  /**
               * Create a hash of the given `string` with the `options.hashAlgorithm`.
               * **Default: `sha1`*
               * @param  {string} str The string to be hashed
               */
  def hash(str: java.lang.String): scala.Unit = js.native
  /**
               * Get an identifier for a given model
               * @param  {string} modelName
               * @param  {string} modelId
               */
  def idForModel(modelName: java.lang.String, modelId: java.lang.String): scala.Unit = js.native
  /**
               * Correct all change list entries.
               * @param {() => void} c
               */
  def rectifyAll(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
               * Track the recent change of the given modelIds
               * @param  {string}   modelName
               * @param  {Array}    modelIds
               * @callback {() => void} callback
               * @param {Error} err
               * @param {Array} changes Changes that were tracke
               */
  def rectifyModelChanges(
    modelName: java.lang.String,
    modelIds: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* changes */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  /**
               * Get the revision string for the given object
               * @param  {any} inst The data to get the revision string for
               */
  def revisionForInst(inst: js.Any): scala.Unit = js.native
}

