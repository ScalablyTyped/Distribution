package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation extends StObject {
  
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1DominantColorsAnnotation](x: Self) {
    
    inline def setColors(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: SchemaGoogleCloudVisionV1p1beta1ColorInfo*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
