package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdentifier extends StObject {
  
  /** The aggregator ID, set for aggregators and subaccounts (in that case, it represents the aggregator of the subaccount). */
  var aggregatorId: js.UndefOr[String] = js.undefined
  
  /** The merchant account ID, set for individual accounts and subaccounts. */
  var merchantId: js.UndefOr[String] = js.undefined
}
object AccountIdentifier {
  
  inline def apply(): AccountIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountIdentifier] (val x: Self) extends AnyVal {
    
    inline def setAggregatorId(value: String): Self = StObject.set(x, "aggregatorId", value.asInstanceOf[js.Any])
    
    inline def setAggregatorIdUndefined: Self = StObject.set(x, "aggregatorId", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
