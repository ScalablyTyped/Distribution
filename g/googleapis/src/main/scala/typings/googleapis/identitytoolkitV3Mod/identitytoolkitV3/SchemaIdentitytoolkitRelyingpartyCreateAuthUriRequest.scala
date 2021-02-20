package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to get the IDP authentication URL.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest extends StObject {
  
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
  def apply(): SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAuthFlowType(value: String): Self = StObject.set(x, "authFlowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthFlowTypeUndefined: Self = StObject.set(x, "authFlowType", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setContinueUri(value: String): Self = StObject.set(x, "continueUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueUriUndefined: Self = StObject.set(x, "continueUri", js.undefined)
    
    @scala.inline
    def setCustomParameter(value: StringDictionary[String]): Self = StObject.set(x, "customParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomParameterUndefined: Self = StObject.set(x, "customParameter", js.undefined)
    
    @scala.inline
    def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setOauthConsumerKey(value: String): Self = StObject.set(x, "oauthConsumerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthConsumerKeyUndefined: Self = StObject.set(x, "oauthConsumerKey", js.undefined)
    
    @scala.inline
    def setOauthScope(value: String): Self = StObject.set(x, "oauthScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthScopeUndefined: Self = StObject.set(x, "oauthScope", js.undefined)
    
    @scala.inline
    def setOpenidRealm(value: String): Self = StObject.set(x, "openidRealm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenidRealmUndefined: Self = StObject.set(x, "openidRealm", js.undefined)
    
    @scala.inline
    def setOtaApp(value: String): Self = StObject.set(x, "otaApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaAppUndefined: Self = StObject.set(x, "otaApp", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setTenantProjectNumber(value: String): Self = StObject.set(x, "tenantProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectNumberUndefined: Self = StObject.set(x, "tenantProjectNumber", js.undefined)
  }
}
