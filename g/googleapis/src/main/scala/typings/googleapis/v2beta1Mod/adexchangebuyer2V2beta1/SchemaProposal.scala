package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  Represents a proposal
  * in the Marketplace. A proposal is the unit of negotiation between a seller
  * and a buyer and contains deals which are served.  Note: you can not update,
  * create, or otherwise modify Private Auction or Preferred Deals deals
  * through the API.  Fields are updatable unless noted otherwise.
  */
@js.native
trait SchemaProposal extends js.Object {
  
  /**
    * Reference to the buyer that will get billed for this proposal.
    * @OutputOnly
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.native
  
  /**
    * Reference to the buyer on the proposal.  Note: This field may be set only
    * when creating the resource. Modifying this field while updating the
    * resource will result in an error.
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  
  /**
    * Contact information for the buyer.
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  
  /**
    * Private data for buyer. (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  
  /**
    * The deals associated with this proposal. For Private Auction proposals
    * (whose deals have NonGuaranteedAuctionTerms), there will only be one
    * deal.
    */
  var deals: js.UndefOr[js.Array[SchemaDeal]] = js.native
  
  /**
    * The name for the proposal.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * True if the proposal is being renegotiated. @OutputOnly
    */
  var isRenegotiating: js.UndefOr[Boolean] = js.native
  
  /**
    * True, if the buyside inventory setup is complete for this proposal.
    * @OutputOnly
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * The role of the last user that either updated the proposal or left a
    * comment. @OutputOnly
    */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.native
  
  /**
    * The notes associated with this proposal. @OutputOnly
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.native
  
  /**
    * Indicates whether the buyer/seller created the proposal. @OutputOnly
    */
  var originatorRole: js.UndefOr[String] = js.native
  
  /**
    * Private auction ID if this proposal is a private auction proposal.
    * @OutputOnly
    */
  var privateAuctionId: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the proposal. @OutputOnly
    */
  var proposalId: js.UndefOr[String] = js.native
  
  /**
    * The revision number for the proposal. Each update to the proposal or the
    * deal causes the proposal revision number to auto-increment. The buyer
    * keeps track of the last revision number they know of and pass it in when
    * making an update. If the head revision number on the server has since
    * incremented, then an ABORTED error is returned during the update
    * operation to let the buyer know that a subsequent update was made.
    * @OutputOnly
    */
  var proposalRevision: js.UndefOr[String] = js.native
  
  /**
    * The current state of the proposal. @OutputOnly
    */
  var proposalState: js.UndefOr[String] = js.native
  
  /**
    * Reference to the seller on the proposal.  Note: This field may be set
    * only when creating the resource. Modifying this field while updating the
    * resource will result in an error.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  
  /**
    * Contact information for the seller. @OutputOnly
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  
  /**
    * The time when the proposal was last revised. @OutputOnly
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaProposal {
  
  @scala.inline
  def apply(): SchemaProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProposal]
  }
  
  @scala.inline
  implicit class SchemaProposalOps[Self <: SchemaProposal] (val x: Self) extends AnyVal {
    
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
    def setBilledBuyer(value: SchemaBuyer): Self = this.set("billedBuyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilledBuyer: Self = this.set("billedBuyer", js.undefined)
    
    @scala.inline
    def setBuyer(value: SchemaBuyer): Self = this.set("buyer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyer: Self = this.set("buyer", js.undefined)
    
    @scala.inline
    def setBuyerContactsVarargs(value: SchemaContactInformation*): Self = this.set("buyerContacts", js.Array(value :_*))
    
    @scala.inline
    def setBuyerContacts(value: js.Array[SchemaContactInformation]): Self = this.set("buyerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerContacts: Self = this.set("buyerContacts", js.undefined)
    
    @scala.inline
    def setBuyerPrivateData(value: SchemaPrivateData): Self = this.set("buyerPrivateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerPrivateData: Self = this.set("buyerPrivateData", js.undefined)
    
    @scala.inline
    def setDealsVarargs(value: SchemaDeal*): Self = this.set("deals", js.Array(value :_*))
    
    @scala.inline
    def setDeals(value: js.Array[SchemaDeal]): Self = this.set("deals", value.asInstanceOf[js.Any])
    
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
    def setNotesVarargs(value: SchemaNote*): Self = this.set("notes", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: js.Array[SchemaNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    
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
    def setSeller(value: SchemaSeller): Self = this.set("seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    
    @scala.inline
    def setSellerContactsVarargs(value: SchemaContactInformation*): Self = this.set("sellerContacts", js.Array(value :_*))
    
    @scala.inline
    def setSellerContacts(value: js.Array[SchemaContactInformation]): Self = this.set("sellerContacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellerContacts: Self = this.set("sellerContacts", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
