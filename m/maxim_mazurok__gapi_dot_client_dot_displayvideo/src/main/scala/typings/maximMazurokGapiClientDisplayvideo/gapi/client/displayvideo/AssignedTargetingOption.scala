package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedTargetingOption extends StObject {
  
  /** Age range details. This field will be populated when the targeting_type is `TARGETING_TYPE_AGE_RANGE`. */
  var ageRangeDetails: js.UndefOr[AgeRangeAssignedTargetingOptionDetails] = js.undefined
  
  /** App category details. This field will be populated when the targeting_type is `TARGETING_TYPE_APP_CATEGORY`. */
  var appCategoryDetails: js.UndefOr[AppCategoryAssignedTargetingOptionDetails] = js.undefined
  
  /** App details. This field will be populated when the targeting_type is `TARGETING_TYPE_APP`. */
  var appDetails: js.UndefOr[AppAssignedTargetingOptionDetails] = js.undefined
  
  /** Output only. The unique ID of the assigned targeting option. The ID is only unique within a given resource and targeting type. It may be reused in other contexts. */
  var assignedTargetingOptionId: js.UndefOr[String] = js.undefined
  
  /** Audience targeting details. This field will be populated when the targeting_type is `TARGETING_TYPE_AUDIENCE_GROUP`. You can only target one audience group option per resource. */
  var audienceGroupDetails: js.UndefOr[AudienceGroupAssignedTargetingOptionDetails] = js.undefined
  
  /** Audio content type details. This field will be populated when the targeting_type is `TARGETING_TYPE_AUDIO_CONTENT_TYPE`. */
  var audioContentTypeDetails: js.UndefOr[AudioContentTypeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Authorized seller status details. This field will be populated when the targeting_type is `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS`. You can only target one authorized seller status
    * option per resource. If a resource doesn't have an authorized seller status option, all authorized sellers indicated as DIRECT or RESELLER in the ads.txt file are targeted by
    * default.
    */
  var authorizedSellerStatusDetails: js.UndefOr[AuthorizedSellerStatusAssignedTargetingOptionDetails] = js.undefined
  
  /** Browser details. This field will be populated when the targeting_type is `TARGETING_TYPE_BROWSER`. */
  var browserDetails: js.UndefOr[BrowserAssignedTargetingOptionDetails] = js.undefined
  
  /** Business chain details. This field will be populated when the targeting_type is `TARGETING_TYPE_BUSINESS_CHAIN`. */
  var businessChainDetails: js.UndefOr[BusinessChainAssignedTargetingOptionDetails] = js.undefined
  
  /** Carrier and ISP details. This field will be populated when the targeting_type is `TARGETING_TYPE_CARRIER_AND_ISP`. */
  var carrierAndIspDetails: js.UndefOr[CarrierAndIspAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Category details. This field will be populated when the targeting_type is `TARGETING_TYPE_CATEGORY`. Targeting a category will also target its subcategories. If a category is
    * excluded from targeting and a subcategory is included, the exclusion will take precedence.
    */
  var categoryDetails: js.UndefOr[CategoryAssignedTargetingOptionDetails] = js.undefined
  
  /** Channel details. This field will be populated when the targeting_type is `TARGETING_TYPE_CHANNEL`. */
  var channelDetails: js.UndefOr[ChannelAssignedTargetingOptionDetails] = js.undefined
  
  /** Content duration details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_DURATION`. */
  var contentDurationDetails: js.UndefOr[ContentDurationAssignedTargetingOptionDetails] = js.undefined
  
  /** Content genre details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_GENRE`. */
  var contentGenreDetails: js.UndefOr[ContentGenreAssignedTargetingOptionDetails] = js.undefined
  
  /** Content instream position details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`. */
  var contentInstreamPositionDetails: js.UndefOr[ContentInstreamPositionAssignedTargetingOptionDetails] = js.undefined
  
  /** Content outstream position details. This field will be populated when the targeting_type is `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION`. */
  var contentOutstreamPositionDetails: js.UndefOr[ContentOutstreamPositionAssignedTargetingOptionDetails] = js.undefined
  
  /** Content duration details. This field will be populated when the TargetingType is `TARGETING_TYPE_CONTENT_STREAM_TYPE`. */
  var contentStreamTypeDetails: js.UndefOr[ContentStreamTypeAssignedTargetingOptionDetails] = js.undefined
  
  /** Day and time details. This field will be populated when the targeting_type is `TARGETING_TYPE_DAY_AND_TIME`. */
  var dayAndTimeDetails: js.UndefOr[DayAndTimeAssignedTargetingOptionDetails] = js.undefined
  
  /** Device make and model details. This field will be populated when the targeting_type is `TARGETING_TYPE_DEVICE_MAKE_MODEL`. */
  var deviceMakeModelDetails: js.UndefOr[DeviceMakeModelAssignedTargetingOptionDetails] = js.undefined
  
  /** Device Type details. This field will be populated when the targeting_type is `TARGETING_TYPE_DEVICE_TYPE`. */
  var deviceTypeDetails: js.UndefOr[DeviceTypeAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Digital content label details. This field will be populated when the targeting_type is `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION`. Digital content labels are targeting
    * exclusions. Advertiser level digital content label exclusions, if set, are always applied in serving (even though they aren't visible in resource settings). Resource settings can
    * exclude content labels in addition to advertiser exclusions, but can't override them. A line item won't serve if all the digital content labels are excluded.
    */
  var digitalContentLabelExclusionDetails: js.UndefOr[DigitalContentLabelAssignedTargetingOptionDetails] = js.undefined
  
  /** Environment details. This field will be populated when the targeting_type is `TARGETING_TYPE_ENVIRONMENT`. */
  var environmentDetails: js.UndefOr[EnvironmentAssignedTargetingOptionDetails] = js.undefined
  
  /** Exchange details. This field will be populated when the targeting_type is `TARGETING_TYPE_EXCHANGE`. */
  var exchangeDetails: js.UndefOr[ExchangeAssignedTargetingOptionDetails] = js.undefined
  
  /** Gender details. This field will be populated when the targeting_type is `TARGETING_TYPE_GENDER`. */
  var genderDetails: js.UndefOr[GenderAssignedTargetingOptionDetails] = js.undefined
  
  /** Geographic region details. This field will be populated when the targeting_type is `TARGETING_TYPE_GEO_REGION`. */
  var geoRegionDetails: js.UndefOr[GeoRegionAssignedTargetingOptionDetails] = js.undefined
  
  /** Household income details. This field will be populated when the targeting_type is `TARGETING_TYPE_HOUSEHOLD_INCOME`. */
  var householdIncomeDetails: js.UndefOr[HouseholdIncomeAssignedTargetingOptionDetails] = js.undefined
  
  /** Output only. The inheritance status of the assigned targeting option. */
  var inheritance: js.UndefOr[String] = js.undefined
  
  /** Inventory source details. This field will be populated when the targeting_type is `TARGETING_TYPE_INVENTORY_SOURCE`. */
  var inventorySourceDetails: js.UndefOr[InventorySourceAssignedTargetingOptionDetails] = js.undefined
  
  /** Inventory source group details. This field will be populated when the targeting_type is `TARGETING_TYPE_INVENTORY_SOURCE_GROUP`. */
  var inventorySourceGroupDetails: js.UndefOr[InventorySourceGroupAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Keyword details. This field will be populated when the targeting_type is `TARGETING_TYPE_KEYWORD`. A maximum of 5000 direct negative keywords can be assigned to a resource. No limit
    * on number of positive keywords that can be assigned.
    */
  var keywordDetails: js.UndefOr[KeywordAssignedTargetingOptionDetails] = js.undefined
  
  /** Language details. This field will be populated when the targeting_type is `TARGETING_TYPE_LANGUAGE`. */
  var languageDetails: js.UndefOr[LanguageAssignedTargetingOptionDetails] = js.undefined
  
  /** Output only. The resource name for this assigned targeting option. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Native content position details. This field will be populated when the targeting_type is `TARGETING_TYPE_NATIVE_CONTENT_POSITION`. */
  var nativeContentPositionDetails: js.UndefOr[NativeContentPositionAssignedTargetingOptionDetails] = js.undefined
  
  /** Keyword details. This field will be populated when the targeting_type is `TARGETING_TYPE_NEGATIVE_KEYWORD_LIST`. A maximum of 4 negative keyword lists can be assigned to a resource. */
  var negativeKeywordListDetails: js.UndefOr[NegativeKeywordListAssignedTargetingOptionDetails] = js.undefined
  
  /** Open Measurement enabled inventory details. This field will be populated when the targeting_type is `TARGETING_TYPE_OMID`. */
  var omidDetails: js.UndefOr[OmidAssignedTargetingOptionDetails] = js.undefined
  
  /** On screen position details. This field will be populated when the targeting_type is `TARGETING_TYPE_ON_SCREEN_POSITION`. */
  var onScreenPositionDetails: js.UndefOr[OnScreenPositionAssignedTargetingOptionDetails] = js.undefined
  
  /** Operating system details. This field will be populated when the targeting_type is `TARGETING_TYPE_OPERATING_SYSTEM`. */
  var operatingSystemDetails: js.UndefOr[OperatingSystemAssignedTargetingOptionDetails] = js.undefined
  
  /** Parental status details. This field will be populated when the targeting_type is `TARGETING_TYPE_PARENTAL_STATUS`. */
  var parentalStatusDetails: js.UndefOr[ParentalStatusAssignedTargetingOptionDetails] = js.undefined
  
  /** POI details. This field will be populated when the targeting_type is `TARGETING_TYPE_POI`. */
  var poiDetails: js.UndefOr[PoiAssignedTargetingOptionDetails] = js.undefined
  
  /** Proximity location list details. This field will be populated when the targeting_type is `TARGETING_TYPE_PROXIMITY_LOCATION_LIST`. */
  var proximityLocationListDetails: js.UndefOr[ProximityLocationListAssignedTargetingOptionDetails] = js.undefined
  
  /** Regional location list details. This field will be populated when the targeting_type is `TARGETING_TYPE_REGIONAL_LOCATION_LIST`. */
  var regionalLocationListDetails: js.UndefOr[RegionalLocationListAssignedTargetingOptionDetails] = js.undefined
  
  /**
    * Sensitive category details. This field will be populated when the targeting_type is `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`. Sensitive categories are targeting exclusions.
    * Advertiser level sensitive category exclusions, if set, are always applied in serving (even though they aren't visible in resource settings). Resource settings can exclude sensitive
    * categories in addition to advertiser exclusions, but can't override them.
    */
  var sensitiveCategoryExclusionDetails: js.UndefOr[SensitiveCategoryAssignedTargetingOptionDetails] = js.undefined
  
  /** Sub-exchange details. This field will be populated when the targeting_type is `TARGETING_TYPE_SUB_EXCHANGE`. */
  var subExchangeDetails: js.UndefOr[SubExchangeAssignedTargetingOptionDetails] = js.undefined
  
  /** Output only. Identifies the type of this assigned targeting option. */
  var targetingType: js.UndefOr[String] = js.undefined
  
  /** Third party verification details. This field will be populated when the targeting_type is `TARGETING_TYPE_THIRD_PARTY_VERIFIER`. */
  var thirdPartyVerifierDetails: js.UndefOr[ThirdPartyVerifierAssignedTargetingOptionDetails] = js.undefined
  
  /** URL details. This field will be populated when the targeting_type is `TARGETING_TYPE_URL`. */
  var urlDetails: js.UndefOr[UrlAssignedTargetingOptionDetails] = js.undefined
  
  /** User rewarded content details. This field will be populated when the targeting_type is `TARGETING_TYPE_USER_REWARDED_CONTENT`. */
  var userRewardedContentDetails: js.UndefOr[UserRewardedContentAssignedTargetingOptionDetails] = js.undefined
  
  /** Video player size details. This field will be populated when the targeting_type is `TARGETING_TYPE_VIDEO_PLAYER_SIZE`. */
  var videoPlayerSizeDetails: js.UndefOr[VideoPlayerSizeAssignedTargetingOptionDetails] = js.undefined
  
  /** Viewability details. This field will be populated when the targeting_type is `TARGETING_TYPE_VIEWABILITY`. You can only target one viewability option per resource. */
  var viewabilityDetails: js.UndefOr[ViewabilityAssignedTargetingOptionDetails] = js.undefined
}
object AssignedTargetingOption {
  
  inline def apply(): AssignedTargetingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedTargetingOption]
  }
  
  extension [Self <: AssignedTargetingOption](x: Self) {
    
    inline def setAgeRangeDetails(value: AgeRangeAssignedTargetingOptionDetails): Self = StObject.set(x, "ageRangeDetails", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeDetailsUndefined: Self = StObject.set(x, "ageRangeDetails", js.undefined)
    
    inline def setAppCategoryDetails(value: AppCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "appCategoryDetails", value.asInstanceOf[js.Any])
    
    inline def setAppCategoryDetailsUndefined: Self = StObject.set(x, "appCategoryDetails", js.undefined)
    
    inline def setAppDetails(value: AppAssignedTargetingOptionDetails): Self = StObject.set(x, "appDetails", value.asInstanceOf[js.Any])
    
    inline def setAppDetailsUndefined: Self = StObject.set(x, "appDetails", js.undefined)
    
    inline def setAssignedTargetingOptionId(value: String): Self = StObject.set(x, "assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setAssignedTargetingOptionIdUndefined: Self = StObject.set(x, "assignedTargetingOptionId", js.undefined)
    
    inline def setAudienceGroupDetails(value: AudienceGroupAssignedTargetingOptionDetails): Self = StObject.set(x, "audienceGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setAudienceGroupDetailsUndefined: Self = StObject.set(x, "audienceGroupDetails", js.undefined)
    
    inline def setAudioContentTypeDetails(value: AudioContentTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "audioContentTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeDetailsUndefined: Self = StObject.set(x, "audioContentTypeDetails", js.undefined)
    
    inline def setAuthorizedSellerStatusDetails(value: AuthorizedSellerStatusAssignedTargetingOptionDetails): Self = StObject.set(x, "authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusDetailsUndefined: Self = StObject.set(x, "authorizedSellerStatusDetails", js.undefined)
    
    inline def setBrowserDetails(value: BrowserAssignedTargetingOptionDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
    
    inline def setBrowserDetailsUndefined: Self = StObject.set(x, "browserDetails", js.undefined)
    
    inline def setBusinessChainDetails(value: BusinessChainAssignedTargetingOptionDetails): Self = StObject.set(x, "businessChainDetails", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainDetailsUndefined: Self = StObject.set(x, "businessChainDetails", js.undefined)
    
    inline def setCarrierAndIspDetails(value: CarrierAndIspAssignedTargetingOptionDetails): Self = StObject.set(x, "carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    inline def setCarrierAndIspDetailsUndefined: Self = StObject.set(x, "carrierAndIspDetails", js.undefined)
    
    inline def setCategoryDetails(value: CategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "categoryDetails", value.asInstanceOf[js.Any])
    
    inline def setCategoryDetailsUndefined: Self = StObject.set(x, "categoryDetails", js.undefined)
    
    inline def setChannelDetails(value: ChannelAssignedTargetingOptionDetails): Self = StObject.set(x, "channelDetails", value.asInstanceOf[js.Any])
    
    inline def setChannelDetailsUndefined: Self = StObject.set(x, "channelDetails", js.undefined)
    
    inline def setContentDurationDetails(value: ContentDurationAssignedTargetingOptionDetails): Self = StObject.set(x, "contentDurationDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDurationDetailsUndefined: Self = StObject.set(x, "contentDurationDetails", js.undefined)
    
    inline def setContentGenreDetails(value: ContentGenreAssignedTargetingOptionDetails): Self = StObject.set(x, "contentGenreDetails", value.asInstanceOf[js.Any])
    
    inline def setContentGenreDetailsUndefined: Self = StObject.set(x, "contentGenreDetails", js.undefined)
    
    inline def setContentInstreamPositionDetails(value: ContentInstreamPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setContentInstreamPositionDetailsUndefined: Self = StObject.set(x, "contentInstreamPositionDetails", js.undefined)
    
    inline def setContentOutstreamPositionDetails(value: ContentOutstreamPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setContentOutstreamPositionDetailsUndefined: Self = StObject.set(x, "contentOutstreamPositionDetails", js.undefined)
    
    inline def setContentStreamTypeDetails(value: ContentStreamTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "contentStreamTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeDetailsUndefined: Self = StObject.set(x, "contentStreamTypeDetails", js.undefined)
    
    inline def setDayAndTimeDetails(value: DayAndTimeAssignedTargetingOptionDetails): Self = StObject.set(x, "dayAndTimeDetails", value.asInstanceOf[js.Any])
    
    inline def setDayAndTimeDetailsUndefined: Self = StObject.set(x, "dayAndTimeDetails", js.undefined)
    
    inline def setDeviceMakeModelDetails(value: DeviceMakeModelAssignedTargetingOptionDetails): Self = StObject.set(x, "deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceMakeModelDetailsUndefined: Self = StObject.set(x, "deviceMakeModelDetails", js.undefined)
    
    inline def setDeviceTypeDetails(value: DeviceTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "deviceTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeDetailsUndefined: Self = StObject.set(x, "deviceTypeDetails", js.undefined)
    
    inline def setDigitalContentLabelExclusionDetails(value: DigitalContentLabelAssignedTargetingOptionDetails): Self = StObject.set(x, "digitalContentLabelExclusionDetails", value.asInstanceOf[js.Any])
    
    inline def setDigitalContentLabelExclusionDetailsUndefined: Self = StObject.set(x, "digitalContentLabelExclusionDetails", js.undefined)
    
    inline def setEnvironmentDetails(value: EnvironmentAssignedTargetingOptionDetails): Self = StObject.set(x, "environmentDetails", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDetailsUndefined: Self = StObject.set(x, "environmentDetails", js.undefined)
    
    inline def setExchangeDetails(value: ExchangeAssignedTargetingOptionDetails): Self = StObject.set(x, "exchangeDetails", value.asInstanceOf[js.Any])
    
    inline def setExchangeDetailsUndefined: Self = StObject.set(x, "exchangeDetails", js.undefined)
    
    inline def setGenderDetails(value: GenderAssignedTargetingOptionDetails): Self = StObject.set(x, "genderDetails", value.asInstanceOf[js.Any])
    
    inline def setGenderDetailsUndefined: Self = StObject.set(x, "genderDetails", js.undefined)
    
    inline def setGeoRegionDetails(value: GeoRegionAssignedTargetingOptionDetails): Self = StObject.set(x, "geoRegionDetails", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionDetailsUndefined: Self = StObject.set(x, "geoRegionDetails", js.undefined)
    
    inline def setHouseholdIncomeDetails(value: HouseholdIncomeAssignedTargetingOptionDetails): Self = StObject.set(x, "householdIncomeDetails", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeDetailsUndefined: Self = StObject.set(x, "householdIncomeDetails", js.undefined)
    
    inline def setInheritance(value: String): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setInheritanceUndefined: Self = StObject.set(x, "inheritance", js.undefined)
    
    inline def setInventorySourceDetails(value: InventorySourceAssignedTargetingOptionDetails): Self = StObject.set(x, "inventorySourceDetails", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceDetailsUndefined: Self = StObject.set(x, "inventorySourceDetails", js.undefined)
    
    inline def setInventorySourceGroupDetails(value: InventorySourceGroupAssignedTargetingOptionDetails): Self = StObject.set(x, "inventorySourceGroupDetails", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceGroupDetailsUndefined: Self = StObject.set(x, "inventorySourceGroupDetails", js.undefined)
    
    inline def setKeywordDetails(value: KeywordAssignedTargetingOptionDetails): Self = StObject.set(x, "keywordDetails", value.asInstanceOf[js.Any])
    
    inline def setKeywordDetailsUndefined: Self = StObject.set(x, "keywordDetails", js.undefined)
    
    inline def setLanguageDetails(value: LanguageAssignedTargetingOptionDetails): Self = StObject.set(x, "languageDetails", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetailsUndefined: Self = StObject.set(x, "languageDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNativeContentPositionDetails(value: NativeContentPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "nativeContentPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setNativeContentPositionDetailsUndefined: Self = StObject.set(x, "nativeContentPositionDetails", js.undefined)
    
    inline def setNegativeKeywordListDetails(value: NegativeKeywordListAssignedTargetingOptionDetails): Self = StObject.set(x, "negativeKeywordListDetails", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListDetailsUndefined: Self = StObject.set(x, "negativeKeywordListDetails", js.undefined)
    
    inline def setOmidDetails(value: OmidAssignedTargetingOptionDetails): Self = StObject.set(x, "omidDetails", value.asInstanceOf[js.Any])
    
    inline def setOmidDetailsUndefined: Self = StObject.set(x, "omidDetails", js.undefined)
    
    inline def setOnScreenPositionDetails(value: OnScreenPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setOnScreenPositionDetailsUndefined: Self = StObject.set(x, "onScreenPositionDetails", js.undefined)
    
    inline def setOperatingSystemDetails(value: OperatingSystemAssignedTargetingOptionDetails): Self = StObject.set(x, "operatingSystemDetails", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemDetailsUndefined: Self = StObject.set(x, "operatingSystemDetails", js.undefined)
    
    inline def setParentalStatusDetails(value: ParentalStatusAssignedTargetingOptionDetails): Self = StObject.set(x, "parentalStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusDetailsUndefined: Self = StObject.set(x, "parentalStatusDetails", js.undefined)
    
    inline def setPoiDetails(value: PoiAssignedTargetingOptionDetails): Self = StObject.set(x, "poiDetails", value.asInstanceOf[js.Any])
    
    inline def setPoiDetailsUndefined: Self = StObject.set(x, "poiDetails", js.undefined)
    
    inline def setProximityLocationListDetails(value: ProximityLocationListAssignedTargetingOptionDetails): Self = StObject.set(x, "proximityLocationListDetails", value.asInstanceOf[js.Any])
    
    inline def setProximityLocationListDetailsUndefined: Self = StObject.set(x, "proximityLocationListDetails", js.undefined)
    
    inline def setRegionalLocationListDetails(value: RegionalLocationListAssignedTargetingOptionDetails): Self = StObject.set(x, "regionalLocationListDetails", value.asInstanceOf[js.Any])
    
    inline def setRegionalLocationListDetailsUndefined: Self = StObject.set(x, "regionalLocationListDetails", js.undefined)
    
    inline def setSensitiveCategoryExclusionDetails(value: SensitiveCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "sensitiveCategoryExclusionDetails", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoryExclusionDetailsUndefined: Self = StObject.set(x, "sensitiveCategoryExclusionDetails", js.undefined)
    
    inline def setSubExchangeDetails(value: SubExchangeAssignedTargetingOptionDetails): Self = StObject.set(x, "subExchangeDetails", value.asInstanceOf[js.Any])
    
    inline def setSubExchangeDetailsUndefined: Self = StObject.set(x, "subExchangeDetails", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
    
    inline def setThirdPartyVerifierDetails(value: ThirdPartyVerifierAssignedTargetingOptionDetails): Self = StObject.set(x, "thirdPartyVerifierDetails", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyVerifierDetailsUndefined: Self = StObject.set(x, "thirdPartyVerifierDetails", js.undefined)
    
    inline def setUrlDetails(value: UrlAssignedTargetingOptionDetails): Self = StObject.set(x, "urlDetails", value.asInstanceOf[js.Any])
    
    inline def setUrlDetailsUndefined: Self = StObject.set(x, "urlDetails", js.undefined)
    
    inline def setUserRewardedContentDetails(value: UserRewardedContentAssignedTargetingOptionDetails): Self = StObject.set(x, "userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    inline def setUserRewardedContentDetailsUndefined: Self = StObject.set(x, "userRewardedContentDetails", js.undefined)
    
    inline def setVideoPlayerSizeDetails(value: VideoPlayerSizeAssignedTargetingOptionDetails): Self = StObject.set(x, "videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoPlayerSizeDetailsUndefined: Self = StObject.set(x, "videoPlayerSizeDetails", js.undefined)
    
    inline def setViewabilityDetails(value: ViewabilityAssignedTargetingOptionDetails): Self = StObject.set(x, "viewabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setViewabilityDetailsUndefined: Self = StObject.set(x, "viewabilityDetails", js.undefined)
  }
}
