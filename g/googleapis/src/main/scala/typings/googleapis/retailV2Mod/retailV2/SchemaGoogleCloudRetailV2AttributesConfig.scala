package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2AttributesConfig extends StObject {
  
  /**
    * Output only. The AttributeConfigLevel used for this catalog.
    */
  var attributeConfigLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Enable attribute(s) config at catalog level. For example, indexable, dynamic_facetable, or searchable for each attribute. The key is catalog attribute's name. For example: `color`, `brands`, `attributes.custom_attribute`, such as `attributes.xyz`. The maximum number of catalog attributes allowed in a request is 1000.
    */
  var catalogAttributes: js.UndefOr[StringDictionary[SchemaGoogleCloudRetailV2CatalogAttribute] | Null] = js.undefined
  
  /**
    * Required. Immutable. The fully qualified resource name of the attribute config. Format: `projects/x/locations/x/catalogs/x/attributesConfig`
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2AttributesConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2AttributesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2AttributesConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2AttributesConfig](x: Self) {
    
    inline def setAttributeConfigLevel(value: String): Self = StObject.set(x, "attributeConfigLevel", value.asInstanceOf[js.Any])
    
    inline def setAttributeConfigLevelNull: Self = StObject.set(x, "attributeConfigLevel", null)
    
    inline def setAttributeConfigLevelUndefined: Self = StObject.set(x, "attributeConfigLevel", js.undefined)
    
    inline def setCatalogAttributes(value: StringDictionary[SchemaGoogleCloudRetailV2CatalogAttribute]): Self = StObject.set(x, "catalogAttributes", value.asInstanceOf[js.Any])
    
    inline def setCatalogAttributesNull: Self = StObject.set(x, "catalogAttributes", null)
    
    inline def setCatalogAttributesUndefined: Self = StObject.set(x, "catalogAttributes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
