package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  inline def apply(): SchemaTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextProperty]
  }
  
  extension [Self <: SchemaTextProperty](x: Self) {
    
    inline def setDetectedBreak(value: SchemaDetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    inline def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    inline def setDetectedLanguages(value: js.Array[SchemaDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
  }
}
