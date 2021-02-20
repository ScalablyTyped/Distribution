package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendBubbleLegendOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
    * also defined for an individual range.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
    * pixels, can be also defined for an individual range.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend' circle graphical elements. This option does not
    * replace default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
    * Applies to ranges, if individual color is not defined.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend's connector graphical elements. This option does not
    * replace default class names of the graphical element.
    */
  var connectorClassName: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
    * defined for an individual range.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
    * If labels are centered, the distance is reduced to 0.
    */
  var connectorDistance: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
    */
  var connectorWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
    */
  var labels: js.UndefOr[LegendBubbleLegendLabelsOptions] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
    * the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
    * values for ranges are not specified, the `minSize` and the `maxSize` are
    * calculated from bubble series.
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
    * values for ranges are not specified, the `minSize` and the `maxSize` are
    * calculated from bubble series.
    */
  var minSize: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Options for specific range. One range
    * consists of bubble, label and connector.
    */
  var ranges: js.UndefOr[js.Array[LegendBubbleLegendRangesOptions]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
    * should be represented by the area or the width of the bubble. The
    * default, area, corresponds best to the human perception of the size of
    * each bubble.
    */
  var sizeBy: js.UndefOr[BubbleSizeByValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
    * of z determines the size of the bubble. This means that with the default
    * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
    * of value 1, while a bubble of value 0 will have a smaller size according
    * to minSize.
    */
  var sizeByAbsoluteValue: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
    * legend.
    */
  var zIndex: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
    * zThreshold, are skipped.
    */
  var zThreshold: js.UndefOr[Double] = js.native
}
object LegendBubbleLegendOptions {
  
  @scala.inline
  def apply(): LegendBubbleLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBubbleLegendOptions]
  }
  
  @scala.inline
  implicit class LegendBubbleLegendOptionsMutableBuilder[Self <: LegendBubbleLegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setConnectorClassName(value: String): Self = StObject.set(x, "connectorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorClassNameUndefined: Self = StObject.set(x, "connectorClassName", js.undefined)
    
    @scala.inline
    def setConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorDistance(value: Double): Self = StObject.set(x, "connectorDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorDistanceUndefined: Self = StObject.set(x, "connectorDistance", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = StObject.set(x, "connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorWidthUndefined: Self = StObject.set(x, "connectorWidth", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setLabels(value: LegendBubbleLegendLabelsOptions): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLegendIndex(value: Double): Self = StObject.set(x, "legendIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendIndexUndefined: Self = StObject.set(x, "legendIndex", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[LegendBubbleLegendRangesOptions]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: LegendBubbleLegendRangesOptions*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setSizeBy(value: BubbleSizeByValue): Self = StObject.set(x, "sizeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeByAbsoluteValue(value: Boolean): Self = StObject.set(x, "sizeByAbsoluteValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeByAbsoluteValueUndefined: Self = StObject.set(x, "sizeByAbsoluteValue", js.undefined)
    
    @scala.inline
    def setSizeByUndefined: Self = StObject.set(x, "sizeBy", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZThreshold(value: Double): Self = StObject.set(x, "zThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZThresholdUndefined: Self = StObject.set(x, "zThreshold", js.undefined)
  }
}
