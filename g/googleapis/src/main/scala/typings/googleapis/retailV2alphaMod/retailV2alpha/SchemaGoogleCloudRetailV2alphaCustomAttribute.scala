package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaCustomAttribute extends StObject {
  
  /**
    * This field is normally ignored unless AttributesConfig.attribute_config_level of the Catalog is set to the deprecated 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG' mode. For information about product-level attribute configuration, see [Configuration modes](https://cloud.google.com/retail/docs/attribute-config#config-modes). If true, custom attribute values are indexed, so that they can be filtered, faceted or boosted in SearchService.Search. This field is ignored in a UserEvent. See SearchRequest.filter, SearchRequest.facet_specs and SearchRequest.boost_spec for more details.
    */
  var indexable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The numerical values of this custom attribute. For example, `[2.3, 15.4]` when the key is "lengths_cm". Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var numbers: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * This field is normally ignored unless AttributesConfig.attribute_config_level of the Catalog is set to the deprecated 'PRODUCT_LEVEL_ATTRIBUTE_CONFIG' mode. For information about product-level attribute configuration, see [Configuration modes](https://cloud.google.com/retail/docs/attribute-config#config-modes). If true, custom attribute values are searchable by text queries in SearchService.Search. This field is ignored in a UserEvent. Only set if type text is set. Otherwise, a INVALID_ARGUMENT error is returned.
    */
  var searchable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The textual values of this custom attribute. For example, `["yellow", "green"]` when the key is "color". Empty string is not allowed. Otherwise, an INVALID_ARGUMENT error is returned. Exactly one of text or numbers should be set. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var text: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaCustomAttribute {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaCustomAttribute]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaCustomAttribute](x: Self) {
    
    inline def setIndexable(value: Boolean): Self = StObject.set(x, "indexable", value.asInstanceOf[js.Any])
    
    inline def setIndexableNull: Self = StObject.set(x, "indexable", null)
    
    inline def setIndexableUndefined: Self = StObject.set(x, "indexable", js.undefined)
    
    inline def setNumbers(value: js.Array[Double]): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    inline def setNumbersNull: Self = StObject.set(x, "numbers", null)
    
    inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
    
    inline def setNumbersVarargs(value: Double*): Self = StObject.set(x, "numbers", js.Array(value*))
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableNull: Self = StObject.set(x, "searchable", null)
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
  }
}
