package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendBubbleLegendOptions extends js.Object {
  
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
  implicit class LegendBubbleLegendOptionsOps[Self <: LegendBubbleLegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setConnectorClassName(value: String): Self = this.set("connectorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorClassName: Self = this.set("connectorClassName", js.undefined)
    
    @scala.inline
    def setConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("connectorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorColor: Self = this.set("connectorColor", js.undefined)
    
    @scala.inline
    def setConnectorDistance(value: Double): Self = this.set("connectorDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorDistance: Self = this.set("connectorDistance", js.undefined)
    
    @scala.inline
    def setConnectorWidth(value: Double): Self = this.set("connectorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorWidth: Self = this.set("connectorWidth", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setLabels(value: LegendBubbleLegendLabelsOptions): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLegendIndex(value: Double): Self = this.set("legendIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendIndex: Self = this.set("legendIndex", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: LegendBubbleLegendRangesOptions*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[LegendBubbleLegendRangesOptions]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    
    @scala.inline
    def setSizeBy(value: BubbleSizeByValue): Self = this.set("sizeBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBy: Self = this.set("sizeBy", js.undefined)
    
    @scala.inline
    def setSizeByAbsoluteValue(value: Boolean): Self = this.set("sizeByAbsoluteValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeByAbsoluteValue: Self = this.set("sizeByAbsoluteValue", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    
    @scala.inline
    def setZThreshold(value: Double): Self = this.set("zThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZThreshold: Self = this.set("zThreshold", js.undefined)
  }
}
