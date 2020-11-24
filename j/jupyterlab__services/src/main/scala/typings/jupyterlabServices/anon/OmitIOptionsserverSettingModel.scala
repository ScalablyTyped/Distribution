package typings.jupyterlabServices.anon

import typings.jupyterlabServices.terminalRestapiMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/terminal/terminal.ITerminalConnection.IOptions, 'serverSettings'> */
@js.native
trait OmitIOptionsserverSettingModel extends js.Object {
  
  var model: IModel = js.native
}
object OmitIOptionsserverSettingModel {
  
  @scala.inline
  def apply(model: IModel): OmitIOptionsserverSettingModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsserverSettingModel]
  }
  
  @scala.inline
  implicit class OmitIOptionsserverSettingModelOps[Self <: OmitIOptionsserverSettingModel] (val x: Self) extends AnyVal {
    
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
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
