package typings
package atJupyterlabAttachmentsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentsModel
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted when the model changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    IAttachmentsModel, 
    atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.ChangedArgs
  ]
  /**
    * The attachment content factory used by the model.
    */
  val contentFactory: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IContentFactory
  /**
    * The keys of the attachments in the model.
    */
  val keys: js.Array[java.lang.String]
  /**
    * The length of the items in the model.
    */
  val length: scala.Double
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IAttachmentsModel, scala.Unit]
  /**
    * Clear all of the attachments.
    */
  def clear(): scala.Unit
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments): scala.Unit
  /**
    * Get an item for the specified key.
    */
  def get(key: java.lang.String): atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModel
  /**
    * Whether the specified key is set.
    */
  def has(key: java.lang.String): scala.Boolean
  /**
    * Set the value of the specified key.
    */
  def set(key: java.lang.String, attachment: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle): scala.Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments
}

object IAttachmentsModel {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      IAttachmentsModel, 
      atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.ChangedArgs
    ],
    clear: () => scala.Unit,
    contentFactory: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModelNs.IContentFactory,
    dispose: () => scala.Unit,
    fromJSON: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments => scala.Unit,
    get: java.lang.String => atJupyterlabRendermimeLib.libAttachmentmodelMod.IAttachmentModel,
    has: java.lang.String => scala.Boolean,
    isDisposed: scala.Boolean,
    keys: js.Array[java.lang.String],
    length: scala.Double,
    set: (java.lang.String, atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle) => scala.Unit,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IAttachmentsModel, scala.Unit],
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IAttachments
  ): IAttachmentsModel = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), contentFactory = contentFactory, dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed, keys = keys, length = length, set = js.Any.fromFunction2(set), stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[IAttachmentsModel]
  }
}

