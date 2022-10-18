package typings.ipfsCoreTypes.distSrcConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MDNSDiscovery extends StObject {
  
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  var Interval: js.UndefOr[Double] = js.undefined
}
object MDNSDiscovery {
  
  inline def apply(): MDNSDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDNSDiscovery]
  }
  
  extension [Self <: MDNSDiscovery](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
  }
}
