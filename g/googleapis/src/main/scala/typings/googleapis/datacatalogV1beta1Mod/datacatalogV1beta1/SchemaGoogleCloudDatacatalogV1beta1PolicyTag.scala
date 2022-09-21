package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1PolicyTag extends StObject {
  
  /**
    * Output only. Resource names of child policy tags of this policy tag.
    */
  var childPolicyTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Description of this policy tag. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description. If not set, defaults to an empty description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User defined name of this policy tag. It must: be unique within the parent taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this policy tag, whose format is: "projects/{project_number\}/locations/{location_id\}/taxonomies/{taxonomy_id\}/policyTags/{id\}".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag). If empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the "Geolocation" policy tag in the example above). If not set, defaults to an empty string.
    */
  var parentPolicyTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1PolicyTag {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1PolicyTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1PolicyTag]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1PolicyTag](x: Self) {
    
    inline def setChildPolicyTags(value: js.Array[String]): Self = StObject.set(x, "childPolicyTags", value.asInstanceOf[js.Any])
    
    inline def setChildPolicyTagsNull: Self = StObject.set(x, "childPolicyTags", null)
    
    inline def setChildPolicyTagsUndefined: Self = StObject.set(x, "childPolicyTags", js.undefined)
    
    inline def setChildPolicyTagsVarargs(value: String*): Self = StObject.set(x, "childPolicyTags", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentPolicyTag(value: String): Self = StObject.set(x, "parentPolicyTag", value.asInstanceOf[js.Any])
    
    inline def setParentPolicyTagNull: Self = StObject.set(x, "parentPolicyTag", null)
    
    inline def setParentPolicyTagUndefined: Self = StObject.set(x, "parentPolicyTag", js.undefined)
  }
}
