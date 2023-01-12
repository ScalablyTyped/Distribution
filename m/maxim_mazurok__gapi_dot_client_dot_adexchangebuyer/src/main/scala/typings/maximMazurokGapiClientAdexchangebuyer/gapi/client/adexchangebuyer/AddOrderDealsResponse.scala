package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOrderDealsResponse extends StObject {
  
  /** List of deals added (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
}
object AddOrderDealsResponse {
  
  inline def apply(): AddOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderDealsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddOrderDealsResponse] (val x: Self) extends AnyVal {
    
    inline def setDeals(value: js.Array[MarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: MarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value*))
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
  }
}
