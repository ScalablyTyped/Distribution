package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy extends StObject {
  
  /**
    * Required. Catalog item categories. Each category should be a UTF-8 encoded string with a length limit of 2 KiB. Note that the order in the list denotes the specificity (from least to most specific).
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
  }
}
