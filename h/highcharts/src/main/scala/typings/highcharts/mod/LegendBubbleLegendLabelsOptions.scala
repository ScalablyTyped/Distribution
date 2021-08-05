package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendBubbleLegendLabelsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
    * the bubble legend. Can be one of `left`, `center` or `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
    * overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend label graphical elements. This option does not replace
    * default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
    * labels. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) Available `this` properties are:
    *
    * - `this.value`: The bubble value.
    *
    * - `this.radius`: The radius of the bubble range.
    *
    * - `this.center`: The center y position of the range.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[BubbleLegendFormatterContextObject]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The x position offset of the label
    * relative to the connector.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The y position offset of the label
    * relative to the connector.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object LegendBubbleLegendLabelsOptions {
  
  inline def apply(): LegendBubbleLegendLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBubbleLegendLabelsOptions]
  }
  
  extension [Self <: LegendBubbleLegendLabelsOptions](x: Self) {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
    
    inline def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: FormatterCallbackFunction[BubbleLegendFormatterContextObject]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
