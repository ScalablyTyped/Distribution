package typings.jupyterlabServices.anon

import typings.jupyterlabServices.libTerminalRestapiMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/terminal/terminal.ITerminalConnection.IOptions, 'serverSettings'> */
trait OmitIOptionsserverSettingModel extends StObject {
  
  var model: IModel
}
object OmitIOptionsserverSettingModel {
  
  inline def apply(model: IModel): OmitIOptionsserverSettingModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsserverSettingModel]
  }
  
  extension [Self <: OmitIOptionsserverSettingModel](x: Self) {
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
