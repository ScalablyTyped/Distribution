package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Campaign Manager ad.
  */
@js.native
trait SchemaAd extends js.Object {
  
  /**
    * Account ID of this ad. This is a read-only field that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Whether this ad is active. When true, archived must be false.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Advertiser ID of this ad. This is a required field on insertion.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether this ad is archived. When true, active must be false.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Audience segment ID that is being targeted for this ad. Applicable when
    * type is AD_SERVING_STANDARD_AD.
    */
  var audienceSegmentId: js.UndefOr[String] = js.native
  
  /**
    * Campaign ID of this ad. This is a required field on insertion.
    */
  var campaignId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the campaign. This is a read-only,
    * auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Click-through URL for this ad. This is a required field on insertion.
    * Applicable when type is AD_SERVING_CLICK_TRACKER.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  
  /**
    * Click-through URL suffix properties for this ad. Applies to the URL in
    * the ad or (if overriding ad properties) the URL in the creative.
    */
  var clickThroughUrlSuffixProperties: js.UndefOr[SchemaClickThroughUrlSuffixProperties] = js.native
  
  /**
    * Comments for this ad.
    */
  var comments: js.UndefOr[String] = js.native
  
  /**
    * Compatibility of this ad. Applicable when type is AD_SERVING_DEFAULT_AD.
    * DISPLAY and DISPLAY_INTERSTITIAL refer to either rendering on desktop or
    * on mobile devices or in mobile apps for regular or interstitial ads,
    * respectively. APP and APP_INTERSTITIAL are only used for existing default
    * ads. New mobile placements must be assigned DISPLAY or
    * DISPLAY_INTERSTITIAL and default ads created for those placements will be
    * limited to those compatibility types. IN_STREAM_VIDEO refers to rendering
    * in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[String] = js.native
  
  /**
    * Information about the creation of this ad. This is a read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Creative group assignments for this ad. Applicable when type is
    * AD_SERVING_CLICK_TRACKER. Only one assignment per creative group number
    * is allowed for a maximum of two assignments.
    */
  var creativeGroupAssignments: js.UndefOr[js.Array[SchemaCreativeGroupAssignment]] = js.native
  
  /**
    * Creative rotation for this ad. Applicable when type is
    * AD_SERVING_DEFAULT_AD, AD_SERVING_STANDARD_AD, or AD_SERVING_TRACKING.
    * When type is AD_SERVING_DEFAULT_AD, this field should have exactly one
    * creativeAssignment.
    */
  var creativeRotation: js.UndefOr[SchemaCreativeRotation] = js.native
  
  /**
    * Time and day targeting information for this ad. This field must be left
    * blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var dayPartTargeting: js.UndefOr[SchemaDayPartTargeting] = js.native
  
  /**
    * Default click-through event tag properties for this ad.
    */
  var defaultClickThroughEventTagProperties: js.UndefOr[SchemaDefaultClickThroughEventTagProperties] = js.native
  
  /**
    * Delivery schedule information for this ad. Applicable when type is
    * AD_SERVING_STANDARD_AD or AD_SERVING_TRACKING. This field along with
    * subfields priority and impressionRatio are required on insertion when
    * type is AD_SERVING_STANDARD_AD.
    */
  var deliverySchedule: js.UndefOr[SchemaDeliverySchedule] = js.native
  
  /**
    * Whether this ad is a dynamic click tracker. Applicable when type is
    * AD_SERVING_CLICK_TRACKER. This is a required field on insert, and is
    * read-only after insert.
    */
  var dynamicClickTracker: js.UndefOr[Boolean] = js.native
  
  /**
    * Date and time that this ad should stop serving. Must be later than the
    * start time. This is a required field on insertion.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Event tag overrides for this ad.
    */
  var eventTagOverrides: js.UndefOr[js.Array[SchemaEventTagOverride]] = js.native
  
  /**
    * Geographical targeting information for this ad. This field must be left
    * blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var geoTargeting: js.UndefOr[SchemaGeoTargeting] = js.native
  
  /**
    * ID of this ad. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of this ad. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Key-value targeting information for this ad. This field must be left
    * blank if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var keyValueTargetingExpression: js.UndefOr[SchemaKeyValueTargetingExpression] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#ad&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Language targeting information for this ad. This field must be left blank
    * if the ad is using a targeting template. Applicable when type is
    * AD_SERVING_STANDARD_AD.
    */
  var languageTargeting: js.UndefOr[SchemaLanguageTargeting] = js.native
  
  /**
    * Information about the most recent modification of this ad. This is a
    * read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  
  /**
    * Name of this ad. This is a required field and must be less than 256
    * characters long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Placement assignments for this ad.
    */
  var placementAssignments: js.UndefOr[js.Array[SchemaPlacementAssignment]] = js.native
  
  /**
    * Remarketing list targeting expression for this ad. This field must be
    * left blank if the ad is using a targeting template. Applicable when type
    * is AD_SERVING_STANDARD_AD.
    */
  var remarketingListExpression: js.UndefOr[SchemaListTargetingExpression] = js.native
  
  /**
    * Size of this ad. Applicable when type is AD_SERVING_DEFAULT_AD.
    */
  var size: js.UndefOr[SchemaSize] = js.native
  
  /**
    * Whether this ad is ssl compliant. This is a read-only field that is
    * auto-generated when the ad is inserted or updated.
    */
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this ad requires ssl. This is a read-only field that is
    * auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Date and time that this ad should start serving. If creating an ad, this
    * field must be a time in the future. This is a required field on
    * insertion.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of this ad. This is a read-only field that can be left
    * blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Targeting template ID, used to apply preconfigured targeting information
    * to this ad. This cannot be set while any of dayPartTargeting,
    * geoTargeting, keyValueTargetingExpression, languageTargeting,
    * remarketingListExpression, or technologyTargeting are set. Applicable
    * when type is AD_SERVING_STANDARD_AD.
    */
  var targetingTemplateId: js.UndefOr[String] = js.native
  
  /**
    * Technology platform targeting information for this ad. This field must be
    * left blank if the ad is using a targeting template. Applicable when type
    * is AD_SERVING_STANDARD_AD.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
  
  /**
    * Type of ad. This is a required field on insertion. Note that default ads
    * (AD_SERVING_DEFAULT_AD) cannot be created directly (see Creative
    * resource).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAd {
  
  @scala.inline
  def apply(): SchemaAd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAd]
  }
  
  @scala.inline
  implicit class SchemaAdOps[Self <: SchemaAd] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
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
    def setAudienceSegmentId(value: String): Self = this.set("audienceSegmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceSegmentId: Self = this.set("audienceSegmentId", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = this.set("campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignId: Self = this.set("campaignId", js.undefined)
    
    @scala.inline
    def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = this.set("campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignIdDimensionValue: Self = this.set("campaignIdDimensionValue", js.undefined)
    
    @scala.inline
    def setClickThroughUrl(value: SchemaClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = this.set("clickThroughUrlSuffixProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrlSuffixProperties: Self = this.set("clickThroughUrlSuffixProperties", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCompatibility(value: String): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    
    @scala.inline
    def setCreateInfo(value: SchemaLastModifiedInfo): Self = this.set("createInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateInfo: Self = this.set("createInfo", js.undefined)
    
    @scala.inline
    def setCreativeGroupAssignmentsVarargs(value: SchemaCreativeGroupAssignment*): Self = this.set("creativeGroupAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeGroupAssignments(value: js.Array[SchemaCreativeGroupAssignment]): Self = this.set("creativeGroupAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeGroupAssignments: Self = this.set("creativeGroupAssignments", js.undefined)
    
    @scala.inline
    def setCreativeRotation(value: SchemaCreativeRotation): Self = this.set("creativeRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeRotation: Self = this.set("creativeRotation", js.undefined)
    
    @scala.inline
    def setDayPartTargeting(value: SchemaDayPartTargeting): Self = this.set("dayPartTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayPartTargeting: Self = this.set("dayPartTargeting", js.undefined)
    
    @scala.inline
    def setDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = this.set("defaultClickThroughEventTagProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClickThroughEventTagProperties: Self = this.set("defaultClickThroughEventTagProperties", js.undefined)
    
    @scala.inline
    def setDeliverySchedule(value: SchemaDeliverySchedule): Self = this.set("deliverySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliverySchedule: Self = this.set("deliverySchedule", js.undefined)
    
    @scala.inline
    def setDynamicClickTracker(value: Boolean): Self = this.set("dynamicClickTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicClickTracker: Self = this.set("dynamicClickTracker", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEventTagOverridesVarargs(value: SchemaEventTagOverride*): Self = this.set("eventTagOverrides", js.Array(value :_*))
    
    @scala.inline
    def setEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = this.set("eventTagOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTagOverrides: Self = this.set("eventTagOverrides", js.undefined)
    
    @scala.inline
    def setGeoTargeting(value: SchemaGeoTargeting): Self = this.set("geoTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoTargeting: Self = this.set("geoTargeting", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: SchemaDimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKeyValueTargetingExpression(value: SchemaKeyValueTargetingExpression): Self = this.set("keyValueTargetingExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValueTargetingExpression: Self = this.set("keyValueTargetingExpression", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguageTargeting(value: SchemaLanguageTargeting): Self = this.set("languageTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageTargeting: Self = this.set("languageTargeting", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlacementAssignmentsVarargs(value: SchemaPlacementAssignment*): Self = this.set("placementAssignments", js.Array(value :_*))
    
    @scala.inline
    def setPlacementAssignments(value: js.Array[SchemaPlacementAssignment]): Self = this.set("placementAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementAssignments: Self = this.set("placementAssignments", js.undefined)
    
    @scala.inline
    def setRemarketingListExpression(value: SchemaListTargetingExpression): Self = this.set("remarketingListExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingListExpression: Self = this.set("remarketingListExpression", js.undefined)
    
    @scala.inline
    def setSize(value: SchemaSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setSslRequired(value: Boolean): Self = this.set("sslRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslRequired: Self = this.set("sslRequired", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTargetingTemplateId(value: String): Self = this.set("targetingTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingTemplateId: Self = this.set("targetingTemplateId", js.undefined)
    
    @scala.inline
    def setTechnologyTargeting(value: SchemaTechnologyTargeting): Self = this.set("technologyTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTechnologyTargeting: Self = this.set("technologyTargeting", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
