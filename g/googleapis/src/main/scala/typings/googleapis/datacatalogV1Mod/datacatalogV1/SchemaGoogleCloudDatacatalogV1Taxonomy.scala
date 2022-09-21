package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1Taxonomy extends StObject {
  
  /**
    * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
    */
  var activatedPolicyTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Description of this taxonomy. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns, and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User-defined name of this taxonomy. The name can't start or end with spaces, must contain only Unicode letters, numbers, underscores, dashes, and spaces, and be at most 200 bytes long when encoded in UTF-8. The taxonomy display name must be unique within an organization.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this taxonomy in URL format. Note: Policy tag manager generates unique taxonomy IDs.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of policy tags in this taxonomy.
    */
  var policyTagCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. Creation and modification timestamps of this taxonomy.
    */
  var taxonomyTimestamps: js.UndefOr[SchemaGoogleCloudDatacatalogV1SystemTimestamps] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1Taxonomy {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1Taxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1Taxonomy]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1Taxonomy](x: Self) {
    
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicyTagCount(value: Double): Self = StObject.set(x, "policyTagCount", value.asInstanceOf[js.Any])
    
    inline def setPolicyTagCountNull: Self = StObject.set(x, "policyTagCount", null)
    
    inline def setPolicyTagCountUndefined: Self = StObject.set(x, "policyTagCount", js.undefined)
    
    inline def setTaxonomyTimestamps(value: SchemaGoogleCloudDatacatalogV1SystemTimestamps): Self = StObject.set(x, "taxonomyTimestamps", value.asInstanceOf[js.Any])
    
    inline def setTaxonomyTimestampsUndefined: Self = StObject.set(x, "taxonomyTimestamps", js.undefined)
  }
}
