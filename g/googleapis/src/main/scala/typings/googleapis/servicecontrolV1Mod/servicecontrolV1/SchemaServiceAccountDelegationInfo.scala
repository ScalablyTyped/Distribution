package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccountDelegationInfo extends StObject {
  
  /**
    * First party (Google) identity as the real authority.
    */
  var firstPartyPrincipal: js.UndefOr[SchemaFirstPartyPrincipal] = js.undefined
  
  /**
    * A string representing the principal_subject associated with the identity. For most identities, the format will be `principal://iam.googleapis.com/{identity pool name\}/subject/{subject)` except for some GKE identities (GKE_WORKLOAD, FREEFORM, GKE_HUB_WORKLOAD) that are still in the legacy format `serviceAccount:{identity pool name\}[{subject\}]`
    */
  var principalSubject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Third party identity as the real authority.
    */
  var thirdPartyPrincipal: js.UndefOr[SchemaThirdPartyPrincipal] = js.undefined
}
object SchemaServiceAccountDelegationInfo {
  
  inline def apply(): SchemaServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountDelegationInfo]
  }
  
  extension [Self <: SchemaServiceAccountDelegationInfo](x: Self) {
    
    inline def setFirstPartyPrincipal(value: SchemaFirstPartyPrincipal): Self = StObject.set(x, "firstPartyPrincipal", value.asInstanceOf[js.Any])
    
    inline def setFirstPartyPrincipalUndefined: Self = StObject.set(x, "firstPartyPrincipal", js.undefined)
    
    inline def setPrincipalSubject(value: String): Self = StObject.set(x, "principalSubject", value.asInstanceOf[js.Any])
    
    inline def setPrincipalSubjectNull: Self = StObject.set(x, "principalSubject", null)
    
    inline def setPrincipalSubjectUndefined: Self = StObject.set(x, "principalSubject", js.undefined)
    
    inline def setThirdPartyPrincipal(value: SchemaThirdPartyPrincipal): Self = StObject.set(x, "thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyPrincipalUndefined: Self = StObject.set(x, "thirdPartyPrincipal", js.undefined)
  }
}
