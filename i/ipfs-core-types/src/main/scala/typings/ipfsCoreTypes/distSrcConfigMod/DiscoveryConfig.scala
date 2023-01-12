package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryConfig extends StObject {
  
  var MDNS: js.UndefOr[MDNSDiscovery] = js.undefined
  
  var webRTCStar: js.UndefOr[WebRTCStarDiscovery] = js.undefined
}
object DiscoveryConfig {
  
  inline def apply(): DiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryConfig] (val x: Self) extends AnyVal {
    
    inline def setMDNS(value: MDNSDiscovery): Self = StObject.set(x, "MDNS", value.asInstanceOf[js.Any])
    
    inline def setMDNSUndefined: Self = StObject.set(x, "MDNS", js.undefined)
    
    inline def setWebRTCStar(value: WebRTCStarDiscovery): Self = StObject.set(x, "webRTCStar", value.asInstanceOf[js.Any])
    
    inline def setWebRTCStarUndefined: Self = StObject.set(x, "webRTCStar", js.undefined)
  }
}
