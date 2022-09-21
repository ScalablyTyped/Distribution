package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaCatalogAttribute extends StObject {
  
  /**
    * If DYNAMIC_FACETABLE_ENABLED, attribute values are available for dynamic facet. Could only be DYNAMIC_FACETABLE_DISABLED if CatalogAttribute.indexable_option is INDEXABLE_DISABLED. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var dynamicFacetableOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If EXACT_SEARCHABLE_ENABLED, attribute values will be exact searchable. This property only applies to textual custom attributes and requires indexable set to enabled to enable exact-searchable.
    */
  var exactSearchableOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether this attribute has been used by any products. `True` if at least one Product is using this attribute in Product.attributes. Otherwise, this field is `False`. CatalogAttribute can be pre-loaded by using CatalogService.AddCatalogAttribute, CatalogService.ImportCatalogAttributes, or CatalogService.UpdateAttributesConfig APIs. This field is `False` for pre-loaded CatalogAttributes. Only pre-loaded CatalogAttributes that are neither in use by products nor predefined can be deleted. CatalogAttributes that are either in use by products or are predefined cannot be deleted; however, their configuration properties will reset to default values upon removal request. After catalog changes, it takes about 10 minutes for this field to update.
    */
  var inUse: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if INDEXABLE_ENABLED attribute values are indexed so that it can be filtered, faceted, or boosted in SearchService.Search.
    */
  var indexableOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Attribute name. For example: `color`, `brands`, `attributes.custom_attribute`, such as `attributes.xyz`. To be indexable, the attribute name can contain only alpha-numeric characters and underscores. For example, an attribute named `attributes.abc_xyz` can be indexed, but an attribute named `attributes.abc-xyz` cannot be indexed.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if RECOMMENDATIONS_FILTERING_ENABLED, attribute values are filterable for recommendations. This option works for categorical features only, does not work for numerical features, inventory filtering.
    */
  var recommendationsFilteringOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When AttributesConfig.attribute_config_level is CATALOG_LEVEL_ATTRIBUTE_CONFIG, if SEARCHABLE_ENABLED, attribute values are searchable by text queries in SearchService.Search. If SEARCHABLE_ENABLED but attribute type is numerical, attribute values will not be searchable by text queries in SearchService.Search, as there are no text values associated to numerical attributes.
    */
  var searchableOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of this attribute. This is derived from the attribute in Product.attributes.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaCatalogAttribute {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaCatalogAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaCatalogAttribute]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaCatalogAttribute](x: Self) {
    
    inline def setDynamicFacetableOption(value: String): Self = StObject.set(x, "dynamicFacetableOption", value.asInstanceOf[js.Any])
    
    inline def setDynamicFacetableOptionNull: Self = StObject.set(x, "dynamicFacetableOption", null)
    
    inline def setDynamicFacetableOptionUndefined: Self = StObject.set(x, "dynamicFacetableOption", js.undefined)
    
    inline def setExactSearchableOption(value: String): Self = StObject.set(x, "exactSearchableOption", value.asInstanceOf[js.Any])
    
    inline def setExactSearchableOptionNull: Self = StObject.set(x, "exactSearchableOption", null)
    
    inline def setExactSearchableOptionUndefined: Self = StObject.set(x, "exactSearchableOption", js.undefined)
    
    inline def setInUse(value: Boolean): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
    
    inline def setInUseNull: Self = StObject.set(x, "inUse", null)
    
    inline def setInUseUndefined: Self = StObject.set(x, "inUse", js.undefined)
    
    inline def setIndexableOption(value: String): Self = StObject.set(x, "indexableOption", value.asInstanceOf[js.Any])
    
    inline def setIndexableOptionNull: Self = StObject.set(x, "indexableOption", null)
    
    inline def setIndexableOptionUndefined: Self = StObject.set(x, "indexableOption", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRecommendationsFilteringOption(value: String): Self = StObject.set(x, "recommendationsFilteringOption", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsFilteringOptionNull: Self = StObject.set(x, "recommendationsFilteringOption", null)
    
    inline def setRecommendationsFilteringOptionUndefined: Self = StObject.set(x, "recommendationsFilteringOption", js.undefined)
    
    inline def setSearchableOption(value: String): Self = StObject.set(x, "searchableOption", value.asInstanceOf[js.Any])
    
    inline def setSearchableOptionNull: Self = StObject.set(x, "searchableOption", null)
    
    inline def setSearchableOptionUndefined: Self = StObject.set(x, "searchableOption", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
