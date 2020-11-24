package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaGoogleAdsLink extends js.Object {
  
  /**
    * Enable personalized advertising features with this integration. Automatically publish my Google Analytics audience lists and Google Analytics remarketing events/parameters to the
    * linked Google Ads account. If this field is not set on create/update it will be defaulted to true.
    */
  var adsPersonalizationEnabled: js.UndefOr[Boolean] = js.native
  
  /** Output only. If true, this link is for a Google Ads manager account. */
  var canManageClients: js.UndefOr[Boolean] = js.native
  
  /** Output only. Time when this link was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Immutable. Google Ads customer ID. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Output only. Email address of the user that created the link. An empty string will be returned if the email address can't be retrieved. */
  var emailAddress: js.UndefOr[String] = js.native
  
  /** Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId} Note: googleAdsLinkId is not the Google Ads customer ID. */
  var name: js.UndefOr[String] = js.native
  
  /** Immutable. Format: properties/{propertyId} */
  var parent: js.UndefOr[String] = js.native
  
  /** Output only. Time when this link was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaGoogleAdsLink {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaGoogleAdsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaGoogleAdsLink]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaGoogleAdsLinkOps[Self <: GoogleAnalyticsAdminV1alphaGoogleAdsLink] (val x: Self) extends AnyVal {
    
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
    def setAdsPersonalizationEnabled(value: Boolean): Self = this.set("adsPersonalizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsPersonalizationEnabled: Self = this.set("adsPersonalizationEnabled", js.undefined)
    
    @scala.inline
    def setCanManageClients(value: Boolean): Self = this.set("canManageClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageClients: Self = this.set("canManageClients", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
