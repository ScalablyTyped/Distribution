package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisCrosshairLabelOptions extends js.Object {
  /**
    * (Highstock) Alignment of the label compared to the axis. Defaults to
    * `"left"` for right-side axes, `"right"` for left-side axes and `"center"`
    * for horizontal axes.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highstock) The background color for the label. Defaults to the related
    * series color, or `#666666` if that is not available.
    */
  var backgroundColor: js.UndefOr[ColorType] = js.native
  /**
    * (Highstock) The border color for the crosshair label
    */
  var borderColor: js.UndefOr[ColorType] = js.native
  /**
    * (Highstock) The border corner radius of the crosshair label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The border width for the crosshair label.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Flag to enable crosshair's label.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) A format string for the crosshair label. Defaults to
    * `{value}` for numeric axes and `{value:%b %d, %Y}` for datetime axes.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Highstock) Formatter function for the label text.
    */
  var formatter: js.UndefOr[XAxisCrosshairLabelFormatterCallbackFunction] = js.native
  /**
    * (Highstock) Padding inside the crosshair label.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The shape to use for the label box.
    */
  var shape: js.UndefOr[String] = js.native
  /**
    * (Highstock) Text styles for the crosshair label.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object AxisCrosshairLabelOptions {
  @scala.inline
  def apply(): AxisCrosshairLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisCrosshairLabelOptions]
  }
  @scala.inline
  implicit class AxisCrosshairLabelOptionsOps[Self <: AxisCrosshairLabelOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatter(value: XAxisCrosshairLabelFormatterCallbackFunction): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

