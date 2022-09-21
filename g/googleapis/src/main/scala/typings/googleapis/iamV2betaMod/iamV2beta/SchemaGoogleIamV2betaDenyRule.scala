package typings.googleapis.iamV2betaMod.iamV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV2betaDenyRule extends StObject {
  
  /**
    * The condition that determines whether this deny rule applies to a request. If the condition expression evaluates to `true`, then the deny rule is applied; otherwise, the deny rule is not applied. Each deny rule is evaluated independently. If this deny rule does not apply to a request, other deny rules might still apply. The condition can use CEL functions that evaluate [resource tags](https://cloud.google.com/iam/help/conditions/resource-tags). Other functions and operators are not supported.
    */
  var denialCondition: js.UndefOr[SchemaGoogleTypeExpr] = js.undefined
  
  /**
    * The permissions that are explicitly denied by this rule. Each permission uses the format `{service_fqdn\}/{resource\}.{verb\}`, where `{service_fqdn\}` is the fully qualified domain name for the service. For example, `iam.googleapis.com/roles.list`.
    */
  var deniedPermissions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The identities that are prevented from using one or more permissions on Google Cloud resources. This field can contain the following values: * `principalSet://goog/public:all`: A special identifier that represents any principal that is on the internet, even if they do not have a Google Account or are not logged in. * `principal://goog/subject/{email_id\}`: A specific Google Account. Includes Gmail, Cloud Identity, and Google Workspace user accounts. For example, `principal://goog/subject/alice@example.com`. * `deleted:principal://goog/subject/{email_id\}?uid={uid\}`: A specific Google Account that was deleted recently. For example, `deleted:principal://goog/subject/alice@example.com?uid=1234567890`. If the Google Account is recovered, this identifier reverts to the standard identifier for a Google Account. * `principalSet://goog/group/{group_id\}`: A Google group. For example, `principalSet://goog/group/admins@example.com`. * `deleted:principalSet://goog/group/{group_id\}?uid={uid\}`: A Google group that was deleted recently. For example, `deleted:principalSet://goog/group/admins@example.com?uid=1234567890`. If the Google group is restored, this identifier reverts to the standard identifier for a Google group. * `principal://iam.googleapis.com/projects/-/serviceAccounts/{service_account_id\}`: A Google Cloud service account. For example, `principal://iam.googleapis.com/projects/-/serviceAccounts/my-service-account@iam.gserviceaccount.com`. * `deleted:principal://iam.googleapis.com/projects/-/serviceAccounts/{service_account_id\}?uid={uid\}`: A Google Cloud service account that was deleted recently. For example, `deleted:principal://iam.googleapis.com/projects/-/serviceAccounts/my-service-account@iam.gserviceaccount.com?uid=1234567890`. If the service account is undeleted, this identifier reverts to the standard identifier for a service account. * `principalSet://goog/cloudIdentityCustomerId/{customer_id\}`: All of the principals associated with the specified Google Workspace or Cloud Identity customer ID. For example, `principalSet://goog/cloudIdentityCustomerId/C01Abc35`.
    */
  var deniedPrincipals: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the permissions that this rule excludes from the set of denied permissions given by `denied_permissions`. If a permission appears in `denied_permissions` _and_ in `exception_permissions` then it will _not_ be denied. The excluded permissions can be specified using the same syntax as `denied_permissions`.
    */
  var exceptionPermissions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The identities that are excluded from the deny rule, even if they are listed in the `denied_principals`. For example, you could add a Google group to the `denied_principals`, then exclude specific users who belong to that group. This field can contain the same values as the `denied_principals` field, excluding `principalSet://goog/public:all`, which represents all users on the internet.
    */
  var exceptionPrincipals: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleIamV2betaDenyRule {
  
  inline def apply(): SchemaGoogleIamV2betaDenyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV2betaDenyRule]
  }
  
  extension [Self <: SchemaGoogleIamV2betaDenyRule](x: Self) {
    
    inline def setDenialCondition(value: SchemaGoogleTypeExpr): Self = StObject.set(x, "denialCondition", value.asInstanceOf[js.Any])
    
    inline def setDenialConditionUndefined: Self = StObject.set(x, "denialCondition", js.undefined)
    
    inline def setDeniedPermissions(value: js.Array[String]): Self = StObject.set(x, "deniedPermissions", value.asInstanceOf[js.Any])
    
    inline def setDeniedPermissionsNull: Self = StObject.set(x, "deniedPermissions", null)
    
    inline def setDeniedPermissionsUndefined: Self = StObject.set(x, "deniedPermissions", js.undefined)
    
    inline def setDeniedPermissionsVarargs(value: String*): Self = StObject.set(x, "deniedPermissions", js.Array(value*))
    
    inline def setDeniedPrincipals(value: js.Array[String]): Self = StObject.set(x, "deniedPrincipals", value.asInstanceOf[js.Any])
    
    inline def setDeniedPrincipalsNull: Self = StObject.set(x, "deniedPrincipals", null)
    
    inline def setDeniedPrincipalsUndefined: Self = StObject.set(x, "deniedPrincipals", js.undefined)
    
    inline def setDeniedPrincipalsVarargs(value: String*): Self = StObject.set(x, "deniedPrincipals", js.Array(value*))
    
    inline def setExceptionPermissions(value: js.Array[String]): Self = StObject.set(x, "exceptionPermissions", value.asInstanceOf[js.Any])
    
    inline def setExceptionPermissionsNull: Self = StObject.set(x, "exceptionPermissions", null)
    
    inline def setExceptionPermissionsUndefined: Self = StObject.set(x, "exceptionPermissions", js.undefined)
    
    inline def setExceptionPermissionsVarargs(value: String*): Self = StObject.set(x, "exceptionPermissions", js.Array(value*))
    
    inline def setExceptionPrincipals(value: js.Array[String]): Self = StObject.set(x, "exceptionPrincipals", value.asInstanceOf[js.Any])
    
    inline def setExceptionPrincipalsNull: Self = StObject.set(x, "exceptionPrincipals", null)
    
    inline def setExceptionPrincipalsUndefined: Self = StObject.set(x, "exceptionPrincipals", js.undefined)
    
    inline def setExceptionPrincipalsVarargs(value: String*): Self = StObject.set(x, "exceptionPrincipals", js.Array(value*))
  }
}
