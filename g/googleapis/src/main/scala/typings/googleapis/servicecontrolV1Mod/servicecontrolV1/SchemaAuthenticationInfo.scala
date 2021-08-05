package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authentication information for the operation.
  */
trait SchemaAuthenticationInfo extends StObject {
  
  /**
    * The authority selector specified by the requestor, if any. It is not
    * guaranteed that the principal was allowed to use this authority.
    */
  var authoritySelector: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the authenticated user (or service account on behalf
    * of third party principal) making the request. For privacy reasons, the
    * principal email address is redacted for all read-only operations that
    * fail with a &quot;permission denied&quot; error.
    */
  var principalEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Identity delegation history of an authenticated service account that
    * makes the request. It contains information on the real authorities that
    * try to access GCP resources by delegating on a service account. When
    * multiple authorities present, they are guaranteed to be sorted based on
    * the original ordering of the identity delegation events.
    */
  var serviceAccountDelegationInfo: js.UndefOr[js.Array[SchemaServiceAccountDelegationInfo]] = js.undefined
  
  /**
    * The name of the service account key used to create or exchange
    * credentials for authenticating the service account making the request.
    * This is a scheme-less URI full resource name. For example:
    * &quot;//iam.googleapis.com/projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}&quot;
    */
  var serviceAccountKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The third party identification (if any) of the authenticated user making
    * the request. When the JSON object represented here has a proto
    * equivalent, the proto name will be indicated in the `@type` property.
    */
  var thirdPartyPrincipal: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaAuthenticationInfo {
  
  inline def apply(): SchemaAuthenticationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthenticationInfo]
  }
  
  extension [Self <: SchemaAuthenticationInfo](x: Self) {
    
    inline def setAuthoritySelector(value: String): Self = StObject.set(x, "authoritySelector", value.asInstanceOf[js.Any])
    
    inline def setAuthoritySelectorUndefined: Self = StObject.set(x, "authoritySelector", js.undefined)
    
    inline def setPrincipalEmail(value: String): Self = StObject.set(x, "principalEmail", value.asInstanceOf[js.Any])
    
    inline def setPrincipalEmailUndefined: Self = StObject.set(x, "principalEmail", js.undefined)
    
    inline def setServiceAccountDelegationInfo(value: js.Array[SchemaServiceAccountDelegationInfo]): Self = StObject.set(x, "serviceAccountDelegationInfo", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountDelegationInfoUndefined: Self = StObject.set(x, "serviceAccountDelegationInfo", js.undefined)
    
    inline def setServiceAccountDelegationInfoVarargs(value: SchemaServiceAccountDelegationInfo*): Self = StObject.set(x, "serviceAccountDelegationInfo", js.Array(value :_*))
    
    inline def setServiceAccountKeyName(value: String): Self = StObject.set(x, "serviceAccountKeyName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountKeyNameUndefined: Self = StObject.set(x, "serviceAccountKeyName", js.undefined)
    
    inline def setThirdPartyPrincipal(value: StringDictionary[js.Any]): Self = StObject.set(x, "thirdPartyPrincipal", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyPrincipalUndefined: Self = StObject.set(x, "thirdPartyPrincipal", js.undefined)
  }
}
