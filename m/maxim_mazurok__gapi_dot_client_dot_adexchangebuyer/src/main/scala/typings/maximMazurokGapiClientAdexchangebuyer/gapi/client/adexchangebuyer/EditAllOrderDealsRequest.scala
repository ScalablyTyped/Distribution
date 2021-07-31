package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditAllOrderDealsRequest extends StObject {
  
  /**
    * List of deals to edit. Service may perform 3 different operations based on comparison of deals in this list vs deals already persisted in database: 1. Add new deal to proposal If a
    * deal in this list does not exist in the proposal, the service will create a new deal and add it to the proposal. Validation will follow AddOrderDealsRequest. 2. Update existing deal
    * in the proposal If a deal in this list already exist in the proposal, the service will update that existing deal to this new deal in the request. Validation will follow
    * UpdateOrderDealsRequest. 3. Delete deals from the proposal (just need the id) If a existing deal in the proposal is not present in this list, the service will delete that deal from
    * the proposal. Validation will follow DeleteOrderDealsRequest.
    */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  
  /** If specified, also updates the proposal in the batch transaction. This is useful when the proposal and the deals need to be updated in one transaction. */
  var proposal: js.UndefOr[Proposal] = js.undefined
  
  /** The last known revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.undefined
}
object EditAllOrderDealsRequest {
  
  @scala.inline
  def apply(): EditAllOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAllOrderDealsRequest]
  }
  
  @scala.inline
  implicit class EditAllOrderDealsRequestMutableBuilder[Self <: EditAllOrderDealsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeals(value: js.Array[MarketplaceDeal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: MarketplaceDeal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    @scala.inline
    def setProposal(value: Proposal): Self = StObject.set(x, "proposal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    @scala.inline
    def setProposalUndefined: Self = StObject.set(x, "proposal", js.undefined)
    
    @scala.inline
    def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
