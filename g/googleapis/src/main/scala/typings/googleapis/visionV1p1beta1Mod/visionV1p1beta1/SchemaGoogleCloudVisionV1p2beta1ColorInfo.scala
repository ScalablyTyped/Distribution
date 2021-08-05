package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Color information consists of RGB channels, score, and the fraction of the
  * image that the color occupies in the image.
  */
trait SchemaGoogleCloudVisionV1p2beta1ColorInfo extends StObject {
  
  /**
    * RGB components of the color.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The fraction of pixels the color occupies in the image. Value in range
    * [0, 1].
    */
  var pixelFraction: js.UndefOr[Double] = js.undefined
  
  /**
    * Image-specific score for this color. Value in range [0, 1].
    */
  var score: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ColorInfo {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ColorInfo]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1ColorInfo](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPixelFraction(value: Double): Self = StObject.set(x, "pixelFraction", value.asInstanceOf[js.Any])
    
    inline def setPixelFractionUndefined: Self = StObject.set(x, "pixelFraction", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
