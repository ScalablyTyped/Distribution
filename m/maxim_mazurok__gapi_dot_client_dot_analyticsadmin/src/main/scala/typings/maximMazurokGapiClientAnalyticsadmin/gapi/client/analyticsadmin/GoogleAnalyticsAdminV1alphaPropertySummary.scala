package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaPropertySummary extends js.Object {
  
  /** Display name for the property referred to in this account summary. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource name of property referred to by this property summary Format: properties/{property_id} Example: "properties/1000" */
  var property: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaPropertySummary {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaPropertySummary]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaPropertySummaryOps[Self <: GoogleAnalyticsAdminV1alphaPropertySummary] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
  }
}
