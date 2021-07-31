package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloodlightConfiguration extends StObject {
  
  /** Account ID of this floodlight configuration. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Advertiser ID of the parent advertiser of this floodlight configuration. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether advertiser data is shared with Google Analytics. */
  var analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Custom Viewability metric for the floodlight configuration. */
  var customViewabilityMetric: js.UndefOr[CustomViewabilityMetric] = js.undefined
  
  /** Whether the exposure-to-conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen by a user before converting. */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Day that will be counted as the first day of the week in reports. This is a required field. */
  var firstDayOfWeek: js.UndefOr[String] = js.undefined
  
  /** ID of this floodlight configuration. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of this floodlight configuration. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether in-app attribution tracking is enabled. */
  var inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightConfiguration". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Lookback window settings for this floodlight configuration. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  
  /** Types of attribution options for natural search conversions. */
  var naturalSearchConversionAttributionOption: js.UndefOr[String] = js.undefined
  
  /** Settings for Campaign Manager Omniture integration. */
  var omnitureSettings: js.UndefOr[OmnitureSettings] = js.undefined
  
  /** Subaccount ID of this floodlight configuration. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /** Configuration settings for dynamic and image floodlight tags. */
  var tagSettings: js.UndefOr[TagSettings] = js.undefined
  
  /** List of third-party authentication tokens enabled for this configuration. */
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[ThirdPartyAuthenticationToken]] = js.undefined
  
  /** List of user defined variables enabled for this configuration. */
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[UserDefinedVariableConfiguration]] = js.undefined
}
object FloodlightConfiguration {
  
  @scala.inline
  def apply(): FloodlightConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightConfiguration]
  }
  
  @scala.inline
  implicit class FloodlightConfigurationMutableBuilder[Self <: FloodlightConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAnalyticsDataSharingEnabled(value: Boolean): Self = StObject.set(x, "analyticsDataSharingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsDataSharingEnabledUndefined: Self = StObject.set(x, "analyticsDataSharingEnabled", js.undefined)
    
    @scala.inline
    def setCustomViewabilityMetric(value: CustomViewabilityMetric): Self = StObject.set(x, "customViewabilityMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomViewabilityMetricUndefined: Self = StObject.set(x, "customViewabilityMetric", js.undefined)
    
    @scala.inline
    def setExposureToConversionEnabled(value: Boolean): Self = StObject.set(x, "exposureToConversionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureToConversionEnabledUndefined: Self = StObject.set(x, "exposureToConversionEnabled", js.undefined)
    
    @scala.inline
    def setFirstDayOfWeek(value: String): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInAppAttributionTrackingEnabled(value: Boolean): Self = StObject.set(x, "inAppAttributionTrackingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppAttributionTrackingEnabledUndefined: Self = StObject.set(x, "inAppAttributionTrackingEnabled", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLookbackConfiguration(value: LookbackConfiguration): Self = StObject.set(x, "lookbackConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookbackConfigurationUndefined: Self = StObject.set(x, "lookbackConfiguration", js.undefined)
    
    @scala.inline
    def setNaturalSearchConversionAttributionOption(value: String): Self = StObject.set(x, "naturalSearchConversionAttributionOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalSearchConversionAttributionOptionUndefined: Self = StObject.set(x, "naturalSearchConversionAttributionOption", js.undefined)
    
    @scala.inline
    def setOmnitureSettings(value: OmnitureSettings): Self = StObject.set(x, "omnitureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmnitureSettingsUndefined: Self = StObject.set(x, "omnitureSettings", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTagSettings(value: TagSettings): Self = StObject.set(x, "tagSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSettingsUndefined: Self = StObject.set(x, "tagSettings", js.undefined)
    
    @scala.inline
    def setThirdPartyAuthenticationTokens(value: js.Array[ThirdPartyAuthenticationToken]): Self = StObject.set(x, "thirdPartyAuthenticationTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyAuthenticationTokensUndefined: Self = StObject.set(x, "thirdPartyAuthenticationTokens", js.undefined)
    
    @scala.inline
    def setThirdPartyAuthenticationTokensVarargs(value: ThirdPartyAuthenticationToken*): Self = StObject.set(x, "thirdPartyAuthenticationTokens", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedVariableConfigurations(value: js.Array[UserDefinedVariableConfiguration]): Self = StObject.set(x, "userDefinedVariableConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedVariableConfigurationsUndefined: Self = StObject.set(x, "userDefinedVariableConfigurations", js.undefined)
    
    @scala.inline
    def setUserDefinedVariableConfigurationsVarargs(value: UserDefinedVariableConfiguration*): Self = StObject.set(x, "userDefinedVariableConfigurations", js.Array(value :_*))
  }
}
