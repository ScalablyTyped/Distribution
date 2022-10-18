package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRTCStarDiscovery extends StObject {
  
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object WebRTCStarDiscovery {
  
  inline def apply(): WebRTCStarDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebRTCStarDiscovery]
  }
  
  extension [Self <: WebRTCStarDiscovery](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
