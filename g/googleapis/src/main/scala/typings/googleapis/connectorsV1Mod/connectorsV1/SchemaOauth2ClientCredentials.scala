package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOauth2ClientCredentials extends StObject {
  
  /**
    * The client identifier.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Secret version reference containing the client secret.
    */
  var clientSecret: js.UndefOr[SchemaSecret] = js.undefined
}
object SchemaOauth2ClientCredentials {
  
  inline def apply(): SchemaOauth2ClientCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOauth2ClientCredentials]
  }
  
  extension [Self <: SchemaOauth2ClientCredentials](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: SchemaSecret): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
  }
}
