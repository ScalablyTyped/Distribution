package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetIosPostInstallAttributionResponse extends StObject {
  
  /**
    * The minimum version for app, specified by dev through ?imv= parameter. Return to iSDK to allow app to evaluate if current version meets this.
    */
  var appMinimumVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The confidence of the returned attribution.
    */
  var attributionConfidence: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The deep-link attributed post-install via one of several techniques (fingerprint, copy unique).
    */
  var deepLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-agent specific custom-scheme URIs for iSDK to open. This will be set according to the user-agent tha the click was originally made in. There is no Safari-equivalent custom-scheme open URLs. ie: googlechrome://www.example.com ie: firefox://open-url?url=http://www.example.com ie: opera-http://example.com
    */
  var externalBrowserDestinationLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to navigate to update the app if min version is not met. This is either (in order): 1) fallback link (from ?ifl= parameter, if specified by developer) or 2) AppStore URL (from ?isi= parameter, if specified), or 3) the payload link (from required link= parameter).
    */
  var fallbackLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Invitation ID attributed post-install via one of several techniques (fingerprint, copy unique).
    */
  var invitationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instruction for iSDK to attemmpt to perform strong match. For instance, if browser does not support/allow cookie or outside of support browsers, this will be false.
    */
  var isStrongMatchExecutable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Describes why match failed, ie: "discarded due to low confidence". This message will be publicly visible.
    */
  var matchMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which IP version the request was made from.
    */
  var requestIpVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Entire FDL (short or long) attributed post-install via one of several techniques (fingerprint, copy unique).
    */
  var requestedLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The entire FDL, expanded from a short link. It is the same as the requested_link, if it is long. Parameters from this should not be used directly (ie: server can default utm_[campaign|medium|source] to a value when requested_link lack them, server determine the best fallback_link when requested_link specifies \>1 fallback links).
    */
  var resolvedLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scion campaign value to be propagated by iSDK to Scion at post-install.
    */
  var utmCampaign: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scion content value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scion medium value to be propagated by iSDK to Scion at post-install.
    */
  var utmMedium: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scion source value to be propagated by iSDK to Scion at post-install.
    */
  var utmSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scion term value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmTerm: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetIosPostInstallAttributionResponse {
  
  inline def apply(): SchemaGetIosPostInstallAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionResponse]
  }
  
  extension [Self <: SchemaGetIosPostInstallAttributionResponse](x: Self) {
    
    inline def setAppMinimumVersion(value: String): Self = StObject.set(x, "appMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setAppMinimumVersionNull: Self = StObject.set(x, "appMinimumVersion", null)
    
    inline def setAppMinimumVersionUndefined: Self = StObject.set(x, "appMinimumVersion", js.undefined)
    
    inline def setAttributionConfidence(value: String): Self = StObject.set(x, "attributionConfidence", value.asInstanceOf[js.Any])
    
    inline def setAttributionConfidenceNull: Self = StObject.set(x, "attributionConfidence", null)
    
    inline def setAttributionConfidenceUndefined: Self = StObject.set(x, "attributionConfidence", js.undefined)
    
    inline def setDeepLink(value: String): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkNull: Self = StObject.set(x, "deepLink", null)
    
    inline def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    inline def setExternalBrowserDestinationLink(value: String): Self = StObject.set(x, "externalBrowserDestinationLink", value.asInstanceOf[js.Any])
    
    inline def setExternalBrowserDestinationLinkNull: Self = StObject.set(x, "externalBrowserDestinationLink", null)
    
    inline def setExternalBrowserDestinationLinkUndefined: Self = StObject.set(x, "externalBrowserDestinationLink", js.undefined)
    
    inline def setFallbackLink(value: String): Self = StObject.set(x, "fallbackLink", value.asInstanceOf[js.Any])
    
    inline def setFallbackLinkNull: Self = StObject.set(x, "fallbackLink", null)
    
    inline def setFallbackLinkUndefined: Self = StObject.set(x, "fallbackLink", js.undefined)
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdNull: Self = StObject.set(x, "invitationId", null)
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    inline def setIsStrongMatchExecutable(value: Boolean): Self = StObject.set(x, "isStrongMatchExecutable", value.asInstanceOf[js.Any])
    
    inline def setIsStrongMatchExecutableNull: Self = StObject.set(x, "isStrongMatchExecutable", null)
    
    inline def setIsStrongMatchExecutableUndefined: Self = StObject.set(x, "isStrongMatchExecutable", js.undefined)
    
    inline def setMatchMessage(value: String): Self = StObject.set(x, "matchMessage", value.asInstanceOf[js.Any])
    
    inline def setMatchMessageNull: Self = StObject.set(x, "matchMessage", null)
    
    inline def setMatchMessageUndefined: Self = StObject.set(x, "matchMessage", js.undefined)
    
    inline def setRequestIpVersion(value: String): Self = StObject.set(x, "requestIpVersion", value.asInstanceOf[js.Any])
    
    inline def setRequestIpVersionNull: Self = StObject.set(x, "requestIpVersion", null)
    
    inline def setRequestIpVersionUndefined: Self = StObject.set(x, "requestIpVersion", js.undefined)
    
    inline def setRequestedLink(value: String): Self = StObject.set(x, "requestedLink", value.asInstanceOf[js.Any])
    
    inline def setRequestedLinkNull: Self = StObject.set(x, "requestedLink", null)
    
    inline def setRequestedLinkUndefined: Self = StObject.set(x, "requestedLink", js.undefined)
    
    inline def setResolvedLink(value: String): Self = StObject.set(x, "resolvedLink", value.asInstanceOf[js.Any])
    
    inline def setResolvedLinkNull: Self = StObject.set(x, "resolvedLink", null)
    
    inline def setResolvedLinkUndefined: Self = StObject.set(x, "resolvedLink", js.undefined)
    
    inline def setUtmCampaign(value: String): Self = StObject.set(x, "utmCampaign", value.asInstanceOf[js.Any])
    
    inline def setUtmCampaignNull: Self = StObject.set(x, "utmCampaign", null)
    
    inline def setUtmCampaignUndefined: Self = StObject.set(x, "utmCampaign", js.undefined)
    
    inline def setUtmContent(value: String): Self = StObject.set(x, "utmContent", value.asInstanceOf[js.Any])
    
    inline def setUtmContentNull: Self = StObject.set(x, "utmContent", null)
    
    inline def setUtmContentUndefined: Self = StObject.set(x, "utmContent", js.undefined)
    
    inline def setUtmMedium(value: String): Self = StObject.set(x, "utmMedium", value.asInstanceOf[js.Any])
    
    inline def setUtmMediumNull: Self = StObject.set(x, "utmMedium", null)
    
    inline def setUtmMediumUndefined: Self = StObject.set(x, "utmMedium", js.undefined)
    
    inline def setUtmSource(value: String): Self = StObject.set(x, "utmSource", value.asInstanceOf[js.Any])
    
    inline def setUtmSourceNull: Self = StObject.set(x, "utmSource", null)
    
    inline def setUtmSourceUndefined: Self = StObject.set(x, "utmSource", js.undefined)
    
    inline def setUtmTerm(value: String): Self = StObject.set(x, "utmTerm", value.asInstanceOf[js.Any])
    
    inline def setUtmTermNull: Self = StObject.set(x, "utmTerm", null)
    
    inline def setUtmTermUndefined: Self = StObject.set(x, "utmTerm", js.undefined)
  }
}
