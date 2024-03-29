package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1ImageProperties extends StObject {
  
  /**
    * If present, dominant colors completed successfully.
    */
  var dominantColors: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1DominantColorsAnnotation] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ImageProperties {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ImageProperties]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1ImageProperties](x: Self) {
    
    inline def setDominantColors(value: SchemaGoogleCloudVisionV1p2beta1DominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
