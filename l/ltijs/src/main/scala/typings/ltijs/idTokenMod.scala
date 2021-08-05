package typings.ltijs

import typings.ltijs.anon.LineItem
import typings.ltijs.platformMod.PlatformInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idTokenMod {
  
  trait IdToken extends StObject {
    
    var endpoint: LineItem
    
    var iss: String
    
    var issuerCode: String
    
    var platformInfo: PlatformInfo
    
    var roles: js.Array[String]
    
    var user: String
    
    var userInfo: UserInfo
  }
  object IdToken {
    
    inline def apply(
      endpoint: LineItem,
      iss: String,
      issuerCode: String,
      platformInfo: PlatformInfo,
      roles: js.Array[String],
      user: String,
      userInfo: UserInfo
    ): IdToken = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], issuerCode = issuerCode.asInstanceOf[js.Any], platformInfo = platformInfo.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdToken]
    }
    
    extension [Self <: IdToken](x: Self) {
      
      inline def setEndpoint(value: LineItem): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      inline def setIssuerCode(value: String): Self = StObject.set(x, "issuerCode", value.asInstanceOf[js.Any])
      
      inline def setPlatformInfo(value: PlatformInfo): Self = StObject.set(x, "platformInfo", value.asInstanceOf[js.Any])
      
      inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfo extends StObject {
    
    var email: String
    
    var family_name: String
    
    var given_name: String
    
    var name: String
  }
  object UserInfo {
    
    inline def apply(email: String, family_name: String, given_name: String, name: String): UserInfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
