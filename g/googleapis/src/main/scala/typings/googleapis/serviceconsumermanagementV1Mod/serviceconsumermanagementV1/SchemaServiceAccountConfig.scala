package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the service account configuration for the tenant project.
  */
trait SchemaServiceAccountConfig extends StObject {
  
  /**
    * ID of the IAM service account to be created in tenant project. The email
    * format of the service account is
    * &quot;&lt;account-id&gt;@&lt;tenant-project-id&gt;.iam.gserviceaccount.com&quot;.
    * This account ID must be unique within tenant project and service
    * producers have to guarantee it. The ID must be 6-30 characters long, and
    * match the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])`.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Roles for the associated service account for the tenant project.
    */
  var tenantProjectRoles: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaServiceAccountConfig {
  
  @scala.inline
  def apply(): SchemaServiceAccountConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountConfig]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountConfigMutableBuilder[Self <: SchemaServiceAccountConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setTenantProjectRoles(value: js.Array[String]): Self = StObject.set(x, "tenantProjectRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectRolesUndefined: Self = StObject.set(x, "tenantProjectRoles", js.undefined)
    
    @scala.inline
    def setTenantProjectRolesVarargs(value: String*): Self = StObject.set(x, "tenantProjectRoles", js.Array(value :_*))
  }
}
