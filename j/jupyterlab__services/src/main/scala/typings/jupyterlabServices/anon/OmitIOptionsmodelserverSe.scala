package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'model' | 'serverSettings'> */
trait OmitIOptionsmodelserverSe extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var handleComms: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object OmitIOptionsmodelserverSe {
  
  inline def apply(): OmitIOptionsmodelserverSe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsmodelserverSe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitIOptionsmodelserverSe] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
    
    inline def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
