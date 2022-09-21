package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Config extends StObject {
  
  /**
    * List of domains authorized for OAuth redirects
    */
  var authorizedDomains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether anonymous users will be auto-deleted after a period of 30 days.
    */
  var autodeleteAnonymousUsers: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration related to blocking functions.
    */
  var blockingFunctions: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig] = js.undefined
  
  /**
    * Options related to how clients making requests on behalf of a project should be configured.
    */
  var client: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig] = js.undefined
  
  /**
    * Configuration for this project's multi-factor authentication, including whether it is active and what factors can be used for the second factor
    */
  var mfa: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig] = js.undefined
  
  /**
    * Configuration related to monitoring project activity.
    */
  var monitoring: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig] = js.undefined
  
  /**
    * Configuration related to multi-tenant functionality.
    */
  var multiTenant: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig] = js.undefined
  
  /**
    * Output only. The name of the Config resource. Example: "projects/my-awesome-project/config"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration related to sending notifications to users.
    */
  var notification: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig] = js.undefined
  
  /**
    * Configuration related to quotas.
    */
  var quota: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig] = js.undefined
  
  /**
    * Configuration related to local sign in methods.
    */
  var signIn: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig] = js.undefined
  
  /**
    * Output only. The subtype of this config.
    */
  var subtype: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Config {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Config]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Config](x: Self) {
    
    inline def setAuthorizedDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedDomains", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedDomainsNull: Self = StObject.set(x, "authorizedDomains", null)
    
    inline def setAuthorizedDomainsUndefined: Self = StObject.set(x, "authorizedDomains", js.undefined)
    
    inline def setAuthorizedDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedDomains", js.Array(value*))
    
    inline def setAutodeleteAnonymousUsers(value: Boolean): Self = StObject.set(x, "autodeleteAnonymousUsers", value.asInstanceOf[js.Any])
    
    inline def setAutodeleteAnonymousUsersNull: Self = StObject.set(x, "autodeleteAnonymousUsers", null)
    
    inline def setAutodeleteAnonymousUsersUndefined: Self = StObject.set(x, "autodeleteAnonymousUsers", js.undefined)
    
    inline def setBlockingFunctions(value: SchemaGoogleCloudIdentitytoolkitAdminV2BlockingFunctionsConfig): Self = StObject.set(x, "blockingFunctions", value.asInstanceOf[js.Any])
    
    inline def setBlockingFunctionsUndefined: Self = StObject.set(x, "blockingFunctions", js.undefined)
    
    inline def setClient(value: SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setMfa(value: SchemaGoogleCloudIdentitytoolkitAdminV2MultiFactorAuthConfig): Self = StObject.set(x, "mfa", value.asInstanceOf[js.Any])
    
    inline def setMfaUndefined: Self = StObject.set(x, "mfa", js.undefined)
    
    inline def setMonitoring(value: SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    inline def setMultiTenant(value: SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig): Self = StObject.set(x, "multiTenant", value.asInstanceOf[js.Any])
    
    inline def setMultiTenantUndefined: Self = StObject.set(x, "multiTenant", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotification(value: SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setQuota(value: SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig): Self = StObject.set(x, "quota", value.asInstanceOf[js.Any])
    
    inline def setQuotaUndefined: Self = StObject.set(x, "quota", js.undefined)
    
    inline def setSignIn(value: SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig): Self = StObject.set(x, "signIn", value.asInstanceOf[js.Any])
    
    inline def setSignInUndefined: Self = StObject.set(x, "signIn", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeNull: Self = StObject.set(x, "subtype", null)
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
