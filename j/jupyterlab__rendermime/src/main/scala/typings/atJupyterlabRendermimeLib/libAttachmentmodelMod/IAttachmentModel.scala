package typings
package atJupyterlabRendermimeLib.libAttachmentmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentModel
  extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel {
  /**
    * A signal emitted when the attachment model changes.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
  /**
    * Dispose of the resources used by the attachment model.
    */
  def dispose(): scala.Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle
}

object IAttachmentModel {
  @scala.inline
  def apply(
    changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IAttachmentModel, scala.Unit],
    data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    dispose: () => scala.Unit,
    metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject,
    setData: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions => scala.Unit,
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IMimeBundle,
    trusted: scala.Boolean
  ): IAttachmentModel = {
    val __obj = js.Dynamic.literal(changed = changed, data = data, dispose = js.Any.fromFunction0(dispose), metadata = metadata, setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
  
    __obj.asInstanceOf[IAttachmentModel]
  }
}

