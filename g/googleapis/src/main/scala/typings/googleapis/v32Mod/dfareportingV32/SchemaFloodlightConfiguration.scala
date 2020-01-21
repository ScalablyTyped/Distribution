package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Floodlight configuration.
  */
@js.native
trait SchemaFloodlightConfiguration extends js.Object {
  /**
    * Account ID of this floodlight configuration. This is a read-only field
    * that can be left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of the parent advertiser of this floodlight configuration.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether advertiser data is shared with Google Analytics.
    */
  var analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the exposure-to-conversion report is enabled. This report shows
    * detailed pathway information on up to 10 of the most recent ad exposures
    * seen by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Day that will be counted as the first day of the week in reports. This is
    * a required field.
    */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /**
    * ID of this floodlight configuration. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether in-app attribution tracking is enabled.
    */
  var inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfiguration&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Lookback window settings for this floodlight configuration.
    */
  var lookbackConfiguration: js.UndefOr[SchemaLookbackConfiguration] = js.native
  /**
    * Types of attribution options for natural search conversions.
    */
  var naturalSearchConversionAttributionOption: js.UndefOr[String] = js.native
  /**
    * Settings for Campaign Manager Omniture integration.
    */
  var omnitureSettings: js.UndefOr[SchemaOmnitureSettings] = js.native
  /**
    * Subaccount ID of this floodlight configuration. This is a read-only field
    * that can be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Configuration settings for dynamic and image floodlight tags.
    */
  var tagSettings: js.UndefOr[SchemaTagSettings] = js.native
  /**
    * List of third-party authentication tokens enabled for this configuration.
    */
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[SchemaThirdPartyAuthenticationToken]] = js.native
  /**
    * List of user defined variables enabled for this configuration.
    */
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[SchemaUserDefinedVariableConfiguration]] = js.native
}

object SchemaFloodlightConfiguration {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: SchemaDimensionValue = null,
    analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.undefined,
    exposureToConversionEnabled: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: String = null,
    id: String = null,
    idDimensionValue: SchemaDimensionValue = null,
    inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lookbackConfiguration: SchemaLookbackConfiguration = null,
    naturalSearchConversionAttributionOption: String = null,
    omnitureSettings: SchemaOmnitureSettings = null,
    subaccountId: String = null,
    tagSettings: SchemaTagSettings = null,
    thirdPartyAuthenticationTokens: js.Array[SchemaThirdPartyAuthenticationToken] = null,
    userDefinedVariableConfigurations: js.Array[SchemaUserDefinedVariableConfiguration] = null
  ): SchemaFloodlightConfiguration = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(analyticsDataSharingEnabled)) __obj.updateDynamic("analyticsDataSharingEnabled")(analyticsDataSharingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(inAppAttributionTrackingEnabled)) __obj.updateDynamic("inAppAttributionTrackingEnabled")(inAppAttributionTrackingEnabled.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration.asInstanceOf[js.Any])
    if (naturalSearchConversionAttributionOption != null) __obj.updateDynamic("naturalSearchConversionAttributionOption")(naturalSearchConversionAttributionOption.asInstanceOf[js.Any])
    if (omnitureSettings != null) __obj.updateDynamic("omnitureSettings")(omnitureSettings.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (tagSettings != null) __obj.updateDynamic("tagSettings")(tagSettings.asInstanceOf[js.Any])
    if (thirdPartyAuthenticationTokens != null) __obj.updateDynamic("thirdPartyAuthenticationTokens")(thirdPartyAuthenticationTokens.asInstanceOf[js.Any])
    if (userDefinedVariableConfigurations != null) __obj.updateDynamic("userDefinedVariableConfigurations")(userDefinedVariableConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFloodlightConfiguration]
  }
}

