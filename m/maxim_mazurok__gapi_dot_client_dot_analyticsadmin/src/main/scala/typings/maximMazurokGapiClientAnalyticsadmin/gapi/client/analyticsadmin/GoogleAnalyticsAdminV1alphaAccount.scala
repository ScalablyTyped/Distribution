package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccount extends StObject {
  
  /** Country of business. Must be a non-deprecated code for a UN M.49 region. https: //unicode.org/cldr/charts/latest/supplem // ental/territory_containment_un_m_49.html */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when this account was originally created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Indicates whether this Account is soft-deleted or not. Deleted accounts are excluded from List results unless specifically requested. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Required. Human-readable display name for this account. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Resource name of this account. Format: accounts/{account} Example: "accounts/100" */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when account payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccount {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccount]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaAccountMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
