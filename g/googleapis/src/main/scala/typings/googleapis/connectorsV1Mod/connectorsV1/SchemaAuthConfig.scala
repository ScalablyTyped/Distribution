package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthConfig extends StObject {
  
  /**
    * List containing additional auth configs.
    */
  var additionalVariables: js.UndefOr[js.Array[SchemaConfigVariable]] = js.undefined
  
  /**
    * The type of authentication configured.
    */
  var authType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Oauth2ClientCredentials.
    */
  var oauth2ClientCredentials: js.UndefOr[SchemaOauth2ClientCredentials] = js.undefined
  
  /**
    * Oauth2JwtBearer.
    */
  var oauth2JwtBearer: js.UndefOr[SchemaOauth2JwtBearer] = js.undefined
  
  /**
    * SSH Public Key.
    */
  var sshPublicKey: js.UndefOr[SchemaSshPublicKey] = js.undefined
  
  /**
    * UserPassword.
    */
  var userPassword: js.UndefOr[SchemaUserPassword] = js.undefined
}
object SchemaAuthConfig {
  
  inline def apply(): SchemaAuthConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthConfig]
  }
  
  extension [Self <: SchemaAuthConfig](x: Self) {
    
    inline def setAdditionalVariables(value: js.Array[SchemaConfigVariable]): Self = StObject.set(x, "additionalVariables", value.asInstanceOf[js.Any])
    
    inline def setAdditionalVariablesUndefined: Self = StObject.set(x, "additionalVariables", js.undefined)
    
    inline def setAdditionalVariablesVarargs(value: SchemaConfigVariable*): Self = StObject.set(x, "additionalVariables", js.Array(value*))
    
    inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeNull: Self = StObject.set(x, "authType", null)
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setOauth2ClientCredentials(value: SchemaOauth2ClientCredentials): Self = StObject.set(x, "oauth2ClientCredentials", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientCredentialsUndefined: Self = StObject.set(x, "oauth2ClientCredentials", js.undefined)
    
    inline def setOauth2JwtBearer(value: SchemaOauth2JwtBearer): Self = StObject.set(x, "oauth2JwtBearer", value.asInstanceOf[js.Any])
    
    inline def setOauth2JwtBearerUndefined: Self = StObject.set(x, "oauth2JwtBearer", js.undefined)
    
    inline def setSshPublicKey(value: SchemaSshPublicKey): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
    
    inline def setUserPassword(value: SchemaUserPassword): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
  }
}
