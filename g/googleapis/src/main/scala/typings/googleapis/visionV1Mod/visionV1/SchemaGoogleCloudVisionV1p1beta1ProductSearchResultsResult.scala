package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a product.
  */
trait SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult extends StObject {
  
  /**
    * The resource name of the image from the product that is the closest match
    * to the query.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * The Product.
    */
  var product: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Product] = js.undefined
  
  /**
    * A confidence level on the match, ranging from 0 (no confidence) to 1
    * (full confidence).
    */
  var score: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setProduct(value: SchemaGoogleCloudVisionV1p1beta1Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
