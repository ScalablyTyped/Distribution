package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1SerializedPolicyTag extends StObject {
  
  /**
    * Children of the policy tag, if any.
    */
  var childPolicyTags: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1SerializedPolicyTag]] = js.undefined
  
  /**
    * Description of the serialized policy tag. At most 2000 bytes when encoded in UTF-8. If not set, defaults to an empty description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name of the policy tag. At most 200 bytes when encoded in UTF-8.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the policy tag. This field is ignored when calling `ImportTaxonomies`.
    */
  var policyTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1SerializedPolicyTag {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1SerializedPolicyTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1SerializedPolicyTag]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1SerializedPolicyTag](x: Self) {
    
    inline def setChildPolicyTags(value: js.Array[SchemaGoogleCloudDatacatalogV1SerializedPolicyTag]): Self = StObject.set(x, "childPolicyTags", value.asInstanceOf[js.Any])
    
    inline def setChildPolicyTagsUndefined: Self = StObject.set(x, "childPolicyTags", js.undefined)
    
    inline def setChildPolicyTagsVarargs(value: SchemaGoogleCloudDatacatalogV1SerializedPolicyTag*): Self = StObject.set(x, "childPolicyTags", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPolicyTag(value: String): Self = StObject.set(x, "policyTag", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagNull: Self = StObject.set(x, "policyTag", null)
    
    inline def setPolicyTagUndefined: Self = StObject.set(x, "policyTag", js.undefined)
  }
}
