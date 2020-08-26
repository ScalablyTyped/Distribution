package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLinearGauge
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Event which is raised when a label of the linear gauge is aligned along the scale.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to the gauge widget.
    * Use ui.actualMinimumValue to obtain the minimum value of the gauge scale.
    * Use ui.actualMaximumValue to obtain the maximum value of the gauge scale.
    * Use ui.value to obtain the value on the gauge scale associated with the label.
    * Use ui.label to obtain the string value of the label.
    * Use ui.width to obtain the width of the label.
    * Use ui.height to obtain the height of the label.
    * Use ui.offsetX to obtain the X offset of the label on the gauge scale.
    * Use ui.offsetY to obtain the Y offset of the label on the gauge scale.
    */
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.native
  /**
    * Gets or sets the brush to use to fill the backing of the linear gauge.
    */
  var backingBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the inner extent of the linear gauge backing.
    */
  var backingInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the outer extent of the linear gauge backing.
    */
  var backingOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the outline of the backing.
    */
  var backingOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the stroke thickness of the backing outline.
    */
  var backingStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the font.
    */
  var font: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush to use for the label font.
    */
  var fontBrush: js.UndefOr[String] = js.native
  /**
    * Event which is raised when a label of the the gauge is formatted.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to the gauge widget.
    * Use ui.actualMinimumValue to obtain the minimum value of the gauge scale.
    * Use ui.actualMaximumValue to obtain the maximum value of the gauge scale.
    * Use ui.value to obtain the value on the the gauge scale associated with the label.
    * Use ui.label to obtain the string value of the label.
    */
  var formatLabel: js.UndefOr[FormatLabelEvent] = js.native
  /**
    * The height of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Gets or sets the interval to use for the scale.
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Gets or sets whether needle dragging is enabled or not.
    */
  var isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets a value indicating whether the scale is inverted.
    * When the scale is inverted the direction in which the scale values increase is right to left.
    */
  var isScaleInverted: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
    * Values further from zero than 1 can be used to hide the labels of the linear gauge.
    */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
    */
  var labelInterval: js.UndefOr[Double] = js.native
  /**
    * A value to start adding labels, added to the scale's MinimumValue.
    */
  var labelsPostInitial: js.UndefOr[Double] = js.native
  /**
    * A value to stop adding labels, subtracted from the scale's MaximumValue.
    */
  var labelsPreTerminal: js.UndefOr[Double] = js.native
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the maximum value of the scale.
    */
  var maximumValue: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the minimum value of the scale.
    */
  var minimumValue: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the minor tickmarks.
    */
  var minorTickBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the number of minor tickmarks to place between major tickmarks.
    */
  var minorTickCount: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var minorTickEndExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var minorTickStartExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness to use when rendering minor ticks.
    */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the needle breadth.
    */
  var needleBreadth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for needle element.
    */
  var needleBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the width of the needle's inner base.
    */
  var needleInnerBaseWidth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the needle geometry, measured from the front/bottom of the linear gauge as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var needleInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the extent of the needle's inner point.
    */
  var needleInnerPointExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the width of the needle's inner point.
    */
  var needleInnerPointWidth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the name used for needle.
    */
  var needleName: js.UndefOr[String] = js.native
  /**
    * Gets or sets the width of the needle's outer base.
    */
  var needleOuterBaseWidth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to stop rendering the needle geometry as a value from 0 to 1 measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var needleOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the extent of the needle's outer point.
    */
  var needleOuterPointExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the width of the needle's outer point.
    */
  var needleOuterPointWidth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the outline of needle element.
    */
  var needleOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the shape to use when rendering the needle from a number of options.
    *
    * Valid values:
    * "custom" A custom user defined needle shape.
    * "rectangle" A needle shaped like a rectangle.
    * "triangle" A needle shaped like a triangle.
    * "needle" A needle shaped like a needle.
    * "trapezoid" A needle shaped like a trapezoid.
    */
  var needleShape: js.UndefOr[String] = js.native
  /**
    * Gets or sets the stroke thickness to use when rendering single actual value element.
    */
  var needleStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the needle's tooltip template.
    */
  var needleToolTipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the orientation of the scale.
    *
    * Valid values:
    * "horizontal" The scale has a horizontal orientation.
    * "vertical" The scale has a vertical orientation.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
    * Gets or sets a collection of brushes to be used as the palette for linear gauge ranges.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeBrushes: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var rangeInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var rangeOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets a collection of brushes to be used as the palette for linear gauge outlines.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeOutlines: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the ranges' tooltip template.
    */
  var rangeToolTipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the scale ranges to render on the linear gauge.
    */
  var ranges: js.UndefOr[js.Array[IgLinearGaugeRange]] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Gets or sets the brush to use to fill the scale of the linear gauge.
    */
  var scaleBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var scaleEndExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the scale, measured from the bottom/front (when orientation is horizontal/vertical) of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var scaleInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the bottom/front (when orientation is horizontal/vertical) of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var scaleOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the outline of the scale.
    */
  var scaleOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the linear gauge as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var scaleStartExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness of the scale outline.
    */
  var scaleStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets a value indicating whether tooltips are enabled.
    */
  var showToolTip: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
    */
  var showToolTipTimeout: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the major tickmarks.
    */
  var tickBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var tickEndExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
    */
  var tickStartExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness to use when rendering ticks.
    */
  var tickStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * A value to start adding tickmarks, added to the scale's MinimumValue.
    */
  var ticksPostInitial: js.UndefOr[Double] = js.native
  /**
    * A value to stop adding tickmarks, subtracted from the scale's MaximumValue.
    */
  var ticksPreTerminal: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the number of milliseconds over which changes to the linear gauge should be animated.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the value at which the needle is positioned.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Occurs when the Value property changes.
    */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.native
  /**
    * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgLinearGauge {
  @scala.inline
  def apply(): IgLinearGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLinearGauge]
  }
  @scala.inline
  implicit class IgLinearGaugeOps[Self <: IgLinearGauge] (val x: Self) extends AnyVal {
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
    def setAlignLabel(value: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit): Self = this.set("alignLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAlignLabel: Self = this.set("alignLabel", js.undefined)
    @scala.inline
    def setBackingBrush(value: String): Self = this.set("backingBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackingBrush: Self = this.set("backingBrush", js.undefined)
    @scala.inline
    def setBackingInnerExtent(value: Double): Self = this.set("backingInnerExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackingInnerExtent: Self = this.set("backingInnerExtent", js.undefined)
    @scala.inline
    def setBackingOuterExtent(value: Double): Self = this.set("backingOuterExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackingOuterExtent: Self = this.set("backingOuterExtent", js.undefined)
    @scala.inline
    def setBackingOutline(value: String): Self = this.set("backingOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackingOutline: Self = this.set("backingOutline", js.undefined)
    @scala.inline
    def setBackingStrokeThickness(value: Double): Self = this.set("backingStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackingStrokeThickness: Self = this.set("backingStrokeThickness", js.undefined)
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFontBrush(value: String): Self = this.set("fontBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontBrush: Self = this.set("fontBrush", js.undefined)
    @scala.inline
    def setFormatLabel(value: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit): Self = this.set("formatLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setIsNeedleDraggingEnabled(value: Boolean): Self = this.set("isNeedleDraggingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNeedleDraggingEnabled: Self = this.set("isNeedleDraggingEnabled", js.undefined)
    @scala.inline
    def setIsScaleInverted(value: Boolean): Self = this.set("isScaleInverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScaleInverted: Self = this.set("isScaleInverted", js.undefined)
    @scala.inline
    def setLabelExtent(value: Double): Self = this.set("labelExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelExtent: Self = this.set("labelExtent", js.undefined)
    @scala.inline
    def setLabelInterval(value: Double): Self = this.set("labelInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInterval: Self = this.set("labelInterval", js.undefined)
    @scala.inline
    def setLabelsPostInitial(value: Double): Self = this.set("labelsPostInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsPostInitial: Self = this.set("labelsPostInitial", js.undefined)
    @scala.inline
    def setLabelsPreTerminal(value: Double): Self = this.set("labelsPreTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsPreTerminal: Self = this.set("labelsPreTerminal", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaximumValue(value: Double): Self = this.set("maximumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumValue: Self = this.set("maximumValue", js.undefined)
    @scala.inline
    def setMinimumValue(value: Double): Self = this.set("minimumValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumValue: Self = this.set("minimumValue", js.undefined)
    @scala.inline
    def setMinorTickBrush(value: String): Self = this.set("minorTickBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickBrush: Self = this.set("minorTickBrush", js.undefined)
    @scala.inline
    def setMinorTickCount(value: Double): Self = this.set("minorTickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickCount: Self = this.set("minorTickCount", js.undefined)
    @scala.inline
    def setMinorTickEndExtent(value: Double): Self = this.set("minorTickEndExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickEndExtent: Self = this.set("minorTickEndExtent", js.undefined)
    @scala.inline
    def setMinorTickStartExtent(value: Double): Self = this.set("minorTickStartExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickStartExtent: Self = this.set("minorTickStartExtent", js.undefined)
    @scala.inline
    def setMinorTickStrokeThickness(value: Double): Self = this.set("minorTickStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickStrokeThickness: Self = this.set("minorTickStrokeThickness", js.undefined)
    @scala.inline
    def setNeedleBreadth(value: Double): Self = this.set("needleBreadth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleBreadth: Self = this.set("needleBreadth", js.undefined)
    @scala.inline
    def setNeedleBrush(value: String): Self = this.set("needleBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleBrush: Self = this.set("needleBrush", js.undefined)
    @scala.inline
    def setNeedleInnerBaseWidth(value: Double): Self = this.set("needleInnerBaseWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleInnerBaseWidth: Self = this.set("needleInnerBaseWidth", js.undefined)
    @scala.inline
    def setNeedleInnerExtent(value: Double): Self = this.set("needleInnerExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleInnerExtent: Self = this.set("needleInnerExtent", js.undefined)
    @scala.inline
    def setNeedleInnerPointExtent(value: Double): Self = this.set("needleInnerPointExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleInnerPointExtent: Self = this.set("needleInnerPointExtent", js.undefined)
    @scala.inline
    def setNeedleInnerPointWidth(value: Double): Self = this.set("needleInnerPointWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleInnerPointWidth: Self = this.set("needleInnerPointWidth", js.undefined)
    @scala.inline
    def setNeedleName(value: String): Self = this.set("needleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleName: Self = this.set("needleName", js.undefined)
    @scala.inline
    def setNeedleOuterBaseWidth(value: Double): Self = this.set("needleOuterBaseWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleOuterBaseWidth: Self = this.set("needleOuterBaseWidth", js.undefined)
    @scala.inline
    def setNeedleOuterExtent(value: Double): Self = this.set("needleOuterExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleOuterExtent: Self = this.set("needleOuterExtent", js.undefined)
    @scala.inline
    def setNeedleOuterPointExtent(value: Double): Self = this.set("needleOuterPointExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleOuterPointExtent: Self = this.set("needleOuterPointExtent", js.undefined)
    @scala.inline
    def setNeedleOuterPointWidth(value: Double): Self = this.set("needleOuterPointWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleOuterPointWidth: Self = this.set("needleOuterPointWidth", js.undefined)
    @scala.inline
    def setNeedleOutline(value: String): Self = this.set("needleOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleOutline: Self = this.set("needleOutline", js.undefined)
    @scala.inline
    def setNeedleShape(value: String): Self = this.set("needleShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleShape: Self = this.set("needleShape", js.undefined)
    @scala.inline
    def setNeedleStrokeThickness(value: Double): Self = this.set("needleStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleStrokeThickness: Self = this.set("needleStrokeThickness", js.undefined)
    @scala.inline
    def setNeedleToolTipTemplate(value: String): Self = this.set("needleToolTipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleToolTipTemplate: Self = this.set("needleToolTipTemplate", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    @scala.inline
    def setRangeBrushes(value: js.Any): Self = this.set("rangeBrushes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeBrushes: Self = this.set("rangeBrushes", js.undefined)
    @scala.inline
    def setRangeInnerExtent(value: Double): Self = this.set("rangeInnerExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeInnerExtent: Self = this.set("rangeInnerExtent", js.undefined)
    @scala.inline
    def setRangeOuterExtent(value: Double): Self = this.set("rangeOuterExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeOuterExtent: Self = this.set("rangeOuterExtent", js.undefined)
    @scala.inline
    def setRangeOutlines(value: js.Any): Self = this.set("rangeOutlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeOutlines: Self = this.set("rangeOutlines", js.undefined)
    @scala.inline
    def setRangeToolTipTemplate(value: String): Self = this.set("rangeToolTipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeToolTipTemplate: Self = this.set("rangeToolTipTemplate", js.undefined)
    @scala.inline
    def setRangesVarargs(value: IgLinearGaugeRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[IgLinearGaugeRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setScaleBrush(value: String): Self = this.set("scaleBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleBrush: Self = this.set("scaleBrush", js.undefined)
    @scala.inline
    def setScaleEndExtent(value: Double): Self = this.set("scaleEndExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleEndExtent: Self = this.set("scaleEndExtent", js.undefined)
    @scala.inline
    def setScaleInnerExtent(value: Double): Self = this.set("scaleInnerExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleInnerExtent: Self = this.set("scaleInnerExtent", js.undefined)
    @scala.inline
    def setScaleOuterExtent(value: Double): Self = this.set("scaleOuterExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleOuterExtent: Self = this.set("scaleOuterExtent", js.undefined)
    @scala.inline
    def setScaleOutline(value: String): Self = this.set("scaleOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleOutline: Self = this.set("scaleOutline", js.undefined)
    @scala.inline
    def setScaleStartExtent(value: Double): Self = this.set("scaleStartExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleStartExtent: Self = this.set("scaleStartExtent", js.undefined)
    @scala.inline
    def setScaleStrokeThickness(value: Double): Self = this.set("scaleStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleStrokeThickness: Self = this.set("scaleStrokeThickness", js.undefined)
    @scala.inline
    def setShowToolTip(value: Boolean): Self = this.set("showToolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolTip: Self = this.set("showToolTip", js.undefined)
    @scala.inline
    def setShowToolTipTimeout(value: Double): Self = this.set("showToolTipTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolTipTimeout: Self = this.set("showToolTipTimeout", js.undefined)
    @scala.inline
    def setTickBrush(value: String): Self = this.set("tickBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickBrush: Self = this.set("tickBrush", js.undefined)
    @scala.inline
    def setTickEndExtent(value: Double): Self = this.set("tickEndExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickEndExtent: Self = this.set("tickEndExtent", js.undefined)
    @scala.inline
    def setTickStartExtent(value: Double): Self = this.set("tickStartExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickStartExtent: Self = this.set("tickStartExtent", js.undefined)
    @scala.inline
    def setTickStrokeThickness(value: Double): Self = this.set("tickStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickStrokeThickness: Self = this.set("tickStrokeThickness", js.undefined)
    @scala.inline
    def setTicksPostInitial(value: Double): Self = this.set("ticksPostInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicksPostInitial: Self = this.set("ticksPostInitial", js.undefined)
    @scala.inline
    def setTicksPreTerminal(value: Double): Self = this.set("ticksPreTerminal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicksPreTerminal: Self = this.set("ticksPreTerminal", js.undefined)
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = this.set("valueChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValueChanged: Self = this.set("valueChanged", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

