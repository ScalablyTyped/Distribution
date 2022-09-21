package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacement extends StObject {
  
  /**
    * Account ID of this placement. This field can be left blank.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this placement opts out of ad blocking. When true, ad blocking is disabled for this placement. When false, the campaign and site settings take effect.
    */
  var adBlockingOptOut: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Additional sizes associated with this placement. When inserting or updating a placement, only the size ID field is used.
    */
  var additionalSizes: js.UndefOr[js.Array[SchemaSize]] = js.undefined
  
  /**
    * Advertiser ID of this placement. This field can be left blank.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Whether this placement is archived.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Campaign ID of this placement. This field is a required field on insertion.
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the campaign. This is a read-only, auto-generated field.
    */
  var campaignIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Comments for this placement.
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Placement compatibility. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering on desktop, on mobile devices or in mobile apps for regular or interstitial ads respectively. APP and APP_INTERSTITIAL are no longer allowed for new placement insertions. Instead, use DISPLAY or DISPLAY_INTERSTITIAL. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST standard. This field is required on insertion.
    */
  var compatibility: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the content category assigned to this placement.
    */
  var contentCategoryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the creation of this placement. This is a read-only field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Directory site ID of this placement. On insert, you must set either this field or the siteId field to specify the site associated with this placement. This is a required field that is read-only after insertion.
    */
  var directorySiteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
    */
  var directorySiteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * External ID for this placement.
    */
  var externalId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this placement. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of this placement. This is a read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Key name of this placement. This is a read-only, auto-generated field.
    */
  var keyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#placement".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the most recent modification of this placement. This is a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Lookback window settings for this placement.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.undefined
  
  /**
    * Name of this placement.This is a required field and must be less than or equal to 256 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether payment was approved for this placement. This is a read-only field relevant only to publisher-paid placements.
    */
  var paymentApproved: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Payment source for this placement. This is a required field that is read-only after insertion.
    */
  var paymentSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this placement's group, if applicable.
    */
  var placementGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the placement group. This is a read-only, auto-generated field.
    */
  var placementGroupIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * ID of the placement strategy assigned to this placement.
    */
  var placementStrategyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pricing schedule of this placement. This field is required on insertion, specifically subfields startDate, endDate and pricingType.
    */
  var pricingSchedule: js.UndefOr[SchemaPricingSchedule] = js.undefined
  
  /**
    * Whether this placement is the primary placement of a roadblock (placement group). You cannot change this field from true to false. Setting this field to true will automatically set the primary field on the original primary placement of the roadblock to false, and it will automatically set the roadblock's primaryPlacementId field to the ID of this placement.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Information about the last publisher update. This is a read-only field.
    */
  var publisherUpdateInfo: js.UndefOr[SchemaLastModifiedInfo] = js.undefined
  
  /**
    * Site ID associated with this placement. On insert, you must set either this field or the directorySiteId field to specify the site associated with this placement. This is a required field that is read-only after insertion.
    */
  var siteId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value for the ID of the site. This is a read-only, auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.undefined
  
  /**
    * Size associated with this placement. When inserting or updating a placement, only the size ID field is used. This field is required on insertion.
    */
  var size: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * Whether creatives assigned to this placement must be SSL-compliant.
    */
  var sslRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Third-party placement status.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of this placement. This field can be left blank.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag formats to generate for this placement. This field is required on insertion. Acceptable values are: - "PLACEMENT_TAG_STANDARD" - "PLACEMENT_TAG_IFRAME_JAVASCRIPT" - "PLACEMENT_TAG_IFRAME_ILAYER" - "PLACEMENT_TAG_INTERNAL_REDIRECT" - "PLACEMENT_TAG_JAVASCRIPT" - "PLACEMENT_TAG_INTERSTITIAL_IFRAME_JAVASCRIPT" - "PLACEMENT_TAG_INTERSTITIAL_INTERNAL_REDIRECT" - "PLACEMENT_TAG_INTERSTITIAL_JAVASCRIPT" - "PLACEMENT_TAG_CLICK_COMMANDS" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_3" - "PLACEMENT_TAG_INSTREAM_VIDEO_PREFETCH_VAST_4" - "PLACEMENT_TAG_TRACKING" - "PLACEMENT_TAG_TRACKING_IFRAME" - "PLACEMENT_TAG_TRACKING_JAVASCRIPT"
    */
  var tagFormats: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Tag settings for this placement.
    */
  var tagSetting: js.UndefOr[SchemaTagSetting] = js.undefined
  
  /**
    * Whether Verification and ActiveView are disabled for in-stream video creatives for this placement. The same setting videoActiveViewOptOut exists on the site level -- the opt out occurs if either of these settings are true. These settings are distinct from DirectorySites.settings.activeViewOptOut or Sites.siteSettings.activeViewOptOut which only apply to display ads. However, Accounts.activeViewOptOut opts out both video traffic, as well as display ads, from Verification and ActiveView.
    */
  var videoActiveViewOptOut: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A collection of settings which affect video creatives served through this placement. Applicable to placements with IN_STREAM_VIDEO compatibility.
    */
  var videoSettings: js.UndefOr[SchemaVideoSettings] = js.undefined
  
  /**
    * VPAID adapter setting for this placement. Controls which VPAID format the measurement adapter will use for in-stream video creatives assigned to this placement. *Note:* Flash is no longer supported. This field now defaults to HTML5 when the following values are provided: FLASH, BOTH.
    */
  var vpaidAdapterChoice: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlacement {
  
  inline def apply(): SchemaPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacement]
  }
  
  extension [Self <: SchemaPlacement](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdBlockingOptOut(value: Boolean): Self = StObject.set(x, "adBlockingOptOut", value.asInstanceOf[js.Any])
    
    inline def setAdBlockingOptOutNull: Self = StObject.set(x, "adBlockingOptOut", null)
    
    inline def setAdBlockingOptOutUndefined: Self = StObject.set(x, "adBlockingOptOut", js.undefined)
    
    inline def setAdditionalSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "additionalSizes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSizesUndefined: Self = StObject.set(x, "additionalSizes", js.undefined)
    
    inline def setAdditionalSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "additionalSizes", js.Array(value*))
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValueUndefined: Self = StObject.set(x, "campaignIdDimensionValue", js.undefined)
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityNull: Self = StObject.set(x, "compatibility", null)
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setContentCategoryId(value: String): Self = StObject.set(x, "contentCategoryId", value.asInstanceOf[js.Any])
    
    inline def setContentCategoryIdNull: Self = StObject.set(x, "contentCategoryId", null)
    
    inline def setContentCategoryIdUndefined: Self = StObject.set(x, "contentCategoryId", js.undefined)
    
    inline def setCreateInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "createInfo", value.asInstanceOf[js.Any])
    
    inline def setCreateInfoUndefined: Self = StObject.set(x, "createInfo", js.undefined)
    
    inline def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdDimensionValueUndefined: Self = StObject.set(x, "directorySiteIdDimensionValue", js.undefined)
    
    inline def setDirectorySiteIdNull: Self = StObject.set(x, "directorySiteId", null)
    
    inline def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdNull: Self = StObject.set(x, "externalId", null)
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameNull: Self = StObject.set(x, "keyName", null)
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "lastModifiedInfo", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedInfoUndefined: Self = StObject.set(x, "lastModifiedInfo", js.undefined)
    
    inline def setLookbackConfiguration(value: SchemaLookbackConfiguration): Self = StObject.set(x, "lookbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLookbackConfigurationUndefined: Self = StObject.set(x, "lookbackConfiguration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaymentApproved(value: Boolean): Self = StObject.set(x, "paymentApproved", value.asInstanceOf[js.Any])
    
    inline def setPaymentApprovedNull: Self = StObject.set(x, "paymentApproved", null)
    
    inline def setPaymentApprovedUndefined: Self = StObject.set(x, "paymentApproved", js.undefined)
    
    inline def setPaymentSource(value: String): Self = StObject.set(x, "paymentSource", value.asInstanceOf[js.Any])
    
    inline def setPaymentSourceNull: Self = StObject.set(x, "paymentSource", null)
    
    inline def setPaymentSourceUndefined: Self = StObject.set(x, "paymentSource", js.undefined)
    
    inline def setPlacementGroupId(value: String): Self = StObject.set(x, "placementGroupId", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "placementGroupIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupIdDimensionValueUndefined: Self = StObject.set(x, "placementGroupIdDimensionValue", js.undefined)
    
    inline def setPlacementGroupIdNull: Self = StObject.set(x, "placementGroupId", null)
    
    inline def setPlacementGroupIdUndefined: Self = StObject.set(x, "placementGroupId", js.undefined)
    
    inline def setPlacementStrategyId(value: String): Self = StObject.set(x, "placementStrategyId", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyIdNull: Self = StObject.set(x, "placementStrategyId", null)
    
    inline def setPlacementStrategyIdUndefined: Self = StObject.set(x, "placementStrategyId", js.undefined)
    
    inline def setPricingSchedule(value: SchemaPricingSchedule): Self = StObject.set(x, "pricingSchedule", value.asInstanceOf[js.Any])
    
    inline def setPricingScheduleUndefined: Self = StObject.set(x, "pricingSchedule", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setPublisherUpdateInfo(value: SchemaLastModifiedInfo): Self = StObject.set(x, "publisherUpdateInfo", value.asInstanceOf[js.Any])
    
    inline def setPublisherUpdateInfoUndefined: Self = StObject.set(x, "publisherUpdateInfo", js.undefined)
    
    inline def setSiteId(value: String): Self = StObject.set(x, "siteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = StObject.set(x, "siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setSiteIdDimensionValueUndefined: Self = StObject.set(x, "siteIdDimensionValue", js.undefined)
    
    inline def setSiteIdNull: Self = StObject.set(x, "siteId", null)
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "siteId", js.undefined)
    
    inline def setSize(value: SchemaSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSslRequired(value: Boolean): Self = StObject.set(x, "sslRequired", value.asInstanceOf[js.Any])
    
    inline def setSslRequiredNull: Self = StObject.set(x, "sslRequired", null)
    
    inline def setSslRequiredUndefined: Self = StObject.set(x, "sslRequired", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTagFormats(value: js.Array[String]): Self = StObject.set(x, "tagFormats", value.asInstanceOf[js.Any])
    
    inline def setTagFormatsNull: Self = StObject.set(x, "tagFormats", null)
    
    inline def setTagFormatsUndefined: Self = StObject.set(x, "tagFormats", js.undefined)
    
    inline def setTagFormatsVarargs(value: String*): Self = StObject.set(x, "tagFormats", js.Array(value*))
    
    inline def setTagSetting(value: SchemaTagSetting): Self = StObject.set(x, "tagSetting", value.asInstanceOf[js.Any])
    
    inline def setTagSettingUndefined: Self = StObject.set(x, "tagSetting", js.undefined)
    
    inline def setVideoActiveViewOptOut(value: Boolean): Self = StObject.set(x, "videoActiveViewOptOut", value.asInstanceOf[js.Any])
    
    inline def setVideoActiveViewOptOutNull: Self = StObject.set(x, "videoActiveViewOptOut", null)
    
    inline def setVideoActiveViewOptOutUndefined: Self = StObject.set(x, "videoActiveViewOptOut", js.undefined)
    
    inline def setVideoSettings(value: SchemaVideoSettings): Self = StObject.set(x, "videoSettings", value.asInstanceOf[js.Any])
    
    inline def setVideoSettingsUndefined: Self = StObject.set(x, "videoSettings", js.undefined)
    
    inline def setVpaidAdapterChoice(value: String): Self = StObject.set(x, "vpaidAdapterChoice", value.asInstanceOf[js.Any])
    
    inline def setVpaidAdapterChoiceNull: Self = StObject.set(x, "vpaidAdapterChoice", null)
    
    inline def setVpaidAdapterChoiceUndefined: Self = StObject.set(x, "vpaidAdapterChoice", js.undefined)
  }
}
