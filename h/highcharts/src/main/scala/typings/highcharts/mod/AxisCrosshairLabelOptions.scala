package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisCrosshairLabelOptions extends StObject {
  
  /**
    * (Highstock) Alignment of the label compared to the axis. Defaults to
    * `"left"` for right-side axes, `"right"` for left-side axes and `"center"`
    * for horizontal axes.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highstock) The background color for the label. Defaults to the related
    * series color, or `#666666` if that is not available.
    */
  var backgroundColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock) The border color for the crosshair label
    */
  var borderColor: js.UndefOr[ColorType] = js.undefined
  
  /**
    * (Highstock) The border corner radius of the crosshair label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The border width for the crosshair label.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Flag to enable crosshair's label.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) A format string for the crosshair label. Defaults to
    * `{value}` for numeric axes and `{value:%b %d, %Y}` for datetime axes.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Formatter function for the label text.
    */
  var formatter: js.UndefOr[XAxisCrosshairLabelFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Padding inside the crosshair label.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The shape to use for the label box.
    */
  var shape: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Text styles for the crosshair label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}
object AxisCrosshairLabelOptions {
  
  @scala.inline
  def apply(): AxisCrosshairLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisCrosshairLabelOptions]
  }
  
  @scala.inline
  implicit class AxisCrosshairLabelOptionsMutableBuilder[Self <: AxisCrosshairLabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorType): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: ColorType): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: XAxisCrosshairLabelFormatterCallbackFunction): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
