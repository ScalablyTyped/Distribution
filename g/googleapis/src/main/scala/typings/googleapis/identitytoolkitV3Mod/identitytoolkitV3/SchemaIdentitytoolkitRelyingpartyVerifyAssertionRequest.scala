package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest extends StObject {
  
  /**
    * When it's true, automatically creates a new account if the user doesn't exist. When it's false, allows existing user to sign in normally and throws exception if the user doesn't exist.
    */
  var autoCreate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GITKit token for the non-trusted IDP pending to be confirmed by the user.
    */
  var pendingIdToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The post body if the request is a HTTP POST.
    */
  var postBody: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI to which the IDP redirects the user back. It may contain federated login result params added by the IDP.
    */
  var requestUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether return 200 and IDP credential rather than throw exception when federated id is already linked.
    */
  var returnIdpCredential: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to return refresh tokens.
    */
  var returnRefreshToken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Session ID, which should match the one in previous createAuthUri request.
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
object SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest](x: Self) {
    
    inline def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateNull: Self = StObject.set(x, "autoCreate", null)
    
    inline def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberNull: Self = StObject.set(x, "delegatedProjectNumber", null)
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setPendingIdToken(value: String): Self = StObject.set(x, "pendingIdToken", value.asInstanceOf[js.Any])
    
    inline def setPendingIdTokenNull: Self = StObject.set(x, "pendingIdToken", null)
    
    inline def setPendingIdTokenUndefined: Self = StObject.set(x, "pendingIdToken", js.undefined)
    
    inline def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    inline def setPostBodyNull: Self = StObject.set(x, "postBody", null)
    
    inline def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
    
    inline def setRequestUri(value: String): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
    
    inline def setRequestUriNull: Self = StObject.set(x, "requestUri", null)
    
    inline def setRequestUriUndefined: Self = StObject.set(x, "requestUri", js.undefined)
    
    inline def setReturnIdpCredential(value: Boolean): Self = StObject.set(x, "returnIdpCredential", value.asInstanceOf[js.Any])
    
    inline def setReturnIdpCredentialNull: Self = StObject.set(x, "returnIdpCredential", null)
    
    inline def setReturnIdpCredentialUndefined: Self = StObject.set(x, "returnIdpCredential", js.undefined)
    
    inline def setReturnRefreshToken(value: Boolean): Self = StObject.set(x, "returnRefreshToken", value.asInstanceOf[js.Any])
    
    inline def setReturnRefreshTokenNull: Self = StObject.set(x, "returnRefreshToken", null)
    
    inline def setReturnRefreshTokenUndefined: Self = StObject.set(x, "returnRefreshToken", js.undefined)
    
    inline def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    
    inline def setReturnSecureTokenNull: Self = StObject.set(x, "returnSecureToken", null)
    
    inline def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    
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
