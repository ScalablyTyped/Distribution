package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for a product search request.
  */
trait SchemaGoogleCloudVisionV1p1beta1ProductSearchParams extends StObject {
  
  /**
    * The bounding polygon around the area of interest in the image. Optional.
    * If it is not specified, system discretion will be applied.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1BoundingPoly] = js.undefined
  
  /**
    * The filtering expression. This can be used to restrict search results
    * based on Product labels. We currently support an AND of OR of key-value
    * expressions, where each expression within an OR must have the same key.
    * For example, &quot;(color = red OR color = blue) AND brand = Google&quot;
    * is acceptable, but not &quot;(color = red OR brand = Google)&quot; or
    * &quot;color: red&quot;.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The list of product categories to search in. Currently, we only consider
    * the first category, and either &quot;homegoods&quot;,
    * &quot;apparel&quot;, or &quot;toys&quot; should be specified.
    */
  var productCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The resource name of a ProductSet to be searched for similar images.
    * Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
    */
  var productSet: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1ProductSearchParams {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1ProductSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchParams]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1ProductSearchParamsMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1ProductSearchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: SchemaGoogleCloudVisionV1p1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setProductCategories(value: js.Array[String]): Self = StObject.set(x, "productCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCategoriesUndefined: Self = StObject.set(x, "productCategories", js.undefined)
    
    @scala.inline
    def setProductCategoriesVarargs(value: String*): Self = StObject.set(x, "productCategories", js.Array(value :_*))
    
    @scala.inline
    def setProductSet(value: String): Self = StObject.set(x, "productSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetUndefined: Self = StObject.set(x, "productSet", js.undefined)
  }
}
