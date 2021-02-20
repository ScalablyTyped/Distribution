package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedTargetingOption extends StObject {
  
  /** Age range details. This field will be populated when the TargetingType is `TARGETING_TYPE_AGE_RANGE`. */
  var ageRangeDetails: js.UndefOr[AgeRangeAssignedTargetingOptionDetails] = js.native
  
  /** App category details. This field will be populated when the TargetingType is `TARGETING_TYPE_APP_CATEGORY`. */
  var appCategoryDetails: js.UndefOr[AppCategoryAssignedTargetingOptionDetails] = js.native
  
  /** App details. This field will be populated when the TargetingType is `TARGETING_TYPE_APP`. */
  var appDetails: js.UndefOr[AppAssignedTargetingOptionDetails] = js.native
  
  /** Output only. The unique ID of the assigned targeting option. The ID is only unique within a given line item and targeting type. It may be reused in other contexts. */
  var assignedTargetingOptionId: js.UndefOr[String] = js.native
  
  /** Audience targeting details. This field will be populated when the TargetingType is `TARGETING_TYPE_AUDIENCE_GROUP`. You can only target one audience group option per line item. */
  var audienceGroupDetails: js.UndefOr[AudienceGroupAssignedTargetingOptionDetails] = js.native
  
  /**
    * Authorized seller status details. This field will be populated when the TargetingType is `TARGETING_TYPE_AUTHORIZED_SELLER_STATUS`. You can only target one authorized seller status
    * option per line item. If a line item doesn't have an authorized seller status option, all authorized sellers indicated as DIRECT or RESELLER in the ads.txt file are targeted by
    * default.
    */
  var authorizedSellerStatusDetails: js.UndefOr[AuthorizedSellerStatusAssignedTargetingOptionDetails] = js.native
  
  /** Browser details. This field will be populated when the TargetingType is `TARGETING_TYPE_BROWSER`. */
  var browserDetails: js.UndefOr[BrowserAssignedTargetingOptionDetails] = js.native
  
  /** Carrier and ISP details. This field will be populated when the TargetingType is `TARGETING_TYPE_CARRIER_AND_ISP`. */
  var carrierAndIspDetails: js.UndefOr[CarrierAndIspAssignedTargetingOptionDetails] = js.native
  
  /**
    * Category details. This field will be populated when the TargetingType is `TARGETING_TYPE_CATEGORY`. Targeting a category will also target its subcategories. If a category is
    * excluded from targeting and a subcategory is included, the exclusion will take precedence.
    */
  var categoryDetails: js.UndefOr[CategoryAssignedTargetingOptionDetails] = js.native
  
  /** Channel details. This field will be populated when the TargetingType is `TARGETING_TYPE_CHANNEL`. */
  var channelDetails: js.UndefOr[ChannelAssignedTargetingOptionDetails] = js.native
  
  /** Content instream position details. This field will be populated when the TargetingType is `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`. */
  var contentInstreamPositionDetails: js.UndefOr[ContentInstreamPositionAssignedTargetingOptionDetails] = js.native
  
  /** Content outstream position details. This field will be populated when the TargetingType is `TARGETING_TYPE_CONTENT_OUTSTREAM_POSITION`. */
  var contentOutstreamPositionDetails: js.UndefOr[ContentOutstreamPositionAssignedTargetingOptionDetails] = js.native
  
  /** Day and time details. This field will be populated when the TargetingType is `TARGETING_TYPE_DAY_AND_TIME`. */
  var dayAndTimeDetails: js.UndefOr[DayAndTimeAssignedTargetingOptionDetails] = js.native
  
  /** Device make and model details. This field will be populated when the TargetingType is `TARGETING_TYPE_DEVICE_MAKE_MODEL`. */
  var deviceMakeModelDetails: js.UndefOr[DeviceMakeModelAssignedTargetingOptionDetails] = js.native
  
  /** Device Type details. This field will be populated when the TargetingType is `TARGETING_TYPE_DEVICE_TYPE`. */
  var deviceTypeDetails: js.UndefOr[DeviceTypeAssignedTargetingOptionDetails] = js.native
  
  /**
    * Digital content label details. This field will be populated when the TargetingType is `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION`. Digital content labels are targeting
    * exclusions. Advertiser level digital content label exclusions, if set, are always applied in serving (even though they aren't visible in line item settings). Line item settings can
    * exclude content labels in addition to advertiser exclusions, but can't override them. A line item won't serve if all the digital content labels are excluded.
    */
  var digitalContentLabelExclusionDetails: js.UndefOr[DigitalContentLabelAssignedTargetingOptionDetails] = js.native
  
  /** Environment details. This field will be populated when the TargetingType is `TARGETING_TYPE_ENVIRONMENT`. */
  var environmentDetails: js.UndefOr[EnvironmentAssignedTargetingOptionDetails] = js.native
  
  /** Exchange details. This field will be populated when the TargetingType is `TARGETING_TYPE_EXCHANGE`. */
  var exchangeDetails: js.UndefOr[ExchangeAssignedTargetingOptionDetails] = js.native
  
  /** Gender details. This field will be populated when the TargetingType is `TARGETING_TYPE_GENDER`. */
  var genderDetails: js.UndefOr[GenderAssignedTargetingOptionDetails] = js.native
  
  /** Geographic region details. This field will be populated when the TargetingType is `TARGETING_TYPE_GEO_REGION`. */
  var geoRegionDetails: js.UndefOr[GeoRegionAssignedTargetingOptionDetails] = js.native
  
  /** Household income details. This field will be populated when the TargetingType is `TARGETING_TYPE_HOUSEHOLD_INCOME`. */
  var householdIncomeDetails: js.UndefOr[HouseholdIncomeAssignedTargetingOptionDetails] = js.native
  
  /** Output only. The inheritance status of the assigned targeting option. */
  var inheritance: js.UndefOr[String] = js.native
  
  /** Inventory source details. This field will be populated when the TargetingType is `TARGETING_TYPE_INVENTORY_SOURCE`. */
  var inventorySourceDetails: js.UndefOr[InventorySourceAssignedTargetingOptionDetails] = js.native
  
  /** Inventory source group details. This field will be populated when the TargetingType is `TARGETING_TYPE_INVENTORY_SOURCE_GROUP`. */
  var inventorySourceGroupDetails: js.UndefOr[InventorySourceGroupAssignedTargetingOptionDetails] = js.native
  
  /**
    * Keyword details. This field will be populated when the TargetingType is `TARGETING_TYPE_KEYWORD`. A maximum of 5000 direct negative keywords can be assigned to a line item. No limit
    * on number of positive keywords that can be assigned.
    */
  var keywordDetails: js.UndefOr[KeywordAssignedTargetingOptionDetails] = js.native
  
  /** Language details. This field will be populated when the TargetingType is `TARGETING_TYPE_LANGUAGE`. */
  var languageDetails: js.UndefOr[LanguageAssignedTargetingOptionDetails] = js.native
  
  /** Output only. The resource name for this assigned targeting option. */
  var name: js.UndefOr[String] = js.native
  
  /** Keyword details. This field will be populated when the TargetingType is `TARGETING_TYPE_NEGATIVE_KEYWORD_LIST`. A maximum of 4 negative keyword lists can be assigned to a line item. */
  var negativeKeywordListDetails: js.UndefOr[NegativeKeywordListAssignedTargetingOptionDetails] = js.native
  
  /** On screen position details. This field will be populated when the TargetingType is `TARGETING_TYPE_ON_SCREEN_POSITION`. */
  var onScreenPositionDetails: js.UndefOr[OnScreenPositionAssignedTargetingOptionDetails] = js.native
  
  /** Operating system details. This field will be populated when the TargetingType is `TARGETING_TYPE_OPERATING_SYSTEM`. */
  var operatingSystemDetails: js.UndefOr[OperatingSystemAssignedTargetingOptionDetails] = js.native
  
  /** Parental status details. This field will be populated when the TargetingType is `TARGETING_TYPE_PARENTAL_STATUS`. */
  var parentalStatusDetails: js.UndefOr[ParentalStatusAssignedTargetingOptionDetails] = js.native
  
  /** Proximity location list details. This field will be populated when the TargetingType is `TARGETING_TYPE_PROXIMITY_LOCATION_LIST`. */
  var proximityLocationListDetails: js.UndefOr[ProximityLocationListAssignedTargetingOptionDetails] = js.native
  
  /** Regional location list details. This field will be populated when the TargetingType is `TARGETING_TYPE_REGIONAL_LOCATION_LIST`. */
  var regionalLocationListDetails: js.UndefOr[RegionalLocationListAssignedTargetingOptionDetails] = js.native
  
  /**
    * Sensitive category details. This field will be populated when the TargetingType is `TARGETING_TYPE_SENSITIVE_CATEGORY_EXCLUSION`. Sensitive categories are targeting exclusions.
    * Advertiser level sensitive category exclusions, if set, are always applied in serving (even though they aren't visible in line item settings). Line item settings can exclude
    * sensitive categories in addition to advertiser exclusions, but can't override them.
    */
  var sensitiveCategoryExclusionDetails: js.UndefOr[SensitiveCategoryAssignedTargetingOptionDetails] = js.native
  
  /** Sub-exchange details. This field will be populated when the TargetingType is `TARGETING_TYPE_SUB_EXCHANGE`. */
  var subExchangeDetails: js.UndefOr[SubExchangeAssignedTargetingOptionDetails] = js.native
  
  /** Output only. Identifies the type of this assigned targeting option. */
  var targetingType: js.UndefOr[String] = js.native
  
  /** Third party verification details. This field will be populated when the TargetingType is `TARGETING_TYPE_THIRD_PARTY_VERIFIER`. */
  var thirdPartyVerifierDetails: js.UndefOr[ThirdPartyVerifierAssignedTargetingOptionDetails] = js.native
  
  /** URL details. This field will be populated when the TargetingType is `TARGETING_TYPE_URL`. */
  var urlDetails: js.UndefOr[UrlAssignedTargetingOptionDetails] = js.native
  
  /** User rewarded content details. This field will be populated when the TargetingType is `TARGETING_TYPE_USER_REWARDED_CONTENT`. */
  var userRewardedContentDetails: js.UndefOr[UserRewardedContentAssignedTargetingOptionDetails] = js.native
  
  /** Video player size details. This field will be populated when the TargetingType is `TARGETING_TYPE_VIDEO_PLAYER_SIZE`. */
  var videoPlayerSizeDetails: js.UndefOr[VideoPlayerSizeAssignedTargetingOptionDetails] = js.native
  
  /** Viewability details. This field will be populated when the TargetingType is `TARGETING_TYPE_VIEWABILITY`. You can only target one viewability option per line item. */
  var viewabilityDetails: js.UndefOr[ViewabilityAssignedTargetingOptionDetails] = js.native
}
object AssignedTargetingOption {
  
  @scala.inline
  def apply(): AssignedTargetingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedTargetingOption]
  }
  
  @scala.inline
  implicit class AssignedTargetingOptionMutableBuilder[Self <: AssignedTargetingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgeRangeDetails(value: AgeRangeAssignedTargetingOptionDetails): Self = StObject.set(x, "ageRangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeRangeDetailsUndefined: Self = StObject.set(x, "ageRangeDetails", js.undefined)
    
    @scala.inline
    def setAppCategoryDetails(value: AppCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "appCategoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCategoryDetailsUndefined: Self = StObject.set(x, "appCategoryDetails", js.undefined)
    
    @scala.inline
    def setAppDetails(value: AppAssignedTargetingOptionDetails): Self = StObject.set(x, "appDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppDetailsUndefined: Self = StObject.set(x, "appDetails", js.undefined)
    
    @scala.inline
    def setAssignedTargetingOptionId(value: String): Self = StObject.set(x, "assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedTargetingOptionIdUndefined: Self = StObject.set(x, "assignedTargetingOptionId", js.undefined)
    
    @scala.inline
    def setAudienceGroupDetails(value: AudienceGroupAssignedTargetingOptionDetails): Self = StObject.set(x, "audienceGroupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceGroupDetailsUndefined: Self = StObject.set(x, "audienceGroupDetails", js.undefined)
    
    @scala.inline
    def setAuthorizedSellerStatusDetails(value: AuthorizedSellerStatusAssignedTargetingOptionDetails): Self = StObject.set(x, "authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedSellerStatusDetailsUndefined: Self = StObject.set(x, "authorizedSellerStatusDetails", js.undefined)
    
    @scala.inline
    def setBrowserDetails(value: BrowserAssignedTargetingOptionDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserDetailsUndefined: Self = StObject.set(x, "browserDetails", js.undefined)
    
    @scala.inline
    def setCarrierAndIspDetails(value: CarrierAndIspAssignedTargetingOptionDetails): Self = StObject.set(x, "carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierAndIspDetailsUndefined: Self = StObject.set(x, "carrierAndIspDetails", js.undefined)
    
    @scala.inline
    def setCategoryDetails(value: CategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "categoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryDetailsUndefined: Self = StObject.set(x, "categoryDetails", js.undefined)
    
    @scala.inline
    def setChannelDetails(value: ChannelAssignedTargetingOptionDetails): Self = StObject.set(x, "channelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelDetailsUndefined: Self = StObject.set(x, "channelDetails", js.undefined)
    
    @scala.inline
    def setContentInstreamPositionDetails(value: ContentInstreamPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInstreamPositionDetailsUndefined: Self = StObject.set(x, "contentInstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setContentOutstreamPositionDetails(value: ContentOutstreamPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOutstreamPositionDetailsUndefined: Self = StObject.set(x, "contentOutstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setDayAndTimeDetails(value: DayAndTimeAssignedTargetingOptionDetails): Self = StObject.set(x, "dayAndTimeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayAndTimeDetailsUndefined: Self = StObject.set(x, "dayAndTimeDetails", js.undefined)
    
    @scala.inline
    def setDeviceMakeModelDetails(value: DeviceMakeModelAssignedTargetingOptionDetails): Self = StObject.set(x, "deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceMakeModelDetailsUndefined: Self = StObject.set(x, "deviceMakeModelDetails", js.undefined)
    
    @scala.inline
    def setDeviceTypeDetails(value: DeviceTypeAssignedTargetingOptionDetails): Self = StObject.set(x, "deviceTypeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeDetailsUndefined: Self = StObject.set(x, "deviceTypeDetails", js.undefined)
    
    @scala.inline
    def setDigitalContentLabelExclusionDetails(value: DigitalContentLabelAssignedTargetingOptionDetails): Self = StObject.set(x, "digitalContentLabelExclusionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitalContentLabelExclusionDetailsUndefined: Self = StObject.set(x, "digitalContentLabelExclusionDetails", js.undefined)
    
    @scala.inline
    def setEnvironmentDetails(value: EnvironmentAssignedTargetingOptionDetails): Self = StObject.set(x, "environmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentDetailsUndefined: Self = StObject.set(x, "environmentDetails", js.undefined)
    
    @scala.inline
    def setExchangeDetails(value: ExchangeAssignedTargetingOptionDetails): Self = StObject.set(x, "exchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeDetailsUndefined: Self = StObject.set(x, "exchangeDetails", js.undefined)
    
    @scala.inline
    def setGenderDetails(value: GenderAssignedTargetingOptionDetails): Self = StObject.set(x, "genderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderDetailsUndefined: Self = StObject.set(x, "genderDetails", js.undefined)
    
    @scala.inline
    def setGeoRegionDetails(value: GeoRegionAssignedTargetingOptionDetails): Self = StObject.set(x, "geoRegionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoRegionDetailsUndefined: Self = StObject.set(x, "geoRegionDetails", js.undefined)
    
    @scala.inline
    def setHouseholdIncomeDetails(value: HouseholdIncomeAssignedTargetingOptionDetails): Self = StObject.set(x, "householdIncomeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHouseholdIncomeDetailsUndefined: Self = StObject.set(x, "householdIncomeDetails", js.undefined)
    
    @scala.inline
    def setInheritance(value: String): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritanceUndefined: Self = StObject.set(x, "inheritance", js.undefined)
    
    @scala.inline
    def setInventorySourceDetails(value: InventorySourceAssignedTargetingOptionDetails): Self = StObject.set(x, "inventorySourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceDetailsUndefined: Self = StObject.set(x, "inventorySourceDetails", js.undefined)
    
    @scala.inline
    def setInventorySourceGroupDetails(value: InventorySourceGroupAssignedTargetingOptionDetails): Self = StObject.set(x, "inventorySourceGroupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceGroupDetailsUndefined: Self = StObject.set(x, "inventorySourceGroupDetails", js.undefined)
    
    @scala.inline
    def setKeywordDetails(value: KeywordAssignedTargetingOptionDetails): Self = StObject.set(x, "keywordDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordDetailsUndefined: Self = StObject.set(x, "keywordDetails", js.undefined)
    
    @scala.inline
    def setLanguageDetails(value: LanguageAssignedTargetingOptionDetails): Self = StObject.set(x, "languageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageDetailsUndefined: Self = StObject.set(x, "languageDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListDetails(value: NegativeKeywordListAssignedTargetingOptionDetails): Self = StObject.set(x, "negativeKeywordListDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeKeywordListDetailsUndefined: Self = StObject.set(x, "negativeKeywordListDetails", js.undefined)
    
    @scala.inline
    def setOnScreenPositionDetails(value: OnScreenPositionAssignedTargetingOptionDetails): Self = StObject.set(x, "onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScreenPositionDetailsUndefined: Self = StObject.set(x, "onScreenPositionDetails", js.undefined)
    
    @scala.inline
    def setOperatingSystemDetails(value: OperatingSystemAssignedTargetingOptionDetails): Self = StObject.set(x, "operatingSystemDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemDetailsUndefined: Self = StObject.set(x, "operatingSystemDetails", js.undefined)
    
    @scala.inline
    def setParentalStatusDetails(value: ParentalStatusAssignedTargetingOptionDetails): Self = StObject.set(x, "parentalStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentalStatusDetailsUndefined: Self = StObject.set(x, "parentalStatusDetails", js.undefined)
    
    @scala.inline
    def setProximityLocationListDetails(value: ProximityLocationListAssignedTargetingOptionDetails): Self = StObject.set(x, "proximityLocationListDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximityLocationListDetailsUndefined: Self = StObject.set(x, "proximityLocationListDetails", js.undefined)
    
    @scala.inline
    def setRegionalLocationListDetails(value: RegionalLocationListAssignedTargetingOptionDetails): Self = StObject.set(x, "regionalLocationListDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalLocationListDetailsUndefined: Self = StObject.set(x, "regionalLocationListDetails", js.undefined)
    
    @scala.inline
    def setSensitiveCategoryExclusionDetails(value: SensitiveCategoryAssignedTargetingOptionDetails): Self = StObject.set(x, "sensitiveCategoryExclusionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveCategoryExclusionDetailsUndefined: Self = StObject.set(x, "sensitiveCategoryExclusionDetails", js.undefined)
    
    @scala.inline
    def setSubExchangeDetails(value: SubExchangeAssignedTargetingOptionDetails): Self = StObject.set(x, "subExchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubExchangeDetailsUndefined: Self = StObject.set(x, "subExchangeDetails", js.undefined)
    
    @scala.inline
    def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
    
    @scala.inline
    def setThirdPartyVerifierDetails(value: ThirdPartyVerifierAssignedTargetingOptionDetails): Self = StObject.set(x, "thirdPartyVerifierDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyVerifierDetailsUndefined: Self = StObject.set(x, "thirdPartyVerifierDetails", js.undefined)
    
    @scala.inline
    def setUrlDetails(value: UrlAssignedTargetingOptionDetails): Self = StObject.set(x, "urlDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlDetailsUndefined: Self = StObject.set(x, "urlDetails", js.undefined)
    
    @scala.inline
    def setUserRewardedContentDetails(value: UserRewardedContentAssignedTargetingOptionDetails): Self = StObject.set(x, "userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRewardedContentDetailsUndefined: Self = StObject.set(x, "userRewardedContentDetails", js.undefined)
    
    @scala.inline
    def setVideoPlayerSizeDetails(value: VideoPlayerSizeAssignedTargetingOptionDetails): Self = StObject.set(x, "videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoPlayerSizeDetailsUndefined: Self = StObject.set(x, "videoPlayerSizeDetails", js.undefined)
    
    @scala.inline
    def setViewabilityDetails(value: ViewabilityAssignedTargetingOptionDetails): Self = StObject.set(x, "viewabilityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityDetailsUndefined: Self = StObject.set(x, "viewabilityDetails", js.undefined)
  }
}
