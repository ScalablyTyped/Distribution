package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaAccount extends js.Object {
  
  /** Country of business. Must be a non-deprecated code for a UN M.49 region. https: //unicode.org/cldr/charts/latest/supplem // ental/territory_containment_un_m_49.html */
  var countryCode: js.UndefOr[String] = js.native
  
  /** Output only. Time when this account was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. Indicates whether this Account is soft-deleted or not. Deleted accounts are excluded from List results unless specifically requested. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Required. Human-readable display name for this account. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this account. Format: accounts/{account} Example: "accounts/100" */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Time when account payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaAccount {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccount]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaAccountOps[Self <: GoogleAnalyticsAdminV1alphaAccount] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
