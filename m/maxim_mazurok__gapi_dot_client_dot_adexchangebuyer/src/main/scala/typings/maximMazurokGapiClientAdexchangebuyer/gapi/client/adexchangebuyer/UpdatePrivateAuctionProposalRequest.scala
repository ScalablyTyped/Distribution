package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePrivateAuctionProposalRequest extends StObject {
  
  /** The externalDealId of the deal to be updated. */
  var externalDealId: js.UndefOr[String] = js.undefined
  
  /** Optional note to be added. */
  var note: js.UndefOr[MarketplaceNote] = js.undefined
  
  /** The current revision number of the proposal to be updated. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  
  /** The proposed action on the private auction proposal. */
  var updateAction: js.UndefOr[String] = js.undefined
}
object UpdatePrivateAuctionProposalRequest {
  
  inline def apply(): UpdatePrivateAuctionProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePrivateAuctionProposalRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePrivateAuctionProposalRequest] (val x: Self) extends AnyVal {
    
    inline def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    inline def setNote(value: MarketplaceNote): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
