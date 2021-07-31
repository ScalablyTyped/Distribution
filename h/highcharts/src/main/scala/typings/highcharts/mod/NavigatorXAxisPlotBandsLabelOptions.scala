package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorXAxisPlotBandsLabelOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
    * one of "left", "center" or "right".
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) CSS styles for the text label.
    *
    * In styled mode, the labels are styled by the
    * `.highcharts-plot-band-label` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
    * is supported.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The text alignment for the label. While
    * `align` determines where the texts anchor point is placed within the plot
    * band, `textAlign` determines how the text is aligned against its anchor
    * point. Possible values are "left", "center" and "right". Defaults to the
    * same as the `align` option.
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
    * to the plot band. Can be one of "top", "middle" or "bottom".
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Horizontal position relative the
    * alignment. Default varies by orientation.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
    * relative to the alignment. Default varies by orientation.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object NavigatorXAxisPlotBandsLabelOptions {
  
  @scala.inline
  def apply(): NavigatorXAxisPlotBandsLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisPlotBandsLabelOptions]
  }
  
  @scala.inline
  implicit class NavigatorXAxisPlotBandsLabelOptionsMutableBuilder[Self <: NavigatorXAxisPlotBandsLabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
