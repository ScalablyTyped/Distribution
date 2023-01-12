package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkPerformanceConfig extends StObject {
  
  /** Specifies the total network bandwidth tier for the NodePool. */
  var totalEgressBandwidthTier: js.UndefOr[String] = js.undefined
}
object NetworkPerformanceConfig {
  
  inline def apply(): NetworkPerformanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPerformanceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkPerformanceConfig] (val x: Self) extends AnyVal {
    
    inline def setTotalEgressBandwidthTier(value: String): Self = StObject.set(x, "totalEgressBandwidthTier", value.asInstanceOf[js.Any])
    
    inline def setTotalEgressBandwidthTierUndefined: Self = StObject.set(x, "totalEgressBandwidthTier", js.undefined)
  }
}
