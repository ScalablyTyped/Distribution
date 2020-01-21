package typings.jupyterlabRendermime.attachmentmodelMod

import typings.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typings.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentModel_ extends IMimeModel {
  /**
    * A signal emitted when the attachment model changes.
    */
  val changed: ISignal[this.type, Unit]
  /**
    * Dispose of the resources used by the attachment model.
    */
  def dispose(): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IMimeBundle
}

object IAttachmentModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentModel_, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IMimeBundle,
    trusted: Boolean
  ): IAttachmentModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAttachmentModel_]
  }
}

