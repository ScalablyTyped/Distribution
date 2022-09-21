package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccess extends StObject {
  
  /**
    * Caller's IP address, such as "1.1.1.1".
    */
  var callerIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The caller IP's geolocation, which identifies where the call came from.
    */
  var callerIpGeo: js.UndefOr[SchemaGeolocation] = js.undefined
  
  /**
    * The method that the service account called, e.g. "SetIamPolicy".
    */
  var methodName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Associated email, such as "foo@google.com". The email address of the authenticated user (or service account on behalf of third party principal) making the request. For third party identity callers, the `principal_subject` field is populated instead of this field. For privacy reasons, the principal email address is sometimes redacted. For more information, see [Caller identities in audit logs](https://cloud.google.com/logging/docs/audit#user-id).
    */
  var principalEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string representing the principal_subject associated with the identity. As compared to `principal_email`, supports principals that aren't associated with email addresses, such as third party principals. For most identities, the format will be `principal://iam.googleapis.com/{identity pool name\}/subject/{subject)` except for some GKE identities (GKE_WORKLOAD, FREEFORM, GKE_HUB_WORKLOAD) that are still in the legacy format `serviceAccount:{identity pool name\}[{subject\}]`
    */
  var principalSubject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identity delegation history of an authenticated service account that makes the request. It contains information on the real authorities that try to access GCP resources by delegating on a service account. When multiple authorities are present, they are guaranteed to be sorted based on the original ordering of the identity delegation events.
    */
  var serviceAccountDelegationInfo: js.UndefOr[js.Array[SchemaServiceAccountDelegationInfo]] = js.undefined
  
  /**
    * The name of the service account key used to create or exchange credentials for authenticating the service account making the request. This is a scheme-less URI full resource name. For example: "//iam.googleapis.com/projects/{PROJECT_ID\}/serviceAccounts/{ACCOUNT\}/keys/{key\}"
    */
  var serviceAccountKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is the API service that the service account made a call to, e.g. "iam.googleapis.com"
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * What kind of user agent is associated, e.g. operating system shells, embedded or stand-alone applications, etc.
    */
  var userAgentFamily: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccess {
  
  inline def apply(): SchemaAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccess]
  }
  
  extension [Self <: SchemaAccess](x: Self) {
    
    inline def setCallerIp(value: String): Self = StObject.set(x, "callerIp", value.asInstanceOf[js.Any])
    
    inline def setCallerIpGeo(value: SchemaGeolocation): Self = StObject.set(x, "callerIpGeo", value.asInstanceOf[js.Any])
    
    inline def setCallerIpGeoUndefined: Self = StObject.set(x, "callerIpGeo", js.undefined)
    
    inline def setCallerIpNull: Self = StObject.set(x, "callerIp", null)
    
    inline def setCallerIpUndefined: Self = StObject.set(x, "callerIp", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameNull: Self = StObject.set(x, "methodName", null)
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailNull: Self = StObject.set(x, "principalEmail", null)
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setPrincipalSubject(value: String): Self = StObject.set(x, "principalSubject", value.asInstanceOf[js.Any])
    
    inline def setPrincipalSubjectNull: Self = StObject.set(x, "principalSubject", null)
    
    inline def setPrincipalSubjectUndefined: Self = StObject.set(x, "principalSubject", js.undefined)
    
    inline def setServiceAccountDelegationInfo(value: js.Array[SchemaServiceAccountDelegationInfo]): Self = StObject.set(x, "serviceAccountDelegationInfo", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountDelegationInfoUndefined: Self = StObject.set(x, "serviceAccountDelegationInfo", js.undefined)
    
    inline def setServiceAccountDelegationInfoVarargs(value: SchemaServiceAccountDelegationInfo*): Self = StObject.set(x, "serviceAccountDelegationInfo", js.Array(value*))
    
    inline def setServiceAccountKeyName(value: String): Self = StObject.set(x, "serviceAccountKeyName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountKeyNameNull: Self = StObject.set(x, "serviceAccountKeyName", null)
    
    inline def setServiceAccountKeyNameUndefined: Self = StObject.set(x, "serviceAccountKeyName", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setUserAgentFamily(value: String): Self = StObject.set(x, "userAgentFamily", value.asInstanceOf[js.Any])
    
    inline def setUserAgentFamilyNull: Self = StObject.set(x, "userAgentFamily", null)
    
    inline def setUserAgentFamilyUndefined: Self = StObject.set(x, "userAgentFamily", js.undefined)
  }
}
