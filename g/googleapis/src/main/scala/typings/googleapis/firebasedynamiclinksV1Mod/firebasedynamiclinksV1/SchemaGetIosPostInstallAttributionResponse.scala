package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for iSDK to execute strong match flow for post-install
  * attribution.
  */
trait SchemaGetIosPostInstallAttributionResponse extends StObject {
  
  /**
    * The minimum version for app, specified by dev through ?imv= parameter.
    * Return to iSDK to allow app to evaluate if current version meets this.
    */
  var appMinimumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The confidence of the returned attribution.
    */
  var attributionConfidence: js.UndefOr[String] = js.undefined
  
  /**
    * The deep-link attributed post-install via one of several techniques
    * (fingerprint, copy unique).
    */
  var deepLink: js.UndefOr[String] = js.undefined
  
  /**
    * User-agent specific custom-scheme URIs for iSDK to open. This will be set
    * according to the user-agent tha the click was originally made in. There
    * is no Safari-equivalent custom-scheme open URLs. ie:
    * googlechrome://www.example.com ie:
    * firefox://open-url?url=http://www.example.com ie:
    * opera-http://example.com
    */
  var externalBrowserDestinationLink: js.UndefOr[String] = js.undefined
  
  /**
    * The link to navigate to update the app if min version is not met. This is
    * either (in order): 1) fallback link (from ?ifl= parameter, if specified
    * by developer) or 2) AppStore URL (from ?isi= parameter, if specified), or
    * 3) the payload link (from required link= parameter).
    */
  var fallbackLink: js.UndefOr[String] = js.undefined
  
  /**
    * Invitation ID attributed post-install via one of several techniques
    * (fingerprint, copy unique).
    */
  var invitationId: js.UndefOr[String] = js.undefined
  
  /**
    * Instruction for iSDK to attemmpt to perform strong match. For instance,
    * if browser does not support/allow cookie or outside of support browsers,
    * this will be false.
    */
  var isStrongMatchExecutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes why match failed, ie: &quot;discarded due to low
    * confidence&quot;. This message will be publicly visible.
    */
  var matchMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Which IP version the request was made from.
    */
  var requestIpVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Entire FDL (short or long) attributed post-install via one of several
    * techniques (fingerprint, copy unique).
    */
  var requestedLink: js.UndefOr[String] = js.undefined
  
  /**
    * The entire FDL, expanded from a short link. It is the same as the
    * requested_link, if it is long. Parameters from this should not be used
    * directly (ie: server can default utm_[campaign|medium|source] to a value
    * when requested_link lack them, server determine the best fallback_link
    * when requested_link specifies &gt;1 fallback links).
    */
  var resolvedLink: js.UndefOr[String] = js.undefined
  
  /**
    * Scion campaign value to be propagated by iSDK to Scion at post-install.
    */
  var utmCampaign: js.UndefOr[String] = js.undefined
  
  /**
    * Scion medium value to be propagated by iSDK to Scion at post-install.
    */
  var utmMedium: js.UndefOr[String] = js.undefined
  
  /**
    * Scion source value to be propagated by iSDK to Scion at post-install.
    */
  var utmSource: js.UndefOr[String] = js.undefined
}
object SchemaGetIosPostInstallAttributionResponse {
  
  @scala.inline
  def apply(): SchemaGetIosPostInstallAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionResponse]
  }
  
  @scala.inline
  implicit class SchemaGetIosPostInstallAttributionResponseMutableBuilder[Self <: SchemaGetIosPostInstallAttributionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppMinimumVersion(value: String): Self = StObject.set(x, "appMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppMinimumVersionUndefined: Self = StObject.set(x, "appMinimumVersion", js.undefined)
    
    @scala.inline
    def setAttributionConfidence(value: String): Self = StObject.set(x, "attributionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionConfidenceUndefined: Self = StObject.set(x, "attributionConfidence", js.undefined)
    
    @scala.inline
    def setDeepLink(value: String): Self = StObject.set(x, "deepLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepLinkUndefined: Self = StObject.set(x, "deepLink", js.undefined)
    
    @scala.inline
    def setExternalBrowserDestinationLink(value: String): Self = StObject.set(x, "externalBrowserDestinationLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalBrowserDestinationLinkUndefined: Self = StObject.set(x, "externalBrowserDestinationLink", js.undefined)
    
    @scala.inline
    def setFallbackLink(value: String): Self = StObject.set(x, "fallbackLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackLinkUndefined: Self = StObject.set(x, "fallbackLink", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
    
    @scala.inline
    def setIsStrongMatchExecutable(value: Boolean): Self = StObject.set(x, "isStrongMatchExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrongMatchExecutableUndefined: Self = StObject.set(x, "isStrongMatchExecutable", js.undefined)
    
    @scala.inline
    def setMatchMessage(value: String): Self = StObject.set(x, "matchMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMessageUndefined: Self = StObject.set(x, "matchMessage", js.undefined)
    
    @scala.inline
    def setRequestIpVersion(value: String): Self = StObject.set(x, "requestIpVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIpVersionUndefined: Self = StObject.set(x, "requestIpVersion", js.undefined)
    
    @scala.inline
    def setRequestedLink(value: String): Self = StObject.set(x, "requestedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedLinkUndefined: Self = StObject.set(x, "requestedLink", js.undefined)
    
    @scala.inline
    def setResolvedLink(value: String): Self = StObject.set(x, "resolvedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedLinkUndefined: Self = StObject.set(x, "resolvedLink", js.undefined)
    
    @scala.inline
    def setUtmCampaign(value: String): Self = StObject.set(x, "utmCampaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmCampaignUndefined: Self = StObject.set(x, "utmCampaign", js.undefined)
    
    @scala.inline
    def setUtmMedium(value: String): Self = StObject.set(x, "utmMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmMediumUndefined: Self = StObject.set(x, "utmMedium", js.undefined)
    
    @scala.inline
    def setUtmSource(value: String): Self = StObject.set(x, "utmSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtmSourceUndefined: Self = StObject.set(x, "utmSource", js.undefined)
  }
}
