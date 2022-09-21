package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkPerformanceConfig extends StObject {
  
  /**
    * Specifies the total network bandwidth tier for the NodePool.
    */
  var totalEgressBandwidthTier: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkPerformanceConfig {
  
  inline def apply(): SchemaNetworkPerformanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPerformanceConfig]
  }
  
  extension [Self <: SchemaNetworkPerformanceConfig](x: Self) {
    
    inline def setTotalEgressBandwidthTier(value: String): Self = StObject.set(x, "totalEgressBandwidthTier", value.asInstanceOf[js.Any])
    
    inline def setTotalEgressBandwidthTierNull: Self = StObject.set(x, "totalEgressBandwidthTier", null)
    
    inline def setTotalEgressBandwidthTierUndefined: Self = StObject.set(x, "totalEgressBandwidthTier", js.undefined)
  }
}
