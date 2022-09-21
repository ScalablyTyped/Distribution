package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebServerNetworkAccessControl extends StObject {
  
  /** A collection of allowed IP ranges with descriptions. */
  var allowedIpRanges: js.UndefOr[js.Array[AllowedIpRange]] = js.undefined
}
object WebServerNetworkAccessControl {
  
  inline def apply(): WebServerNetworkAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebServerNetworkAccessControl]
  }
  
  extension [Self <: WebServerNetworkAccessControl](x: Self) {
    
    inline def setAllowedIpRanges(value: js.Array[AllowedIpRange]): Self = StObject.set(x, "allowedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setAllowedIpRangesUndefined: Self = StObject.set(x, "allowedIpRanges", js.undefined)
    
    inline def setAllowedIpRangesVarargs(value: AllowedIpRange*): Self = StObject.set(x, "allowedIpRanges", js.Array(value*))
  }
}
