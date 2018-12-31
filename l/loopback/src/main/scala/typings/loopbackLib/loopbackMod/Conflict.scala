package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When two changes conflict a conflict is created
  * **Note**: call `conflict.fetch()` to get the `target` and `source` models
  *
  * @param {*} modelId
  * @param {PersistedModel} SourceModel
  * @param {PersistedModel} TargetModel
  * @property {ModelClass} source The source model instance
  * @property {ModelClass} target The target model instance
  * @class Change.Conflic
  */
@JSImport("loopback", "Conflict")
@js.native
class Conflict protected ()
  extends loopbackLib.loopbackMod.lNs.Conflict {
  def this(modelId: js.Any, SourceModel: loopbackLib.loopbackMod.lNs.PersistedModel, TargetModel: loopbackLib.loopbackMod.lNs.PersistedModel) = this()
  /* CompleteClass */
  override var source: js.Any = js.native
  /* CompleteClass */
  override var target: js.Any = js.native
  /**
    * Get the conflicting changes
    * @callback {() => void} callback
    * @param {Error} err
    * @param {Change} sourceChange
    * @param {Change} targetChang
    */
  /* CompleteClass */
  override def changes(
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* sourceChange */ loopbackLib.loopbackMod.lNs.Change, 
      /* targetChange */ loopbackLib.loopbackMod.lNs.Change, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fetch the conflicting models
    * @callback {() => void} callback
    * @param {Error} err
    * @param {PersistedModel} source
    * @param {PersistedModel} targe
    */
  /* CompleteClass */
  override def models(
    callback: js.Function3[
      /* err */ nodeLib.Error, 
      /* source */ loopbackLib.loopbackMod.lNs.PersistedModel, 
      /* target */ loopbackLib.loopbackMod.lNs.PersistedModel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Resolve the conflict
    * Set the source change's previous revision to the current revision of the
    * (conflicting) target change. Since the changes are no longer conflicting
    * and appear as if the source change was based on the target, they will be
    * replicated normally as part of the next replicate() call
    * This is effectively resolving the conflict using the source version
    * @callback {() => void} callback
    * @param {Error} err
    */
  /* CompleteClass */
  override def resolve(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Resolve the conflict using the supplied instance data
    * @param {any} data The set of changes to apply on the model
    * instance. Use `null` value to delete the source instance instead.
    * @callback {() => void} callback
    * @param {Error} err
    */
  /* CompleteClass */
  override def resolveManually(data: js.Any, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Resolve the conflict using the instance data in the source model
    * @callback {() => void} callback
    * @param {Error} err
    */
  /* CompleteClass */
  override def resolveUsingSource(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Resolve the conflict using the instance data in the target model
    * @callback {() => void} callback
    * @param {Error} err
    */
  /* CompleteClass */
  override def resolveUsingTarget(callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Return a new Conflict instance with swapped Source and Target models
    * This is useful when resolving a conflict in one-way
    * replication, where the source data must not be changed
    *
    * ```js
    * conflict.swapParties().resolveUsingTarget(cb);
    * ```
    * @returns {Conflict} A new Conflict instance
    */
  /* CompleteClass */
  override def swapParties(): loopbackLib.loopbackMod.lNs.Conflict = js.native
  /**
    * Determine the conflict type
    * Possible results ar
    *
    * - `Change.UPDATE`: Source and target models were updated
    * - `Change.DELETE`: Source and or target model was deleted.
    * - `Change.UNKNOWN`: the conflict type is uknown or due to an erro
    *
    * @callback {() => void} callback
    * @param {Error} err
    * @param {string} type The conflict type
    */
  /* CompleteClass */
  override def `type`(callback: js.Function2[/* err */ nodeLib.Error, /* type */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

