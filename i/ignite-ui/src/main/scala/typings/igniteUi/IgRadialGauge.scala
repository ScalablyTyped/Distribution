package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGauge
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    alignLabel: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit = null,
    backingBrush: String = null,
    backingCornerRadius: js.UndefOr[Double] = js.undefined,
    backingInnerExtent: js.UndefOr[Double] = js.undefined,
    backingOuterExtent: js.UndefOr[Double] = js.undefined,
    backingOutline: String = null,
    backingOversweep: js.UndefOr[Double] = js.undefined,
    backingShape: String = null,
    backingStrokeThickness: js.UndefOr[Double] = js.undefined,
    centerX: js.UndefOr[Double] = js.undefined,
    centerY: js.UndefOr[Double] = js.undefined,
    duplicateLabelOmissionStrategy: String = null,
    font: String = null,
    fontBrush: String = null,
    formatLabel: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit = null,
    height: String | Double = null,
    interval: js.UndefOr[Double] = js.undefined,
    isNeedleDraggingConstrained: js.UndefOr[Boolean] = js.undefined,
    isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.undefined,
    labelExtent: js.UndefOr[Double] = js.undefined,
    labelInterval: js.UndefOr[Double] = js.undefined,
    language: String = null,
    locale: js.Any = null,
    maximumValue: js.UndefOr[Double] = js.undefined,
    minimumValue: js.UndefOr[Double] = js.undefined,
    minorTickBrush: String = null,
    minorTickCount: js.UndefOr[Double] = js.undefined,
    minorTickEndExtent: js.UndefOr[Double] = js.undefined,
    minorTickStartExtent: js.UndefOr[Double] = js.undefined,
    minorTickStrokeThickness: js.UndefOr[Double] = js.undefined,
    needleBaseFeatureExtent: js.UndefOr[Double] = js.undefined,
    needleBaseFeatureWidthRatio: js.UndefOr[Double] = js.undefined,
    needleBrush: String = null,
    needleEndExtent: js.UndefOr[Double] = js.undefined,
    needleEndWidthRatio: js.UndefOr[Double] = js.undefined,
    needleOutline: String = null,
    needlePivotBrush: String = null,
    needlePivotInnerWidthRatio: js.UndefOr[Double] = js.undefined,
    needlePivotOutline: String = null,
    needlePivotShape: String = null,
    needlePivotStrokeThickness: js.UndefOr[Double] = js.undefined,
    needlePivotWidthRatio: js.UndefOr[Double] = js.undefined,
    needlePointFeatureExtent: js.UndefOr[Double] = js.undefined,
    needlePointFeatureWidthRatio: js.UndefOr[Double] = js.undefined,
    needleShape: String = null,
    needleStartExtent: js.UndefOr[Double] = js.undefined,
    needleStartWidthRatio: js.UndefOr[Double] = js.undefined,
    needleStrokeThickness: js.UndefOr[Double] = js.undefined,
    pixelScalingRatio: js.UndefOr[Double] = js.undefined,
    radiusMultiplier: js.UndefOr[Double] = js.undefined,
    rangeBrushes: js.Any = null,
    rangeOutlines: js.Any = null,
    ranges: js.Array[IgRadialGaugeRange] = null,
    regional: String | js.Object = null,
    scaleBrush: String = null,
    scaleEndAngle: js.UndefOr[Double] = js.undefined,
    scaleEndExtent: js.UndefOr[Double] = js.undefined,
    scaleOversweep: js.UndefOr[Double] = js.undefined,
    scaleOversweepShape: String = null,
    scaleStartAngle: js.UndefOr[Double] = js.undefined,
    scaleStartExtent: js.UndefOr[Double] = js.undefined,
    scaleSweepDirection: String = null,
    tickBrush: String = null,
    tickEndExtent: js.UndefOr[Double] = js.undefined,
    tickStartExtent: js.UndefOr[Double] = js.undefined,
    tickStrokeThickness: js.UndefOr[Double] = js.undefined,
    transitionDuration: js.UndefOr[Double] = js.undefined,
    transitionEasingFunction: js.Any = null,
    transitionProgress: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    valueChanged: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgRadialGauge = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignLabel != null) __obj.updateDynamic("alignLabel")(js.Any.fromFunction2(alignLabel))
    if (backingBrush != null) __obj.updateDynamic("backingBrush")(backingBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(backingCornerRadius)) __obj.updateDynamic("backingCornerRadius")(backingCornerRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backingInnerExtent)) __obj.updateDynamic("backingInnerExtent")(backingInnerExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backingOuterExtent)) __obj.updateDynamic("backingOuterExtent")(backingOuterExtent.get.asInstanceOf[js.Any])
    if (backingOutline != null) __obj.updateDynamic("backingOutline")(backingOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(backingOversweep)) __obj.updateDynamic("backingOversweep")(backingOversweep.get.asInstanceOf[js.Any])
    if (backingShape != null) __obj.updateDynamic("backingShape")(backingShape.asInstanceOf[js.Any])
    if (!js.isUndefined(backingStrokeThickness)) __obj.updateDynamic("backingStrokeThickness")(backingStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerX)) __obj.updateDynamic("centerX")(centerX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centerY)) __obj.updateDynamic("centerY")(centerY.get.asInstanceOf[js.Any])
    if (duplicateLabelOmissionStrategy != null) __obj.updateDynamic("duplicateLabelOmissionStrategy")(duplicateLabelOmissionStrategy.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontBrush != null) __obj.updateDynamic("fontBrush")(fontBrush.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isNeedleDraggingConstrained)) __obj.updateDynamic("isNeedleDraggingConstrained")(isNeedleDraggingConstrained.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isNeedleDraggingEnabled)) __obj.updateDynamic("isNeedleDraggingEnabled")(isNeedleDraggingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelExtent)) __obj.updateDynamic("labelExtent")(labelExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInterval)) __obj.updateDynamic("labelInterval")(labelInterval.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumValue)) __obj.updateDynamic("maximumValue")(maximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    if (minorTickBrush != null) __obj.updateDynamic("minorTickBrush")(minorTickBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickCount)) __obj.updateDynamic("minorTickCount")(minorTickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickEndExtent)) __obj.updateDynamic("minorTickEndExtent")(minorTickEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickStartExtent)) __obj.updateDynamic("minorTickStartExtent")(minorTickStartExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickStrokeThickness)) __obj.updateDynamic("minorTickStrokeThickness")(minorTickStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleBaseFeatureExtent)) __obj.updateDynamic("needleBaseFeatureExtent")(needleBaseFeatureExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleBaseFeatureWidthRatio)) __obj.updateDynamic("needleBaseFeatureWidthRatio")(needleBaseFeatureWidthRatio.get.asInstanceOf[js.Any])
    if (needleBrush != null) __obj.updateDynamic("needleBrush")(needleBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(needleEndExtent)) __obj.updateDynamic("needleEndExtent")(needleEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleEndWidthRatio)) __obj.updateDynamic("needleEndWidthRatio")(needleEndWidthRatio.get.asInstanceOf[js.Any])
    if (needleOutline != null) __obj.updateDynamic("needleOutline")(needleOutline.asInstanceOf[js.Any])
    if (needlePivotBrush != null) __obj.updateDynamic("needlePivotBrush")(needlePivotBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(needlePivotInnerWidthRatio)) __obj.updateDynamic("needlePivotInnerWidthRatio")(needlePivotInnerWidthRatio.get.asInstanceOf[js.Any])
    if (needlePivotOutline != null) __obj.updateDynamic("needlePivotOutline")(needlePivotOutline.asInstanceOf[js.Any])
    if (needlePivotShape != null) __obj.updateDynamic("needlePivotShape")(needlePivotShape.asInstanceOf[js.Any])
    if (!js.isUndefined(needlePivotStrokeThickness)) __obj.updateDynamic("needlePivotStrokeThickness")(needlePivotStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needlePivotWidthRatio)) __obj.updateDynamic("needlePivotWidthRatio")(needlePivotWidthRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needlePointFeatureExtent)) __obj.updateDynamic("needlePointFeatureExtent")(needlePointFeatureExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needlePointFeatureWidthRatio)) __obj.updateDynamic("needlePointFeatureWidthRatio")(needlePointFeatureWidthRatio.get.asInstanceOf[js.Any])
    if (needleShape != null) __obj.updateDynamic("needleShape")(needleShape.asInstanceOf[js.Any])
    if (!js.isUndefined(needleStartExtent)) __obj.updateDynamic("needleStartExtent")(needleStartExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleStartWidthRatio)) __obj.updateDynamic("needleStartWidthRatio")(needleStartWidthRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(needleStrokeThickness)) __obj.updateDynamic("needleStrokeThickness")(needleStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelScalingRatio)) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusMultiplier)) __obj.updateDynamic("radiusMultiplier")(radiusMultiplier.get.asInstanceOf[js.Any])
    if (rangeBrushes != null) __obj.updateDynamic("rangeBrushes")(rangeBrushes.asInstanceOf[js.Any])
    if (rangeOutlines != null) __obj.updateDynamic("rangeOutlines")(rangeOutlines.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (scaleBrush != null) __obj.updateDynamic("scaleBrush")(scaleBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleEndAngle)) __obj.updateDynamic("scaleEndAngle")(scaleEndAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleEndExtent)) __obj.updateDynamic("scaleEndExtent")(scaleEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleOversweep)) __obj.updateDynamic("scaleOversweep")(scaleOversweep.get.asInstanceOf[js.Any])
    if (scaleOversweepShape != null) __obj.updateDynamic("scaleOversweepShape")(scaleOversweepShape.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleStartAngle)) __obj.updateDynamic("scaleStartAngle")(scaleStartAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleStartExtent)) __obj.updateDynamic("scaleStartExtent")(scaleStartExtent.get.asInstanceOf[js.Any])
    if (scaleSweepDirection != null) __obj.updateDynamic("scaleSweepDirection")(scaleSweepDirection.asInstanceOf[js.Any])
    if (tickBrush != null) __obj.updateDynamic("tickBrush")(tickBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(tickEndExtent)) __obj.updateDynamic("tickEndExtent")(tickEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickStartExtent)) __obj.updateDynamic("tickStartExtent")(tickStartExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickStrokeThickness)) __obj.updateDynamic("tickStrokeThickness")(tickStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    if (transitionEasingFunction != null) __obj.updateDynamic("transitionEasingFunction")(transitionEasingFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionProgress)) __obj.updateDynamic("transitionProgress")(transitionProgress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(js.Any.fromFunction2(valueChanged))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialGauge]
  }
}

