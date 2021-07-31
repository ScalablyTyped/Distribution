package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains properties of a Campaign Manager account.
  */
trait SchemaAccount extends StObject {
  
  /**
    * Account permissions assigned to this account.
    */
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Profile for this account. This is a read-only field that can be left
    * blank.
    */
  var accountProfile: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this account is active.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum number of active ads allowed for this account.
    */
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to serve creatives with Active View tags. If disabled,
    * viewability data will not be available for any impressions.
    */
  var activeViewOptOut: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User role permissions available to the user roles of this account.
    */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ID of the country associated with this account.
    */
  var countryId: js.UndefOr[String] = js.undefined
  
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
  var currencyId: js.UndefOr[String] = js.undefined
  
  /**
    * Default placement dimensions for this account.
    */
  var defaultCreativeSizeId: js.UndefOr[String] = js.undefined
  
  /**
    * Description of this account.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this account. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#account&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
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
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum image size allowed for this account, in kilobytes. Value must be
    * greater than or equal to 1.
    */
  var maximumImageSize: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this account. This is a required field, and must be less than 128
    * characters long and be globally unique.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Whether campaigns created in this account will be enabled for Nielsen OCR
    * reach ratings by default.
    */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Reporting configuration of this account.
    */
  var reportsConfiguration: js.UndefOr[SchemaReportsConfiguration] = js.undefined
  
  /**
    * Share Path to Conversion reports with Twitter.
    */
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * File size limit in kilobytes of Rich Media teaser creatives. Acceptable
    * values are 1 to 10240, inclusive.
    */
  var teaserSizeLimit: js.UndefOr[String] = js.undefined
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountPermissionIds(value: js.Array[String]): Self = StObject.set(x, "accountPermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountPermissionIdsUndefined: Self = StObject.set(x, "accountPermissionIds", js.undefined)
    
    @scala.inline
    def setAccountPermissionIdsVarargs(value: String*): Self = StObject.set(x, "accountPermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountProfile(value: String): Self = StObject.set(x, "accountProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountProfileUndefined: Self = StObject.set(x, "accountProfile", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAdsLimitTier(value: String): Self = StObject.set(x, "activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAdsLimitTierUndefined: Self = StObject.set(x, "activeAdsLimitTier", js.undefined)
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = StObject.set(x, "activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveViewOptOutUndefined: Self = StObject.set(x, "activeViewOptOut", js.undefined)
    
    @scala.inline
    def setAvailablePermissionIds(value: js.Array[String]): Self = StObject.set(x, "availablePermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePermissionIdsUndefined: Self = StObject.set(x, "availablePermissionIds", js.undefined)
    
    @scala.inline
    def setAvailablePermissionIdsVarargs(value: String*): Self = StObject.set(x, "availablePermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setCountryId(value: String): Self = StObject.set(x, "countryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryIdUndefined: Self = StObject.set(x, "countryId", js.undefined)
    
    @scala.inline
    def setCurrencyId(value: String): Self = StObject.set(x, "currencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyIdUndefined: Self = StObject.set(x, "currencyId", js.undefined)
    
    @scala.inline
    def setDefaultCreativeSizeId(value: String): Self = StObject.set(x, "defaultCreativeSizeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCreativeSizeIdUndefined: Self = StObject.set(x, "defaultCreativeSizeId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaximumImageSize(value: String): Self = StObject.set(x, "maximumImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumImageSizeUndefined: Self = StObject.set(x, "maximumImageSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNielsenOcrEnabled(value: Boolean): Self = StObject.set(x, "nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNielsenOcrEnabledUndefined: Self = StObject.set(x, "nielsenOcrEnabled", js.undefined)
    
    @scala.inline
    def setReportsConfiguration(value: SchemaReportsConfiguration): Self = StObject.set(x, "reportsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportsConfigurationUndefined: Self = StObject.set(x, "reportsConfiguration", js.undefined)
    
    @scala.inline
    def setShareReportsWithTwitter(value: Boolean): Self = StObject.set(x, "shareReportsWithTwitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareReportsWithTwitterUndefined: Self = StObject.set(x, "shareReportsWithTwitter", js.undefined)
    
    @scala.inline
    def setTeaserSizeLimit(value: String): Self = StObject.set(x, "teaserSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeaserSizeLimitUndefined: Self = StObject.set(x, "teaserSizeLimit", js.undefined)
  }
}
