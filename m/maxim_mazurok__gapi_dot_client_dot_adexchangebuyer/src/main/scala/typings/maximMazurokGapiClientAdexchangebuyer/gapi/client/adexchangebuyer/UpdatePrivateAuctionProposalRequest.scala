package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePrivateAuctionProposalRequest extends StObject {
  
  /** The externalDealId of the deal to be updated. */
  var externalDealId: js.UndefOr[String] = js.native
  
  /** Optional note to be added. */
  var note: js.UndefOr[MarketplaceNote] = js.native
  
  /** The current revision number of the proposal to be updated. */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  
  /** The proposed action on the private auction proposal. */
  var updateAction: js.UndefOr[String] = js.native
}
object UpdatePrivateAuctionProposalRequest {
  
  @scala.inline
  def apply(): UpdatePrivateAuctionProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePrivateAuctionProposalRequest]
  }
  
  @scala.inline
  implicit class UpdatePrivateAuctionProposalRequestMutableBuilder[Self <: UpdatePrivateAuctionProposalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    @scala.inline
    def setNote(value: MarketplaceNote): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
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
