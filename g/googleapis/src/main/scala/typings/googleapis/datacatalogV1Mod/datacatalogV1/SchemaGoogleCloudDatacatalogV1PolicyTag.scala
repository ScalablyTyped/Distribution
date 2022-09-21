package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1PolicyTag extends StObject {
  
  /**
    * Output only. Resource names of child policy tags of this policy tag.
    */
  var childPolicyTags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Description of this policy tag. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User-defined name of this policy tag. The name can't start or end with spaces and must be unique within the parent taxonomy, contain only Unicode letters, numbers, underscores, dashes and spaces, and be at most 200 bytes long when encoded in UTF-8.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this policy tag in the URL format. The policy tag manager generates unique taxonomy IDs and policy tag IDs.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of this policy tag's parent policy tag. If empty, this is a top level tag. If not set, defaults to an empty string. For example, for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag, and, for "Geolocation", this field is empty.
    */
  var parentPolicyTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1PolicyTag {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1PolicyTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1PolicyTag]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1PolicyTag](x: Self) {
    
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
