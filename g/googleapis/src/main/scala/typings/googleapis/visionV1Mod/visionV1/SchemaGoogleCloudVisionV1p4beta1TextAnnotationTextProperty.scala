package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty extends StObject {
  
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak] = js.undefined
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty](x: Self) {
    
    inline def setDetectedBreak(value: SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    inline def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
  }
}
