package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorYAxisStackLabelsOptions extends js.Object {
  /**
    * (Highcharts) Defines the horizontal alignment of the stack total label.
    * Can be one of `"left"`, `"center"` or `"right"`. The default value is
    * calculated at runtime and depends on orientation and whether the stack is
    * positive or negative.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts) Allow the stack labels to overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The background color or gradient for the stack label.
    */
  var backgroundColor: js.UndefOr[ColorType] = js.native
  /**
    * (Highcharts) The border color for the stack label. Defaults to
    * `undefined`.
    */
  var borderColor: js.UndefOr[ColorType] = js.native
  /**
    * (Highcharts) The border radius in pixels for the stack label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The border width in pixels for the stack label.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Whether to hide stack labels that are outside the plot area.
    * By default, the stack label is moved inside the plot area according to
    * the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Enable or disable the stack total labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) A format string for the data label. Available
    * variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Callback JavaScript function to format the label. The value
    * is given by `this.total`.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[StackItemObject]] = js.native
  /**
    * (Highcharts) How to handle stack total labels that flow outside the plot
    * area. The default is set to `"justify"`, which aligns them inside the
    * plot area. For columns and bars, this means it will be moved inside the
    * bar. To display stack labels outside the plot area, set `crop` to `false`
    * and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.native
  /**
    * (Highcharts) Rotation of the labels in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) CSS styles for the label.
    *
    * In styled mode, the styles are set in the `.highcharts-stack-label`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts) The text alignment for the label. While `align` determines
    * where the texts anchor point is placed with regards to the stack,
    * `textAlign` determines how the text is aligned against its anchor point.
    * Possible values are `"left"`, `"center"` and `"right"`. The default value
    * is calculated at runtime and depends on orientation and whether the stack
    * is positive or negative.
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Defines the vertical alignment of the stack total label. Can
    * be one of `"top"`, `"middle"` or `"bottom"`. The default value is
    * calculated at runtime and depends on orientation and whether the stack is
    * positive or negative.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts) The x position offset of the label relative to the left of
    * the stacked bar. The default value is calculated at runtime and depends
    * on orientation and whether the stack is positive or negative.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The y position offset of the label relative to the tick
    * position on the axis. The default value is calculated at runtime and
    * depends on orientation and whether the stack is positive or negative.
    */
  var y: js.UndefOr[Double] = js.native
}

object NavigatorYAxisStackLabelsOptions {
  @scala.inline
  def apply(): NavigatorYAxisStackLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisStackLabelsOptions]
  }
  @scala.inline
  implicit class NavigatorYAxisStackLabelsOptionsOps[Self <: NavigatorYAxisStackLabelsOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: ColorType): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorType): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCrop(value: Boolean): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[StackItemObject]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setOverflow(value: DataLabelsOverflowValue): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
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

