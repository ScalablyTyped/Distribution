package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an Identity and Access Management (IAM) policy. It is used to
  * specify access control policies for Cloud Platform resources.   A `Policy`
  * consists of a list of `bindings`. A `binding` binds a list of `members` to
  * a `role`, where the members can be user accounts, Google groups, Google
  * domains, and service accounts. A `role` is a named list of permissions
  * defined by IAM.  **JSON Example**      {       &quot;bindings&quot;: [ {
  * &quot;role&quot;: &quot;roles/owner&quot;,           &quot;members&quot;: [
  * &quot;user:mike@example.com&quot;, &quot;group:admins@example.com&quot;,
  * &quot;domain:google.com&quot;,
  * &quot;serviceAccount:my-other-app@appspot.gserviceaccount.com&quot; ] }, {
  * &quot;role&quot;: &quot;roles/viewer&quot;,           &quot;members&quot;:
  * [&quot;user:sean@example.com&quot;]         }       ]     }  **YAML
  * Example**      bindings:     - members:       - user:mike@example.com -
  * group:admins@example.com       - domain:google.com       -
  * serviceAccount:my-other-app@appspot.gserviceaccount.com       role:
  * roles/owner     - members:       - user:sean@example.com       role:
  * roles/viewer   For a description of IAM and its features, see the [IAM
  * developer&#39;s guide](https://cloud.google.com/iam/docs).
  */
trait SchemaGoogleIamV1Policy extends StObject {
  
  /**
    * Specifies cloud audit logging configuration for this policy.
    */
  var auditConfigs: js.UndefOr[js.Array[SchemaGoogleIamV1AuditConfig]] = js.undefined
  
  /**
    * Associates a list of `members` to a `role`. `bindings` with no members
    * will result in an error.
    */
  var bindings: js.UndefOr[js.Array[SchemaGoogleIamV1Binding]] = js.undefined
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a policy from overwriting each other. It
    * is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform policy updates in order to avoid race
    * conditions: An `etag` is returned in the response to `getIamPolicy`, and
    * systems are expected to put that etag in the request to `setIamPolicy` to
    * ensure that their change will be applied to the same version of the
    * policy.  If no `etag` is provided in the call to `setIamPolicy`, then the
    * existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleIamV1Policy {
  
  inline def apply(): SchemaGoogleIamV1Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1Policy]
  }
  
  extension [Self <: SchemaGoogleIamV1Policy](x: Self) {
    
    inline def setAuditConfigs(value: js.Array[SchemaGoogleIamV1AuditConfig]): Self = StObject.set(x, "auditConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditConfigsUndefined: Self = StObject.set(x, "auditConfigs", js.undefined)
    
    inline def setAuditConfigsVarargs(value: SchemaGoogleIamV1AuditConfig*): Self = StObject.set(x, "auditConfigs", js.Array(value :_*))
    
    inline def setBindings(value: js.Array[SchemaGoogleIamV1Binding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: SchemaGoogleIamV1Binding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
