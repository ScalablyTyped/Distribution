package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a package or roadblock.
  */
@js.native
trait SchemaPlacementGroup extends js.Object {
  /**
    * Account ID of this placement group. This is a read-only field that can be
    * left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this placement group. This is a required field on
    * insertion.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this placement group is archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Campaign ID of this placement group. This field is required on insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * IDs of placements which are assigned to this placement group. This is a
    * read-only, auto-generated field.
    */
  var childPlacementIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Comments for this placement group.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * ID of the content category assigned to this placement group.
    */
  var contentCategoryId: js.UndefOr[String] = js.native
  /**
    * Information about the creation of this placement group. This is a
    * read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Directory site ID associated with this placement group. On insert, you
    * must set either this field or the site_id field to specify the site
    * associated with this placement group. This is a required field that is
    * read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the directory site. This is a read-only,
    * auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * External ID for this placement.
    */
  var externalId: js.UndefOr[String] = js.native
  /**
    * ID of this placement group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this placement group. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this placement group.
    * This is a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this placement group. This is a required field and must be less
    * than 256 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Type of this placement group. A package is a simple group of placements
    * that acts as a single pricing point for a group of tags. A roadblock is a
    * group of placements that not only acts as a single pricing point, but
    * also assumes that all the tags in it will be served at the same time. A
    * roadblock requires one of its assigned placements to be marked as primary
    * for reporting. This field is required on insertion.
    */
  var placementGroupType: js.UndefOr[String] = js.native
  /**
    * ID of the placement strategy assigned to this placement group.
    */
  var placementStrategyId: js.UndefOr[String] = js.native
  /**
    * Pricing schedule of this placement group. This field is required on
    * insertion.
    */
  var pricingSchedule: js.UndefOr[SchemaPricingSchedule] = js.native
  /**
    * ID of the primary placement, used to calculate the media cost of a
    * roadblock (placement group). Modifying this field will automatically
    * modify the primary field on all affected roadblock child placements.
    */
  var primaryPlacementId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the primary placement. This is a read-only,
    * auto-generated field.
    */
  var primaryPlacementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Site ID associated with this placement group. On insert, you must set
    * either this field or the directorySiteId field to specify the site
    * associated with this placement group. This is a required field that is
    * read-only after insertion.
    */
  var siteId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Subaccount ID of this placement group. This is a read-only field that can
    * be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object SchemaPlacementGroup {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: SchemaDimensionValue = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    campaignId: String = null,
    campaignIdDimensionValue: SchemaDimensionValue = null,
    childPlacementIds: js.Array[String] = null,
    comment: String = null,
    contentCategoryId: String = null,
    createInfo: SchemaLastModifiedInfo = null,
    directorySiteId: String = null,
    directorySiteIdDimensionValue: SchemaDimensionValue = null,
    externalId: String = null,
    id: String = null,
    idDimensionValue: SchemaDimensionValue = null,
    kind: String = null,
    lastModifiedInfo: SchemaLastModifiedInfo = null,
    name: String = null,
    placementGroupType: String = null,
    placementStrategyId: String = null,
    pricingSchedule: SchemaPricingSchedule = null,
    primaryPlacementId: String = null,
    primaryPlacementIdDimensionValue: SchemaDimensionValue = null,
    siteId: String = null,
    siteIdDimensionValue: SchemaDimensionValue = null,
    subaccountId: String = null
  ): SchemaPlacementGroup = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (campaignIdDimensionValue != null) __obj.updateDynamic("campaignIdDimensionValue")(campaignIdDimensionValue.asInstanceOf[js.Any])
    if (childPlacementIds != null) __obj.updateDynamic("childPlacementIds")(childPlacementIds.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId.asInstanceOf[js.Any])
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo.asInstanceOf[js.Any])
    if (directorySiteId != null) __obj.updateDynamic("directorySiteId")(directorySiteId.asInstanceOf[js.Any])
    if (directorySiteIdDimensionValue != null) __obj.updateDynamic("directorySiteIdDimensionValue")(directorySiteIdDimensionValue.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placementGroupType != null) __obj.updateDynamic("placementGroupType")(placementGroupType.asInstanceOf[js.Any])
    if (placementStrategyId != null) __obj.updateDynamic("placementStrategyId")(placementStrategyId.asInstanceOf[js.Any])
    if (pricingSchedule != null) __obj.updateDynamic("pricingSchedule")(pricingSchedule.asInstanceOf[js.Any])
    if (primaryPlacementId != null) __obj.updateDynamic("primaryPlacementId")(primaryPlacementId.asInstanceOf[js.Any])
    if (primaryPlacementIdDimensionValue != null) __obj.updateDynamic("primaryPlacementIdDimensionValue")(primaryPlacementIdDimensionValue.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    if (siteIdDimensionValue != null) __obj.updateDynamic("siteIdDimensionValue")(siteIdDimensionValue.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlacementGroup]
  }
}

