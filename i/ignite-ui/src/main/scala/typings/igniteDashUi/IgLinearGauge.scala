package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinearGauge
  extends /**
	 * Option for igLinearGauge
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
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the backing of the linear gauge.
  	 */
  var backingBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the inner extent of the linear gauge backing.
  	 */
  var backingInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the outer extent of the linear gauge backing.
  	 */
  var backingOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the font.
  	 */
  var font: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised when a label of the the gauge is formatted.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to the gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of the gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of the gauge scale.
  	 * Use ui.value to obtain the value on the the gauge scale associated with the label.
  	 * Use ui.label to obtain the string value of the label.
  	 */
  var formatLabel: js.UndefOr[FormatLabelEvent] = js.undefined
  /**
  	 * The height of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for the scale.
  	 */
  var interval: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether needle dragging is enabled or not.
  	 */
  var isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets a value indicating whether the scale is inverted.
  	 * When the scale is inverted the direction in which the scale values increase is right to left.
  	 */
  var isScaleInverted: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
  	 * Values further from zero than 1 can be used to hide the labels of the linear gauge.
  	 */
  var labelExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
  	 */
  var labelInterval: js.UndefOr[Double] = js.undefined
  /**
  	 * A value to start adding labels, added to the scale's MinimumValue.
  	 */
  var labelsPostInitial: js.UndefOr[Double] = js.undefined
  /**
  	 * A value to stop adding labels, subtracted from the scale's MaximumValue.
  	 */
  var labelsPreTerminal: js.UndefOr[Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the maximum value of the scale.
  	 */
  var maximumValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the minimum value of the scale.
  	 */
  var minimumValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the minor tickmarks.
  	 */
  var minorTickBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the number of minor tickmarks to place between major tickmarks.
  	 */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var minorTickEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var minorTickStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the needle breadth.
  	 */
  var needleBreadth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for needle element.
  	 */
  var needleBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the width of the needle's inner base.
  	 */
  var needleInnerBaseWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the needle geometry, measured from the front/bottom of the linear gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var needleInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the extent of the needle's inner point.
  	 */
  var needleInnerPointExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle's inner point.
  	 */
  var needleInnerPointWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the name used for needle.
  	 */
  var needleName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the width of the needle's outer base.
  	 */
  var needleOuterBaseWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the needle geometry as a value from 0 to 1 measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var needleOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the extent of the needle's outer point.
  	 */
  var needleOuterPointExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle's outer point.
  	 */
  var needleOuterPointWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of needle element.
  	 */
  var needleOutline: js.UndefOr[String] = js.undefined
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
  var needleShape: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering single actual value element.
  	 */
  var needleStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the needle's tooltip template.
  	 */
  var needleToolTipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the orientation of the scale.
  	 *
  	 * Valid values:
  	 * "horizontal" The scale has a horizontal orientation.
  	 * "vertical" The scale has a vertical orientation.
  	 */
  var orientation: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for linear gauge ranges.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var rangeInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var rangeOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for linear gauge outlines.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the ranges' tooltip template.
  	 */
  var rangeToolTipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the scale ranges to render on the linear gauge.
  	 */
  var ranges: js.UndefOr[js.Array[IgLinearGaugeRange]] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the scale of the linear gauge.
  	 */
  var scaleBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the bottom/front (when orientation is horizontal/vertical) of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the bottom/front (when orientation is horizontal/vertical) of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the scale.
  	 */
  var scaleOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the linear gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the scale outline.
  	 */
  var scaleStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets a value indicating whether tooltips are enabled.
  	 */
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
  	 */
  var showToolTipTimeout: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var tickEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var tickStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering ticks.
  	 */
  var tickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * A value to start adding tickmarks, added to the scale's MinimumValue.
  	 */
  var ticksPostInitial: js.UndefOr[Double] = js.undefined
  /**
  	 * A value to stop adding tickmarks, subtracted from the scale's MaximumValue.
  	 */
  var ticksPreTerminal: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the number of milliseconds over which changes to the linear gauge should be animated.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the value at which the needle is positioned.
  	 */
  var value: js.UndefOr[Double] = js.undefined
  /**
  	 * Occurs when the Value property changes.
  	 */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.undefined
  /**
  	 * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgLinearGauge {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igLinearGauge
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    alignLabel: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit = null,
    backingBrush: String = null,
    backingInnerExtent: Int | Double = null,
    backingOuterExtent: Int | Double = null,
    backingOutline: String = null,
    backingStrokeThickness: Int | Double = null,
    font: String = null,
    fontBrush: String = null,
    formatLabel: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit = null,
    height: String | Double = null,
    interval: Int | Double = null,
    isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.undefined,
    isScaleInverted: js.UndefOr[Boolean] = js.undefined,
    labelExtent: Int | Double = null,
    labelInterval: Int | Double = null,
    labelsPostInitial: Int | Double = null,
    labelsPreTerminal: Int | Double = null,
    language: String = null,
    locale: js.Any = null,
    maximumValue: Int | Double = null,
    minimumValue: Int | Double = null,
    minorTickBrush: String = null,
    minorTickCount: Int | Double = null,
    minorTickEndExtent: Int | Double = null,
    minorTickStartExtent: Int | Double = null,
    minorTickStrokeThickness: Int | Double = null,
    needleBreadth: Int | Double = null,
    needleBrush: String = null,
    needleInnerBaseWidth: Int | Double = null,
    needleInnerExtent: Int | Double = null,
    needleInnerPointExtent: Int | Double = null,
    needleInnerPointWidth: Int | Double = null,
    needleName: String = null,
    needleOuterBaseWidth: Int | Double = null,
    needleOuterExtent: Int | Double = null,
    needleOuterPointExtent: Int | Double = null,
    needleOuterPointWidth: Int | Double = null,
    needleOutline: String = null,
    needleShape: String = null,
    needleStrokeThickness: Int | Double = null,
    needleToolTipTemplate: String = null,
    orientation: String = null,
    pixelScalingRatio: Int | Double = null,
    rangeBrushes: js.Any = null,
    rangeInnerExtent: Int | Double = null,
    rangeOuterExtent: Int | Double = null,
    rangeOutlines: js.Any = null,
    rangeToolTipTemplate: String = null,
    ranges: js.Array[IgLinearGaugeRange] = null,
    regional: String | js.Object = null,
    scaleBrush: String = null,
    scaleEndExtent: Int | Double = null,
    scaleInnerExtent: Int | Double = null,
    scaleOuterExtent: Int | Double = null,
    scaleOutline: String = null,
    scaleStartExtent: Int | Double = null,
    scaleStrokeThickness: Int | Double = null,
    showToolTip: js.UndefOr[Boolean] = js.undefined,
    showToolTipTimeout: Int | Double = null,
    tickBrush: String = null,
    tickEndExtent: Int | Double = null,
    tickStartExtent: Int | Double = null,
    tickStrokeThickness: Int | Double = null,
    ticksPostInitial: Int | Double = null,
    ticksPreTerminal: Int | Double = null,
    transitionDuration: Int | Double = null,
    value: Int | Double = null,
    valueChanged: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgLinearGauge = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignLabel != null) __obj.updateDynamic("alignLabel")(js.Any.fromFunction2(alignLabel))
    if (backingBrush != null) __obj.updateDynamic("backingBrush")(backingBrush)
    if (backingInnerExtent != null) __obj.updateDynamic("backingInnerExtent")(backingInnerExtent.asInstanceOf[js.Any])
    if (backingOuterExtent != null) __obj.updateDynamic("backingOuterExtent")(backingOuterExtent.asInstanceOf[js.Any])
    if (backingOutline != null) __obj.updateDynamic("backingOutline")(backingOutline)
    if (backingStrokeThickness != null) __obj.updateDynamic("backingStrokeThickness")(backingStrokeThickness.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontBrush != null) __obj.updateDynamic("fontBrush")(fontBrush)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(isNeedleDraggingEnabled)) __obj.updateDynamic("isNeedleDraggingEnabled")(isNeedleDraggingEnabled)
    if (!js.isUndefined(isScaleInverted)) __obj.updateDynamic("isScaleInverted")(isScaleInverted)
    if (labelExtent != null) __obj.updateDynamic("labelExtent")(labelExtent.asInstanceOf[js.Any])
    if (labelInterval != null) __obj.updateDynamic("labelInterval")(labelInterval.asInstanceOf[js.Any])
    if (labelsPostInitial != null) __obj.updateDynamic("labelsPostInitial")(labelsPostInitial.asInstanceOf[js.Any])
    if (labelsPreTerminal != null) __obj.updateDynamic("labelsPreTerminal")(labelsPreTerminal.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (minorTickBrush != null) __obj.updateDynamic("minorTickBrush")(minorTickBrush)
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickEndExtent != null) __obj.updateDynamic("minorTickEndExtent")(minorTickEndExtent.asInstanceOf[js.Any])
    if (minorTickStartExtent != null) __obj.updateDynamic("minorTickStartExtent")(minorTickStartExtent.asInstanceOf[js.Any])
    if (minorTickStrokeThickness != null) __obj.updateDynamic("minorTickStrokeThickness")(minorTickStrokeThickness.asInstanceOf[js.Any])
    if (needleBreadth != null) __obj.updateDynamic("needleBreadth")(needleBreadth.asInstanceOf[js.Any])
    if (needleBrush != null) __obj.updateDynamic("needleBrush")(needleBrush)
    if (needleInnerBaseWidth != null) __obj.updateDynamic("needleInnerBaseWidth")(needleInnerBaseWidth.asInstanceOf[js.Any])
    if (needleInnerExtent != null) __obj.updateDynamic("needleInnerExtent")(needleInnerExtent.asInstanceOf[js.Any])
    if (needleInnerPointExtent != null) __obj.updateDynamic("needleInnerPointExtent")(needleInnerPointExtent.asInstanceOf[js.Any])
    if (needleInnerPointWidth != null) __obj.updateDynamic("needleInnerPointWidth")(needleInnerPointWidth.asInstanceOf[js.Any])
    if (needleName != null) __obj.updateDynamic("needleName")(needleName)
    if (needleOuterBaseWidth != null) __obj.updateDynamic("needleOuterBaseWidth")(needleOuterBaseWidth.asInstanceOf[js.Any])
    if (needleOuterExtent != null) __obj.updateDynamic("needleOuterExtent")(needleOuterExtent.asInstanceOf[js.Any])
    if (needleOuterPointExtent != null) __obj.updateDynamic("needleOuterPointExtent")(needleOuterPointExtent.asInstanceOf[js.Any])
    if (needleOuterPointWidth != null) __obj.updateDynamic("needleOuterPointWidth")(needleOuterPointWidth.asInstanceOf[js.Any])
    if (needleOutline != null) __obj.updateDynamic("needleOutline")(needleOutline)
    if (needleShape != null) __obj.updateDynamic("needleShape")(needleShape)
    if (needleStrokeThickness != null) __obj.updateDynamic("needleStrokeThickness")(needleStrokeThickness.asInstanceOf[js.Any])
    if (needleToolTipTemplate != null) __obj.updateDynamic("needleToolTipTemplate")(needleToolTipTemplate)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (rangeBrushes != null) __obj.updateDynamic("rangeBrushes")(rangeBrushes)
    if (rangeInnerExtent != null) __obj.updateDynamic("rangeInnerExtent")(rangeInnerExtent.asInstanceOf[js.Any])
    if (rangeOuterExtent != null) __obj.updateDynamic("rangeOuterExtent")(rangeOuterExtent.asInstanceOf[js.Any])
    if (rangeOutlines != null) __obj.updateDynamic("rangeOutlines")(rangeOutlines)
    if (rangeToolTipTemplate != null) __obj.updateDynamic("rangeToolTipTemplate")(rangeToolTipTemplate)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (scaleBrush != null) __obj.updateDynamic("scaleBrush")(scaleBrush)
    if (scaleEndExtent != null) __obj.updateDynamic("scaleEndExtent")(scaleEndExtent.asInstanceOf[js.Any])
    if (scaleInnerExtent != null) __obj.updateDynamic("scaleInnerExtent")(scaleInnerExtent.asInstanceOf[js.Any])
    if (scaleOuterExtent != null) __obj.updateDynamic("scaleOuterExtent")(scaleOuterExtent.asInstanceOf[js.Any])
    if (scaleOutline != null) __obj.updateDynamic("scaleOutline")(scaleOutline)
    if (scaleStartExtent != null) __obj.updateDynamic("scaleStartExtent")(scaleStartExtent.asInstanceOf[js.Any])
    if (scaleStrokeThickness != null) __obj.updateDynamic("scaleStrokeThickness")(scaleStrokeThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip)
    if (showToolTipTimeout != null) __obj.updateDynamic("showToolTipTimeout")(showToolTipTimeout.asInstanceOf[js.Any])
    if (tickBrush != null) __obj.updateDynamic("tickBrush")(tickBrush)
    if (tickEndExtent != null) __obj.updateDynamic("tickEndExtent")(tickEndExtent.asInstanceOf[js.Any])
    if (tickStartExtent != null) __obj.updateDynamic("tickStartExtent")(tickStartExtent.asInstanceOf[js.Any])
    if (tickStrokeThickness != null) __obj.updateDynamic("tickStrokeThickness")(tickStrokeThickness.asInstanceOf[js.Any])
    if (ticksPostInitial != null) __obj.updateDynamic("ticksPostInitial")(ticksPostInitial.asInstanceOf[js.Any])
    if (ticksPreTerminal != null) __obj.updateDynamic("ticksPreTerminal")(ticksPreTerminal.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(js.Any.fromFunction2(valueChanged))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLinearGauge]
  }
}

