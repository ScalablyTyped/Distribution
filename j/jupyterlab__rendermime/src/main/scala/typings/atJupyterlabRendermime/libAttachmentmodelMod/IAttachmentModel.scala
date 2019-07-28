package typings.atJupyterlabRendermime.libAttachmentmodelMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMimeBundle
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentModel extends IMimeModel {
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

object IAttachmentModel {
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentModel, Unit],
    data: ReadonlyJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IMimeBundle,
    trusted: Boolean
  ): IAttachmentModel = {
    val __obj = js.Dynamic.literal(changed = changed, data = data, dispose = js.Any.fromFunction0(dispose), metadata = metadata, setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
  
    __obj.asInstanceOf[IAttachmentModel]
  }
}

