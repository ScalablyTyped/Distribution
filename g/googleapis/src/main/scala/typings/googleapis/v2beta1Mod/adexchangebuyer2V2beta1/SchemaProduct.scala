package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  A product is a
  * segment of inventory that a seller wishes to sell. It is associated with
  * certain terms and targeting information which helps the buyer know more
  * about the inventory.
  */
@js.native
trait SchemaProduct extends js.Object {
  /**
    * The proposed end time for the deal. The field will be truncated to the
    * order of seconds during serving.
    */
  var availableEndTime: js.UndefOr[String] = js.native
  /**
    * Inventory availability dates. The start time will be truncated to seconds
    * during serving. Thus, a field specified as 3:23:34.456 (HH:mm:ss.SSS)
    * will be truncated to 3:23:34 when serving.
    */
  var availableStartTime: js.UndefOr[String] = js.native
  /**
    * Creation time.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Optional contact information for the creator of this product.
    */
  var creatorContacts: js.UndefOr[js.Array[SchemaContactInformation]] = js.native
  /**
    * The display name for this product as set by the seller.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * If the creator has already signed off on the product, then the buyer can
    * finalize the deal by accepting the product as is. When copying to a
    * proposal, if any of the terms are changed, then auto_finalize is
    * automatically set to false.
    */
  var hasCreatorSignedOff: js.UndefOr[Boolean] = js.native
  /**
    * The unique ID for the product.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The revision number of the product (auto-assigned by Marketplace).
    */
  var productRevision: js.UndefOr[String] = js.native
  /**
    * An ID which can be used by the Publisher Profile API to get more
    * information about the seller that created this product.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /**
    * Information about the seller that created this product.
    */
  var seller: js.UndefOr[SchemaSeller] = js.native
  /**
    * The syndication product associated with the deal.
    */
  var syndicationProduct: js.UndefOr[String] = js.native
  /**
    * Targeting that is shared between the buyer and the seller. Each targeting
    * criterion has a specified key and for each key there is a list of
    * inclusion value or exclusion values.
    */
  var targetingCriterion: js.UndefOr[js.Array[SchemaTargetingCriteria]] = js.native
  /**
    * The negotiable terms of the deal.
    */
  var terms: js.UndefOr[SchemaDealTerms] = js.native
  /**
    * Time of last update.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * The web-property code for the seller. This needs to be copied as is when
    * adding a new deal to a proposal.
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object SchemaProduct {
  @scala.inline
  def apply(
    availableEndTime: String = null,
    availableStartTime: String = null,
    createTime: String = null,
    creatorContacts: js.Array[SchemaContactInformation] = null,
    displayName: String = null,
    hasCreatorSignedOff: js.UndefOr[Boolean] = js.undefined,
    productId: String = null,
    productRevision: String = null,
    publisherProfileId: String = null,
    seller: SchemaSeller = null,
    syndicationProduct: String = null,
    targetingCriterion: js.Array[SchemaTargetingCriteria] = null,
    terms: SchemaDealTerms = null,
    updateTime: String = null,
    webPropertyCode: String = null
  ): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    if (availableEndTime != null) __obj.updateDynamic("availableEndTime")(availableEndTime.asInstanceOf[js.Any])
    if (availableStartTime != null) __obj.updateDynamic("availableStartTime")(availableStartTime.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (creatorContacts != null) __obj.updateDynamic("creatorContacts")(creatorContacts.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCreatorSignedOff)) __obj.updateDynamic("hasCreatorSignedOff")(hasCreatorSignedOff.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productRevision != null) __obj.updateDynamic("productRevision")(productRevision.asInstanceOf[js.Any])
    if (publisherProfileId != null) __obj.updateDynamic("publisherProfileId")(publisherProfileId.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (syndicationProduct != null) __obj.updateDynamic("syndicationProduct")(syndicationProduct.asInstanceOf[js.Any])
    if (targetingCriterion != null) __obj.updateDynamic("targetingCriterion")(targetingCriterion.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (webPropertyCode != null) __obj.updateDynamic("webPropertyCode")(webPropertyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProduct]
  }
}

