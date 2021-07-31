package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional information detected on the structural component.
  */
trait SchemaTextProperty extends StObject {
  
  /**
    * Detected start or end of a text segment.
    */
  var detectedBreak: js.UndefOr[SchemaDetectedBreak] = js.undefined
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaDetectedLanguage]] = js.undefined
}
object SchemaTextProperty {
  
  @scala.inline
  def apply(): SchemaTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextProperty]
  }
  
  @scala.inline
  implicit class SchemaTextPropertyMutableBuilder[Self <: SchemaTextProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedBreak(value: SchemaDetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[SchemaDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: SchemaDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value :_*))
  }
}
