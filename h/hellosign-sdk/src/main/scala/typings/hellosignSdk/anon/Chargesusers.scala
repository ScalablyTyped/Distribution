package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chargesusers extends StObject {
  
  var callback_url: String
  
  var charges_users: Boolean
  
  var scopes: js.Array[String]
  
  var secret: String
}
object Chargesusers {
  
  inline def apply(callback_url: String, charges_users: Boolean, scopes: js.Array[String], secret: String): Chargesusers = {
    val __obj = js.Dynamic.literal(callback_url = callback_url.asInstanceOf[js.Any], charges_users = charges_users.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chargesusers]
  }
  
  extension [Self <: Chargesusers](x: Self) {
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setCharges_users(value: Boolean): Self = StObject.set(x, "charges_users", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
  }
}
