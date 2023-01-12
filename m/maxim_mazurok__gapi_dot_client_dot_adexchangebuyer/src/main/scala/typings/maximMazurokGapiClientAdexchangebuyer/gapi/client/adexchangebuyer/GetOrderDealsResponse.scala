package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderDealsResponse extends StObject {
  
  /** List of deals for the proposal */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
}
object GetOrderDealsResponse {
  
  inline def apply(): GetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrderDealsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOrderDealsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeals(value: js.Array[MarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: MarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value*))
  }
}
