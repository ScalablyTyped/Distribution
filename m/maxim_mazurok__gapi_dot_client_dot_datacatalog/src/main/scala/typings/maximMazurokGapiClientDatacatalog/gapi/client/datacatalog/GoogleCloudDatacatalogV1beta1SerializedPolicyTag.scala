package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1SerializedPolicyTag extends StObject {
  
  /** Children of the policy tag if any. */
  var childPolicyTags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]] = js.undefined
  
  /** Description of the serialized policy tag. The length of the description is limited to 2000 bytes when encoded in UTF-8. If not set, defaults to an empty description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Resource name of the policy tag. This field will be ignored when calling ImportTaxonomies. */
  var policyTag: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1SerializedPolicyTag {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1SerializedPolicyTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1SerializedPolicyTag](x: Self) {
    
    inline def setChildPolicyTags(value: js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]): Self = StObject.set(x, "childPolicyTags", value.asInstanceOf[js.Any])
    
    inline def setChildPolicyTagsUndefined: Self = StObject.set(x, "childPolicyTags", js.undefined)
    
    inline def setChildPolicyTagsVarargs(value: GoogleCloudDatacatalogV1beta1SerializedPolicyTag*): Self = StObject.set(x, "childPolicyTags", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPolicyTag(value: String): Self = StObject.set(x, "policyTag", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagUndefined: Self = StObject.set(x, "policyTag", js.undefined)
  }
}
