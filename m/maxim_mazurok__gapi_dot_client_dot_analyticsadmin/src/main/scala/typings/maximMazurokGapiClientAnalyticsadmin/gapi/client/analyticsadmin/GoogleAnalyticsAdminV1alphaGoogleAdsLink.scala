package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaGoogleAdsLink extends StObject {
  
  /**
    * Enable personalized advertising features with this integration. Automatically publish my Google Analytics audience lists and Google Analytics remarketing events/parameters to the
    * linked Google Ads account. If this field is not set on create/update it will be defaulted to true.
    */
  var adsPersonalizationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. If true, this link is for a Google Ads manager account. */
  var canManageClients: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Time when this link was originally created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Immutable. Google Ads customer ID. */
  var customerId: js.UndefOr[String] = js.undefined
  
  /** Output only. Email address of the user that created the link. An empty string will be returned if the email address can't be retrieved. */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** Output only. Format: properties/{propertyId}/googleAdsLinks/{googleAdsLinkId} Note: googleAdsLinkId is not the Google Ads customer ID. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Immutable. Format: properties/{propertyId} */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Output only. Time when this link was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaGoogleAdsLink {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaGoogleAdsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaGoogleAdsLink]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaGoogleAdsLinkMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaGoogleAdsLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdsPersonalizationEnabled(value: Boolean): Self = StObject.set(x, "adsPersonalizationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsPersonalizationEnabledUndefined: Self = StObject.set(x, "adsPersonalizationEnabled", js.undefined)
    
    @scala.inline
    def setCanManageClients(value: Boolean): Self = StObject.set(x, "canManageClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageClientsUndefined: Self = StObject.set(x, "canManageClients", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
