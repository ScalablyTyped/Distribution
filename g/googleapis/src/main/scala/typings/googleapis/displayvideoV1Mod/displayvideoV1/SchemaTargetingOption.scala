package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetingOption extends StObject {
  
  /**
    * Age range details.
    */
  var ageRangeDetails: js.UndefOr[SchemaAgeRangeTargetingOptionDetails] = js.undefined
  
  /**
    * App category details.
    */
  var appCategoryDetails: js.UndefOr[SchemaAppCategoryTargetingOptionDetails] = js.undefined
  
  /**
    * Audio content type details.
    */
  var audioContentTypeDetails: js.UndefOr[SchemaAudioContentTypeTargetingOptionDetails] = js.undefined
  
  /**
    * Authorized seller status resource details.
    */
  var authorizedSellerStatusDetails: js.UndefOr[SchemaAuthorizedSellerStatusTargetingOptionDetails] = js.undefined
  
  /**
    * Browser details.
    */
  var browserDetails: js.UndefOr[SchemaBrowserTargetingOptionDetails] = js.undefined
  
  /**
    * Business chain resource details.
    */
  var businessChainDetails: js.UndefOr[SchemaBusinessChainTargetingOptionDetails] = js.undefined
  
  /**
    * Carrier and ISP details.
    */
  var carrierAndIspDetails: js.UndefOr[SchemaCarrierAndIspTargetingOptionDetails] = js.undefined
  
  /**
    * Category resource details.
    */
  var categoryDetails: js.UndefOr[SchemaCategoryTargetingOptionDetails] = js.undefined
  
  /**
    * Content duration resource details.
    */
  var contentDurationDetails: js.UndefOr[SchemaContentDurationTargetingOptionDetails] = js.undefined
  
  /**
    * Content genre resource details.
    */
  var contentGenreDetails: js.UndefOr[SchemaContentGenreTargetingOptionDetails] = js.undefined
  
  /**
    * Content instream position details.
    */
  var contentInstreamPositionDetails: js.UndefOr[SchemaContentInstreamPositionTargetingOptionDetails] = js.undefined
  
  /**
    * Content outstream position details.
    */
  var contentOutstreamPositionDetails: js.UndefOr[SchemaContentOutstreamPositionTargetingOptionDetails] = js.undefined
  
  /**
    * Content stream type resource details.
    */
  var contentStreamTypeDetails: js.UndefOr[SchemaContentStreamTypeTargetingOptionDetails] = js.undefined
  
  /**
    * Device make and model resource details.
    */
  var deviceMakeModelDetails: js.UndefOr[SchemaDeviceMakeModelTargetingOptionDetails] = js.undefined
  
  /**
    * Device type details.
    */
  var deviceTypeDetails: js.UndefOr[SchemaDeviceTypeTargetingOptionDetails] = js.undefined
  
  /**
    * Digital content label details.
    */
  var digitalContentLabelDetails: js.UndefOr[SchemaDigitalContentLabelTargetingOptionDetails] = js.undefined
  
  /**
    * Environment details.
    */
  var environmentDetails: js.UndefOr[SchemaEnvironmentTargetingOptionDetails] = js.undefined
  
  /**
    * Exchange details.
    */
  var exchangeDetails: js.UndefOr[SchemaExchangeTargetingOptionDetails] = js.undefined
  
  /**
    * Gender details.
    */
  var genderDetails: js.UndefOr[SchemaGenderTargetingOptionDetails] = js.undefined
  
  /**
    * Geographic region resource details.
    */
  var geoRegionDetails: js.UndefOr[SchemaGeoRegionTargetingOptionDetails] = js.undefined
  
  /**
    * Household income details.
    */
  var householdIncomeDetails: js.UndefOr[SchemaHouseholdIncomeTargetingOptionDetails] = js.undefined
  
  /**
    * Language resource details.
    */
  var languageDetails: js.UndefOr[SchemaLanguageTargetingOptionDetails] = js.undefined
  
  /**
    * Output only. The resource name for this targeting option.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Native content position details.
    */
  var nativeContentPositionDetails: js.UndefOr[SchemaNativeContentPositionTargetingOptionDetails] = js.undefined
  
  /**
    * Open Measurement enabled inventory details.
    */
  var omidDetails: js.UndefOr[SchemaOmidTargetingOptionDetails] = js.undefined
  
  /**
    * On screen position details.
    */
  var onScreenPositionDetails: js.UndefOr[SchemaOnScreenPositionTargetingOptionDetails] = js.undefined
  
  /**
    * Operating system resources details.
    */
  var operatingSystemDetails: js.UndefOr[SchemaOperatingSystemTargetingOptionDetails] = js.undefined
  
  /**
    * Parental status details.
    */
  var parentalStatusDetails: js.UndefOr[SchemaParentalStatusTargetingOptionDetails] = js.undefined
  
  /**
    * POI resource details.
    */
  var poiDetails: js.UndefOr[SchemaPoiTargetingOptionDetails] = js.undefined
  
  /**
    * Sensitive Category details.
    */
  var sensitiveCategoryDetails: js.UndefOr[SchemaSensitiveCategoryTargetingOptionDetails] = js.undefined
  
  /**
    * Sub-exchange details.
    */
  var subExchangeDetails: js.UndefOr[SchemaSubExchangeTargetingOptionDetails] = js.undefined
  
  /**
    * Output only. A unique identifier for this targeting option. The tuple {`targeting_type`, `targeting_option_id`\} will be unique.
    */
  var targetingOptionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of this targeting option.
    */
  var targetingType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User rewarded content details.
    */
  var userRewardedContentDetails: js.UndefOr[SchemaUserRewardedContentTargetingOptionDetails] = js.undefined
  
  /**
    * Video player size details.
    */
  var videoPlayerSizeDetails: js.UndefOr[SchemaVideoPlayerSizeTargetingOptionDetails] = js.undefined
  
  /**
    * Viewability resource details.
    */
  var viewabilityDetails: js.UndefOr[SchemaViewabilityTargetingOptionDetails] = js.undefined
}
object SchemaTargetingOption {
  
  inline def apply(): SchemaTargetingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingOption]
  }
  
  extension [Self <: SchemaTargetingOption](x: Self) {
    
    inline def setAgeRangeDetails(value: SchemaAgeRangeTargetingOptionDetails): Self = StObject.set(x, "ageRangeDetails", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeDetailsUndefined: Self = StObject.set(x, "ageRangeDetails", js.undefined)
    
    inline def setAppCategoryDetails(value: SchemaAppCategoryTargetingOptionDetails): Self = StObject.set(x, "appCategoryDetails", value.asInstanceOf[js.Any])
    
    inline def setAppCategoryDetailsUndefined: Self = StObject.set(x, "appCategoryDetails", js.undefined)
    
    inline def setAudioContentTypeDetails(value: SchemaAudioContentTypeTargetingOptionDetails): Self = StObject.set(x, "audioContentTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setAudioContentTypeDetailsUndefined: Self = StObject.set(x, "audioContentTypeDetails", js.undefined)
    
    inline def setAuthorizedSellerStatusDetails(value: SchemaAuthorizedSellerStatusTargetingOptionDetails): Self = StObject.set(x, "authorizedSellerStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSellerStatusDetailsUndefined: Self = StObject.set(x, "authorizedSellerStatusDetails", js.undefined)
    
    inline def setBrowserDetails(value: SchemaBrowserTargetingOptionDetails): Self = StObject.set(x, "browserDetails", value.asInstanceOf[js.Any])
    
    inline def setBrowserDetailsUndefined: Self = StObject.set(x, "browserDetails", js.undefined)
    
    inline def setBusinessChainDetails(value: SchemaBusinessChainTargetingOptionDetails): Self = StObject.set(x, "businessChainDetails", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainDetailsUndefined: Self = StObject.set(x, "businessChainDetails", js.undefined)
    
    inline def setCarrierAndIspDetails(value: SchemaCarrierAndIspTargetingOptionDetails): Self = StObject.set(x, "carrierAndIspDetails", value.asInstanceOf[js.Any])
    
    inline def setCarrierAndIspDetailsUndefined: Self = StObject.set(x, "carrierAndIspDetails", js.undefined)
    
    inline def setCategoryDetails(value: SchemaCategoryTargetingOptionDetails): Self = StObject.set(x, "categoryDetails", value.asInstanceOf[js.Any])
    
    inline def setCategoryDetailsUndefined: Self = StObject.set(x, "categoryDetails", js.undefined)
    
    inline def setContentDurationDetails(value: SchemaContentDurationTargetingOptionDetails): Self = StObject.set(x, "contentDurationDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDurationDetailsUndefined: Self = StObject.set(x, "contentDurationDetails", js.undefined)
    
    inline def setContentGenreDetails(value: SchemaContentGenreTargetingOptionDetails): Self = StObject.set(x, "contentGenreDetails", value.asInstanceOf[js.Any])
    
    inline def setContentGenreDetailsUndefined: Self = StObject.set(x, "contentGenreDetails", js.undefined)
    
    inline def setContentInstreamPositionDetails(value: SchemaContentInstreamPositionTargetingOptionDetails): Self = StObject.set(x, "contentInstreamPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setContentInstreamPositionDetailsUndefined: Self = StObject.set(x, "contentInstreamPositionDetails", js.undefined)
    
    inline def setContentOutstreamPositionDetails(value: SchemaContentOutstreamPositionTargetingOptionDetails): Self = StObject.set(x, "contentOutstreamPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setContentOutstreamPositionDetailsUndefined: Self = StObject.set(x, "contentOutstreamPositionDetails", js.undefined)
    
    inline def setContentStreamTypeDetails(value: SchemaContentStreamTypeTargetingOptionDetails): Self = StObject.set(x, "contentStreamTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setContentStreamTypeDetailsUndefined: Self = StObject.set(x, "contentStreamTypeDetails", js.undefined)
    
    inline def setDeviceMakeModelDetails(value: SchemaDeviceMakeModelTargetingOptionDetails): Self = StObject.set(x, "deviceMakeModelDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceMakeModelDetailsUndefined: Self = StObject.set(x, "deviceMakeModelDetails", js.undefined)
    
    inline def setDeviceTypeDetails(value: SchemaDeviceTypeTargetingOptionDetails): Self = StObject.set(x, "deviceTypeDetails", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeDetailsUndefined: Self = StObject.set(x, "deviceTypeDetails", js.undefined)
    
    inline def setDigitalContentLabelDetails(value: SchemaDigitalContentLabelTargetingOptionDetails): Self = StObject.set(x, "digitalContentLabelDetails", value.asInstanceOf[js.Any])
    
    inline def setDigitalContentLabelDetailsUndefined: Self = StObject.set(x, "digitalContentLabelDetails", js.undefined)
    
    inline def setEnvironmentDetails(value: SchemaEnvironmentTargetingOptionDetails): Self = StObject.set(x, "environmentDetails", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentDetailsUndefined: Self = StObject.set(x, "environmentDetails", js.undefined)
    
    inline def setExchangeDetails(value: SchemaExchangeTargetingOptionDetails): Self = StObject.set(x, "exchangeDetails", value.asInstanceOf[js.Any])
    
    inline def setExchangeDetailsUndefined: Self = StObject.set(x, "exchangeDetails", js.undefined)
    
    inline def setGenderDetails(value: SchemaGenderTargetingOptionDetails): Self = StObject.set(x, "genderDetails", value.asInstanceOf[js.Any])
    
    inline def setGenderDetailsUndefined: Self = StObject.set(x, "genderDetails", js.undefined)
    
    inline def setGeoRegionDetails(value: SchemaGeoRegionTargetingOptionDetails): Self = StObject.set(x, "geoRegionDetails", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionDetailsUndefined: Self = StObject.set(x, "geoRegionDetails", js.undefined)
    
    inline def setHouseholdIncomeDetails(value: SchemaHouseholdIncomeTargetingOptionDetails): Self = StObject.set(x, "householdIncomeDetails", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeDetailsUndefined: Self = StObject.set(x, "householdIncomeDetails", js.undefined)
    
    inline def setLanguageDetails(value: SchemaLanguageTargetingOptionDetails): Self = StObject.set(x, "languageDetails", value.asInstanceOf[js.Any])
    
    inline def setLanguageDetailsUndefined: Self = StObject.set(x, "languageDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNativeContentPositionDetails(value: SchemaNativeContentPositionTargetingOptionDetails): Self = StObject.set(x, "nativeContentPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setNativeContentPositionDetailsUndefined: Self = StObject.set(x, "nativeContentPositionDetails", js.undefined)
    
    inline def setOmidDetails(value: SchemaOmidTargetingOptionDetails): Self = StObject.set(x, "omidDetails", value.asInstanceOf[js.Any])
    
    inline def setOmidDetailsUndefined: Self = StObject.set(x, "omidDetails", js.undefined)
    
    inline def setOnScreenPositionDetails(value: SchemaOnScreenPositionTargetingOptionDetails): Self = StObject.set(x, "onScreenPositionDetails", value.asInstanceOf[js.Any])
    
    inline def setOnScreenPositionDetailsUndefined: Self = StObject.set(x, "onScreenPositionDetails", js.undefined)
    
    inline def setOperatingSystemDetails(value: SchemaOperatingSystemTargetingOptionDetails): Self = StObject.set(x, "operatingSystemDetails", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemDetailsUndefined: Self = StObject.set(x, "operatingSystemDetails", js.undefined)
    
    inline def setParentalStatusDetails(value: SchemaParentalStatusTargetingOptionDetails): Self = StObject.set(x, "parentalStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusDetailsUndefined: Self = StObject.set(x, "parentalStatusDetails", js.undefined)
    
    inline def setPoiDetails(value: SchemaPoiTargetingOptionDetails): Self = StObject.set(x, "poiDetails", value.asInstanceOf[js.Any])
    
    inline def setPoiDetailsUndefined: Self = StObject.set(x, "poiDetails", js.undefined)
    
    inline def setSensitiveCategoryDetails(value: SchemaSensitiveCategoryTargetingOptionDetails): Self = StObject.set(x, "sensitiveCategoryDetails", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoryDetailsUndefined: Self = StObject.set(x, "sensitiveCategoryDetails", js.undefined)
    
    inline def setSubExchangeDetails(value: SchemaSubExchangeTargetingOptionDetails): Self = StObject.set(x, "subExchangeDetails", value.asInstanceOf[js.Any])
    
    inline def setSubExchangeDetailsUndefined: Self = StObject.set(x, "subExchangeDetails", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdNull: Self = StObject.set(x, "targetingOptionId", null)
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    inline def setTargetingType(value: String): Self = StObject.set(x, "targetingType", value.asInstanceOf[js.Any])
    
    inline def setTargetingTypeNull: Self = StObject.set(x, "targetingType", null)
    
    inline def setTargetingTypeUndefined: Self = StObject.set(x, "targetingType", js.undefined)
    
    inline def setUserRewardedContentDetails(value: SchemaUserRewardedContentTargetingOptionDetails): Self = StObject.set(x, "userRewardedContentDetails", value.asInstanceOf[js.Any])
    
    inline def setUserRewardedContentDetailsUndefined: Self = StObject.set(x, "userRewardedContentDetails", js.undefined)
    
    inline def setVideoPlayerSizeDetails(value: SchemaVideoPlayerSizeTargetingOptionDetails): Self = StObject.set(x, "videoPlayerSizeDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoPlayerSizeDetailsUndefined: Self = StObject.set(x, "videoPlayerSizeDetails", js.undefined)
    
    inline def setViewabilityDetails(value: SchemaViewabilityTargetingOptionDetails): Self = StObject.set(x, "viewabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setViewabilityDetailsUndefined: Self = StObject.set(x, "viewabilityDetails", js.undefined)
  }
}
