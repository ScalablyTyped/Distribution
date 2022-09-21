package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdatePrivateAuctionProposalRequest extends StObject {
  
  /**
    * The externalDealId of the deal to be updated.
    */
  var externalDealId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional note to be added.
    */
  var note: js.UndefOr[SchemaMarketplaceNote] = js.undefined
  
  /**
    * The current revision number of the proposal to be updated.
    */
  var proposalRevisionNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The proposed action on the private auction proposal.
    */
  var updateAction: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdatePrivateAuctionProposalRequest {
  
  inline def apply(): SchemaUpdatePrivateAuctionProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePrivateAuctionProposalRequest]
  }
  
  extension [Self <: SchemaUpdatePrivateAuctionProposalRequest](x: Self) {
    
    inline def setExternalDealId(value: String): Self = StObject.set(x, "externalDealId", value.asInstanceOf[js.Any])
    
    inline def setExternalDealIdNull: Self = StObject.set(x, "externalDealId", null)
    
    inline def setExternalDealIdUndefined: Self = StObject.set(x, "externalDealId", js.undefined)
    
    inline def setNote(value: SchemaMarketplaceNote): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setProposalRevisionNumber(value: String): Self = StObject.set(x, "proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionNumberNull: Self = StObject.set(x, "proposalRevisionNumber", null)
    
    inline def setProposalRevisionNumberUndefined: Self = StObject.set(x, "proposalRevisionNumber", js.undefined)
    
    inline def setUpdateAction(value: String): Self = StObject.set(x, "updateAction", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionNull: Self = StObject.set(x, "updateAction", null)
    
    inline def setUpdateActionUndefined: Self = StObject.set(x, "updateAction", js.undefined)
  }
}
