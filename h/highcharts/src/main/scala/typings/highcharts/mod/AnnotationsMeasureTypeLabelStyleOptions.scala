package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureTypeLabelStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[String] = js.undefined
}
object AnnotationsMeasureTypeLabelStyleOptions {
  
  @scala.inline
  def apply(): AnnotationsMeasureTypeLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelStyleOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureTypeLabelStyleOptionsMutableBuilder[Self <: AnnotationsMeasureTypeLabelStyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
