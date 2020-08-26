package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for iSDK to execute strong match flow for post-install
  * attribution.
  */
@js.native
trait SchemaGetIosPostInstallAttributionResponse extends js.Object {
  /**
    * The minimum version for app, specified by dev through ?imv= parameter.
    * Return to iSDK to allow app to evaluate if current version meets this.
    */
  var appMinimumVersion: js.UndefOr[String] = js.native
  /**
    * The confidence of the returned attribution.
    */
  var attributionConfidence: js.UndefOr[String] = js.native
  /**
    * The deep-link attributed post-install via one of several techniques
    * (fingerprint, copy unique).
    */
  var deepLink: js.UndefOr[String] = js.native
  /**
    * User-agent specific custom-scheme URIs for iSDK to open. This will be set
    * according to the user-agent tha the click was originally made in. There
    * is no Safari-equivalent custom-scheme open URLs. ie:
    * googlechrome://www.example.com ie:
    * firefox://open-url?url=http://www.example.com ie:
    * opera-http://example.com
    */
  var externalBrowserDestinationLink: js.UndefOr[String] = js.native
  /**
    * The link to navigate to update the app if min version is not met. This is
    * either (in order): 1) fallback link (from ?ifl= parameter, if specified
    * by developer) or 2) AppStore URL (from ?isi= parameter, if specified), or
    * 3) the payload link (from required link= parameter).
    */
  var fallbackLink: js.UndefOr[String] = js.native
  /**
    * Invitation ID attributed post-install via one of several techniques
    * (fingerprint, copy unique).
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * Instruction for iSDK to attemmpt to perform strong match. For instance,
    * if browser does not support/allow cookie or outside of support browsers,
    * this will be false.
    */
  var isStrongMatchExecutable: js.UndefOr[Boolean] = js.native
  /**
    * Describes why match failed, ie: &quot;discarded due to low
    * confidence&quot;. This message will be publicly visible.
    */
  var matchMessage: js.UndefOr[String] = js.native
  /**
    * Which IP version the request was made from.
    */
  var requestIpVersion: js.UndefOr[String] = js.native
  /**
    * Entire FDL (short or long) attributed post-install via one of several
    * techniques (fingerprint, copy unique).
    */
  var requestedLink: js.UndefOr[String] = js.native
  /**
    * The entire FDL, expanded from a short link. It is the same as the
    * requested_link, if it is long. Parameters from this should not be used
    * directly (ie: server can default utm_[campaign|medium|source] to a value
    * when requested_link lack them, server determine the best fallback_link
    * when requested_link specifies &gt;1 fallback links).
    */
  var resolvedLink: js.UndefOr[String] = js.native
  /**
    * Scion campaign value to be propagated by iSDK to Scion at post-install.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Scion medium value to be propagated by iSDK to Scion at post-install.
    */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Scion source value to be propagated by iSDK to Scion at post-install.
    */
  var utmSource: js.UndefOr[String] = js.native
}

object SchemaGetIosPostInstallAttributionResponse {
  @scala.inline
  def apply(): SchemaGetIosPostInstallAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionResponse]
  }
  @scala.inline
  implicit class SchemaGetIosPostInstallAttributionResponseOps[Self <: SchemaGetIosPostInstallAttributionResponse] (val x: Self) extends AnyVal {
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
    def setAppMinimumVersion(value: String): Self = this.set("appMinimumVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppMinimumVersion: Self = this.set("appMinimumVersion", js.undefined)
    @scala.inline
    def setAttributionConfidence(value: String): Self = this.set("attributionConfidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributionConfidence: Self = this.set("attributionConfidence", js.undefined)
    @scala.inline
    def setDeepLink(value: String): Self = this.set("deepLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLink: Self = this.set("deepLink", js.undefined)
    @scala.inline
    def setExternalBrowserDestinationLink(value: String): Self = this.set("externalBrowserDestinationLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalBrowserDestinationLink: Self = this.set("externalBrowserDestinationLink", js.undefined)
    @scala.inline
    def setFallbackLink(value: String): Self = this.set("fallbackLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackLink: Self = this.set("fallbackLink", js.undefined)
    @scala.inline
    def setInvitationId(value: String): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitationId: Self = this.set("invitationId", js.undefined)
    @scala.inline
    def setIsStrongMatchExecutable(value: Boolean): Self = this.set("isStrongMatchExecutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStrongMatchExecutable: Self = this.set("isStrongMatchExecutable", js.undefined)
    @scala.inline
    def setMatchMessage(value: String): Self = this.set("matchMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchMessage: Self = this.set("matchMessage", js.undefined)
    @scala.inline
    def setRequestIpVersion(value: String): Self = this.set("requestIpVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestIpVersion: Self = this.set("requestIpVersion", js.undefined)
    @scala.inline
    def setRequestedLink(value: String): Self = this.set("requestedLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedLink: Self = this.set("requestedLink", js.undefined)
    @scala.inline
    def setResolvedLink(value: String): Self = this.set("resolvedLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedLink: Self = this.set("resolvedLink", js.undefined)
    @scala.inline
    def setUtmCampaign(value: String): Self = this.set("utmCampaign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmCampaign: Self = this.set("utmCampaign", js.undefined)
    @scala.inline
    def setUtmMedium(value: String): Self = this.set("utmMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmMedium: Self = this.set("utmMedium", js.undefined)
    @scala.inline
    def setUtmSource(value: String): Self = this.set("utmSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmSource: Self = this.set("utmSource", js.undefined)
  }
  
}

