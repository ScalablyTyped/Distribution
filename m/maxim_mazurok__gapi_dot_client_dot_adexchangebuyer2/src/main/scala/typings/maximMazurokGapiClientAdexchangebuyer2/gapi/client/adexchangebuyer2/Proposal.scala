package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proposal extends js.Object {
  
  /** Output only. Reference to the buyer that will get billed for this proposal. */
  var billedBuyer: js.UndefOr[Buyer] = js.native
  
  /** Reference to the buyer on the proposal. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an error. */
  var buyer: js.UndefOr[Buyer] = js.native
  
  /** Contact information for the buyer. */
  var buyerContacts: js.UndefOr[js.Array[ContactInformation]] = js.native
  
  /** Private data for buyer. (hidden from seller). */
  var buyerPrivateData: js.UndefOr[PrivateData] = js.native
  
  /** The deals associated with this proposal. For Private Auction proposals (whose deals have NonGuaranteedAuctionTerms), there will only be one deal. */
  var deals: js.UndefOr[js.Array[Deal]] = js.native
  
  /** The name for the proposal. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. True if the proposal is being renegotiated. */
  var isRenegotiating: js.UndefOr[Boolean] = js.native
  
  /** Output only. True, if the buyside inventory setup is complete for this proposal. */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  
  /** Output only. The role of the last user that either updated the proposal or left a comment. */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.native
  
  /** Output only. The notes associated with this proposal. */
  var notes: js.UndefOr[js.Array[Note]] = js.native
  
  /** Output only. Indicates whether the buyer/seller created the proposal. */
  var originatorRole: js.UndefOr[String] = js.native
  
  /** Output only. Private auction ID if this proposal is a private auction proposal. */
  var privateAuctionId: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the proposal. */
  var proposalId: js.UndefOr[String] = js.native
  
  /**
    * Output only. The revision number for the proposal. Each update to the proposal or the deal causes the proposal revision number to auto-increment. The buyer keeps track of the last
    * revision number they know of and pass it in when making an update. If the head revision number on the server has since incremented, then an ABORTED error is returned during the
    * update operation to let the buyer know that a subsequent update was made.
    */
  var proposalRevision: js.UndefOr[String] = js.native
  
  /** Output only. The current state of the proposal. */
  var proposalState: js.UndefOr[String] = js.native
  
  /** Reference to the seller on the proposal. Note: This field may be set only when creating the resource. Modifying this field while updating the resource will result in an error. */
  var seller: js.UndefOr[Seller] = js.native
  
  /** Output only. Contact information for the seller. */
  var sellerContacts: js.UndefOr[js.Array[ContactInformation]] = js.native
  
  /** Output only. The time when the proposal was last revised. */
  var updateTime: js.UndefOr[String] = js.native
}
object Proposal {
  
  @scala.inline
  def apply(): Proposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Proposal]
  }
  
  @scala.inline
  implicit class ProposalOps[Self <: Proposal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBilledBuyer(value: Buyer): Self = this.set("billedBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilledBuyer: Self = this.set("billedBuyer", js.undefined)
    
    @scala.inline
    def setBuyer(value: Buyer): Self = this.set("buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer: Self = this.set("buyer", js.undefined)
    
    @scala.inline
    def setBuyerContactsVarargs(value: ContactInformation*): Self = this.set("buyerContacts", js.Array(value :_*))
    
    @scala.inline
    def setBuyerContacts(value: js.Array[ContactInformation]): Self = this.set("buyerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerContacts: Self = this.set("buyerContacts", js.undefined)
    
    @scala.inline
    def setBuyerPrivateData(value: PrivateData): Self = this.set("buyerPrivateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerPrivateData: Self = this.set("buyerPrivateData", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: Deal*): Self = this.set("deals", js.Array(value :_*))
    
    @scala.inline
    def setDeals(value: js.Array[Deal]): Self = this.set("deals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeals: Self = this.set("deals", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setIsRenegotiating(value: Boolean): Self = this.set("isRenegotiating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRenegotiating: Self = this.set("isRenegotiating", js.undefined)
    
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = this.set("isSetupComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSetupComplete: Self = this.set("isSetupComplete", js.undefined)
    
    @scala.inline
    def setLastUpdaterOrCommentorRole(value: String): Self = this.set("lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdaterOrCommentorRole: Self = this.set("lastUpdaterOrCommentorRole", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: Note*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[Note]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setOriginatorRole(value: String): Self = this.set("originatorRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginatorRole: Self = this.set("originatorRole", js.undefined)
    
    @scala.inline
    def setPrivateAuctionId(value: String): Self = this.set("privateAuctionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateAuctionId: Self = this.set("privateAuctionId", js.undefined)
    
    @scala.inline
    def setProposalId(value: String): Self = this.set("proposalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalId: Self = this.set("proposalId", js.undefined)
    
    @scala.inline
    def setProposalRevision(value: String): Self = this.set("proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalRevision: Self = this.set("proposalRevision", js.undefined)
    
    @scala.inline
    def setProposalState(value: String): Self = this.set("proposalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalState: Self = this.set("proposalState", js.undefined)
    
    @scala.inline
    def setSeller(value: Seller): Self = this.set("seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    
    @scala.inline
    def setSellerContactsVarargs(value: ContactInformation*): Self = this.set("sellerContacts", js.Array(value :_*))
    
    @scala.inline
    def setSellerContacts(value: js.Array[ContactInformation]): Self = this.set("sellerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerContacts: Self = this.set("sellerContacts", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
