package typings.jupyterlabRendermime.attachmentmodelMod

import typings.jupyterlabNbformat.mod.IMimeBundle
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAttachmentModel_ extends IMimeModel {
  
  /**
    * A signal emitted when the attachment model changes.
    */
  val changed: ISignal[this.type, Unit] = js.native
  
  /**
    * Dispose of the resources used by the attachment model.
    */
  def dispose(): Unit = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IMimeBundle = js.native
}
object IAttachmentModel_ {
  
  @scala.inline
  def apply(
    changed: ISignal[IAttachmentModel_, Unit],
    data: ReadonlyPartialJSONObject,
    dispose: () => Unit,
    metadata: ReadonlyPartialJSONObject,
    setData: ISetDataOptions => Unit,
    toJSON: () => IMimeBundle,
    trusted: Boolean
  ): IAttachmentModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachmentModel_]
  }
  
  @scala.inline
  implicit class IAttachmentModel_Ops[Self <: IAttachmentModel_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChanged(value: ISignal[IAttachmentModel_, Unit]): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => IMimeBundle): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
