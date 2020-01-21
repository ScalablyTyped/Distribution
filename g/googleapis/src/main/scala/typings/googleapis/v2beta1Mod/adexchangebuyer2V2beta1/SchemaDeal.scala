package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A deal represents a segment of inventory for displaying ads on. A proposal
  * can contain multiple deals. A deal contains the terms and targeting
  * information that is used for serving.
  */
@js.native
trait SchemaDeal extends js.Object {
  /**
    * Proposed flight end time of the deal. This will generally be stored in a
    * granularity of a second. A value is not required for Private Auction
    * deals or Preferred Deals.
    */
  var availableEndTime: js.UndefOr[String] = js.native
  /**
    * Optional proposed flight start time of the deal. This will generally be
    * stored in the granularity of one second since deal serving starts at
    * seconds boundary. Any time specified with more granularity (e.g., in
    * milliseconds) will be truncated towards the start of time in seconds.
    */
  var availableStartTime: js.UndefOr[String] = js.native
  /**
    * Buyer private data (hidden from seller).
    */
  var buyerPrivateData: js.UndefOr[SchemaPrivateData] = js.native
  /**
    * The product ID from which this deal was created.  Note: This field may be
    * set only when creating the resource. Modifying this field while updating
    * the resource will result in an error.
    */
  var createProductId: js.UndefOr[String] = js.native
  /**
    * Optional revision number of the product that the deal was created from.
    * If present on create, and the server `product_revision` has advanced
    * sinced the passed-in `create_product_revision`, an `ABORTED` error will
    * be returned.  Note: This field may be set only when creating the
    * resource. Modifying this field while updating the resource will result in
    * an error.
    */
  var createProductRevision: js.UndefOr[String] = js.native
  /**
    * The time of the deal creation. @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Specifies the creative pre-approval policy. @OutputOnly
    */
  var creativePreApprovalPolicy: js.UndefOr[String] = js.native
  /**
    * Restricitions about the creatives associated with the deal (i.e., size)
    * This is available for Programmatic Guaranteed/Preferred Deals in Ad
    * Manager. @OutputOnly
    */
  var creativeRestrictions: js.UndefOr[SchemaCreativeRestrictions] = js.native
  /**
    * Specifies whether the creative is safeFrame compatible. @OutputOnly
    */
  var creativeSafeFrameCompatibility: js.UndefOr[String] = js.native
  /**
    * A unique deal ID for the deal (server-assigned). @OutputOnly
    */
  var dealId: js.UndefOr[String] = js.native
  /**
    * Metadata about the serving status of this deal. @OutputOnly
    */
  var dealServingMetadata: js.UndefOr[SchemaDealServingMetadata] = js.native
  /**
    * The negotiable terms of the deal.
    */
  var dealTerms: js.UndefOr[SchemaDealTerms] = js.native
  /**
    * The set of fields around delivery control that are interesting for a
    * buyer to see but are non-negotiable. These are set by the publisher.
    */
  var deliveryControl: js.UndefOr[SchemaDeliveryControl] = js.native
  /**
    * Description for the deal terms.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the deal.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The external deal ID assigned to this deal once the deal is finalized.
    * This is the deal ID that shows up in serving/reporting etc. @OutputOnly
    */
  var externalDealId: js.UndefOr[String] = js.native
  /**
    * True, if the buyside inventory setup is complete for this deal.
    * @OutputOnly
    */
  var isSetupComplete: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the creative source for programmatic deals. PUBLISHER means
    * creative is provided by seller and ADVERTISER means creative is provided
    * by buyer. @OutputOnly
    */
  var programmaticCreativeSource: js.UndefOr[String] = js.native
  /**
    * ID of the proposal that this deal is part of. @OutputOnly
    */
  var proposalId: js.UndefOr[String] = js.native
  /**
    * Seller contact information for the deal. @OutputOnly
    */
  var sellerContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * The syndication product associated with the deal.  Note: This field may
    * be set only when creating the resource. Modifying this field while
    * updating the resource will result in an error.
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  /**
    * Specifies the subset of inventory targeted by the deal. @OutputOnly
    */
  var targeting: js.UndefOr[SchemaMarketplaceTargeting] = js.native
  /**
    * The shared targeting visible to buyers and sellers. Each shared targeting
    * entity is AND&#39;d together.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.native
  /**
    * The time when the deal was last updated. @OutputOnly
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The web property code for the seller copied over from the product.
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object SchemaDeal {
  @scala.inline
  def apply(
    availableEndTime: String = null,
    availableStartTime: String = null,
    buyerPrivateData: SchemaPrivateData = null,
    createProductId: String = null,
    createProductRevision: String = null,
    createTime: String = null,
    creativePreApprovalPolicy: String = null,
    creativeRestrictions: SchemaCreativeRestrictions = null,
    creativeSafeFrameCompatibility: String = null,
    dealId: String = null,
    dealServingMetadata: SchemaDealServingMetadata = null,
    dealTerms: SchemaDealTerms = null,
    deliveryControl: SchemaDeliveryControl = null,
    description: String = null,
    displayName: String = null,
    externalDealId: String = null,
    isSetupComplete: js.UndefOr[Boolean] = js.undefined,
    programmaticCreativeSource: String = null,
    proposalId: String = null,
    sellerContacts: js.Array[SchemaContactInformation] = null,
    syndicationProduct: String = null,
    targeting: SchemaMarketplaceTargeting = null,
    targetingCriterion: js.Array[SchemaTargetingCriteria] = null,
    updateTime: String = null,
    webPropertyCode: String = null
  ): SchemaDeal = {
    val __obj = js.Dynamic.literal()
    if (availableEndTime != null) __obj.updateDynamic("availableEndTime")(availableEndTime.asInstanceOf[js.Any])
    if (availableStartTime != null) __obj.updateDynamic("availableStartTime")(availableStartTime.asInstanceOf[js.Any])
    if (buyerPrivateData != null) __obj.updateDynamic("buyerPrivateData")(buyerPrivateData.asInstanceOf[js.Any])
    if (createProductId != null) __obj.updateDynamic("createProductId")(createProductId.asInstanceOf[js.Any])
    if (createProductRevision != null) __obj.updateDynamic("createProductRevision")(createProductRevision.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (creativePreApprovalPolicy != null) __obj.updateDynamic("creativePreApprovalPolicy")(creativePreApprovalPolicy.asInstanceOf[js.Any])
    if (creativeRestrictions != null) __obj.updateDynamic("creativeRestrictions")(creativeRestrictions.asInstanceOf[js.Any])
    if (creativeSafeFrameCompatibility != null) __obj.updateDynamic("creativeSafeFrameCompatibility")(creativeSafeFrameCompatibility.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (dealServingMetadata != null) __obj.updateDynamic("dealServingMetadata")(dealServingMetadata.asInstanceOf[js.Any])
    if (dealTerms != null) __obj.updateDynamic("dealTerms")(dealTerms.asInstanceOf[js.Any])
    if (deliveryControl != null) __obj.updateDynamic("deliveryControl")(deliveryControl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (externalDealId != null) __obj.updateDynamic("externalDealId")(externalDealId.asInstanceOf[js.Any])
    if (!js.isUndefined(isSetupComplete)) __obj.updateDynamic("isSetupComplete")(isSetupComplete.asInstanceOf[js.Any])
    if (programmaticCreativeSource != null) __obj.updateDynamic("programmaticCreativeSource")(programmaticCreativeSource.asInstanceOf[js.Any])
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId.asInstanceOf[js.Any])
    if (sellerContacts != null) __obj.updateDynamic("sellerContacts")(sellerContacts.asInstanceOf[js.Any])
    if (syndicationProduct != null) __obj.updateDynamic("syndicationProduct")(syndicationProduct.asInstanceOf[js.Any])
    if (targeting != null) __obj.updateDynamic("targeting")(targeting.asInstanceOf[js.Any])
    if (targetingCriterion != null) __obj.updateDynamic("targetingCriterion")(targetingCriterion.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeal]
  }
}

