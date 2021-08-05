package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var email: String
  
  var id: Double
  
  var oauth_identities: js.UndefOr[OAuthIdentity] = js.undefined
}
object User {
  
  inline def apply(email: String, id: Double): User = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOauth_identities(value: OAuthIdentity): Self = StObject.set(x, "oauth_identities", value.asInstanceOf[js.Any])
    
    inline def setOauth_identitiesUndefined: Self = StObject.set(x, "oauth_identities", js.undefined)
  }
}
