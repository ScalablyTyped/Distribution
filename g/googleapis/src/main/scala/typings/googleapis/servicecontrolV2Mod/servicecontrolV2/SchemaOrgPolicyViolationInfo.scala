package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrgPolicyViolationInfo extends StObject {
  
  /**
    * Optional. Resource payload that is currently in scope and is subjected to orgpolicy conditions. This payload may be the subset of the actual Resource that may come in the request. This payload should not contain any core content.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Optional. Tags referenced on the resource at the time of evaluation. These also include the federated tags, if they are supplied in the CheckOrgPolicy or CheckCustomConstraints Requests. Optional field as of now. These tags are the Cloud tags that are available on the resource during the policy evaluation and will be available as part of the OrgPolicy check response for logging purposes.
    */
  var resourceTags: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Resource type that the orgpolicy is checked against. Example: compute.googleapis.com/Instance, store.googleapis.com/bucket
    */
  var resourceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Policy violations
    */
  var violationInfo: js.UndefOr[js.Array[SchemaViolationInfo]] = js.undefined
}
object SchemaOrgPolicyViolationInfo {
  
  inline def apply(): SchemaOrgPolicyViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrgPolicyViolationInfo]
  }
  
  extension [Self <: SchemaOrgPolicyViolationInfo](x: Self) {
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setResourceTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsNull: Self = StObject.set(x, "resourceTags", null)
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setViolationInfo(value: js.Array[SchemaViolationInfo]): Self = StObject.set(x, "violationInfo", value.asInstanceOf[js.Any])
    
    inline def setViolationInfoUndefined: Self = StObject.set(x, "violationInfo", js.undefined)
    
    inline def setViolationInfoVarargs(value: SchemaViolationInfo*): Self = StObject.set(x, "violationInfo", js.Array(value*))
  }
}
