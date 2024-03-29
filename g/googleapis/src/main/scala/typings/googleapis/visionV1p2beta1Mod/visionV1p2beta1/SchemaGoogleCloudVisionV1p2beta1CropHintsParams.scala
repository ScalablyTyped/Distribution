package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1CropHintsParams extends StObject {
  
  /**
    * Aspect ratios in floats, representing the ratio of the width to the height of the image. For example, if the desired aspect ratio is 4/3, the corresponding float value should be 1.33333. If not specified, the best possible crop is returned. The number of provided aspect ratios is limited to a maximum of 16; any aspect ratios provided after the 16th are ignored.
    */
  var aspectRatios: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1CropHintsParams {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1CropHintsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1CropHintsParams]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1CropHintsParams](x: Self) {
    
    inline def setAspectRatios(value: js.Array[Double]): Self = StObject.set(x, "aspectRatios", value.asInstanceOf[js.Any])
    
    inline def setAspectRatiosNull: Self = StObject.set(x, "aspectRatios", null)
    
    inline def setAspectRatiosUndefined: Self = StObject.set(x, "aspectRatios", js.undefined)
    
    inline def setAspectRatiosVarargs(value: Double*): Self = StObject.set(x, "aspectRatios", js.Array(value*))
  }
}
