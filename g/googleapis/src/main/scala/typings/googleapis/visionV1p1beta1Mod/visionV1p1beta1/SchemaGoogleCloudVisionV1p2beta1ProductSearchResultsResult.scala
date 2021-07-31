package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a product.
  */
trait SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult extends StObject {
  
  /**
    * The resource name of the image from the product that is the closest match
    * to the query.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The Product.
    */
  var product: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1Product] = js.undefined
  
  /**
    * A confidence level on the match, ranging from 0 (no confidence) to 1
    * (full confidence).
    */
  var score: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResultMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setProduct(value: SchemaGoogleCloudVisionV1p2beta1Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
