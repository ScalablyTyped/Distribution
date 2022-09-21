package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssignedTargetingOption extends StObject {
  
  /**
    * Age range details. This field will be populated when the targeting_type is `TARGETING_TYPE_AGE_RANGE`.
    */
  var ageRangeDetails: js.UndefOr[SchemaAgeRangeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * App category details. This field will be populated when the targeting_type is `TARGETING_TYPE_APP_CATEGORY`.
    */
  var appCategoryDetails: js.UndefOr[SchemaAppCategoryAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * App details. This field will be populated when the targeting_type is `TARGETING_TYPE_APP`.
    */
  var appDetails: js.UndefOr[SchemaAppAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Output only. The unique ID of the assigned targeting option. The ID is only unique within a given resource and targeting type. It may be reused in other contexts.
    */
  var assignedTargetingOptionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Audience targeting details. This field will be populated when the targeting_type is `TARGETING_TYPE_AUDIENCE_GROUP`. You can only target one audience group option per resource.
    */
  var audienceGroupDetails: js.UndefOr[SchemaAudienceGroupAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Audio content type details. This field will be populated when the targeting_type is `TARGETING_TYPE_AUDIO_CONTENT_TYPE`.
    */
  var audioContentTypeDetails: js.UndefOr[SchemaAudioContentTypeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Authorized seller status details. This field will be populated when the targeting_type is `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS`. You can only target one authorized seller status option per resource. If a resource doesn't have an authorized seller status option, all authorized sellers indicated as DIRECT or RESELLER in the ads.txt file are targeted by default.
    */
  var authorizedSellerStatusDetails: js.UndefOr[SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Browser details. This field will be populated when the targeting_type is `TARGETING_TYPE_BROWSER`.
    */
  var browserDetails: js.UndefOr[SchemaBrowserAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Business chain details. This field will be populated when the targeting_type is `TARGETING_TYPE_BUSINESS_CHAIN`.
    */
  var businessChainDetails: js.UndefOr[SchemaBusinessChainAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Carrier and ISP details. This field will be populated when the targeting_type is `TARGETING_TYPE_CARRIER_AND_ISP`.
    */
  var carrierAndIspDetails: js.UndefOr[SchemaCarrierAndIspAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Category details. This field will be populated when the targeting_type is `TARGETING_TYPE_CATEGORY`. Targeting a category will also target its subcategories. If a category is excluded from targeting and a subcategory is included, the exclusion will take precedence.
    */
  var categoryDetails: js.UndefOr[SchemaCategoryAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Channel details. This field will be populated when the targeting_type is `TARGETING_TYPE_CHANNEL`.
    */
  var channelDetails: js.UndefOr[SchemaChannelAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Content duration details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_DURATION`.
    */
  var contentDurationDetails: js.UndefOr[SchemaContentDurationAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Content genre details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_GENRE`.
    */
  var contentGenreDetails: js.UndefOr[SchemaContentGenreAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Content instream position details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`.
    */
  var contentInstreamPositionDetails: js.UndefOr[SchemaContentInstreamPositionAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Content outstream position details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION`.
    */
  var contentOutstreamPositionDetails: js.UndefOr[SchemaContentOutstreamPositionAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Content duration details. This field will be populated when the TargetingType is `TARGETING_TYPE_CONTENT_STREAM_TYPE`.
    */
  var contentStreamTypeDetails: js.UndefOr[SchemaContentStreamTypeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Day and time details. This field will be populated when the targeting_type is `TARGETING_TYPE_DAY_AND_TIME`.
    */
  var dayAndTimeDetails: js.UndefOr[SchemaDayAndTimeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Device make and model details. This field will be populated when the targeting_type is `TARGETING_TYPE_DEVICE_MAKE_MODEL`.
    */
  var deviceMakeModelDetails: js.UndefOr[SchemaDeviceMakeModelAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Device Type details. This field will be populated when the targeting_type is `TARGETING_TYPE_DEVICE_TYPE`.
    */
  var deviceTypeDetails: js.UndefOr[SchemaDeviceTypeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Digital content label details. This field will be populated when the targeting_type is `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION`. Digital content labels are targeting exclusions. Advertiser level digital content label exclusions, if set, are always applied in serving (even though they aren't visible in resource settings). Resource settings can exclude content labels in addition to advertiser exclusions, but can't override them. A line item won't serve if all the digital content labels are excluded.
    */
  var digitalContentLabelExclusionDetails: js.UndefOr[SchemaDigitalContentLabelAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Environment details. This field will be populated when the targeting_type is `TARGETING_TYPE_ENVIRONMENT`.
    */
  var environmentDetails: js.UndefOr[SchemaEnvironmentAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Exchange details. This field will be populated when the targeting_type is `TARGETING_TYPE_EXCHANGE`.
    */
  var exchangeDetails: js.UndefOr[SchemaExchangeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Gender details. This field will be populated when the targeting_type is `TARGETING_TYPE_GENDER`.
    */
  var genderDetails: js.UndefOr[SchemaGenderAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Geographic region details. This field will be populated when the targeting_type is `TARGETING_TYPE_GEO_REGION`.
    */
  var geoRegionDetails: js.UndefOr[SchemaGeoRegionAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Household income details. This field will be populated when the targeting_type is `TARGETING_TYPE_HOUSEHOLD_INCOME`.
    */
  var householdIncomeDetails: js.UndefOr[SchemaHouseholdIncomeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Output only. The inheritance status of the assigned targeting option.
    */
  var inheritance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Inventory source details. This field will be populated when the targeting_type is `TARGETING_TYPE_INVENTORY_SOURCE`.
    */
  var inventorySourceDetails: js.UndefOr[SchemaInventorySourceAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Inventory source group details. This field will be populated when the targeting_type is `TARGETING_TYPE_INVENTORY_SOURCE_GROUP`.
    */
  var inventorySourceGroupDetails: js.UndefOr[SchemaInventorySourceGroupAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Keyword details. This field will be populated when the targeting_type is `TARGETING_TYPE_KEYWORD`. A maximum of 5000 direct negative keywords can be assigned to a resource. No limit on number of positive keywords that can be assigned.
    */
  var keywordDetails: js.UndefOr[SchemaKeywordAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Language details. This field will be populated when the targeting_type is `TARGETING_TYPE_LANGUAGE`.
    */
  var languageDetails: js.UndefOr[SchemaLanguageAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Output only. The resource name for this assigned targeting option.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Native content position details. This field will be populated when the targeting_type is `TARGETING_TYPE_NATIVE_CONTENT_POSITION`.
    */
  var nativeContentPositionDetails: js.UndefOr[SchemaNativeContentPositionAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Keyword details. This field will be populated when the targeting_type is `TARGETING_TYPE_NEGATIVE_KEYWORD_LIST`. A maximum of 4 negative keyword lists can be assigned to a resource.
    */
  var negativeKeywordListDetails: js.UndefOr[SchemaNegativeKeywordListAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Open Measurement enabled inventory details. This field will be populated when the targeting_type is `TARGETING_TYPE_OMID`.
    */
  var omidDetails: js.UndefOr[SchemaOmidAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * On screen position details. This field will be populated when the targeting_type is `TARGETING_TYPE_ON_SCREEN_POSITION`.
    */
  var onScreenPositionDetails: js.UndefOr[SchemaOnScreenPositionAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Operating system details. This field will be populated when the targeting_type is `TARGETING_TYPE_OPERATING_SYSTEM`.
    */
  var operatingSystemDetails: js.UndefOr[SchemaOperatingSystemAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Parental status details. This field will be populated when the targeting_type is `TARGETING_TYPE_PARENTAL_STATUS`.
    */
  var parentalStatusDetails: js.UndefOr[SchemaParentalStatusAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * POI details. This field will be populated when the targeting_type is `TARGETING_TYPE_POI`.
    */
  var poiDetails: js.UndefOr[SchemaPoiAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Proximity location list details. This field will be populated when the targeting_type is `TARGETING_TYPE_PROXIMITY_LOCATION_LIST`.
    */
  var proximityLocationListDetails: js.UndefOr[SchemaProximityLocationListAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Regional location list details. This field will be populated when the targeting_type is `TARGETING_TYPE_REGIONAL_LOCATION_LIST`.
    */
  var regionalLocationListDetails: js.UndefOr[SchemaRegionalLocationListAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Sensitive category details. This field will be populated when the targeting_type is `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`. Sensitive categories are targeting exclusions. Advertiser level sensitive category exclusions, if set, are always applied in serving (even though they aren't visible in resource settings). Resource settings can exclude sensitive categories in addition to advertiser exclusions, but can't override them.
    */
  var sensitiveCategoryExclusionDetails: js.UndefOr[SchemaSensitiveCategoryAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Sub-exchange details. This field will be populated when the targeting_type is `TARGETING_TYPE_SUB_EXCHANGE`.
    */
  var subExchangeDetails: js.UndefOr[SchemaSubExchangeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Output only. Identifies the type of this assigned targeting option.
    */
  var targetingType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Third party verification details. This field will be populated when the targeting_type is `TARGETING_TYPE_THIRD_PARTY_VERIFIER`.
    */
  var thirdPartyVerifierDetails: js.UndefOr[SchemaThirdPartyVerifierAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * URL details. This field will be populated when the targeting_type is `TARGETING_TYPE_URL`.
    */
  var urlDetails: js.UndefOr[SchemaUrlAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * User rewarded content details. This field will be populated when the targeting_type is `TARGETING_TYPE_USER_REWARDED_CONTENT`.
    */
  var userRewardedContentDetails: js.UndefOr[SchemaUserRewardedContentAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Video player size details. This field will be populated when the targeting_type is `TARGETING_TYPE_VIDEO_PLAYER_SIZE`.
    */
  var videoPlayerSizeDetails: js.UndefOr[SchemaVideoPlayerSizeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Viewability details. This field will be populated when the targeting_type is `TARGETING_TYPE_VIEWABILITY`. You can only target one viewability option per resource.
    */
  var viewabilityDetails: js.UndefOr[SchemaViewabilityAssignedTargetingOptionDetails] = js.undefined
}
object SchemaAssignedTargetingOption {
  
  inline def apply(): SchemaAssignedTargetingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignedTargetingOption]
  }
  
  extension [Self <: SchemaAssignedTargetingOption](x: Self) {
    
    inline def setAgeRangeDetails(value: SchemaAgeRangeAssignedTargetingOptionDetails): Self = StObject.set(x, "ageRangeDetails", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeDetailsUndefined: Self = StObject.set(x, "ageRangeDetails", js.undefined)
    
    inline def setAppCategoryDetails(value: SchemaAppCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "appCategoryDetails", value.asInstanceOf[js.Any])
    
    inline def setAppCategoryDetailsUndefined: Self = StObject.set(x, "appCategoryDetails", js.undefined)
    
    inline def setAppDetails(value: SchemaAppAssignedTargetingOptionDetails): Self = StObject.set(x, "appDetails", value.asInstanceOf[js.Any])
    
    inline def setAppDetailsUndefined: Self = StObject.set(x, "appDetails", js.undefined)
    
    inline def setAssignedTargetingOptionId(value: String): Self = StObject.set(x, "assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionIdNull: Self = StObject.set(x, "assignedTargetingOptionId", null)
    
    inline def setAssignedTargetingOptionIdUndefined: Self = StObject.set(x, "assignedTargetingOptionId", js.undefined)
    
    inline def setAudienceGroupDetails(value: SchemaAudienceGroupAssignedTargetingOptionDetails): Self = StObject.set(x, "audienceGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setAudienceGroupDetailsUndefined: Self = StObject.set(x, "audienceGroupDetails", js.undefined)
    
    inline def setAudioContentTypeDetails(value: SchemaAudioContentTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "audioContentTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeDetailsUndefined: Self = StObject.set(x, "audioContentTypeDetails", js.undefined)
    
    inline def setAuthorizedSellerStatusDetails(value: SchemaAuthorizedSellerStatusAssignedTargetingOptionDetails): Self = StObject.set(x, "authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusDetailsUndefined: Self = StObject.set(x, "authorizedSellerStatusDetails", js.undefined)
    
    inline def setBrowserDetails(value: SchemaBrowserAssignedTargetingOptionDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
    
    inline def setBrowserDetailsUndefined: Self = StObject.set(x, "browserDetails", js.undefined)
    
    inline def setBusinessChainDetails(value: SchemaBusinessChainAssignedTargetingOptionDetails): Self = StObject.set(x, "businessChainDetails", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainDetailsUndefined: Self = StObject.set(x, "businessChainDetails", js.undefined)
    
    inline def setCarrierAndIspDetails(value: SchemaCarrierAndIspAssignedTargetingOptionDetails): Self = StObject.set(x, "carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    inline def setCarrierAndIspDetailsUndefined: Self = StObject.set(x, "carrierAndIspDetails", js.undefined)
    
    inline def setCategoryDetails(value: SchemaCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "categoryDetails", value.asInstanceOf[js.Any])
    
    inline def setCategoryDetailsUndefined: Self = StObject.set(x, "categoryDetails", js.undefined)
    
    inline def setChannelDetails(value: SchemaChannelAssignedTargetingOptionDetails): Self = StObject.set(x, "channelDetails", value.asInstanceOf[js.Any])
    
    inline def setChannelDetailsUndefined: Self = StObject.set(x, "channelDetails", js.undefined)
    
    inline def setContentDurationDetails(value: SchemaContentDurationAssignedTargetingOptionDetails): Self = StObject.set(x, "contentDurationDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDurationDetailsUndefined: Self = StObject.set(x, "contentDurationDetails", js.undefined)
    
    inline def setContentGenreDetails(value: SchemaContentGenreAssignedTargetingOptionDetails): Self = StObject.set(x, "contentGenreDetails", value.asInstanceOf[js.Any])
    
    inline def setContentGenreDetailsUndefined: Self = StObject.set(x, "contentGenreDetails", js.undefined)
    
    inline def setContentInstreamPositionDetails(value: SchemaContentInstreamPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setContentInstreamPositionDetailsUndefined: Self = StObject.set(x, "contentInstreamPositionDetails", js.undefined)
    
    inline def setContentOutstreamPositionDetails(value: SchemaContentOutstreamPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setContentOutstreamPositionDetailsUndefined: Self = StObject.set(x, "contentOutstreamPositionDetails", js.undefined)
    
    inline def setContentStreamTypeDetails(value: SchemaContentStreamTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "contentStreamTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeDetailsUndefined: Self = StObject.set(x, "contentStreamTypeDetails", js.undefined)
    
    inline def setDayAndTimeDetails(value: SchemaDayAndTimeAssignedTargetingOptionDetails): Self = StObject.set(x, "dayAndTimeDetails", value.asInstanceOf[js.Any])
    
    inline def setDayAndTimeDetailsUndefined: Self = StObject.set(x, "dayAndTimeDetails", js.undefined)
    
    inline def setDeviceMakeModelDetails(value: SchemaDeviceMakeModelAssignedTargetingOptionDetails): Self = StObject.set(x, "deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceMakeModelDetailsUndefined: Self = StObject.set(x, "deviceMakeModelDetails", js.undefined)
    
    inline def setDeviceTypeDetails(value: SchemaDeviceTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "deviceTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeDetailsUndefined: Self = StObject.set(x, "deviceTypeDetails", js.undefined)
    
    inline def setDigitalContentLabelExclusionDetails(value: SchemaDigitalContentLabelAssignedTargetingOptionDetails): Self = StObject.set(x, "digitalContentLabelExclusionDetails", value.asInstanceOf[js.Any])
    
    inline def setDigitalContentLabelExclusionDetailsUndefined: Self = StObject.set(x, "digitalContentLabelExclusionDetails", js.undefined)
    
    inline def setEnvironmentDetails(value: SchemaEnvironmentAssignedTargetingOptionDetails): Self = StObject.set(x, "environmentDetails", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDetailsUndefined: Self = StObject.set(x, "environmentDetails", js.undefined)
    
    inline def setExchangeDetails(value: SchemaExchangeAssignedTargetingOptionDetails): Self = StObject.set(x, "exchangeDetails", value.asInstanceOf[js.Any])
    
    inline def setExchangeDetailsUndefined: Self = StObject.set(x, "exchangeDetails", js.undefined)
    
    inline def setGenderDetails(value: SchemaGenderAssignedTargetingOptionDetails): Self = StObject.set(x, "genderDetails", value.asInstanceOf[js.Any])
    
    inline def setGenderDetailsUndefined: Self = StObject.set(x, "genderDetails", js.undefined)
    
    inline def setGeoRegionDetails(value: SchemaGeoRegionAssignedTargetingOptionDetails): Self = StObject.set(x, "geoRegionDetails", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionDetailsUndefined: Self = StObject.set(x, "geoRegionDetails", js.undefined)
    
    inline def setHouseholdIncomeDetails(value: SchemaHouseholdIncomeAssignedTargetingOptionDetails): Self = StObject.set(x, "householdIncomeDetails", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeDetailsUndefined: Self = StObject.set(x, "householdIncomeDetails", js.undefined)
    
    inline def setInheritance(value: String): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setInheritanceNull: Self = StObject.set(x, "inheritance", null)
    
    inline def setInheritanceUndefined: Self = StObject.set(x, "inheritance", js.undefined)
    
    inline def setInventorySourceDetails(value: SchemaInventorySourceAssignedTargetingOptionDetails): Self = StObject.set(x, "inventorySourceDetails", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceDetailsUndefined: Self = StObject.set(x, "inventorySourceDetails", js.undefined)
    
    inline def setInventorySourceGroupDetails(value: SchemaInventorySourceGroupAssignedTargetingOptionDetails): Self = StObject.set(x, "inventorySourceGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupDetailsUndefined: Self = StObject.set(x, "inventorySourceGroupDetails", js.undefined)
    
    inline def setKeywordDetails(value: SchemaKeywordAssignedTargetingOptionDetails): Self = StObject.set(x, "keywordDetails", value.asInstanceOf[js.Any])
    
    inline def setKeywordDetailsUndefined: Self = StObject.set(x, "keywordDetails", js.undefined)
    
    inline def setLanguageDetails(value: SchemaLanguageAssignedTargetingOptionDetails): Self = StObject.set(x, "languageDetails", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetailsUndefined: Self = StObject.set(x, "languageDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNativeContentPositionDetails(value: SchemaNativeContentPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "nativeContentPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setNativeContentPositionDetailsUndefined: Self = StObject.set(x, "nativeContentPositionDetails", js.undefined)
    
    inline def setNegativeKeywordListDetails(value: SchemaNegativeKeywordListAssignedTargetingOptionDetails): Self = StObject.set(x, "negativeKeywordListDetails", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListDetailsUndefined: Self = StObject.set(x, "negativeKeywordListDetails", js.undefined)
    
    inline def setOmidDetails(value: SchemaOmidAssignedTargetingOptionDetails): Self = StObject.set(x, "omidDetails", value.asInstanceOf[js.Any])
    
    inline def setOmidDetailsUndefined: Self = StObject.set(x, "omidDetails", js.undefined)
    
    inline def setOnScreenPositionDetails(value: SchemaOnScreenPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setOnScreenPositionDetailsUndefined: Self = StObject.set(x, "onScreenPositionDetails", js.undefined)
    
    inline def setOperatingSystemDetails(value: SchemaOperatingSystemAssignedTargetingOptionDetails): Self = StObject.set(x, "operatingSystemDetails", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemDetailsUndefined: Self = StObject.set(x, "operatingSystemDetails", js.undefined)
    
    inline def setParentalStatusDetails(value: SchemaParentalStatusAssignedTargetingOptionDetails): Self = StObject.set(x, "parentalStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusDetailsUndefined: Self = StObject.set(x, "parentalStatusDetails", js.undefined)
    
    inline def setPoiDetails(value: SchemaPoiAssignedTargetingOptionDetails): Self = StObject.set(x, "poiDetails", value.asInstanceOf[js.Any])
    
    inline def setPoiDetailsUndefined: Self = StObject.set(x, "poiDetails", js.undefined)
    
    inline def setProximityLocationListDetails(value: SchemaProximityLocationListAssignedTargetingOptionDetails): Self = StObject.set(x, "proximityLocationListDetails", value.asInstanceOf[js.Any])
    
    inline def setProximityLocationListDetailsUndefined: Self = StObject.set(x, "proximityLocationListDetails", js.undefined)
    
    inline def setRegionalLocationListDetails(value: SchemaRegionalLocationListAssignedTargetingOptionDetails): Self = StObject.set(x, "regionalLocationListDetails", value.asInstanceOf[js.Any])
    
    inline def setRegionalLocationListDetailsUndefined: Self = StObject.set(x, "regionalLocationListDetails", js.undefined)
    
    inline def setSensitiveCategoryExclusionDetails(value: SchemaSensitiveCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "sensitiveCategoryExclusionDetails", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoryExclusionDetailsUndefined: Self = StObject.set(x, "sensitiveCategoryExclusionDetails", js.undefined)
    
    inline def setSubExchangeDetails(value: SchemaSubExchangeAssignedTargetingOptionDetails): Self = StObject.set(x, "subExchangeDetails", value.asInstanceOf[js.Any])
    
    inline def setSubExchangeDetailsUndefined: Self = StObject.set(x, "subExchangeDetails", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeNull: Self = StObject.set(x, "targetingType", null)
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
    
    inline def setThirdPartyVerifierDetails(value: SchemaThirdPartyVerifierAssignedTargetingOptionDetails): Self = StObject.set(x, "thirdPartyVerifierDetails", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyVerifierDetailsUndefined: Self = StObject.set(x, "thirdPartyVerifierDetails", js.undefined)
    
    inline def setUrlDetails(value: SchemaUrlAssignedTargetingOptionDetails): Self = StObject.set(x, "urlDetails", value.asInstanceOf[js.Any])
    
    inline def setUrlDetailsUndefined: Self = StObject.set(x, "urlDetails", js.undefined)
    
    inline def setUserRewardedContentDetails(value: SchemaUserRewardedContentAssignedTargetingOptionDetails): Self = StObject.set(x, "userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    inline def setUserRewardedContentDetailsUndefined: Self = StObject.set(x, "userRewardedContentDetails", js.undefined)
    
    inline def setVideoPlayerSizeDetails(value: SchemaVideoPlayerSizeAssignedTargetingOptionDetails): Self = StObject.set(x, "videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoPlayerSizeDetailsUndefined: Self = StObject.set(x, "videoPlayerSizeDetails", js.undefined)
    
    inline def setViewabilityDetails(value: SchemaViewabilityAssignedTargetingOptionDetails): Self = StObject.set(x, "viewabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setViewabilityDetailsUndefined: Self = StObject.set(x, "viewabilityDetails", js.undefined)
  }
}
