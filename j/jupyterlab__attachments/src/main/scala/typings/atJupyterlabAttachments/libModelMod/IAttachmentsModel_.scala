package typings.atJupyterlabAttachments.libModelMod

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel.ChangedArgs
import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IContentFactory
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IAttachments
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.IMimeBundle
import typings.atJupyterlabRendermime.libAttachmentmodelMod.IAttachmentModel
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IAttachmentsModel")
trait IAttachmentsModel_ extends IDisposable {
  /**
    * A signal emitted when the model changes.
    */
  val changed: ISignal[IAttachmentsModel, ChangedArgs]
  /**
    * The attachment content factory used by the model.
    */
  val contentFactory: IContentFactory
  /**
    * The keys of the attachments in the model.
    */
  val keys: js.Array[String]
  /**
    * The length of the items in the model.
    */
  val length: Double
  /**
    * A signal emitted when the model state changes.
    */
  val stateChanged: ISignal[IAttachmentsModel, Unit]
  /**
    * Clear all of the attachments.
    */
  def clear(): Unit
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * This will clear any existing data.
    */
  def fromJSON(values: IAttachments): Unit
  /**
    * Get an item for the specified key.
    */
  def get(key: String): IAttachmentModel
  /**
    * Whether the specified key is set.
    */
  def has(key: String): Boolean
  /**
    * Set the value of the specified key.
    */
  def set(key: String, attachment: IMimeBundle): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IAttachments
}

object IAttachmentsModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentsModel, ChangedArgs],
    clear: () => Unit,
    contentFactory: IContentFactory,
    dispose: () => Unit,
    fromJSON: IAttachments => Unit,
    get: String => IAttachmentModel,
    has: String => Boolean,
    isDisposed: Boolean,
    keys: js.Array[String],
    length: Double,
    set: (String, IMimeBundle) => Unit,
    stateChanged: ISignal[IAttachmentsModel, Unit],
    toJSON: () => IAttachments
  ): IAttachmentsModel_ = {
    val __obj = js.Dynamic.literal(changed = changed, clear = js.Any.fromFunction0(clear), contentFactory = contentFactory, dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), isDisposed = isDisposed, keys = keys, length = length, set = js.Any.fromFunction2(set), stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[IAttachmentsModel_]
  }
}

