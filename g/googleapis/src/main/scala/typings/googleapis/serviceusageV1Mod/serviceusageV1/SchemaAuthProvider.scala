package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for an anthentication provider, including support for [JSON
  * Web Token
  * (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
  */
trait SchemaAuthProvider extends StObject {
  
  /**
    * The list of JWT
    * [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3).
    * that are allowed to access. A JWT containing any of these audiences will
    * be accepted. When this setting is absent, only JWTs with audience
    * &quot;https://Service_name/API_name&quot; will be accepted. For example,
    * if no audiences are in the setting, LibraryService API will only accept
    * JWTs with the following audience
    * &quot;https://library-example.googleapis.com/google.example.library.v1.LibraryService&quot;.
    * Example:      audiences: bookstore_android.apps.googleusercontent.com,
    * bookstore_web.apps.googleusercontent.com
    */
  var audiences: js.UndefOr[String] = js.undefined
  
  /**
    * Redirect URL if JWT token is required but not present or is expired.
    * Implement authorizationUrl of securityDefinitions in OpenAPI spec.
    */
  var authorizationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the auth provider. It will be referred to by
    * `AuthRequirement.provider_id`.  Example: &quot;bookstore_auth&quot;.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the principal that issued the JWT. See
    * https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1
    * Usually a URL or an email address.  Example:
    * https://securetoken.google.com Example:
    * 1234567-compute@developer.gserviceaccount.com
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the provider&#39;s public key set to validate signature of the
    * JWT. See [OpenID
    * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata).
    * Optional if the key set document:  - can be retrieved from    [OpenID
    * Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html of
    * the issuer.  - can be inferred from the email domain of the issuer (e.g.
    * a Google  service account).  Example:
    * https://www.googleapis.com/oauth2/v1/certs
    */
  var jwksUri: js.UndefOr[String] = js.undefined
}
object SchemaAuthProvider {
  
  @scala.inline
  def apply(): SchemaAuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthProvider]
  }
  
  @scala.inline
  implicit class SchemaAuthProviderMutableBuilder[Self <: SchemaAuthProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudiences(value: String): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setJwksUri(value: String): Self = StObject.set(x, "jwksUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwksUriUndefined: Self = StObject.set(x, "jwksUri", js.undefined)
  }
}
