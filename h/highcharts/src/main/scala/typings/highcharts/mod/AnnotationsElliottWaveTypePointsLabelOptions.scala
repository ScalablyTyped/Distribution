package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsElliottWaveTypePointsLabelOptions extends js.Object {
  /**
    * (Highstock) Accessibility options for an annotation label.
    */
  var accessibility: js.UndefOr[AnnotationLabelAccessibilityOptionsObject] = js.native
  /**
    * (Highstock) The alignment of the annotation's label. If right, the right
    * side of the label should be touching the point.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highstock) Whether to allow the annotation's labels to overlap. To make
    * the labels less sensitive for overlapping, the can be set to 0.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The background color or gradient for the annotation's label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The border color for the annotation's label.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock) The border radius in pixels for the annotaiton's label.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The border width in pixels for the annotation's label
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A class name for styling by CSS.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highstock) Whether to hide the annotation's label that is outside the
    * plot area.
    */
  var crop: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The label's pixel distance from the point.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A format string for the data label.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Highstock) Callback JavaScript function to format the annotation's
    * label. Note that if a `format` or `text` are defined, the format or text
    * take precedence and the formatter is ignored. `This` refers to a point
    * object.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.native
  /**
    * (Highstock) How to handle the annotation's label that flow outside the
    * plot area. The justify option aligns the label inside the plot area.
    */
  var overflow: js.UndefOr[OptionsOverflowValue] = js.native
  /**
    * (Highstock) When either the borderWidth or the backgroundColor is set,
    * this is the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The shadow of the box. The shadow can be an object
    * configuration containing `color`, `offsetX`, `offsetY`, `opacity` and
    * `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  /**
    * (Highstock) The name of a symbol to use for the border around the label.
    * Symbols are predefined functions on the Renderer object.
    */
  var shape: js.UndefOr[String] = js.native
  /**
    * (Highstock) Styles for the annotation's label.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highstock) Alias for the format option.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highstock) Whether to use HTML to render the annotation's label.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The vertical alignment of the annotation's label.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highstock) The x position offset of the label relative to the point.
    * Note that if a `distance` is defined, the distance takes precedence over
    * `x` and `y` options.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The y position offset of the label relative to the point.
    * Note that if a `distance` is defined, the distance takes precedence over
    * `x` and `y` options.
    */
  var y: js.UndefOr[Double] = js.native
}

object AnnotationsElliottWaveTypePointsLabelOptions {
  @scala.inline
  def apply(): AnnotationsElliottWaveTypePointsLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypePointsLabelOptions]
  }
  @scala.inline
  implicit class AnnotationsElliottWaveTypePointsLabelOptionsOps[Self <: AnnotationsElliottWaveTypePointsLabelOptions] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: AnnotationLabelAccessibilityOptionsObject): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOverlap: Self = this.set("allowOverlap", js.undefined)
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorString): Self = this.set("borderColor", value.asInstanceOf[js.Any])
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCrop(value: Boolean): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[Point]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setOverflow(value: OptionsOverflowValue): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setShadow(value: Boolean | ShadowOptionsObject): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
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

