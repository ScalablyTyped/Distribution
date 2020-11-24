package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaProperty extends js.Object {
  
  /** Output only. Time when the entity was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The currency type used in reports involving monetary values. Format: https://en.wikipedia.org/wiki/ISO_4217 Examples: "USD", "EUR", "JPY" */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Output only. Indicates whether this Property is soft-deleted or not. Deleted properties are excluded from List results unless specifically requested. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Required. Human-readable display name for this property. The max allowed display name length is 100 UTF-16 code units. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Industry associated with this property Example: AUTOMOTIVE, FOOD_AND_DRINK */
  var industryCategory: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this property. Format: properties/{property_id} Example: "properties/1000" */
  var name: js.UndefOr[String] = js.native
  
  /** Immutable. Resource name of this property's logical parent. Note: The Property-Moving UI can be used to change the parent. Format: accounts/{account} Example: "accounts/100" */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Reporting Time Zone, used as the day boundary for reports, regardless of where the data originates. If the time zone honors DST, Analytics will automatically adjust for the changes.
    * NOTE: Changing the time zone only affects data going forward, and is not applied retroactively. Format: https://www.iana.org/time-zones Example: "America/Los_Angeles"
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /** Output only. Time when entity payload fields were last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaProperty {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaProperty]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaPropertyOps[Self <: GoogleAnalyticsAdminV1alphaProperty] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setIndustryCategory(value: String): Self = this.set("industryCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustryCategory: Self = this.set("industryCategory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
