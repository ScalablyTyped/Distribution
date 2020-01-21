package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    billedBuyer: SchemaBuyer = null,
    buyer: SchemaBuyer = null,
    buyerContacts: js.Array[SchemaContactInformation] = null,
    buyerPrivateData: SchemaPrivateData = null,
    deals: js.Array[SchemaDeal] = null,
    displayName: String = null,
    isRenegotiating: js.UndefOr[Boolean] = js.undefined,
    isSetupComplete: js.UndefOr[Boolean] = js.undefined,
    lastUpdaterOrCommentorRole: String = null,
    notes: js.Array[SchemaNote] = null,
    originatorRole: String = null,
    privateAuctionId: String = null,
    proposalId: String = null,
    proposalRevision: String = null,
    proposalState: String = null,
    seller: SchemaSeller = null,
    sellerContacts: js.Array[SchemaContactInformation] = null,
    updateTime: String = null
  ): SchemaProposal = {
    val __obj = js.Dynamic.literal()
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (buyerContacts != null) __obj.updateDynamic("buyerContacts")(buyerContacts.asInstanceOf[js.Any])
    if (buyerPrivateData != null) __obj.updateDynamic("buyerPrivateData")(buyerPrivateData.asInstanceOf[js.Any])
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isRenegotiating)) __obj.updateDynamic("isRenegotiating")(isRenegotiating.asInstanceOf[js.Any])
    if (!js.isUndefined(isSetupComplete)) __obj.updateDynamic("isSetupComplete")(isSetupComplete.asInstanceOf[js.Any])
    if (lastUpdaterOrCommentorRole != null) __obj.updateDynamic("lastUpdaterOrCommentorRole")(lastUpdaterOrCommentorRole.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (originatorRole != null) __obj.updateDynamic("originatorRole")(originatorRole.asInstanceOf[js.Any])
    if (privateAuctionId != null) __obj.updateDynamic("privateAuctionId")(privateAuctionId.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (proposalRevision != null) __obj.updateDynamic("proposalRevision")(proposalRevision.asInstanceOf[js.Any])
    if (proposalState != null) __obj.updateDynamic("proposalState")(proposalState.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (sellerContacts != null) __obj.updateDynamic("sellerContacts")(sellerContacts.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProposal]
  }
}

