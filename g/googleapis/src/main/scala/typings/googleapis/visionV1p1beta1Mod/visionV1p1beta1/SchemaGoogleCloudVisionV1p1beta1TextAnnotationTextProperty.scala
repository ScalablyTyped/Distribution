package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional information detected on the structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty extends StObject {
  
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak] = js.native
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage]] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextPropertyMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1TextAnnotationTextProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedBreak(value: SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: SchemaGoogleCloudVisionV1p1beta1TextAnnotationDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value :_*))
  }
}
