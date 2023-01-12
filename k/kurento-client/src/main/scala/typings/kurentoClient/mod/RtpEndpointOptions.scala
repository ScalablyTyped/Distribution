package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtpEndpointOptions extends StObject {
  
  var crypto: js.UndefOr[SDES] = js.undefined
  
  var useIpv6: js.UndefOr[Boolean] = js.undefined
}
object RtpEndpointOptions {
  
  inline def apply(): RtpEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RtpEndpointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RtpEndpointOptions] (val x: Self) extends AnyVal {
    
    inline def setCrypto(value: SDES): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
    
    inline def setUseIpv6(value: Boolean): Self = StObject.set(x, "useIpv6", value.asInstanceOf[js.Any])
    
    inline def setUseIpv6Undefined: Self = StObject.set(x, "useIpv6", js.undefined)
  }
}
