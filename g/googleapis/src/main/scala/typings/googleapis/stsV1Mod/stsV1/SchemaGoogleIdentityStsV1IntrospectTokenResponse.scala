package typings.googleapis.stsV1Mod.stsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityStsV1IntrospectTokenResponse extends StObject {
  
  /**
    * A boolean value that indicates whether the provided access token is currently active.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The client identifier for the OAuth 2.0 client that requested the provided token.
    */
  var client_id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expiration timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire.
    */
  var exp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The issued timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued.
    */
  var iat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The issuer of the provided token.
    */
  var iss: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of scopes associated with the provided token.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique user ID associated with the provided token. For Google Accounts, this value is based on the Google Account's user ID. For federated identities, this value is based on the identity pool ID and the value of the mapped `google.subject` attribute.
    */
  var sub: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The human-readable identifier for the token principal subject. For example, if the provided token is associated with a workload identity pool, this field contains a value in the following format: `principal://iam.googleapis.com/projects//locations/global/workloadIdentityPools//subject/`
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIdentityStsV1IntrospectTokenResponse {
  
  inline def apply(): SchemaGoogleIdentityStsV1IntrospectTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityStsV1IntrospectTokenResponse]
  }
  
  extension [Self <: SchemaGoogleIdentityStsV1IntrospectTokenResponse](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idNull: Self = StObject.set(x, "client_id", null)
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setExp(value: String): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpNull: Self = StObject.set(x, "exp", null)
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIat(value: String): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatNull: Self = StObject.set(x, "iat", null)
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssNull: Self = StObject.set(x, "iss", null)
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubNull: Self = StObject.set(x, "sub", null)
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
