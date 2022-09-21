package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Tenant extends StObject {
  
  /**
    * Whether to allow email/password user authentication.
    */
  var allowPasswordSignup: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether anonymous users will be auto-deleted after a period of 30 days.
    */
  var autodeleteAnonymousUsers: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Options related to how clients making requests on behalf of a project should be configured.
    */
  var client: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig] = js.undefined
  
  /**
    * Whether authentication is disabled for the tenant. If true, the users under the disabled tenant are not allowed to sign-in. Admins of the disabled tenant are not able to manage its users.
    */
  var disableAuth: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Display name of the tenant.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to enable anonymous user authentication.
    */
  var enableAnonymousUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to enable email link user authentication.
    */
  var enableEmailLinkSignin: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Hash config information of a tenant for display on Pantheon. This can only be displayed on Pantheon to avoid the sensitive information to get accidentally leaked. Only returned in GetTenant response to restrict reading of this information. Requires firebaseauth.configs.getHashConfig permission on the agent project for returning this field.
    */
  var hashConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig] = js.undefined
  
  /**
    * Specify the settings that the tenant could inherit.
    */
  var inheritance: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance] = js.undefined
  
  /**
    * The tenant-level configuration of MFA options.
    */
  var mfaConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig] = js.undefined
  
  /**
    * Output only. Resource name of a tenant. For example: "projects/{project-id\}/tenants/{tenant-id\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of pairs that can be used for MFA. The phone number should be in E.164 format (https://www.itu.int/rec/T-REC-E.164/) and a maximum of 10 pairs can be added (error will be thrown once exceeded).
    */
  var testPhoneNumbers: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Tenant {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Tenant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Tenant]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Tenant](x: Self) {
    
    inline def setAllowPasswordSignup(value: Boolean): Self = StObject.set(x, "allowPasswordSignup", value.asInstanceOf[js.Any])
    
    inline def setAllowPasswordSignupNull: Self = StObject.set(x, "allowPasswordSignup", null)
    
    inline def setAllowPasswordSignupUndefined: Self = StObject.set(x, "allowPasswordSignup", js.undefined)
    
    inline def setAutodeleteAnonymousUsers(value: Boolean): Self = StObject.set(x, "autodeleteAnonymousUsers", value.asInstanceOf[js.Any])
    
    inline def setAutodeleteAnonymousUsersNull: Self = StObject.set(x, "autodeleteAnonymousUsers", null)
    
    inline def setAutodeleteAnonymousUsersUndefined: Self = StObject.set(x, "autodeleteAnonymousUsers", js.undefined)
    
    inline def setClient(value: SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setDisableAuth(value: Boolean): Self = StObject.set(x, "disableAuth", value.asInstanceOf[js.Any])
    
    inline def setDisableAuthNull: Self = StObject.set(x, "disableAuth", null)
    
    inline def setDisableAuthUndefined: Self = StObject.set(x, "disableAuth", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
    
    inline def setEnableAnonymousUserNull: Self = StObject.set(x, "enableAnonymousUser", null)
    
    inline def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
    
    inline def setEnableEmailLinkSignin(value: Boolean): Self = StObject.set(x, "enableEmailLinkSignin", value.asInstanceOf[js.Any])
    
    inline def setEnableEmailLinkSigninNull: Self = StObject.set(x, "enableEmailLinkSignin", null)
    
    inline def setEnableEmailLinkSigninUndefined: Self = StObject.set(x, "enableEmailLinkSignin", js.undefined)
    
    inline def setHashConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig): Self = StObject.set(x, "hashConfig", value.asInstanceOf[js.Any])
    
    inline def setHashConfigUndefined: Self = StObject.set(x, "hashConfig", js.undefined)
    
    inline def setInheritance(value: SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    inline def setInheritanceUndefined: Self = StObject.set(x, "inheritance", js.undefined)
    
    inline def setMfaConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig): Self = StObject.set(x, "mfaConfig", value.asInstanceOf[js.Any])
    
    inline def setMfaConfigUndefined: Self = StObject.set(x, "mfaConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestPhoneNumbers(value: StringDictionary[String]): Self = StObject.set(x, "testPhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setTestPhoneNumbersNull: Self = StObject.set(x, "testPhoneNumbers", null)
    
    inline def setTestPhoneNumbersUndefined: Self = StObject.set(x, "testPhoneNumbers", js.undefined)
  }
}
