package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicy extends StObject {
  
  var advancedOptionsConfig: js.UndefOr[SecurityPolicyAdvancedOptionsConfig] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a fingerprint for this resource, which is essentially a hash of the metadata's contents and used for optimistic locking. The fingerprint is initially generated by Compute
    * Engine and changes after every request to modify or update metadata. You must always provide an up-to-date fingerprint hash in order to update or change metadata, otherwise the
    * request will fail with error 412 conditionNotMet. To see the latest fingerprint, make get() request to the security policy.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output only] Type of the resource. Always compute#securityPolicyfor security policies */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match "*"). If no rules are provided when creating a security
    * policy, a default rule with action "allow" will be added.
    */
  var rules: js.UndefOr[js.Array[SecurityPolicyRule]] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SecurityPolicy {
  
  inline def apply(): SecurityPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPolicy] (val x: Self) extends AnyVal {
    
    inline def setAdvancedOptionsConfig(value: SecurityPolicyAdvancedOptionsConfig): Self = StObject.set(x, "advancedOptionsConfig", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsConfigUndefined: Self = StObject.set(x, "advancedOptionsConfig", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: js.Array[SecurityPolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SecurityPolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
