package typings.jupyterlabServices.anon

import typings.jupyterlabServices.libKernelRestapiMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'serverSettings'> */
trait OmitIOptionsserverSetting extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var handleComms: js.UndefOr[Boolean] = js.undefined
  
  var model: IModel
  
  var username: js.UndefOr[String] = js.undefined
}
object OmitIOptionsserverSetting {
  
  inline def apply(model: IModel): OmitIOptionsserverSetting = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitIOptionsserverSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitIOptionsserverSetting] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
    
    inline def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
