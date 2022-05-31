package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel/kernel.IKernelConnection.IOptions, 'clientId' | 'username' | 'handleComms'> */
trait PickIOptionsclientIdusern extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var handleComms: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object PickIOptionsclientIdusern {
  
  inline def apply(): PickIOptionsclientIdusern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIOptionsclientIdusern]
  }
  
  extension [Self <: PickIOptionsclientIdusern](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
    
    inline def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
