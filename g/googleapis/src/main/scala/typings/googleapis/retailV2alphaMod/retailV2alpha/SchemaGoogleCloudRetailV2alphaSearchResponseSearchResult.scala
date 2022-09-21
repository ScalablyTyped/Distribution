package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult extends StObject {
  
  /**
    * Product.id of the searched Product.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of matched variant Products.
    */
  var matchingVariantCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If a variant Product matches the search query, this map indicates which Product fields are matched. The key is the Product.name, the value is a field mask of the matched Product fields. If matched attributes cannot be determined, this map will be empty. For example, a key "sku1" with field mask "products.color_info" indicates there is a match between "sku1" ColorInfo and the query.
    */
  var matchingVariantFields: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Specifies previous events related to this product for this user based on UserEvent with same SearchRequest.visitor_id or UserInfo.user_id. This is set only when SearchRequest.PersonalizationSpec.mode is SearchRequest.PersonalizationSpec.Mode.AUTO. Possible values: * `purchased`: Indicates that this product has been purchased before.
    */
  var personalLabels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The product data snippet in the search response. Only Product.name is guaranteed to be populated. Product.variants contains the product variants that match the search query. If there are multiple product variants matching the query, top 5 most relevant product variants are returned and ordered by relevancy. If relevancy can be deternmined, use matching_variant_fields to look up matched product variants fields. If relevancy cannot be determined, e.g. when searching "shoe" all products in a shoe product can be a match, 5 product variants are returned but order is meaningless.
    */
  var product: js.UndefOr[SchemaGoogleCloudRetailV2alphaProduct] = js.undefined
  
  /**
    * The rollup matching variant Product attributes. The key is one of the SearchRequest.variant_rollup_keys. The values are the merged and de-duplicated Product attributes. Notice that the rollup values are respect filter. For example, when filtering by "colorFamilies:ANY(\"red\")" and rollup "colorFamilies", only "red" is returned. For textual and numerical attributes, the rollup values is a list of string or double values with type google.protobuf.ListValue. For example, if there are two variants with colors "red" and "blue", the rollup values are { key: "colorFamilies" value { list_value { values { string_value: "red" \} values { string_value: "blue" \} \} \} \} For FulfillmentInfo, the rollup values is a double value with type google.protobuf.Value. For example, `{key: "pickupInStore.store1" value { number_value: 10 \}\}` means a there are 10 variants in this product are available in the store "store1".
    */
  var variantRollupValues: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaSearchResponseSearchResult](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMatchingVariantCount(value: Double): Self = StObject.set(x, "matchingVariantCount", value.asInstanceOf[js.Any])
    
    inline def setMatchingVariantCountNull: Self = StObject.set(x, "matchingVariantCount", null)
    
    inline def setMatchingVariantCountUndefined: Self = StObject.set(x, "matchingVariantCount", js.undefined)
    
    inline def setMatchingVariantFields(value: StringDictionary[String]): Self = StObject.set(x, "matchingVariantFields", value.asInstanceOf[js.Any])
    
    inline def setMatchingVariantFieldsNull: Self = StObject.set(x, "matchingVariantFields", null)
    
    inline def setMatchingVariantFieldsUndefined: Self = StObject.set(x, "matchingVariantFields", js.undefined)
    
    inline def setPersonalLabels(value: js.Array[String]): Self = StObject.set(x, "personalLabels", value.asInstanceOf[js.Any])
    
    inline def setPersonalLabelsNull: Self = StObject.set(x, "personalLabels", null)
    
    inline def setPersonalLabelsUndefined: Self = StObject.set(x, "personalLabels", js.undefined)
    
    inline def setPersonalLabelsVarargs(value: String*): Self = StObject.set(x, "personalLabels", js.Array(value*))
    
    inline def setProduct(value: SchemaGoogleCloudRetailV2alphaProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setVariantRollupValues(value: StringDictionary[Any]): Self = StObject.set(x, "variantRollupValues", value.asInstanceOf[js.Any])
    
    inline def setVariantRollupValuesNull: Self = StObject.set(x, "variantRollupValues", null)
    
    inline def setVariantRollupValuesUndefined: Self = StObject.set(x, "variantRollupValues", js.undefined)
  }
}
