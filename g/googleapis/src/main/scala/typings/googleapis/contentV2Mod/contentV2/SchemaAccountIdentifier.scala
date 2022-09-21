package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountIdentifier extends StObject {
  
  /**
    * The aggregator ID, set for aggregators and subaccounts (in that case, it represents the aggregator of the subaccount).
    */
  var aggregatorId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The merchant account ID, set for individual accounts and subaccounts.
    */
  var merchantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountIdentifier {
  
  inline def apply(): SchemaAccountIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountIdentifier]
  }
  
  extension [Self <: SchemaAccountIdentifier](x: Self) {
    
    inline def setAggregatorId(value: String): Self = StObject.set(x, "aggregatorId", value.asInstanceOf[js.Any])
    
    inline def setAggregatorIdNull: Self = StObject.set(x, "aggregatorId", null)
    
    inline def setAggregatorIdUndefined: Self = StObject.set(x, "aggregatorId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdNull: Self = StObject.set(x, "merchantId", null)
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
