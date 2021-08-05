package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a package or roadblock.
  */
trait SchemaPlacementGroup extends StObject {
  
  /**
    * Account ID of this placement group. This is a read-only field that can be
    * left blank.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Advertiser ID of this placement group. This is a required field on
    * insertion.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether this placement group is archived.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Campaign ID of this placement group. This field is required on insertion.
    */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * IDs of placements which are assigned to this placement group. This is a
    * read-only, auto-generated field.
    */
  var childPlacementIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Comments for this placement group.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the content category assigned to this placement group.
    */
  var contentCategoryId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the creation of this placement group. This is a
    * read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Directory site ID associated with this placement group. On insert, you
    * must set either this field or the site_id field to specify the site
    * associated with this placement group. This is a required field that is
    * read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the directory site. This is a read-only,
    * auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * External ID for this placement.
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this placement group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of this placement group. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#placementGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the most recent modification of this placement group.
    * This is a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Name of this placement group. This is a required field and must be less
    * than 256 characters long.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Type of this placement group. A package is a simple group of placements
    * that acts as a single pricing point for a group of tags. A roadblock is a
    * group of placements that not only acts as a single pricing point, but
    * also assumes that all the tags in it will be served at the same time. A
    * roadblock requires one of its assigned placements to be marked as primary
    * for reporting. This field is required on insertion.
    */
  var placementGroupType: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the placement strategy assigned to this placement group.
    */
  var placementStrategyId: js.UndefOr[String] = js.undefined
  
  /**
    * Pricing schedule of this placement group. This field is required on
    * insertion.
    */
  var pricingSchedule: js.UndefOr[SchemaPricingSchedule] = js.undefined
  
  /**
    * ID of the primary placement, used to calculate the media cost of a
    * roadblock (placement group). Modifying this field will automatically
    * modify the primary field on all affected roadblock child placements.
    */
  var primaryPlacementId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the primary placement. This is a read-only,
    * auto-generated field.
    */
  var primaryPlacementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Site ID associated with this placement group. On insert, you must set
    * either this field or the directorySiteId field to specify the site
    * associated with this placement group. This is a required field that is
    * read-only after insertion.
    */
  var siteId: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Subaccount ID of this placement group. This is a read-only field that can
    * be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.undefined
}
object SchemaPlacementGroup {
  
  inline def apply(): SchemaPlacementGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementGroup]
  }
  
  extension [Self <: SchemaPlacementGroup](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValueUndefined: Self = StObject.set(x, "campaignIdDimensionValue", js.undefined)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setChildPlacementIds(value: js.Array[String]): Self = StObject.set(x, "childPlacementIds", value.asInstanceOf[js.Any])
    
    inline def setChildPlacementIdsUndefined: Self = StObject.set(x, "childPlacementIds", js.undefined)
    
    inline def setChildPlacementIdsVarargs(value: String*): Self = StObject.set(x, "childPlacementIds", js.Array(value :_*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setContentCategoryId(value: String): Self = StObject.set(x, "contentCategoryId", value.asInstanceOf[js.Any])
    
    inline def setContentCategoryIdUndefined: Self = StObject.set(x, "contentCategoryId", js.undefined)
    
    inline def setCreateInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createInfo", value.asInstanceOf[js.Any])
    
    inline def setCreateInfoUndefined: Self = StObject.set(x, "createInfo", js.undefined)
    
    inline def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdDimensionValueUndefined: Self = StObject.set(x, "directorySiteIdDimensionValue", js.undefined)
    
    inline def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlacementGroupType(value: String): Self = StObject.set(x, "placementGroupType", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupTypeUndefined: Self = StObject.set(x, "placementGroupType", js.undefined)
    
    inline def setPlacementStrategyId(value: String): Self = StObject.set(x, "placementStrategyId", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyIdUndefined: Self = StObject.set(x, "placementStrategyId", js.undefined)
    
    inline def setPricingSchedule(value: SchemaPricingSchedule): Self = StObject.set(x, "pricingSchedule", value.asInstanceOf[js.Any])
    
    inline def setPricingScheduleUndefined: Self = StObject.set(x, "pricingSchedule", js.undefined)
    
    inline def setPrimaryPlacementId(value: String): Self = StObject.set(x, "primaryPlacementId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPlacementIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "primaryPlacementIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPlacementIdDimensionValueUndefined: Self = StObject.set(x, "primaryPlacementIdDimensionValue", js.undefined)
    
    inline def setPrimaryPlacementIdUndefined: Self = StObject.set(x, "primaryPlacementId", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValueUndefined: Self = StObject.set(x, "siteIdDimensionValue", js.undefined)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}
