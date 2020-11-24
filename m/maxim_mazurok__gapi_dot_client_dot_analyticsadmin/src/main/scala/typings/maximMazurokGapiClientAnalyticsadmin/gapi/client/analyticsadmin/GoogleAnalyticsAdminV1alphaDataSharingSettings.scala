package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaDataSharingSettings extends js.Object {
  
  /** Output only. Resource name. Format: accounts/{account}/dataSharingSettings Example: "accounts/1000/dataSharingSettings" */
  var name: js.UndefOr[String] = js.native
  
  /** Allows any of Google sales to access the data in order to suggest configuration changes to improve results. */
  var sharingWithGoogleAnySalesEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows Google sales teams that are assigned to the customer to access the data in order to suggest configuration changes to improve results. Sales team restrictions still apply when
    * enabled.
    */
  var sharingWithGoogleAssignedSalesEnabled: js.UndefOr[Boolean] = js.native
  
  /** Allows Google to use the data to improve other Google products or services. */
  var sharingWithGoogleProductsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Allows Google support to access the data in order to help troubleshoot issues. */
  var sharingWithGoogleSupportEnabled: js.UndefOr[Boolean] = js.native
  
  /** Allows Google to share the data anonymously in aggregate form with others. */
  var sharingWithOthersEnabled: js.UndefOr[Boolean] = js.native
}
object GoogleAnalyticsAdminV1alphaDataSharingSettings {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaDataSharingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaDataSharingSettings]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaDataSharingSettingsOps[Self <: GoogleAnalyticsAdminV1alphaDataSharingSettings] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSharingWithGoogleAnySalesEnabled(value: Boolean): Self = this.set("sharingWithGoogleAnySalesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingWithGoogleAnySalesEnabled: Self = this.set("sharingWithGoogleAnySalesEnabled", js.undefined)
    
    @scala.inline
    def setSharingWithGoogleAssignedSalesEnabled(value: Boolean): Self = this.set("sharingWithGoogleAssignedSalesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingWithGoogleAssignedSalesEnabled: Self = this.set("sharingWithGoogleAssignedSalesEnabled", js.undefined)
    
    @scala.inline
    def setSharingWithGoogleProductsEnabled(value: Boolean): Self = this.set("sharingWithGoogleProductsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingWithGoogleProductsEnabled: Self = this.set("sharingWithGoogleProductsEnabled", js.undefined)
    
    @scala.inline
    def setSharingWithGoogleSupportEnabled(value: Boolean): Self = this.set("sharingWithGoogleSupportEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingWithGoogleSupportEnabled: Self = this.set("sharingWithGoogleSupportEnabled", js.undefined)
    
    @scala.inline
    def setSharingWithOthersEnabled(value: Boolean): Self = this.set("sharingWithOthersEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharingWithOthersEnabled: Self = this.set("sharingWithOthersEnabled", js.undefined)
  }
}
