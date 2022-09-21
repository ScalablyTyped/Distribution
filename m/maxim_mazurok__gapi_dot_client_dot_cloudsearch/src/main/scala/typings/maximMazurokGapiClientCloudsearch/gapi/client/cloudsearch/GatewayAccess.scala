package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayAccess extends StObject {
  
  /** Whether third-party gateway accesses are enabled for this meeting space. If enabled, the actual access code can be retrieved by calling the GetGatewayAccess RPC method. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object GatewayAccess {
  
  inline def apply(): GatewayAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayAccess]
  }
  
  extension [Self <: GatewayAccess](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
