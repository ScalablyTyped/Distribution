package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendBubbleLegendLabelsOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
    * the bubble legend. Can be one of `left`, `center` or `right`.
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
    * overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend label graphical elements. This option does not replace
    * default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
    * labels. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) Available `this` properties are:
    *
    * - `this.value`: The bubble value.
    *
    * - `this.radius`: The radius of the bubble range.
    *
    * - `this.center`: The center y position of the range.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[BubbleLegendFormatterContextObject]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
    */
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The x position offset of the label
    * relative to the connector.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps) The y position offset of the label
    * relative to the connector.
    */
  var y: js.UndefOr[Double] = js.native
}
object LegendBubbleLegendLabelsOptions {
  
  @scala.inline
  def apply(): LegendBubbleLegendLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBubbleLegendLabelsOptions]
  }
  
  @scala.inline
  implicit class LegendBubbleLegendLabelsOptionsOps[Self <: LegendBubbleLegendLabelsOptions] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverlap: Self = this.set("allowOverlap", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[BubbleLegendFormatterContextObject]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
