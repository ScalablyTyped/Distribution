package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest extends StObject {
  
  /**
    * The app ID of the mobile app, base64(CERT_SHA1):PACKAGE_NAME for Android, BUNDLE_ID for iOS.
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Explicitly specify the auth flow type. Currently only support "CODE_FLOW" type. The field is only used for Google provider.
    */
  var authFlowType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relying party OAuth client ID.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The opaque value used by the client to maintain context info between the authentication request and the IDP callback.
    */
  var context: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI to which the IDP redirects the user after the federated login flow.
    */
  var continueUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The query parameter that client can customize by themselves in auth url. The following parameters are reserved for server so that they cannot be customized by clients: client_id, response_type, scope, redirect_uri, state, oauth_token.
    */
  var customParameter: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The hosted domain to restrict sign-in to accounts at that domain for Google Apps hosted accounts.
    */
  var hostedDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email or federated ID of the user.
    */
  var identifier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The developer's consumer key for OpenId OAuth Extension
    */
  var oauthConsumerKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional oauth scopes, beyond the basid user profile, that the user would be prompted to grant
    */
  var oauthScope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional realm for OpenID protocol. The sub string "scheme://domain:port" of the param "continueUri" is used if this is not set.
    */
  var openidRealm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The native app package for OTA installation.
    */
  var otaApp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IdP ID. For white listed IdPs it's a short domain name e.g. google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP identifier.
    */
  var providerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The session_id passed by client.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters, Firebear needs to know which Tenant to retrieve IDP configs from.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAuthFlowType(value: String): Self = StObject.set(x, "authFlowType", value.asInstanceOf[js.Any])
    
    inline def setAuthFlowTypeNull: Self = StObject.set(x, "authFlowType", null)
    
    inline def setAuthFlowTypeUndefined: Self = StObject.set(x, "authFlowType", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContinueUri(value: String): Self = StObject.set(x, "continueUri", value.asInstanceOf[js.Any])
    
    inline def setContinueUriNull: Self = StObject.set(x, "continueUri", null)
    
    inline def setContinueUriUndefined: Self = StObject.set(x, "continueUri", js.undefined)
    
    inline def setCustomParameter(value: StringDictionary[String]): Self = StObject.set(x, "customParameter", value.asInstanceOf[js.Any])
    
    inline def setCustomParameterNull: Self = StObject.set(x, "customParameter", null)
    
    inline def setCustomParameterUndefined: Self = StObject.set(x, "customParameter", js.undefined)
    
    inline def setHostedDomain(value: String): Self = StObject.set(x, "hostedDomain", value.asInstanceOf[js.Any])
    
    inline def setHostedDomainNull: Self = StObject.set(x, "hostedDomain", null)
    
    inline def setHostedDomainUndefined: Self = StObject.set(x, "hostedDomain", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setOauthConsumerKey(value: String): Self = StObject.set(x, "oauthConsumerKey", value.asInstanceOf[js.Any])
    
    inline def setOauthConsumerKeyNull: Self = StObject.set(x, "oauthConsumerKey", null)
    
    inline def setOauthConsumerKeyUndefined: Self = StObject.set(x, "oauthConsumerKey", js.undefined)
    
    inline def setOauthScope(value: String): Self = StObject.set(x, "oauthScope", value.asInstanceOf[js.Any])
    
    inline def setOauthScopeNull: Self = StObject.set(x, "oauthScope", null)
    
    inline def setOauthScopeUndefined: Self = StObject.set(x, "oauthScope", js.undefined)
    
    inline def setOpenidRealm(value: String): Self = StObject.set(x, "openidRealm", value.asInstanceOf[js.Any])
    
    inline def setOpenidRealmNull: Self = StObject.set(x, "openidRealm", null)
    
    inline def setOpenidRealmUndefined: Self = StObject.set(x, "openidRealm", js.undefined)
    
    inline def setOtaApp(value: String): Self = StObject.set(x, "otaApp", value.asInstanceOf[js.Any])
    
    inline def setOtaAppNull: Self = StObject.set(x, "otaApp", null)
    
    inline def setOtaAppUndefined: Self = StObject.set(x, "otaApp", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdNull: Self = StObject.set(x, "providerId", null)
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setTenantProjectNumber(value: String): Self = StObject.set(x, "tenantProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setTenantProjectNumberNull: Self = StObject.set(x, "tenantProjectNumber", null)
    
    inline def setTenantProjectNumberUndefined: Self = StObject.set(x, "tenantProjectNumber", js.undefined)
  }
}
