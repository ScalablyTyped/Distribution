package typings
package loopbackLib.loopbackMod.lNs

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
@js.native
trait Change extends PersistedModel {
  var checkpoint: scala.Double = js.native
  /** Hash of the modelName and ID. */
  var id: java.lang.String = js.native
  /** Model ID. */
  var modelId: java.lang.String = js.native
  /** Model name. */
  var modelName: java.lang.String = js.native
  var prev: java.lang.String = js.native
  /** The current model revision. */
  var rev: java.lang.String = js.native
  /**
               * settings Extends the `Model.settings` object.
               * settings.hashAlgorithm Algorithm used to create cryptographic hash, used as argument
               * to [crypto.createHash](nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm).Default is sha1.
               * settings.ignoreErrors By default, when changes are rectified, an error will throw an exception.
               * However, if this setting is true, then errors will not throw exceptions.
               */
  @JSName("settings")
  var settings_Change: loopbackLib.Anon_HashAlgorithm = js.native
  /**
               * Does this change conflict with the given change.
               * @param  {Change} change
               * @return {boolean
               */
  def conflictsWith(change: Change): scala.Unit = js.native
  /**
               * Get a change's current revision based on current data.
               * @callback  {() => void} callback
               * @param {Error} err
               * @param {string} rev The current revisio
               */
  def currentRevision(callback: js.Function2[/* err */ nodeLib.Error, /* rev */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
               * Compare two changes.
               * @param  {Change} change
               */
  def equals(change: Change): scala.Unit = js.native
  /**
               * Get the `Model` class for `change.modelName`.
               */
  def getModelCtor(): scala.Unit = js.native
  /**
               * Determine if the change is based on the given change.
               * @param  {Change} change
               * @return {boolean
               */
  def isBasedOn(change: Change): scala.Unit = js.native
  /**
               * Update (or create) the change with the current revision
               * @callback {() => void} callback
               * @param {Error} err
               * @param {Change} chang
               */
  def rectify(callback: js.Function2[/* err */ nodeLib.Error, /* change */ this.type, scala.Unit]): scala.Unit = js.native
  /**
               * Get a change's type. Returns one of
               * - `Change.UPDATE`
               * - `Change.CREATE`
               * - `Change.DELETE`
               * - `Change.UNKNOWN
               */
  def `type`(): scala.Unit = js.native
}

