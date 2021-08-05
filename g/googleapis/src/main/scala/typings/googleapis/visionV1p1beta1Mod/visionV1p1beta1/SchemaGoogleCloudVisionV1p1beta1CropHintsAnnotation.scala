package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of crop hints that are used to generate new crops when serving images.
  */
trait SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation extends StObject {
  
  /**
    * Crop hint results.
    */
  var cropHints: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1CropHint]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1CropHintsAnnotation](x: Self) {
    
    inline def setCropHints(value: js.Array[SchemaGoogleCloudVisionV1p1beta1CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    inline def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    inline def setCropHintsVarargs(value: SchemaGoogleCloudVisionV1p1beta1CropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
