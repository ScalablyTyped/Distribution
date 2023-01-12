package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session/session.ISessionConnection.IOptions, 'model' | 'connectToKernel' | 'serverSettings'> */
trait OmitIOptionsmodelconnectT extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var kernelConnectionOptions: js.UndefOr[OmitIOptionsmodelusername] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object OmitIOptionsmodelconnectT {
  
  inline def apply(): OmitIOptionsmodelconnectT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsmodelconnectT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitIOptionsmodelconnectT] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setKernelConnectionOptions(value: OmitIOptionsmodelusername): Self = StObject.set(x, "kernelConnectionOptions", value.asInstanceOf[js.Any])
    
    inline def setKernelConnectionOptionsUndefined: Self = StObject.set(x, "kernelConnectionOptions", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
