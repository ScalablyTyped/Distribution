package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of dominant colors and their corresponding scores.
  */
trait SchemaGoogleCloudVisionV1p4beta1DominantColorsAnnotation extends StObject {
  
  /**
    * RGB color values with their score and pixel fraction.
    */
  var colors: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1ColorInfo]] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1DominantColorsAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1DominantColorsAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1DominantColorsAnnotation](x: Self) {
    
    inline def setColors(value: js.Array[SchemaGoogleCloudVisionV1p4beta1ColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: SchemaGoogleCloudVisionV1p4beta1ColorInfo*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
