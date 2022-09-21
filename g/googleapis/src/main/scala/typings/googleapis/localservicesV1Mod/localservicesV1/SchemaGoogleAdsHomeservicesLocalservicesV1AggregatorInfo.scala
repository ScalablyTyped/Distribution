package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo extends StObject {
  
  /**
    * Provider id (listed in aggregator system) which maps to a account id in GLS system.
    */
  var aggregatorProviderId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1AggregatorInfo](x: Self) {
    
    inline def setAggregatorProviderId(value: String): Self = StObject.set(x, "aggregatorProviderId", value.asInstanceOf[js.Any])
    
    inline def setAggregatorProviderIdNull: Self = StObject.set(x, "aggregatorProviderId", null)
    
    inline def setAggregatorProviderIdUndefined: Self = StObject.set(x, "aggregatorProviderId", js.undefined)
  }
}
