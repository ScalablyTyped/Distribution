package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * caption. Can be one of "left", "center" and "right".
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When the caption is floating,
    * the plot area will not move to make space for it.
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The margin between the caption
    * and the plot area.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the caption.
    *
    * In styled mode, the caption style is given in the `.highcharts-caption`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The caption text of the chart.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the text.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * caption. Can be one of `"top"`, `"middle"` and `"bottom"`. When middle,
    * the caption behaves as floating.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the caption
    * relative to the alignment within `chart.spacingLeft` and
    * `chart.spacingRight`.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the caption
    * relative to the alignment within `chart.spacingTop` and
    * `chart.spacingBottom`.
    */
  var y: js.UndefOr[Double] = js.native
}

object CaptionOptions {
  @scala.inline
  def apply(): CaptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionOptions]
  }
  @scala.inline
  implicit class CaptionOptionsOps[Self <: CaptionOptions] (val x: Self) extends AnyVal {
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
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUseHTML(value: Boolean): Self = this.set("useHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHTML: Self = this.set("useHTML", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
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

