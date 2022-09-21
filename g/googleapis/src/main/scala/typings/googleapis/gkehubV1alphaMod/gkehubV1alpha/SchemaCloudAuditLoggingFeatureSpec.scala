package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudAuditLoggingFeatureSpec extends StObject {
  
  /**
    * Service account that should be allowlisted to send the audit logs; eg cloudauditlogging@gcp-project.iam.gserviceaccount.com. These accounts must already exist, but do not need to have any permissions granted to them. The customer's entitlements will be checked prior to allowlisting (i.e. the customer must be an Anthos customer.)
    */
  var allowlistedServiceAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCloudAuditLoggingFeatureSpec {
  
  inline def apply(): SchemaCloudAuditLoggingFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudAuditLoggingFeatureSpec]
  }
  
  extension [Self <: SchemaCloudAuditLoggingFeatureSpec](x: Self) {
    
    inline def setAllowlistedServiceAccounts(value: js.Array[String]): Self = StObject.set(x, "allowlistedServiceAccounts", value.asInstanceOf[js.Any])
    
    inline def setAllowlistedServiceAccountsNull: Self = StObject.set(x, "allowlistedServiceAccounts", null)
    
    inline def setAllowlistedServiceAccountsUndefined: Self = StObject.set(x, "allowlistedServiceAccounts", js.undefined)
    
    inline def setAllowlistedServiceAccountsVarargs(value: String*): Self = StObject.set(x, "allowlistedServiceAccounts", js.Array(value*))
  }
}
