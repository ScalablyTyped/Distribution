package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProduct extends StObject {
  
  /**
    * User-provided metadata to be stored with this product. Must be at most 4096 characters long.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-provided name for this Product. Must not be empty. Must be at most 4096 characters long.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the product. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. This field is ignored when creating a product.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The category for the product identified by the reference image. This should be one of "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1" or "general-v1". The legacy categories "homegoods", "apparel", and "toys" are still supported, but these should not be used for new products.
    */
  var productCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key-value pairs that can be attached to a product. At query time, constraints can be specified based on the product_labels. Note that integer values can be provided as strings, e.g. "1199". Only strings with integer values can match a range-based restriction which is to be supported soon. Multiple values can be assigned to the same key. One product may have up to 500 product_labels. Notice that the total number of distinct product_labels over all products in one ProductSet cannot exceed 1M, otherwise the product search pipeline will refuse to work for that ProductSet.
    */
  var productLabels: js.UndefOr[js.Array[SchemaKeyValue]] = js.undefined
}
object SchemaProduct {
  
  inline def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  extension [Self <: SchemaProduct](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProductCategory(value: String): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductCategoryNull: Self = StObject.set(x, "productCategory", null)
    
    inline def setProductCategoryUndefined: Self = StObject.set(x, "productCategory", js.undefined)
    
    inline def setProductLabels(value: js.Array[SchemaKeyValue]): Self = StObject.set(x, "productLabels", value.asInstanceOf[js.Any])
    
    inline def setProductLabelsUndefined: Self = StObject.set(x, "productLabels", js.undefined)
    
    inline def setProductLabelsVarargs(value: SchemaKeyValue*): Self = StObject.set(x, "productLabels", js.Array(value*))
  }
}
