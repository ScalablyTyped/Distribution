package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccountDelegationInfo extends StObject {
  
  /**
    * The email address of a Google account. .
    */
  var principalEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string representing the principal_subject associated with the identity. As compared to `principal_email`, supports principals that aren't associated with email addresses, such as third party principals. For most identities, the format will be `principal://iam.googleapis.com/{identity pool name\}/subject/{subject)` except for some GKE identities (GKE_WORKLOAD, FREEFORM, GKE_HUB_WORKLOAD) that are still in the legacy format `serviceAccount:{identity pool name\}[{subject\}]`
    */
  var principalSubject: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceAccountDelegationInfo {
  
  inline def apply(): SchemaServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountDelegationInfo]
  }
  
  extension [Self <: SchemaServiceAccountDelegationInfo](x: Self) {
    
    inline def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailNull: Self = StObject.set(x, "principalEmail", null)
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setPrincipalSubject(value: String): Self = StObject.set(x, "principalSubject", value.asInstanceOf[js.Any])
    
    inline def setPrincipalSubjectNull: Self = StObject.set(x, "principalSubject", null)
    
    inline def setPrincipalSubjectUndefined: Self = StObject.set(x, "principalSubject", js.undefined)
  }
}
