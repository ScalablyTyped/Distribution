package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAd extends StObject {
  
  /**
    * Account ID of this ad. This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this ad is active. When true, archived must be false.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Advertiser ID of this ad. This is a required field on insertion.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether this ad is archived. When true, active must be false.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Audience segment ID that is being targeted for this ad. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var audienceSegmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Campaign ID of this ad. This is a required field on insertion.
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Click-through URL for this ad. This is a required field on insertion. Applicable when type is AD_SERVING_CLICK_TRACKER.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.undefined
  
  /**
    * Click-through URL suffix properties for this ad. Applies to the URL in the ad or (if overriding ad properties) the URL in the creative.
    */
  var clickThroughUrlSuffixProperties: js.UndefOr[SchemaClickThroughUrlSuffixProperties] = js.undefined
  
  /**
    * Comments for this ad.
    */
  var comments: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compatibility of this ad. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to either rendering on desktop or on mobile devices or in mobile apps for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are only used for existing default ads. New mobile placements must be assigned DISPLAY or DISPLAY_INTERSTITIAL and default ads created for those placements will be limited to those compatibility types. IN_STREAM_VIDEO refers to rendering in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the creation of this ad. This is a read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Creative group assignments for this ad. Applicable when type is AD_SERVING_CLICK_TRACKER. Only one assignment per creative group number is allowed for a maximum of two assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[SchemaCreativeGroupAssignment]] = js.undefined
  
  /**
    * Creative rotation for this ad. Applicable when type is AD_SERVING_DEFAULT_AD, AD_SERVING_STANDARD_AD, or AD_SERVING_TRACKING. When type is AD_SERVING_DEFAULT_AD, this field should have exactly one creativeAssignment .
    */
  var creativeRotation: js.UndefOr[SchemaCreativeRotation] = js.undefined
  
  /**
    * Time and day targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.undefined
  
  /**
    * Default click-through event tag properties for this ad.
    */
  var defaultClickThroughEventTagProperties: js.UndefOr[SchemaDefaultClickThroughEventTagProperties] = js.undefined
  
  /**
    * Delivery schedule information for this ad. Applicable when type is AD_SERVING_STANDARD_AD or AD_SERVING_TRACKING. This field along with subfields priority and impressionRatio are required on insertion when type is AD_SERVING_STANDARD_AD.
    */
  var deliverySchedule: js.UndefOr[SchemaDeliverySchedule] = js.undefined
  
  /**
    * Whether this ad is a dynamic click tracker. Applicable when type is AD_SERVING_CLICK_TRACKER. This is a required field on insert, and is read-only after insert.
    */
  var dynamicClickTracker: js.UndefOr[Boolean | Null] = js.undefined
  
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Event tag overrides for this ad.
    */
  var eventTagOverrides: js.UndefOr[js.Array[SchemaEventTagOverride]] = js.undefined
  
  /**
    * Geographical targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.undefined
  
  /**
    * ID of this ad. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of this ad. This is a read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Key-value targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#ad".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Language targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.undefined
  
  /**
    * Information about the most recent modification of this ad. This is a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Name of this ad. This is a required field and must be less than 256 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Placement assignments for this ad.
    */
  var placementAssignments: js.UndefOr[js.Array[SchemaPlacementAssignment]] = js.undefined
  
  /**
    * Remarketing list targeting expression for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var remarketingListExpression: js.UndefOr[SchemaListTargetingExpression] = js.undefined
  
  /**
    * Size of this ad. Applicable when type is AD_SERVING_DEFAULT_AD.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * Whether this ad is ssl compliant. This is a read-only field that is auto-generated when the ad is inserted or updated.
    */
  var sslCompliant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether this ad requires ssl. This is a read-only field that is auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this ad. This is a read-only field that can be left blank.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Targeting template ID, used to apply preconfigured targeting information to this ad. This cannot be set while any of dayPartTargeting, geoTargeting, keyValueTargetingExpression, languageTargeting, remarketingListExpression, or technologyTargeting are set. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var targetingTemplateId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Technology platform targeting information for this ad. This field must be left blank if the ad is using a targeting template. Applicable when type is AD_SERVING_STANDARD_AD.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.undefined
  
  /**
    * Type of ad. This is a required field on insertion. Note that default ads ( AD_SERVING_DEFAULT_AD) cannot be created directly (see Creative resource).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAd {
  
  inline def apply(): SchemaAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAd]
  }
  
  extension [Self <: SchemaAd](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setAudienceSegmentId(value: String): Self = StObject.set(x, "audienceSegmentId", value.asInstanceOf[js.Any])
    
    inline def setAudienceSegmentIdNull: Self = StObject.set(x, "audienceSegmentId", null)
    
    inline def setAudienceSegmentIdUndefined: Self = StObject.set(x, "audienceSegmentId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValueUndefined: Self = StObject.set(x, "campaignIdDimensionValue", js.undefined)
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setClickThroughUrl(value: SchemaClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = StObject.set(x, "clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlSuffixPropertiesUndefined: Self = StObject.set(x, "clickThroughUrlSuffixProperties", js.undefined)
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityNull: Self = StObject.set(x, "compatibility", null)
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setCreateInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createInfo", value.asInstanceOf[js.Any])
    
    inline def setCreateInfoUndefined: Self = StObject.set(x, "createInfo", js.undefined)
    
    inline def setCreativeGroupAssignments(value: js.Array[SchemaCreativeGroupAssignment]): Self = StObject.set(x, "creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupAssignmentsUndefined: Self = StObject.set(x, "creativeGroupAssignments", js.undefined)
    
    inline def setCreativeGroupAssignmentsVarargs(value: SchemaCreativeGroupAssignment*): Self = StObject.set(x, "creativeGroupAssignments", js.Array(value*))
    
    inline def setCreativeRotation(value: SchemaCreativeRotation): Self = StObject.set(x, "creativeRotation", value.asInstanceOf[js.Any])
    
    inline def setCreativeRotationUndefined: Self = StObject.set(x, "creativeRotation", js.undefined)
    
    inline def setDayPartTargeting(value: SchemaDayPartTargeting): Self = StObject.set(x, "dayPartTargeting", value.asInstanceOf[js.Any])
    
    inline def setDayPartTargetingUndefined: Self = StObject.set(x, "dayPartTargeting", js.undefined)
    
    inline def setDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = StObject.set(x, "defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
    inline def setDefaultClickThroughEventTagPropertiesUndefined: Self = StObject.set(x, "defaultClickThroughEventTagProperties", js.undefined)
    
    inline def setDeliverySchedule(value: SchemaDeliverySchedule): Self = StObject.set(x, "deliverySchedule", value.asInstanceOf[js.Any])
    
    inline def setDeliveryScheduleUndefined: Self = StObject.set(x, "deliverySchedule", js.undefined)
    
    inline def setDynamicClickTracker(value: Boolean): Self = StObject.set(x, "dynamicClickTracker", value.asInstanceOf[js.Any])
    
    inline def setDynamicClickTrackerNull: Self = StObject.set(x, "dynamicClickTracker", null)
    
    inline def setDynamicClickTrackerUndefined: Self = StObject.set(x, "dynamicClickTracker", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = StObject.set(x, "eventTagOverrides", value.asInstanceOf[js.Any])
    
    inline def setEventTagOverridesUndefined: Self = StObject.set(x, "eventTagOverrides", js.undefined)
    
    inline def setEventTagOverridesVarargs(value: SchemaEventTagOverride*): Self = StObject.set(x, "eventTagOverrides", js.Array(value*))
    
    inline def setGeoTargeting(value: SchemaGeoTargeting): Self = StObject.set(x, "geoTargeting", value.asInstanceOf[js.Any])
    
    inline def setGeoTargetingUndefined: Self = StObject.set(x, "geoTargeting", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = StObject.set(x, "keyValueTargetingExpression", value.asInstanceOf[js.Any])
    
    inline def setKeyValueTargetingExpressionUndefined: Self = StObject.set(x, "keyValueTargetingExpression", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguageTargeting(value: SchemaLanguageTargeting): Self = StObject.set(x, "languageTargeting", value.asInstanceOf[js.Any])
    
    inline def setLanguageTargetingUndefined: Self = StObject.set(x, "languageTargeting", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlacementAssignments(value: js.Array[SchemaPlacementAssignment]): Self = StObject.set(x, "placementAssignments", value.asInstanceOf[js.Any])
    
    inline def setPlacementAssignmentsUndefined: Self = StObject.set(x, "placementAssignments", js.undefined)
    
    inline def setPlacementAssignmentsVarargs(value: SchemaPlacementAssignment*): Self = StObject.set(x, "placementAssignments", js.Array(value*))
    
    inline def setRemarketingListExpression(value: SchemaListTargetingExpression): Self = StObject.set(x, "remarketingListExpression", value.asInstanceOf[js.Any])
    
    inline def setRemarketingListExpressionUndefined: Self = StObject.set(x, "remarketingListExpression", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantNull: Self = StObject.set(x, "sslCompliant", null)
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredNull: Self = StObject.set(x, "sslRequired", null)
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTargetingTemplateId(value: String): Self = StObject.set(x, "targetingTemplateId", value.asInstanceOf[js.Any])
    
    inline def setTargetingTemplateIdNull: Self = StObject.set(x, "targetingTemplateId", null)
    
    inline def setTargetingTemplateIdUndefined: Self = StObject.set(x, "targetingTemplateId", js.undefined)
    
    inline def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = StObject.set(x, "technologyTargeting", value.asInstanceOf[js.Any])
    
    inline def setTechnologyTargetingUndefined: Self = StObject.set(x, "technologyTargeting", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
