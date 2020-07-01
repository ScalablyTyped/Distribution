package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager account.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * Account permissions assigned to this account.
    */
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Profile for this account. This is a read-only field that can be left
    * blank.
    */
  var accountProfile: js.UndefOr[String] = js.native
  /**
    * Whether this account is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of active ads allowed for this account.
    */
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  /**
    * Whether to serve creatives with Active View tags. If disabled,
    * viewability data will not be available for any impressions.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  /**
    * User role permissions available to the user roles of this account.
    */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of the country associated with this account.
    */
  var countryId: js.UndefOr[String] = js.native
  /**
    * ID of currency associated with this account. This is a required field.
    * Acceptable values are:  - &quot;1&quot; for USD  - &quot;2&quot; for GBP
    * - &quot;3&quot; for ESP  - &quot;4&quot; for SEK  - &quot;5&quot; for CAD
    * - &quot;6&quot; for JPY  - &quot;7&quot; for DEM  - &quot;8&quot; for AUD
    * - &quot;9&quot; for FRF  - &quot;10&quot; for ITL  - &quot;11&quot; for
    * DKK  - &quot;12&quot; for NOK  - &quot;13&quot; for FIM  - &quot;14&quot;
    * for ZAR  - &quot;15&quot; for IEP  - &quot;16&quot; for NLG  -
    * &quot;17&quot; for EUR  - &quot;18&quot; for KRW  - &quot;19&quot; for
    * TWD  - &quot;20&quot; for SGD  - &quot;21&quot; for CNY  - &quot;22&quot;
    * for HKD  - &quot;23&quot; for NZD  - &quot;24&quot; for MYR  -
    * &quot;25&quot; for BRL  - &quot;26&quot; for PTE  - &quot;27&quot; for
    * MXP  - &quot;28&quot; for CLP  - &quot;29&quot; for TRY  - &quot;30&quot;
    * for ARS  - &quot;31&quot; for PEN  - &quot;32&quot; for ILS  -
    * &quot;33&quot; for CHF  - &quot;34&quot; for VEF  - &quot;35&quot; for
    * COP  - &quot;36&quot; for GTQ  - &quot;37&quot; for PLN  - &quot;39&quot;
    * for INR  - &quot;40&quot; for THB  - &quot;41&quot; for IDR  -
    * &quot;42&quot; for CZK  - &quot;43&quot; for RON  - &quot;44&quot; for
    * HUF  - &quot;45&quot; for RUB  - &quot;46&quot; for AED  - &quot;47&quot;
    * for BGN  - &quot;48&quot; for HRK  - &quot;49&quot; for MXN  -
    * &quot;50&quot; for NGN
    */
  var currencyId: js.UndefOr[String] = js.native
  /**
    * Default placement dimensions for this account.
    */
  var defaultCreativeSizeId: js.UndefOr[String] = js.native
  /**
    * Description of this account.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ID of this account. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#account&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Locale of this account. Acceptable values are:  - &quot;cs&quot; (Czech)
    * - &quot;de&quot; (German)  - &quot;en&quot; (English)  -
    * &quot;en-GB&quot; (English United Kingdom)  - &quot;es&quot; (Spanish)  -
    * &quot;fr&quot; (French)  - &quot;it&quot; (Italian)  - &quot;ja&quot;
    * (Japanese)  - &quot;ko&quot; (Korean)  - &quot;pl&quot; (Polish)  -
    * &quot;pt-BR&quot; (Portuguese Brazil)  - &quot;ru&quot; (Russian)  -
    * &quot;sv&quot; (Swedish)  - &quot;tr&quot; (Turkish)  - &quot;zh-CN&quot;
    * (Chinese Simplified)  - &quot;zh-TW&quot; (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Maximum image size allowed for this account, in kilobytes. Value must be
    * greater than or equal to 1.
    */
  var maximumImageSize: js.UndefOr[String] = js.native
  /**
    * Name of this account. This is a required field, and must be less than 128
    * characters long and be globally unique.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether campaigns created in this account will be enabled for Nielsen OCR
    * reach ratings by default.
    */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Reporting configuration of this account.
    */
  var reportsConfiguration: js.UndefOr[SchemaReportsConfiguration] = js.native
  /**
    * Share Path to Conversion reports with Twitter.
    */
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.native
  /**
    * File size limit in kilobytes of Rich Media teaser creatives. Acceptable
    * values are 1 to 10240, inclusive.
    */
  var teaserSizeLimit: js.UndefOr[String] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(
    accountPermissionIds: js.Array[String] = null,
    accountProfile: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    activeAdsLimitTier: String = null,
    activeViewOptOut: js.UndefOr[Boolean] = js.undefined,
    availablePermissionIds: js.Array[String] = null,
    countryId: String = null,
    currencyId: String = null,
    defaultCreativeSizeId: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    locale: String = null,
    maximumImageSize: String = null,
    name: String = null,
    nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined,
    reportsConfiguration: SchemaReportsConfiguration = null,
    shareReportsWithTwitter: js.UndefOr[Boolean] = js.undefined,
    teaserSizeLimit: String = null
  ): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionIds != null) __obj.updateDynamic("accountPermissionIds")(accountPermissionIds.asInstanceOf[js.Any])
    if (accountProfile != null) __obj.updateDynamic("accountProfile")(accountProfile.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (activeAdsLimitTier != null) __obj.updateDynamic("activeAdsLimitTier")(activeAdsLimitTier.asInstanceOf[js.Any])
    if (!js.isUndefined(activeViewOptOut)) __obj.updateDynamic("activeViewOptOut")(activeViewOptOut.get.asInstanceOf[js.Any])
    if (availablePermissionIds != null) __obj.updateDynamic("availablePermissionIds")(availablePermissionIds.asInstanceOf[js.Any])
    if (countryId != null) __obj.updateDynamic("countryId")(countryId.asInstanceOf[js.Any])
    if (currencyId != null) __obj.updateDynamic("currencyId")(currencyId.asInstanceOf[js.Any])
    if (defaultCreativeSizeId != null) __obj.updateDynamic("defaultCreativeSizeId")(defaultCreativeSizeId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maximumImageSize != null) __obj.updateDynamic("maximumImageSize")(maximumImageSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nielsenOcrEnabled)) __obj.updateDynamic("nielsenOcrEnabled")(nielsenOcrEnabled.get.asInstanceOf[js.Any])
    if (reportsConfiguration != null) __obj.updateDynamic("reportsConfiguration")(reportsConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(shareReportsWithTwitter)) __obj.updateDynamic("shareReportsWithTwitter")(shareReportsWithTwitter.get.asInstanceOf[js.Any])
    if (teaserSizeLimit != null) __obj.updateDynamic("teaserSizeLimit")(teaserSizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

