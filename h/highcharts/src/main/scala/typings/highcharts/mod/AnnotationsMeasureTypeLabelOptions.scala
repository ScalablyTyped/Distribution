package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsMeasureTypeLabelOptions extends StObject {
  
  /**
    * (Highstock) Enable or disable the label text (min, max, average, bins
    * values).
    *
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) Formatter function for the label text.
    *
    * Available data are:
    *
    *  (see online documentation for example)
    */
  var formatter: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highstock) CSS styles for the measure label.
    */
  var style: js.UndefOr[AnnotationsMeasureTypeLabelStyleOptions | CSSObject] = js.undefined
}
object AnnotationsMeasureTypeLabelOptions {
  
  @scala.inline
  def apply(): AnnotationsMeasureTypeLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsMeasureTypeLabelOptions]
  }
  
  @scala.inline
  implicit class AnnotationsMeasureTypeLabelOptionsMutableBuilder[Self <: AnnotationsMeasureTypeLabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormatter(value: js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setStyle(value: AnnotationsMeasureTypeLabelStyleOptions | CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
