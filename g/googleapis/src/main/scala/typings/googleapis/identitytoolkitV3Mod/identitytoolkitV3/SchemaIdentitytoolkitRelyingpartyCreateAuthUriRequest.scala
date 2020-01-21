package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to get the IDP authentication URL.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest extends js.Object {
  /**
    * The app ID of the mobile app, base64(CERT_SHA1):PACKAGE_NAME for Android,
    * BUNDLE_ID for iOS.
    */
  var appId: js.UndefOr[String] = js.native
  /**
    * Explicitly specify the auth flow type. Currently only support
    * &quot;CODE_FLOW&quot; type. The field is only used for Google provider.
    */
  var authFlowType: js.UndefOr[String] = js.native
  /**
    * The relying party OAuth client ID.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The opaque value used by the client to maintain context info between the
    * authentication request and the IDP callback.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * The URI to which the IDP redirects the user after the federated login
    * flow.
    */
  var continueUri: js.UndefOr[String] = js.native
  /**
    * The query parameter that client can customize by themselves in auth url.
    * The following parameters are reserved for server so that they cannot be
    * customized by clients: client_id, response_type, scope, redirect_uri,
    * state, oauth_token.
    */
  var customParameter: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The hosted domain to restrict sign-in to accounts at that domain for
    * Google Apps hosted accounts.
    */
  var hostedDomain: js.UndefOr[String] = js.native
  /**
    * The email or federated ID of the user.
    */
  var identifier: js.UndefOr[String] = js.native
  /**
    * The developer&#39;s consumer key for OpenId OAuth Extension
    */
  var oauthConsumerKey: js.UndefOr[String] = js.native
  /**
    * Additional oauth scopes, beyond the basid user profile, that the user
    * would be prompted to grant
    */
  var oauthScope: js.UndefOr[String] = js.native
  /**
    * Optional realm for OpenID protocol. The sub string
    * &quot;scheme://domain:port&quot; of the param &quot;continueUri&quot; is
    * used if this is not set.
    */
  var openidRealm: js.UndefOr[String] = js.native
  /**
    * The native app package for OTA installation.
    */
  var otaApp: js.UndefOr[String] = js.native
  /**
    * The IdP ID. For white listed IdPs it&#39;s a short domain name e.g.
    * google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs
    * it&#39;s the OP identifier.
    */
  var providerId: js.UndefOr[String] = js.native
  /**
    * The session_id passed by client.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the
    * correct IDP parameters, Firebear needs to know which Tenant to retrieve
    * IDP configs from.
    */
  var tenantId: js.UndefOr[String] = js.native
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest {
  @scala.inline
  def apply(
    appId: String = null,
    authFlowType: String = null,
    clientId: String = null,
    context: String = null,
    continueUri: String = null,
    customParameter: StringDictionary[String] = null,
    hostedDomain: String = null,
    identifier: String = null,
    oauthConsumerKey: String = null,
    oauthScope: String = null,
    openidRealm: String = null,
    otaApp: String = null,
    providerId: String = null,
    sessionId: String = null,
    tenantId: String = null,
    tenantProjectNumber: String = null
  ): SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (authFlowType != null) __obj.updateDynamic("authFlowType")(authFlowType.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (continueUri != null) __obj.updateDynamic("continueUri")(continueUri.asInstanceOf[js.Any])
    if (customParameter != null) __obj.updateDynamic("customParameter")(customParameter.asInstanceOf[js.Any])
    if (hostedDomain != null) __obj.updateDynamic("hostedDomain")(hostedDomain.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (oauthConsumerKey != null) __obj.updateDynamic("oauthConsumerKey")(oauthConsumerKey.asInstanceOf[js.Any])
    if (oauthScope != null) __obj.updateDynamic("oauthScope")(oauthScope.asInstanceOf[js.Any])
    if (openidRealm != null) __obj.updateDynamic("openidRealm")(openidRealm.asInstanceOf[js.Any])
    if (otaApp != null) __obj.updateDynamic("otaApp")(otaApp.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    if (tenantProjectNumber != null) __obj.updateDynamic("tenantProjectNumber")(tenantProjectNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest]
  }
}

