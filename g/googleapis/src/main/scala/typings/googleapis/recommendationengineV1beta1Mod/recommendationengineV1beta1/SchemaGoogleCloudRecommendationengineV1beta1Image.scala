package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1Image extends StObject {
  
  /**
    * Optional. Height of the image in number of pixels.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. URL of the image with a length limit of 5 KiB.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Width of the image in number of pixels.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1Image {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1Image]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1Image](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
