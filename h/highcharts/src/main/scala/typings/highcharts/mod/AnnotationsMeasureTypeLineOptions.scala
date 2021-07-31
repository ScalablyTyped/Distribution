package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureTypeLineOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
}
object AnnotationsMeasureTypeLineOptions {
  
  @scala.inline
  def apply(): AnnotationsMeasureTypeLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLineOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureTypeLineOptionsMutableBuilder[Self <: AnnotationsMeasureTypeLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
