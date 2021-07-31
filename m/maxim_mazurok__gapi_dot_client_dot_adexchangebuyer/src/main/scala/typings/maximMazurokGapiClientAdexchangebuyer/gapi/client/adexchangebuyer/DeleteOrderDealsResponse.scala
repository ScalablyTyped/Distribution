package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrderDealsResponse extends StObject {
  
  /** List of deals deleted (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
}
object DeleteOrderDealsResponse {
  
  @scala.inline
  def apply(): DeleteOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrderDealsResponse]
  }
  
  @scala.inline
  implicit class DeleteOrderDealsResponseMutableBuilder[Self <: DeleteOrderDealsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeals(value: js.Array[MarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: MarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
  }
}
