package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proposal extends StObject {
  
  /** Output only. Reference to the buyer that will get billed for this proposal. */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  
  /** Reference to the buyer on the proposal. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an error. */
  var buyer: js.UndefOr[Buyer] = js.undefined
  
  /** Contact information for the buyer. */
  var buyerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  
  /** Private data for buyer. (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.undefined
  
  /** The deals associated with this proposal. For Private Auction proposals (whose deals have NonGuaranteedAuctionTerms), there will only be one deal. */
  var deals: js.UndefOr[js.Array[Deal]] = js.undefined
  
  /** The name for the proposal. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. True if the proposal is being renegotiated. */
  var isRenegotiating: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. True, if the buyside inventory setup is complete for this proposal. */
  var isSetupComplete: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The role of the last user that either updated the proposal or left a comment. */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.undefined
  
  /** Output only. The notes associated with this proposal. */
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
  
  /** Output only. Indicates whether the buyer/seller created the proposal. */
  var originatorRole: js.UndefOr[String] = js.undefined
  
  /** Output only. Private auction ID if this proposal is a private auction proposal. */
  var privateAuctionId: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the proposal. */
  var proposalId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The revision number for the proposal. Each update to the proposal or the deal causes the proposal revision number to auto-increment. The buyer keeps track of the last
    * revision number they know of and pass it in when making an update. If the head revision number on the server has since incremented, then an ABORTED error is returned during the
    * update operation to let the buyer know that a subsequent update was made.
    */
  var proposalRevision: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of the proposal. */
  var proposalState: js.UndefOr[String] = js.undefined
  
  /** Reference to the seller on the proposal. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an error. */
  var seller: js.UndefOr[Seller] = js.undefined
  
  /** Output only. Contact information for the seller. */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.undefined
  
  /** Output only. The time when the proposal was last revised. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Proposal {
  
  inline def apply(): Proposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proposal]
  }
  
  extension [Self <: Proposal](x: Self) {
    
    inline def setBilledBuyer(value: Buyer): Self = StObject.set(x, "billedBuyer", value.asInstanceOf[js.Any])
    
    inline def setBilledBuyerUndefined: Self = StObject.set(x, "billedBuyer", js.undefined)
    
    inline def setBuyer(value: Buyer): Self = StObject.set(x, "buyer", value.asInstanceOf[js.Any])
    
    inline def setBuyerContacts(value: js.Array[ContactInformation]): Self = StObject.set(x, "buyerContacts", value.asInstanceOf[js.Any])
    
    inline def setBuyerContactsUndefined: Self = StObject.set(x, "buyerContacts", js.undefined)
    
    inline def setBuyerContactsVarargs(value: ContactInformation*): Self = StObject.set(x, "buyerContacts", js.Array(value :_*))
    
    inline def setBuyerPrivateData(value: PrivateData): Self = StObject.set(x, "buyerPrivateData", value.asInstanceOf[js.Any])
    
    inline def setBuyerPrivateDataUndefined: Self = StObject.set(x, "buyerPrivateData", js.undefined)
    
    inline def setBuyerUndefined: Self = StObject.set(x, "buyer", js.undefined)
    
    inline def setDeals(value: js.Array[Deal]): Self = StObject.set(x, "deals", value.asInstanceOf[js.Any])
    
    inline def setDealsUndefined: Self = StObject.set(x, "deals", js.undefined)
    
    inline def setDealsVarargs(value: Deal*): Self = StObject.set(x, "deals", js.Array(value :_*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsRenegotiating(value: Boolean): Self = StObject.set(x, "isRenegotiating", value.asInstanceOf[js.Any])
    
    inline def setIsRenegotiatingUndefined: Self = StObject.set(x, "isRenegotiating", js.undefined)
    
    inline def setIsSetupComplete(value: Boolean): Self = StObject.set(x, "isSetupComplete", value.asInstanceOf[js.Any])
    
    inline def setIsSetupCompleteUndefined: Self = StObject.set(x, "isSetupComplete", js.undefined)
    
    inline def setLastUpdaterOrCommentorRole(value: String): Self = StObject.set(x, "lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    
    inline def setLastUpdaterOrCommentorRoleUndefined: Self = StObject.set(x, "lastUpdaterOrCommentorRole", js.undefined)
    
    inline def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    inline def setOriginatorRole(value: String): Self = StObject.set(x, "originatorRole", value.asInstanceOf[js.Any])
    
    inline def setOriginatorRoleUndefined: Self = StObject.set(x, "originatorRole", js.undefined)
    
    inline def setPrivateAuctionId(value: String): Self = StObject.set(x, "privateAuctionId", value.asInstanceOf[js.Any])
    
    inline def setPrivateAuctionIdUndefined: Self = StObject.set(x, "privateAuctionId", js.undefined)
    
    inline def setProposalId(value: String): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    
    inline def setProposalRevision(value: String): Self = StObject.set(x, "proposalRevision", value.asInstanceOf[js.Any])
    
    inline def setProposalRevisionUndefined: Self = StObject.set(x, "proposalRevision", js.undefined)
    
    inline def setProposalState(value: String): Self = StObject.set(x, "proposalState", value.asInstanceOf[js.Any])
    
    inline def setProposalStateUndefined: Self = StObject.set(x, "proposalState", js.undefined)
    
    inline def setSeller(value: Seller): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerContacts(value: js.Array[ContactInformation]): Self = StObject.set(x, "sellerContacts", value.asInstanceOf[js.Any])
    
    inline def setSellerContactsUndefined: Self = StObject.set(x, "sellerContacts", js.undefined)
    
    inline def setSellerContactsVarargs(value: ContactInformation*): Self = StObject.set(x, "sellerContacts", js.Array(value :_*))
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
