package typings.ltijs

import typings.ltijs.anon.LineItem
import typings.ltijs.platformMod.PlatformInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idTokenMod {
  
  @js.native
  trait IdToken extends StObject {
    
    var endpoint: LineItem = js.native
    
    var iss: String = js.native
    
    var issuerCode: String = js.native
    
    var platformInfo: PlatformInfo = js.native
    
    var roles: js.Array[String] = js.native
    
    var user: String = js.native
    
    var userInfo: UserInfo = js.native
  }
  object IdToken {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IdTokenMutableBuilder[Self <: IdToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: LineItem): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerCode(value: String): Self = StObject.set(x, "issuerCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformInfo(value: PlatformInfo): Self = StObject.set(x, "platformInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserInfo(value: UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserInfo extends StObject {
    
    var email: String = js.native
    
    var family_name: String = js.native
    
    var given_name: String = js.native
    
    var name: String = js.native
  }
  object UserInfo {
    
    @scala.inline
    def apply(email: String, family_name: String, given_name: String, name: String): UserInfo = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
