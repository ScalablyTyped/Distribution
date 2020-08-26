package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAxisCurrentDateIndicatorLabelOptions extends js.Object {
  /**
    * (Gantt) Horizontal alignment of the label. Can be one of "left", "center"
    * or "right".
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Gantt) Format of the label. This options is passed as the fist argument
    * to dateFormat function.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Gantt) Callback JavaScript function to format the label. Useful
    * properties like the value of plot line or the range of plot band (`from`
    * & `to` properties) can be found in `this.options` object.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[PlotLineOrBand]] = js.native
  /**
    * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
    * horizontal plot lines and 90 for vertical lines.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * (Gantt) CSS styles for the text label.
    *
    * In styled mode, the labels are styled by the
    * `.highcharts-plot-line-label` class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Gantt) The text itself. A subset of HTML is supported.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Gantt) The text alignment for the label. While `align` determines where
    * the texts anchor point is placed within the plot band, `textAlign`
    * determines how the text is aligned against its anchor point. Possible
    * values are "left", "center" and "right". Defaults to the same as the
    * `align` option.
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
  /**
    * (Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) Vertical alignment of the label relative to the plot line. Can be
    * one of "top", "middle" or "bottom".
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Gantt) Horizontal position relative the alignment. Default varies by
    * orientation.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Vertical position of the text baseline relative to the alignment.
    * Default varies by orientation.
    */
  var y: js.UndefOr[Double] = js.native
}

object XAxisCurrentDateIndicatorLabelOptions {
  @scala.inline
  def apply(): XAxisCurrentDateIndicatorLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisCurrentDateIndicatorLabelOptions]
  }
  @scala.inline
  implicit class XAxisCurrentDateIndicatorLabelOptionsOps[Self <: XAxisCurrentDateIndicatorLabelOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[PlotLineOrBand]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlign(value: AlignValue): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
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

