package typings.jupyterlabServices.anon

import typings.jupyterlabServices.terminalRestapiMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/terminal/terminal.ITerminalConnection.IOptions, 'serverSettings'> */
@js.native
trait OmitIOptionsserverSettingModel extends StObject {
  
  var model: IModel = js.native
}
object OmitIOptionsserverSettingModel {
  
  @scala.inline
  def apply(model: IModel): OmitIOptionsserverSettingModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsserverSettingModel]
  }
  
  @scala.inline
  implicit class OmitIOptionsserverSettingModelMutableBuilder[Self <: OmitIOptionsserverSettingModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
