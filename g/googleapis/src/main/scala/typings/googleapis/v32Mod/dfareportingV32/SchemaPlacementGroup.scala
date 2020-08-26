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
  def apply(): SchemaPlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementGroup]
  }
  @scala.inline
  implicit class SchemaPlacementGroupOps[Self <: SchemaPlacementGroup] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    @scala.inline
    def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    @scala.inline
    def setChildPlacementIdsVarargs(value: String*): Self = this.set("childPlacementIds", js.Array(value :_*))
    @scala.inline
    def setChildPlacementIds(value: js.Array[String]): Self = this.set("childPlacementIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildPlacementIds: Self = this.set("childPlacementIds", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setContentCategoryId(value: String): Self = this.set("contentCategoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentCategoryId: Self = this.set("contentCategoryId", js.undefined)
    @scala.inline
    def setCreateInfo(value: SchemaLastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    @scala.inline
    def setDirectorySiteIdDimensionValue(value: SchemaDimensionValue): Self = this.set("directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteIdDimensionValue: Self = this.set("directorySiteIdDimensionValue", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlacementGroupType(value: String): Self = this.set("placementGroupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroupType: Self = this.set("placementGroupType", js.undefined)
    @scala.inline
    def setPlacementStrategyId(value: String): Self = this.set("placementStrategyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementStrategyId: Self = this.set("placementStrategyId", js.undefined)
    @scala.inline
    def setPricingSchedule(value: SchemaPricingSchedule): Self = this.set("pricingSchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingSchedule: Self = this.set("pricingSchedule", js.undefined)
    @scala.inline
    def setPrimaryPlacementId(value: String): Self = this.set("primaryPlacementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryPlacementId: Self = this.set("primaryPlacementId", js.undefined)
    @scala.inline
    def setPrimaryPlacementIdDimensionValue(value: SchemaDimensionValue): Self = this.set("primaryPlacementIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryPlacementIdDimensionValue: Self = this.set("primaryPlacementIdDimensionValue", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    @scala.inline
    def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = this.set("siteIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteIdDimensionValue: Self = this.set("siteIdDimensionValue", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
  
}

