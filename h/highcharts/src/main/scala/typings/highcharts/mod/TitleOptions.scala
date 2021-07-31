package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * title. Can be one of "left", "center" and "right".
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When the title is floating, the
    * plot area will not move to make space for it.
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the title and
    * the plot area, or if a subtitle is present, the margin between the
    * subtitle and the plot area.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title. Use
    * this for font styling, but use `align`, `x` and `y` for text alignment.
    *
    * In styled mode, the title style is given in the `.highcharts-title`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The title of the chart. To
    * disable the title, set the `text` to `undefined`.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the text.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * title. Can be one of `"top"`, `"middle"` and `"bottom"`. When a value is
    * given, the title behaves as if floating were `true`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the title
    * width, normally to reserve space for the exporting burger menu.
    */
  var widthAdjust: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the title
    * relative to the alignment within `chart.spacingLeft` and
    * `chart.spacingRight`.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the title
    * relative to the alignment within chart.spacingTop and
    * chart.spacingBottom. By default it depends on the font size.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object TitleOptions {
  
  @scala.inline
  def apply(): TitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleOptions]
  }
  
  @scala.inline
  implicit class TitleOptionsMutableBuilder[Self <: TitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
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
    def setWidthAdjust(value: Double): Self = StObject.set(x, "widthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthAdjustUndefined: Self = StObject.set(x, "widthAdjust", js.undefined)
    
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
