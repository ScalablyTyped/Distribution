package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1CatalogItem extends StObject {
  
  /**
    * Required. Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs to both ["Shoes & Accessories" -\> "Shoes"] and ["Sports & Fitness" -\> "Athletic Clothing" -\> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes & Accessories", "Shoes"]\}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] \} ]
    */
  var categoryHierarchies: js.UndefOr[
    js.Array[SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]
  ] = js.undefined
  
  /**
    * Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be used when logging user events in order for the user events to be joined with the Catalog.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
    */
  var itemAttributes: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1FeatureMap] = js.undefined
  
  /**
    * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
    */
  var itemGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in multiple languages can result in degraded model performance.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Metadata specific to retail products.
    */
  var productMetadata: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem] = js.undefined
  
  /**
    * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation results by passing the tag as part of the predict request filter.
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Catalog item title. UTF-8 encoded string with a length limit of 1 KiB.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1CatalogItem {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1CatalogItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1CatalogItem](x: Self) {
    
    inline def setCategoryHierarchies(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]): Self = StObject.set(x, "categoryHierarchies", value.asInstanceOf[js.Any])
    
    inline def setCategoryHierarchiesUndefined: Self = StObject.set(x, "categoryHierarchies", js.undefined)
    
    inline def setCategoryHierarchiesVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy*): Self = StObject.set(x, "categoryHierarchies", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemAttributes(value: SchemaGoogleCloudRecommendationengineV1beta1FeatureMap): Self = StObject.set(x, "itemAttributes", value.asInstanceOf[js.Any])
    
    inline def setItemAttributesUndefined: Self = StObject.set(x, "itemAttributes", js.undefined)
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdNull: Self = StObject.set(x, "itemGroupId", null)
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setProductMetadata(value: SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem): Self = StObject.set(x, "productMetadata", value.asInstanceOf[js.Any])
    
    inline def setProductMetadataUndefined: Self = StObject.set(x, "productMetadata", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
