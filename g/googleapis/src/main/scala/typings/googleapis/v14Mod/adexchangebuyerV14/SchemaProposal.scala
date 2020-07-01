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
  def apply(
    billedBuyer: SchemaBuyer = null,
    buyer: SchemaBuyer = null,
    buyerContacts: js.Array[SchemaContactInformation] = null,
    buyerPrivateData: SchemaPrivateData = null,
    dbmAdvertiserIds: js.Array[String] = null,
    hasBuyerSignedOff: js.UndefOr[Boolean] = js.undefined,
    hasSellerSignedOff: js.UndefOr[Boolean] = js.undefined,
    inventorySource: String = null,
    isRenegotiating: js.UndefOr[Boolean] = js.undefined,
    isSetupComplete: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    labels: js.Array[SchemaMarketplaceLabel] = null,
    lastUpdaterOrCommentorRole: String = null,
    name: String = null,
    negotiationId: String = null,
    originatorRole: String = null,
    privateAuctionId: String = null,
    proposalId: String = null,
    proposalState: String = null,
    revisionNumber: String = null,
    revisionTimeMs: String = null,
    seller: SchemaSeller = null,
    sellerContacts: js.Array[SchemaContactInformation] = null
  ): SchemaProposal = {
    val __obj = js.Dynamic.literal()
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (buyerContacts != null) __obj.updateDynamic("buyerContacts")(buyerContacts.asInstanceOf[js.Any])
    if (buyerPrivateData != null) __obj.updateDynamic("buyerPrivateData")(buyerPrivateData.asInstanceOf[js.Any])
    if (dbmAdvertiserIds != null) __obj.updateDynamic("dbmAdvertiserIds")(dbmAdvertiserIds.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBuyerSignedOff)) __obj.updateDynamic("hasBuyerSignedOff")(hasBuyerSignedOff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSellerSignedOff)) __obj.updateDynamic("hasSellerSignedOff")(hasSellerSignedOff.get.asInstanceOf[js.Any])
    if (inventorySource != null) __obj.updateDynamic("inventorySource")(inventorySource.asInstanceOf[js.Any])
    if (!js.isUndefined(isRenegotiating)) __obj.updateDynamic("isRenegotiating")(isRenegotiating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSetupComplete)) __obj.updateDynamic("isSetupComplete")(isSetupComplete.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lastUpdaterOrCommentorRole != null) __obj.updateDynamic("lastUpdaterOrCommentorRole")(lastUpdaterOrCommentorRole.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negotiationId != null) __obj.updateDynamic("negotiationId")(negotiationId.asInstanceOf[js.Any])
    if (originatorRole != null) __obj.updateDynamic("originatorRole")(originatorRole.asInstanceOf[js.Any])
    if (privateAuctionId != null) __obj.updateDynamic("privateAuctionId")(privateAuctionId.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (proposalState != null) __obj.updateDynamic("proposalState")(proposalState.asInstanceOf[js.Any])
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    if (revisionTimeMs != null) __obj.updateDynamic("revisionTimeMs")(revisionTimeMs.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (sellerContacts != null) __obj.updateDynamic("sellerContacts")(sellerContacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProposal]
  }
}

