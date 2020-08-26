package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a proposal in the marketplace. A proposal is the unit of
  * negotiation between a seller and a buyer and contains deals which are
  * served. Each field in a proposal can have one of the following setting:
  * (readonly) - It is an error to try and set this field. (buyer-readonly) -
  * Only the seller can set this field. (seller-readonly) - Only the buyer can
  * set this field. (updatable) - The field is updatable at all times by either
  * buyer or the seller.
  */
@js.native
trait SchemaProposal extends js.Object {
  /**
    * Reference to the buyer that will get billed for this proposal. (readonly)
    */
  var billedBuyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * Reference to the buyer on the proposal. (readonly, except on create)
    */
  var buyer: js.UndefOr[SchemaBuyer] = js.native
  /**
    * Optional contact information of the buyer. (seller-readonly)
    */
  var buyerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * Private data for buyer. (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  /**
    * IDs of DBM advertisers permission to this proposal.
    */
  var dbmAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has
    * signed off. Once both sides have signed off on a deal, the proposal can
    * be finalized by the seller. (seller-readonly)
    */
  var hasBuyerSignedOff: js.UndefOr[Boolean] = js.native
  /**
    * When an proposal is in an accepted state, indicates whether the buyer has
    * signed off Once both sides have signed off on a deal, the proposal can be
    * finalized by the seller. (buyer-readonly)
    */
  var hasSellerSignedOff: js.UndefOr[Boolean] = js.native
  /**
    * What exchange will provide this inventory (readonly, except on create).
    */
  var inventorySource: js.UndefOr[String] = js.native
  /**
    * True if the proposal is being renegotiated (readonly).
    */
  var isRenegotiating: js.UndefOr[Boolean] = js.native
  /**
    * True, if the buyside inventory setup is complete for this proposal.
    * (readonly, except via OrderSetupCompleted action) Deprecated in favor of
    * deal level setup complete flag.
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;adexchangebuyer#proposal&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * List of labels associated with the proposal. (readonly)
    */
  var labels: js.UndefOr[js.Array[SchemaMarketplaceLabel]] = js.native
  /**
    * The role of the last user that either updated the proposal or left a
    * comment. (readonly)
    */
  var lastUpdaterOrCommentorRole: js.UndefOr[String] = js.native
  /**
    * The name for the proposal (updatable)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional negotiation id if this proposal is a preferred deal proposal.
    */
  var negotiationId: js.UndefOr[String] = js.native
  /**
    * Indicates whether the buyer/seller created the proposal.(readonly)
    */
  var originatorRole: js.UndefOr[String] = js.native
  /**
    * Optional private auction id if this proposal is a private auction
    * proposal.
    */
  var privateAuctionId: js.UndefOr[String] = js.native
  /**
    * The unique id of the proposal. (readonly).
    */
  var proposalId: js.UndefOr[String] = js.native
  /**
    * The current state of the proposal. (readonly)
    */
  var proposalState: js.UndefOr[String] = js.native
  /**
    * The revision number for the proposal (readonly).
    */
  var revisionNumber: js.UndefOr[String] = js.native
  /**
    * The time (ms since epoch) when the proposal was last revised (readonly).
    */
  var revisionTimeMs: js.UndefOr[String] = js.native
  /**
    * Reference to the seller on the proposal. (readonly, except on create)
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * Optional contact information of the seller (buyer-readonly).
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
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
    def setDbmAdvertiserIdsVarargs(value: String*): Self = this.set("dbmAdvertiserIds", js.Array(value :_*))
    @scala.inline
    def setDbmAdvertiserIds(value: js.Array[String]): Self = this.set("dbmAdvertiserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbmAdvertiserIds: Self = this.set("dbmAdvertiserIds", js.undefined)
    @scala.inline
    def setHasBuyerSignedOff(value: Boolean): Self = this.set("hasBuyerSignedOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBuyerSignedOff: Self = this.set("hasBuyerSignedOff", js.undefined)
    @scala.inline
    def setHasSellerSignedOff(value: Boolean): Self = this.set("hasSellerSignedOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSellerSignedOff: Self = this.set("hasSellerSignedOff", js.undefined)
    @scala.inline
    def setInventorySource(value: String): Self = this.set("inventorySource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventorySource: Self = this.set("inventorySource", js.undefined)
    @scala.inline
    def setIsRenegotiating(value: Boolean): Self = this.set("isRenegotiating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRenegotiating: Self = this.set("isRenegotiating", js.undefined)
    @scala.inline
    def setIsSetupComplete(value: Boolean): Self = this.set("isSetupComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSetupComplete: Self = this.set("isSetupComplete", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: SchemaMarketplaceLabel*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[SchemaMarketplaceLabel]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLastUpdaterOrCommentorRole(value: String): Self = this.set("lastUpdaterOrCommentorRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdaterOrCommentorRole: Self = this.set("lastUpdaterOrCommentorRole", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNegotiationId(value: String): Self = this.set("negotiationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegotiationId: Self = this.set("negotiationId", js.undefined)
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
    def setProposalState(value: String): Self = this.set("proposalState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposalState: Self = this.set("proposalState", js.undefined)
    @scala.inline
    def setRevisionNumber(value: String): Self = this.set("revisionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionNumber: Self = this.set("revisionNumber", js.undefined)
    @scala.inline
    def setRevisionTimeMs(value: String): Self = this.set("revisionTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionTimeMs: Self = this.set("revisionTimeMs", js.undefined)
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
  }
  
}

