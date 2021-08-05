package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityScreenReaderSectionAnnotationsOptions extends StObject {
  
  var descriptionMultiplePoints: js.UndefOr[String] = js.undefined
  
  var descriptionNoPoints: js.UndefOr[String] = js.undefined
  
  var descriptionSinglePoint: js.UndefOr[String] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
}
object LangAccessibilityScreenReaderSectionAnnotationsOptions {
  
  inline def apply(): LangAccessibilityScreenReaderSectionAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityScreenReaderSectionAnnotationsOptions]
  }
  
  extension [Self <: LangAccessibilityScreenReaderSectionAnnotationsOptions](x: Self) {
    
    inline def setDescriptionMultiplePoints(value: String): Self = StObject.set(x, "descriptionMultiplePoints", value.asInstanceOf[js.Any])
    
    inline def setDescriptionMultiplePointsUndefined: Self = StObject.set(x, "descriptionMultiplePoints", js.undefined)
    
    inline def setDescriptionNoPoints(value: String): Self = StObject.set(x, "descriptionNoPoints", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNoPointsUndefined: Self = StObject.set(x, "descriptionNoPoints", js.undefined)
    
    inline def setDescriptionSinglePoint(value: String): Self = StObject.set(x, "descriptionSinglePoint", value.asInstanceOf[js.Any])
    
    inline def setDescriptionSinglePointUndefined: Self = StObject.set(x, "descriptionSinglePoint", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
