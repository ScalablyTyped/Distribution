package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Account extends js.Object {
  
  /** Account permissions assigned to this account. */
  var accountPermissionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Profile for this account. This is a read-only field that can be left blank. */
  var accountProfile: js.UndefOr[String] = js.native
  
  /** Whether this account is active. */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Maximum number of active ads allowed for this account. */
  var activeAdsLimitTier: js.UndefOr[String] = js.native
  
  /** Whether to serve creatives with Active View tags. If disabled, viewability data will not be available for any impressions. */
  var activeViewOptOut: js.UndefOr[Boolean] = js.native
  
  /** User role permissions available to the user roles of this account. */
  var availablePermissionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** ID of the country associated with this account. */
  var countryId: js.UndefOr[String] = js.native
  
  /**
    * ID of currency associated with this account. This is a required field. Acceptable values are: - "1" for USD - "2" for GBP - "3" for ESP - "4" for SEK - "5" for CAD - "6" for JPY -
    * "7" for DEM - "8" for AUD - "9" for FRF - "10" for ITL - "11" for DKK - "12" for NOK - "13" for FIM - "14" for ZAR - "15" for IEP - "16" for NLG - "17" for EUR - "18" for KRW - "19"
    * for TWD - "20" for SGD - "21" for CNY - "22" for HKD - "23" for NZD - "24" for MYR - "25" for BRL - "26" for PTE - "28" for CLP - "29" for TRY - "30" for ARS - "31" for PEN - "32"
    * for ILS - "33" for CHF - "34" for VEF - "35" for COP - "36" for GTQ - "37" for PLN - "39" for INR - "40" for THB - "41" for IDR - "42" for CZK - "43" for RON - "44" for HUF - "45"
    * for RUB - "46" for AED - "47" for BGN - "48" for HRK - "49" for MXN - "50" for NGN - "51" for EGP
    */
  var currencyId: js.UndefOr[String] = js.native
  
  /** Default placement dimensions for this account. */
  var defaultCreativeSizeId: js.UndefOr[String] = js.native
  
  /** Description of this account. */
  var description: js.UndefOr[String] = js.native
  
  /** ID of this account. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#account". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Locale of this account. Acceptable values are: - "cs" (Czech) - "de" (German) - "en" (English) - "en-GB" (English United Kingdom) - "es" (Spanish) - "fr" (French) - "it" (Italian) -
    * "ja" (Japanese) - "ko" (Korean) - "pl" (Polish) - "pt-BR" (Portuguese Brazil) - "ru" (Russian) - "sv" (Swedish) - "tr" (Turkish) - "zh-CN" (Chinese Simplified) - "zh-TW" (Chinese
    * Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Maximum image size allowed for this account, in kilobytes. Value must be greater than or equal to 1. */
  var maximumImageSize: js.UndefOr[String] = js.native
  
  /** Name of this account. This is a required field, and must be less than 128 characters long and be globally unique. */
  var name: js.UndefOr[String] = js.native
  
  /** Whether campaigns created in this account will be enabled for Nielsen OCR reach ratings by default. */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  
  /** Reporting configuration of this account. */
  var reportsConfiguration: js.UndefOr[ReportsConfiguration] = js.native
  
  /** Share Path to Conversion reports with Twitter. */
  var shareReportsWithTwitter: js.UndefOr[Boolean] = js.native
  
  /** File size limit in kilobytes of Rich Media teaser creatives. Acceptable values are 1 to 10240, inclusive. */
  var teaserSizeLimit: js.UndefOr[String] = js.native
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    
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
    def setAccountPermissionIdsVarargs(value: String*): Self = this.set("accountPermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setAccountPermissionIds(value: js.Array[String]): Self = this.set("accountPermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountPermissionIds: Self = this.set("accountPermissionIds", js.undefined)
    
    @scala.inline
    def setAccountProfile(value: String): Self = this.set("accountProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountProfile: Self = this.set("accountProfile", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setActiveAdsLimitTier(value: String): Self = this.set("activeAdsLimitTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveAdsLimitTier: Self = this.set("activeAdsLimitTier", js.undefined)
    
    @scala.inline
    def setActiveViewOptOut(value: Boolean): Self = this.set("activeViewOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveViewOptOut: Self = this.set("activeViewOptOut", js.undefined)
    
    @scala.inline
    def setAvailablePermissionIdsVarargs(value: String*): Self = this.set("availablePermissionIds", js.Array(value :_*))
    
    @scala.inline
    def setAvailablePermissionIds(value: js.Array[String]): Self = this.set("availablePermissionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailablePermissionIds: Self = this.set("availablePermissionIds", js.undefined)
    
    @scala.inline
    def setCountryId(value: String): Self = this.set("countryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryId: Self = this.set("countryId", js.undefined)
    
    @scala.inline
    def setCurrencyId(value: String): Self = this.set("currencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyId: Self = this.set("currencyId", js.undefined)
    
    @scala.inline
    def setDefaultCreativeSizeId(value: String): Self = this.set("defaultCreativeSizeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCreativeSizeId: Self = this.set("defaultCreativeSizeId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaximumImageSize(value: String): Self = this.set("maximumImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumImageSize: Self = this.set("maximumImageSize", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNielsenOcrEnabled(value: Boolean): Self = this.set("nielsenOcrEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNielsenOcrEnabled: Self = this.set("nielsenOcrEnabled", js.undefined)
    
    @scala.inline
    def setReportsConfiguration(value: ReportsConfiguration): Self = this.set("reportsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportsConfiguration: Self = this.set("reportsConfiguration", js.undefined)
    
    @scala.inline
    def setShareReportsWithTwitter(value: Boolean): Self = this.set("shareReportsWithTwitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareReportsWithTwitter: Self = this.set("shareReportsWithTwitter", js.undefined)
    
    @scala.inline
    def setTeaserSizeLimit(value: String): Self = this.set("teaserSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeaserSizeLimit: Self = this.set("teaserSizeLimit", js.undefined)
  }
}
