package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGauge
  extends /**
	 * Option for igRadialGauge
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is raised when a label of the gauge is aligned along the scale.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of gauge scale.
  	 * Use ui.startAngle to obtain the starting angle of gauge scale.
  	 * Use ui.endAngle to obtain the ending angle of gauge scale.
  	 * Use ui.angle to obtain the angle on the gauge scale at which the label will be located.
  	 * Use ui.value to obtain the value on the gauge scale associated with the label.
  	 * Use ui.label to obtain the string value of the label.
  	 * Use ui.width to obtain the width of the label.
  	 * Use ui.height to obtain the height of the label.
  	 * Use ui.offsetX to obtain the X offset of the label on the gauge scale.
  	 * Use ui.offsetY to obtain the Y offset of the label on the gauge scale.
  	 */
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the backing of the gauge.
  	 */
  var backingBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the corner rounding radius to use for the fitted scale backings.
  	 */
  var backingCornerRadius: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the inner extent of the gauge backing.
  	 */
  var backingInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the outer extent of the gauge backing.
  	 */
  var backingOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the over sweep angle to apply to the backing if it is displaying fitted (in degrees). Must be greater or equal to 0.
  	 */
  var backingOversweep: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the type of shape to use for the backing of the gauge.
  	 *
  	 * Valid values:
  	 * "circular" A circular backing shape.
  	 * "fitted" A fitted backing shape.
  	 */
  var backingShape: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the x position of the center of the gauge with the value ranging from 0 to 1.
  	 */
  var centerX: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the y position of the center of the gauge with the value ranging from 0 to 1.
  	 */
  var centerY: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the strategy to use for omitting labels if the first and last label have the same value.
  	 *
  	 * Valid values:
  	 * "omitLast" Omit the last label.
  	 * "omitFirst" Omit the first label.
  	 * "omitNeither" Omit no labels.
  	 * "omitBoth" Omit both labels.
  	 */
  var duplicateLabelOmissionStrategy: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the font.
  	 */
  var font: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Event which is raised when a label of the gauge is formatted.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of gauge scale.
  	 * Use ui.startAngle to obtain the starting angle of gauge scale.
  	 * Use ui.endAngle to obtain the ending angle of gauge scale.
  	 * Use ui.angle to obtain the angle on the gauge scale at which the label will be located.
  	 * Use ui.value to obtain the value on the gauge scale associated with the label.
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
  	 * Gets or sets whether the needle is constrained within the minimum and maximum value range during dragging.
  	 */
  var isNeedleDraggingConstrained: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether needle dragging is enabled or not.
  	 */
  var isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured form the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var labelExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
  	 */
  var labelInterval: js.UndefOr[Double] = js.undefined
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
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var minorTickEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var minorTickStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the extent of the feature which is closest to the base (e.g. a bulb) with a value from -1 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleBaseFeatureExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its feature which is closest to the base (e.g. a bulb) with a value from 0 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleBaseFeatureWidthRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use when rendering the fill of the needle.
  	 */
  var needleBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the extent (from -1 to 1) at which to end rendering the needle, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleEndWidthRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use when rendering the outline of the needle.
  	 */
  var needleOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the brush to use for filling the needle cap. Note: this only applies to certain cap shapes.
  	 */
  var needlePivotBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the width of the inner cutout section of the needle cap with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle that has a cutout section.
  	 */
  var needlePivotInnerWidthRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outlines of the needle cap.
  	 */
  var needlePivotOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the shape to use for the needle cap.
  	 *
  	 * Valid values:
  	 * "none" No pivot shape.
  	 * "circle" A circle shaped pivot.
  	 * "circleWithHole" A circle pivot with a hole in it.
  	 * "circleOverlay" A circle pivot overlayed on top of the needle.
  	 * "circleOverlayWithHole" A circle pivot with a hole in it overlayed on top of the needle.
  	 * "circleUnderlay" A circle pivot rendered underneath the needle.
  	 * "circleUnderlayWithHole" A circle pivot with a hold in it rendered underneath the needle.
  	 */
  var needlePivotShape: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use for the outline of the needle cap.
  	 */
  var needlePivotStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the cap of the needle with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePivotWidthRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the extent of the feature which is closest to the point (e.g. the tapering point of a needle) with a value from -1 to 1. Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePointFeatureExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its feature which is closest to the point (e.g. the tapering point of a needle) with a value from 0 to 1. Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePointFeatureWidthRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the shape to use when rendering the needle from a number of options.
  	 *
  	 * Valid values:
  	 * "none" No shape.
  	 * "rectangle" A rectangle shape.
  	 * "triangle" A triangle shape.
  	 * "needle" A needle shape.
  	 * "trapezoid" A trapezoid shape.
  	 * "rectangleWithBulb" A rectangle shape with a bulb at the end.
  	 * "triangleWithBulb" A triangle shape with a bulb at the end.
  	 * "needleWithBulb" A needle shape with a bulb at the end.
  	 * "trapezoidWithBulb" A trapezoid shape with a bulb at the end.
  	 */
  var needleShape: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the extent (from -1 to 1) at which to start rendering the needle, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleStartWidthRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the needle outline.
  	 */
  var needleStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the multiplying factor to apply to the normal radius of the gauge.
  	 * The radius of the gauge is defined by the minimum of the width and height of the control divided by 2.0.
  	 * This introduces a multiplicative factor to that value.
  	 */
  var radiusMultiplier: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for gauge ranges.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for gauge outlines.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the scale ranges to render on the linear gauge.
  	 */
  var ranges: js.UndefOr[js.Array[IgRadialGaugeRange]] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the background of the scale.
  	 */
  var scaleBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the end angle for the scale in degrees.
  	 */
  var scaleEndAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var scaleEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the extra degrees of sweep to apply to the scale background. Must be greater or equal to 0.
  	 */
  var scaleOversweep: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the oversweep shape to use for the excess fill area for the scale.
  	 *
  	 * Valid values:
  	 * "auto" A default oversweep shape.
  	 * "circular" A circular oversweep shape.
  	 * "fitted" A fitted oversweep shape.
  	 */
  var scaleOversweepShape: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the start angle for the scale in degrees.
  	 */
  var scaleStartAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the center of the gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var scaleStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the direction in which the scale sweeps around the center from the start angle to end angle.
  	 *
  	 * Valid values:
  	 * "counterclockwise" In a direction opposite the typical forward movement of the hands of a clock.
  	 * "clockwise" In a direction corresponding to the typical forward movement of the hands of a clock.
  	 */
  var scaleSweepDirection: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var tickEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var tickStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering ticks.
  	 */
  var tickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the number of milliseconds over which changes to the gauge should be animated.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the easing function used to morph the current series.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the transition progress of the animation when the control is animating.
  	 */
  var transitionProgress: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the value at which to point the needle of the gauge.
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

object IgRadialGauge {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igRadialGauge
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    alignLabel: (/* event */ Event_, /* ui */ AlignLabelEventUIParam) => Unit = null,
    backingBrush: String = null,
    backingCornerRadius: Int | Double = null,
    backingInnerExtent: Int | Double = null,
    backingOuterExtent: Int | Double = null,
    backingOutline: String = null,
    backingOversweep: Int | Double = null,
    backingShape: String = null,
    backingStrokeThickness: Int | Double = null,
    centerX: Int | Double = null,
    centerY: Int | Double = null,
    duplicateLabelOmissionStrategy: String = null,
    font: String = null,
    fontBrush: String = null,
    formatLabel: (/* event */ Event_, /* ui */ FormatLabelEventUIParam) => Unit = null,
    height: String | Double = null,
    interval: Int | Double = null,
    isNeedleDraggingConstrained: js.UndefOr[Boolean] = js.undefined,
    isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.undefined,
    labelExtent: Int | Double = null,
    labelInterval: Int | Double = null,
    language: String = null,
    locale: js.Any = null,
    maximumValue: Int | Double = null,
    minimumValue: Int | Double = null,
    minorTickBrush: String = null,
    minorTickCount: Int | Double = null,
    minorTickEndExtent: Int | Double = null,
    minorTickStartExtent: Int | Double = null,
    minorTickStrokeThickness: Int | Double = null,
    needleBaseFeatureExtent: Int | Double = null,
    needleBaseFeatureWidthRatio: Int | Double = null,
    needleBrush: String = null,
    needleEndExtent: Int | Double = null,
    needleEndWidthRatio: Int | Double = null,
    needleOutline: String = null,
    needlePivotBrush: String = null,
    needlePivotInnerWidthRatio: Int | Double = null,
    needlePivotOutline: String = null,
    needlePivotShape: String = null,
    needlePivotStrokeThickness: Int | Double = null,
    needlePivotWidthRatio: Int | Double = null,
    needlePointFeatureExtent: Int | Double = null,
    needlePointFeatureWidthRatio: Int | Double = null,
    needleShape: String = null,
    needleStartExtent: Int | Double = null,
    needleStartWidthRatio: Int | Double = null,
    needleStrokeThickness: Int | Double = null,
    pixelScalingRatio: Int | Double = null,
    radiusMultiplier: Int | Double = null,
    rangeBrushes: js.Any = null,
    rangeOutlines: js.Any = null,
    ranges: js.Array[IgRadialGaugeRange] = null,
    regional: String | js.Object = null,
    scaleBrush: String = null,
    scaleEndAngle: Int | Double = null,
    scaleEndExtent: Int | Double = null,
    scaleOversweep: Int | Double = null,
    scaleOversweepShape: String = null,
    scaleStartAngle: Int | Double = null,
    scaleStartExtent: Int | Double = null,
    scaleSweepDirection: String = null,
    tickBrush: String = null,
    tickEndExtent: Int | Double = null,
    tickStartExtent: Int | Double = null,
    tickStrokeThickness: Int | Double = null,
    transitionDuration: Int | Double = null,
    transitionEasingFunction: js.Any = null,
    transitionProgress: Int | Double = null,
    value: Int | Double = null,
    valueChanged: (/* event */ Event_, /* ui */ ValueChangedEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgRadialGauge = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignLabel != null) __obj.updateDynamic("alignLabel")(js.Any.fromFunction2(alignLabel))
    if (backingBrush != null) __obj.updateDynamic("backingBrush")(backingBrush.asInstanceOf[js.Any])
    if (backingCornerRadius != null) __obj.updateDynamic("backingCornerRadius")(backingCornerRadius.asInstanceOf[js.Any])
    if (backingInnerExtent != null) __obj.updateDynamic("backingInnerExtent")(backingInnerExtent.asInstanceOf[js.Any])
    if (backingOuterExtent != null) __obj.updateDynamic("backingOuterExtent")(backingOuterExtent.asInstanceOf[js.Any])
    if (backingOutline != null) __obj.updateDynamic("backingOutline")(backingOutline.asInstanceOf[js.Any])
    if (backingOversweep != null) __obj.updateDynamic("backingOversweep")(backingOversweep.asInstanceOf[js.Any])
    if (backingShape != null) __obj.updateDynamic("backingShape")(backingShape.asInstanceOf[js.Any])
    if (backingStrokeThickness != null) __obj.updateDynamic("backingStrokeThickness")(backingStrokeThickness.asInstanceOf[js.Any])
    if (centerX != null) __obj.updateDynamic("centerX")(centerX.asInstanceOf[js.Any])
    if (centerY != null) __obj.updateDynamic("centerY")(centerY.asInstanceOf[js.Any])
    if (duplicateLabelOmissionStrategy != null) __obj.updateDynamic("duplicateLabelOmissionStrategy")(duplicateLabelOmissionStrategy.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontBrush != null) __obj.updateDynamic("fontBrush")(fontBrush.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(isNeedleDraggingConstrained)) __obj.updateDynamic("isNeedleDraggingConstrained")(isNeedleDraggingConstrained.asInstanceOf[js.Any])
    if (!js.isUndefined(isNeedleDraggingEnabled)) __obj.updateDynamic("isNeedleDraggingEnabled")(isNeedleDraggingEnabled.asInstanceOf[js.Any])
    if (labelExtent != null) __obj.updateDynamic("labelExtent")(labelExtent.asInstanceOf[js.Any])
    if (labelInterval != null) __obj.updateDynamic("labelInterval")(labelInterval.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (minorTickBrush != null) __obj.updateDynamic("minorTickBrush")(minorTickBrush.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickEndExtent != null) __obj.updateDynamic("minorTickEndExtent")(minorTickEndExtent.asInstanceOf[js.Any])
    if (minorTickStartExtent != null) __obj.updateDynamic("minorTickStartExtent")(minorTickStartExtent.asInstanceOf[js.Any])
    if (minorTickStrokeThickness != null) __obj.updateDynamic("minorTickStrokeThickness")(minorTickStrokeThickness.asInstanceOf[js.Any])
    if (needleBaseFeatureExtent != null) __obj.updateDynamic("needleBaseFeatureExtent")(needleBaseFeatureExtent.asInstanceOf[js.Any])
    if (needleBaseFeatureWidthRatio != null) __obj.updateDynamic("needleBaseFeatureWidthRatio")(needleBaseFeatureWidthRatio.asInstanceOf[js.Any])
    if (needleBrush != null) __obj.updateDynamic("needleBrush")(needleBrush.asInstanceOf[js.Any])
    if (needleEndExtent != null) __obj.updateDynamic("needleEndExtent")(needleEndExtent.asInstanceOf[js.Any])
    if (needleEndWidthRatio != null) __obj.updateDynamic("needleEndWidthRatio")(needleEndWidthRatio.asInstanceOf[js.Any])
    if (needleOutline != null) __obj.updateDynamic("needleOutline")(needleOutline.asInstanceOf[js.Any])
    if (needlePivotBrush != null) __obj.updateDynamic("needlePivotBrush")(needlePivotBrush.asInstanceOf[js.Any])
    if (needlePivotInnerWidthRatio != null) __obj.updateDynamic("needlePivotInnerWidthRatio")(needlePivotInnerWidthRatio.asInstanceOf[js.Any])
    if (needlePivotOutline != null) __obj.updateDynamic("needlePivotOutline")(needlePivotOutline.asInstanceOf[js.Any])
    if (needlePivotShape != null) __obj.updateDynamic("needlePivotShape")(needlePivotShape.asInstanceOf[js.Any])
    if (needlePivotStrokeThickness != null) __obj.updateDynamic("needlePivotStrokeThickness")(needlePivotStrokeThickness.asInstanceOf[js.Any])
    if (needlePivotWidthRatio != null) __obj.updateDynamic("needlePivotWidthRatio")(needlePivotWidthRatio.asInstanceOf[js.Any])
    if (needlePointFeatureExtent != null) __obj.updateDynamic("needlePointFeatureExtent")(needlePointFeatureExtent.asInstanceOf[js.Any])
    if (needlePointFeatureWidthRatio != null) __obj.updateDynamic("needlePointFeatureWidthRatio")(needlePointFeatureWidthRatio.asInstanceOf[js.Any])
    if (needleShape != null) __obj.updateDynamic("needleShape")(needleShape.asInstanceOf[js.Any])
    if (needleStartExtent != null) __obj.updateDynamic("needleStartExtent")(needleStartExtent.asInstanceOf[js.Any])
    if (needleStartWidthRatio != null) __obj.updateDynamic("needleStartWidthRatio")(needleStartWidthRatio.asInstanceOf[js.Any])
    if (needleStrokeThickness != null) __obj.updateDynamic("needleStrokeThickness")(needleStrokeThickness.asInstanceOf[js.Any])
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (radiusMultiplier != null) __obj.updateDynamic("radiusMultiplier")(radiusMultiplier.asInstanceOf[js.Any])
    if (rangeBrushes != null) __obj.updateDynamic("rangeBrushes")(rangeBrushes.asInstanceOf[js.Any])
    if (rangeOutlines != null) __obj.updateDynamic("rangeOutlines")(rangeOutlines.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (scaleBrush != null) __obj.updateDynamic("scaleBrush")(scaleBrush.asInstanceOf[js.Any])
    if (scaleEndAngle != null) __obj.updateDynamic("scaleEndAngle")(scaleEndAngle.asInstanceOf[js.Any])
    if (scaleEndExtent != null) __obj.updateDynamic("scaleEndExtent")(scaleEndExtent.asInstanceOf[js.Any])
    if (scaleOversweep != null) __obj.updateDynamic("scaleOversweep")(scaleOversweep.asInstanceOf[js.Any])
    if (scaleOversweepShape != null) __obj.updateDynamic("scaleOversweepShape")(scaleOversweepShape.asInstanceOf[js.Any])
    if (scaleStartAngle != null) __obj.updateDynamic("scaleStartAngle")(scaleStartAngle.asInstanceOf[js.Any])
    if (scaleStartExtent != null) __obj.updateDynamic("scaleStartExtent")(scaleStartExtent.asInstanceOf[js.Any])
    if (scaleSweepDirection != null) __obj.updateDynamic("scaleSweepDirection")(scaleSweepDirection.asInstanceOf[js.Any])
    if (tickBrush != null) __obj.updateDynamic("tickBrush")(tickBrush.asInstanceOf[js.Any])
    if (tickEndExtent != null) __obj.updateDynamic("tickEndExtent")(tickEndExtent.asInstanceOf[js.Any])
    if (tickStartExtent != null) __obj.updateDynamic("tickStartExtent")(tickStartExtent.asInstanceOf[js.Any])
    if (tickStrokeThickness != null) __obj.updateDynamic("tickStrokeThickness")(tickStrokeThickness.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction.asInstanceOf[js.Any])
    if (transitionProgress != null) __obj.updateDynamic("transitionProgress")(transitionProgress.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(js.Any.fromFunction2(valueChanged))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialGauge]
  }
}

