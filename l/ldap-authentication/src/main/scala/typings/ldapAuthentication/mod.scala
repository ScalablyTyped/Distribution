package typings.ldapAuthentication

import typings.ldapjs.mod.ClientOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldap-authentication", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ldap-authentication", "LdapAuthenticationError")
  @js.native
  open class LdapAuthenticationError protected ()
    extends StObject
       with Error {
    def this(message: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def authenticate(options: AuthenticationOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  trait AuthenticationOptions extends StObject {
    
    var adminDn: js.UndefOr[String] = js.undefined
    
    var adminPassword: js.UndefOr[String] = js.undefined
    
    var groupClass: js.UndefOr[String] = js.undefined
    
    var groupMemberAttribute: js.UndefOr[String] = js.undefined
    
    var groupMemberUserAttribute: js.UndefOr[String] = js.undefined
    
    var groupsSearchBase: js.UndefOr[String] = js.undefined
    
    var ldapOpts: ClientOptions
    
    var starttls: js.UndefOr[Boolean] = js.undefined
    
    var userDn: js.UndefOr[String] = js.undefined
    
    var userPassword: js.UndefOr[String] = js.undefined
    
    var userSearchBase: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var usernameAttribute: js.UndefOr[String] = js.undefined
    
    var verifyUserExists: js.UndefOr[Boolean] = js.undefined
  }
  object AuthenticationOptions {
    
    inline def apply(ldapOpts: ClientOptions): AuthenticationOptions = {
      val __obj = js.Dynamic.literal(ldapOpts = ldapOpts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticationOptions] (val x: Self) extends AnyVal {
      
      inline def setAdminDn(value: String): Self = StObject.set(x, "adminDn", value.asInstanceOf[js.Any])
      
      inline def setAdminDnUndefined: Self = StObject.set(x, "adminDn", js.undefined)
      
      inline def setAdminPassword(value: String): Self = StObject.set(x, "adminPassword", value.asInstanceOf[js.Any])
      
      inline def setAdminPasswordUndefined: Self = StObject.set(x, "adminPassword", js.undefined)
      
      inline def setGroupClass(value: String): Self = StObject.set(x, "groupClass", value.asInstanceOf[js.Any])
      
      inline def setGroupClassUndefined: Self = StObject.set(x, "groupClass", js.undefined)
      
      inline def setGroupMemberAttribute(value: String): Self = StObject.set(x, "groupMemberAttribute", value.asInstanceOf[js.Any])
      
      inline def setGroupMemberAttributeUndefined: Self = StObject.set(x, "groupMemberAttribute", js.undefined)
      
      inline def setGroupMemberUserAttribute(value: String): Self = StObject.set(x, "groupMemberUserAttribute", value.asInstanceOf[js.Any])
      
      inline def setGroupMemberUserAttributeUndefined: Self = StObject.set(x, "groupMemberUserAttribute", js.undefined)
      
      inline def setGroupsSearchBase(value: String): Self = StObject.set(x, "groupsSearchBase", value.asInstanceOf[js.Any])
      
      inline def setGroupsSearchBaseUndefined: Self = StObject.set(x, "groupsSearchBase", js.undefined)
      
      inline def setLdapOpts(value: ClientOptions): Self = StObject.set(x, "ldapOpts", value.asInstanceOf[js.Any])
      
      inline def setStarttls(value: Boolean): Self = StObject.set(x, "starttls", value.asInstanceOf[js.Any])
      
      inline def setStarttlsUndefined: Self = StObject.set(x, "starttls", js.undefined)
      
      inline def setUserDn(value: String): Self = StObject.set(x, "userDn", value.asInstanceOf[js.Any])
      
      inline def setUserDnUndefined: Self = StObject.set(x, "userDn", js.undefined)
      
      inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
      
      inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
      
      inline def setUserSearchBase(value: String): Self = StObject.set(x, "userSearchBase", value.asInstanceOf[js.Any])
      
      inline def setUserSearchBaseUndefined: Self = StObject.set(x, "userSearchBase", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameAttribute(value: String): Self = StObject.set(x, "usernameAttribute", value.asInstanceOf[js.Any])
      
      inline def setUsernameAttributeUndefined: Self = StObject.set(x, "usernameAttribute", js.undefined)
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setVerifyUserExists(value: Boolean): Self = StObject.set(x, "verifyUserExists", value.asInstanceOf[js.Any])
      
      inline def setVerifyUserExistsUndefined: Self = StObject.set(x, "verifyUserExists", js.undefined)
    }
  }
}
