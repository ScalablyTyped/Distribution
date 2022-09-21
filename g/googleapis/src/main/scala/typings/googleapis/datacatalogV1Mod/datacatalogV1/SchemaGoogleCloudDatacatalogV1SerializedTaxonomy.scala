package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1SerializedTaxonomy extends StObject {
  
  /**
    * A list of policy types that are activated per taxonomy.
    */
  var activatedPolicyTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Description of the serialized taxonomy. At most 2000 bytes when encoded in UTF-8. If not set, defaults to an empty description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name of the taxonomy. At most 200 bytes when encoded in UTF-8.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Top level policy tags associated with the taxonomy, if any.
    */
  var policyTags: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1SerializedPolicyTag]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1SerializedTaxonomy {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1SerializedTaxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1SerializedTaxonomy]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1SerializedTaxonomy](x: Self) {
    
    inline def setActivatedPolicyTypes(value: js.Array[String]): Self = StObject.set(x, "activatedPolicyTypes", value.asInstanceOf[js.Any])
    
    inline def setActivatedPolicyTypesNull: Self = StObject.set(x, "activatedPolicyTypes", null)
    
    inline def setActivatedPolicyTypesUndefined: Self = StObject.set(x, "activatedPolicyTypes", js.undefined)
    
    inline def setActivatedPolicyTypesVarargs(value: String*): Self = StObject.set(x, "activatedPolicyTypes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPolicyTags(value: js.Array[SchemaGoogleCloudDatacatalogV1SerializedPolicyTag]): Self = StObject.set(x, "policyTags", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagsUndefined: Self = StObject.set(x, "policyTags", js.undefined)
    
    inline def setPolicyTagsVarargs(value: SchemaGoogleCloudDatacatalogV1SerializedPolicyTag*): Self = StObject.set(x, "policyTags", js.Array(value*))
  }
}
