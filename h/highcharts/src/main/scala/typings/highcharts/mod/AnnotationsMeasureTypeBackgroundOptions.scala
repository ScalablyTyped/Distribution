package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureTypeBackgroundOptions extends StObject {
  
  /**
    * (Highstock) The color of the rectangle.
    */
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The color of border.
    */
  var stroke: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The width of border.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object AnnotationsMeasureTypeBackgroundOptions {
  
  @scala.inline
  def apply(): AnnotationsMeasureTypeBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeBackgroundOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureTypeBackgroundOptionsMutableBuilder[Self <: AnnotationsMeasureTypeBackgroundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
