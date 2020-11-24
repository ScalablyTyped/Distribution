package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedTargetingOption extends js.Object {
  
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
  implicit class AssignedTargetingOptionOps[Self <: AssignedTargetingOption] (val x: Self) extends AnyVal {
    
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
    def setAgeRangeDetails(value: AgeRangeAssignedTargetingOptionDetails): Self = this.set("ageRangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeRangeDetails: Self = this.set("ageRangeDetails", js.undefined)
    
    @scala.inline
    def setAppCategoryDetails(value: AppCategoryAssignedTargetingOptionDetails): Self = this.set("appCategoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppCategoryDetails: Self = this.set("appCategoryDetails", js.undefined)
    
    @scala.inline
    def setAppDetails(value: AppAssignedTargetingOptionDetails): Self = this.set("appDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppDetails: Self = this.set("appDetails", js.undefined)
    
    @scala.inline
    def setAssignedTargetingOptionId(value: String): Self = this.set("assignedTargetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTargetingOptionId: Self = this.set("assignedTargetingOptionId", js.undefined)
    
    @scala.inline
    def setAudienceGroupDetails(value: AudienceGroupAssignedTargetingOptionDetails): Self = this.set("audienceGroupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceGroupDetails: Self = this.set("audienceGroupDetails", js.undefined)
    
    @scala.inline
    def setAuthorizedSellerStatusDetails(value: AuthorizedSellerStatusAssignedTargetingOptionDetails): Self = this.set("authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedSellerStatusDetails: Self = this.set("authorizedSellerStatusDetails", js.undefined)
    
    @scala.inline
    def setBrowserDetails(value: BrowserAssignedTargetingOptionDetails): Self = this.set("browserDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserDetails: Self = this.set("browserDetails", js.undefined)
    
    @scala.inline
    def setCarrierAndIspDetails(value: CarrierAndIspAssignedTargetingOptionDetails): Self = this.set("carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierAndIspDetails: Self = this.set("carrierAndIspDetails", js.undefined)
    
    @scala.inline
    def setCategoryDetails(value: CategoryAssignedTargetingOptionDetails): Self = this.set("categoryDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryDetails: Self = this.set("categoryDetails", js.undefined)
    
    @scala.inline
    def setChannelDetails(value: ChannelAssignedTargetingOptionDetails): Self = this.set("channelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelDetails: Self = this.set("channelDetails", js.undefined)
    
    @scala.inline
    def setContentInstreamPositionDetails(value: ContentInstreamPositionAssignedTargetingOptionDetails): Self = this.set("contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentInstreamPositionDetails: Self = this.set("contentInstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setContentOutstreamPositionDetails(value: ContentOutstreamPositionAssignedTargetingOptionDetails): Self = this.set("contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOutstreamPositionDetails: Self = this.set("contentOutstreamPositionDetails", js.undefined)
    
    @scala.inline
    def setDayAndTimeDetails(value: DayAndTimeAssignedTargetingOptionDetails): Self = this.set("dayAndTimeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayAndTimeDetails: Self = this.set("dayAndTimeDetails", js.undefined)
    
    @scala.inline
    def setDeviceMakeModelDetails(value: DeviceMakeModelAssignedTargetingOptionDetails): Self = this.set("deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceMakeModelDetails: Self = this.set("deviceMakeModelDetails", js.undefined)
    
    @scala.inline
    def setDeviceTypeDetails(value: DeviceTypeAssignedTargetingOptionDetails): Self = this.set("deviceTypeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceTypeDetails: Self = this.set("deviceTypeDetails", js.undefined)
    
    @scala.inline
    def setDigitalContentLabelExclusionDetails(value: DigitalContentLabelAssignedTargetingOptionDetails): Self = this.set("digitalContentLabelExclusionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigitalContentLabelExclusionDetails: Self = this.set("digitalContentLabelExclusionDetails", js.undefined)
    
    @scala.inline
    def setEnvironmentDetails(value: EnvironmentAssignedTargetingOptionDetails): Self = this.set("environmentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentDetails: Self = this.set("environmentDetails", js.undefined)
    
    @scala.inline
    def setExchangeDetails(value: ExchangeAssignedTargetingOptionDetails): Self = this.set("exchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchangeDetails: Self = this.set("exchangeDetails", js.undefined)
    
    @scala.inline
    def setGenderDetails(value: GenderAssignedTargetingOptionDetails): Self = this.set("genderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenderDetails: Self = this.set("genderDetails", js.undefined)
    
    @scala.inline
    def setGeoRegionDetails(value: GeoRegionAssignedTargetingOptionDetails): Self = this.set("geoRegionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoRegionDetails: Self = this.set("geoRegionDetails", js.undefined)
    
    @scala.inline
    def setHouseholdIncomeDetails(value: HouseholdIncomeAssignedTargetingOptionDetails): Self = this.set("householdIncomeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHouseholdIncomeDetails: Self = this.set("householdIncomeDetails", js.undefined)
    
    @scala.inline
    def setInheritance(value: String): Self = this.set("inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritance: Self = this.set("inheritance", js.undefined)
    
    @scala.inline
    def setInventorySourceDetails(value: InventorySourceAssignedTargetingOptionDetails): Self = this.set("inventorySourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceDetails: Self = this.set("inventorySourceDetails", js.undefined)
    
    @scala.inline
    def setInventorySourceGroupDetails(value: InventorySourceGroupAssignedTargetingOptionDetails): Self = this.set("inventorySourceGroupDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventorySourceGroupDetails: Self = this.set("inventorySourceGroupDetails", js.undefined)
    
    @scala.inline
    def setKeywordDetails(value: KeywordAssignedTargetingOptionDetails): Self = this.set("keywordDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywordDetails: Self = this.set("keywordDetails", js.undefined)
    
    @scala.inline
    def setLanguageDetails(value: LanguageAssignedTargetingOptionDetails): Self = this.set("languageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageDetails: Self = this.set("languageDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNegativeKeywordListDetails(value: NegativeKeywordListAssignedTargetingOptionDetails): Self = this.set("negativeKeywordListDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeKeywordListDetails: Self = this.set("negativeKeywordListDetails", js.undefined)
    
    @scala.inline
    def setOnScreenPositionDetails(value: OnScreenPositionAssignedTargetingOptionDetails): Self = this.set("onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnScreenPositionDetails: Self = this.set("onScreenPositionDetails", js.undefined)
    
    @scala.inline
    def setOperatingSystemDetails(value: OperatingSystemAssignedTargetingOptionDetails): Self = this.set("operatingSystemDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatingSystemDetails: Self = this.set("operatingSystemDetails", js.undefined)
    
    @scala.inline
    def setParentalStatusDetails(value: ParentalStatusAssignedTargetingOptionDetails): Self = this.set("parentalStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentalStatusDetails: Self = this.set("parentalStatusDetails", js.undefined)
    
    @scala.inline
    def setProximityLocationListDetails(value: ProximityLocationListAssignedTargetingOptionDetails): Self = this.set("proximityLocationListDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximityLocationListDetails: Self = this.set("proximityLocationListDetails", js.undefined)
    
    @scala.inline
    def setRegionalLocationListDetails(value: RegionalLocationListAssignedTargetingOptionDetails): Self = this.set("regionalLocationListDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalLocationListDetails: Self = this.set("regionalLocationListDetails", js.undefined)
    
    @scala.inline
    def setSensitiveCategoryExclusionDetails(value: SensitiveCategoryAssignedTargetingOptionDetails): Self = this.set("sensitiveCategoryExclusionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveCategoryExclusionDetails: Self = this.set("sensitiveCategoryExclusionDetails", js.undefined)
    
    @scala.inline
    def setSubExchangeDetails(value: SubExchangeAssignedTargetingOptionDetails): Self = this.set("subExchangeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubExchangeDetails: Self = this.set("subExchangeDetails", js.undefined)
    
    @scala.inline
    def setTargetingType(value: String): Self = this.set("targetingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingType: Self = this.set("targetingType", js.undefined)
    
    @scala.inline
    def setThirdPartyVerifierDetails(value: ThirdPartyVerifierAssignedTargetingOptionDetails): Self = this.set("thirdPartyVerifierDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyVerifierDetails: Self = this.set("thirdPartyVerifierDetails", js.undefined)
    
    @scala.inline
    def setUrlDetails(value: UrlAssignedTargetingOptionDetails): Self = this.set("urlDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlDetails: Self = this.set("urlDetails", js.undefined)
    
    @scala.inline
    def setUserRewardedContentDetails(value: UserRewardedContentAssignedTargetingOptionDetails): Self = this.set("userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRewardedContentDetails: Self = this.set("userRewardedContentDetails", js.undefined)
    
    @scala.inline
    def setVideoPlayerSizeDetails(value: VideoPlayerSizeAssignedTargetingOptionDetails): Self = this.set("videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoPlayerSizeDetails: Self = this.set("videoPlayerSizeDetails", js.undefined)
    
    @scala.inline
    def setViewabilityDetails(value: ViewabilityAssignedTargetingOptionDetails): Self = this.set("viewabilityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewabilityDetails: Self = this.set("viewabilityDetails", js.undefined)
  }
}
