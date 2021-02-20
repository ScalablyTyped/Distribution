package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOrderDealsRequest extends StObject {
  
  /** The list of deals to add */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.native
  
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.native
}
object AddOrderDealsRequest {
  
  @scala.inline
  def apply(): AddOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOrderDealsRequest]
  }
  
  @scala.inline
  implicit class AddOrderDealsRequestMutableBuilder[Self <: AddOrderDealsRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
