package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1ColorInfo extends StObject {
  
  /**
    * RGB components of the color.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The fraction of pixels the color occupies in the image. Value in range [0, 1].
    */
  var pixelFraction: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Image-specific score for this color. Value in range [0, 1].
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1ColorInfo {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ColorInfo]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1ColorInfo](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPixelFraction(value: Double): Self = StObject.set(x, "pixelFraction", value.asInstanceOf[js.Any])
    
    inline def setPixelFractionNull: Self = StObject.set(x, "pixelFraction", null)
    
    inline def setPixelFractionUndefined: Self = StObject.set(x, "pixelFraction", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
