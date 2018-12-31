package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGauge
  extends /**
	 * Option for igRadialGauge
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var backingBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the corner rounding radius to use for the fitted scale backings.
  	 */
  var backingCornerRadius: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the inner extent of the gauge backing.
  	 */
  var backingInnerExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the outer extent of the gauge backing.
  	 */
  var backingOuterExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the over sweep angle to apply to the backing if it is displaying fitted (in degrees). Must be greater or equal to 0.
  	 */
  var backingOversweep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the type of shape to use for the backing of the gauge.
  	 *
  	 * Valid values:
  	 * "circular" A circular backing shape.
  	 * "fitted" A fitted backing shape.
  	 */
  var backingShape: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the x position of the center of the gauge with the value ranging from 0 to 1.
  	 */
  var centerX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the y position of the center of the gauge with the value ranging from 0 to 1.
  	 */
  var centerY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the strategy to use for omitting labels if the first and last label have the same value.
  	 *
  	 * Valid values:
  	 * "omitLast" Omit the last label.
  	 * "omitFirst" Omit the first label.
  	 * "omitNeither" Omit no labels.
  	 * "omitBoth" Omit both labels.
  	 */
  var duplicateLabelOmissionStrategy: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the font.
  	 */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[java.lang.String] = js.undefined
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
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for the scale.
  	 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether the needle is constrained within the minimum and maximum value range during dragging.
  	 */
  var isNeedleDraggingConstrained: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether needle dragging is enabled or not.
  	 */
  var isNeedleDraggingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured form the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var labelExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
  	 */
  var labelInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the maximum value of the scale.
  	 */
  var maximumValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the minimum value of the scale.
  	 */
  var minimumValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the minor tickmarks.
  	 */
  var minorTickBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the number of minor tickmarks to place between major tickmarks.
  	 */
  var minorTickCount: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var minorTickEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var minorTickStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the extent of the feature which is closest to the base (e.g. a bulb) with a value from -1 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleBaseFeatureExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its feature which is closest to the base (e.g. a bulb) with a value from 0 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleBaseFeatureWidthRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use when rendering the fill of the needle.
  	 */
  var needleBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the extent (from -1 to 1) at which to end rendering the needle, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleEndWidthRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use when rendering the outline of the needle.
  	 */
  var needleOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for filling the needle cap. Note: this only applies to certain cap shapes.
  	 */
  var needlePivotBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the width of the inner cutout section of the needle cap with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle that has a cutout section.
  	 */
  var needlePivotInnerWidthRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outlines of the needle cap.
  	 */
  var needlePivotOutline: js.UndefOr[java.lang.String] = js.undefined
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
  var needlePivotShape: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use for the outline of the needle cap.
  	 */
  var needlePivotStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the cap of the needle with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePivotWidthRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the extent of the feature which is closest to the point (e.g. the tapering point of a needle) with a value from -1 to 1. Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePointFeatureExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its feature which is closest to the point (e.g. the tapering point of a needle) with a value from 0 to 1. Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePointFeatureWidthRatio: js.UndefOr[scala.Double] = js.undefined
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
  var needleShape: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the extent (from -1 to 1) at which to start rendering the needle, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleStartWidthRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the needle outline.
  	 */
  var needleStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the multiplying factor to apply to the normal radius of the gauge.
  	 * The radius of the gauge is defined by the minimum of the width and height of the control divided by 2.0.
  	 * This introduces a multiplicative factor to that value.
  	 */
  var radiusMultiplier: js.UndefOr[scala.Double] = js.undefined
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
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the background of the scale.
  	 */
  var scaleBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the end angle for the scale in degrees.
  	 */
  var scaleEndAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var scaleEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the extra degrees of sweep to apply to the scale background. Must be greater or equal to 0.
  	 */
  var scaleOversweep: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the oversweep shape to use for the excess fill area for the scale.
  	 *
  	 * Valid values:
  	 * "auto" A default oversweep shape.
  	 * "circular" A circular oversweep shape.
  	 * "fitted" A fitted oversweep shape.
  	 */
  var scaleOversweepShape: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the start angle for the scale in degrees.
  	 */
  var scaleStartAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the center of the gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var scaleStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the direction in which the scale sweeps around the center from the start angle to end angle.
  	 *
  	 * Valid values:
  	 * "counterclockwise" In a direction opposite the typical forward movement of the hands of a clock.
  	 * "clockwise" In a direction corresponding to the typical forward movement of the hands of a clock.
  	 */
  var scaleSweepDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var tickEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var tickStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering ticks.
  	 */
  var tickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the number of milliseconds over which changes to the gauge should be animated.
  	 */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the easing function used to morph the current series.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the transition progress of the animation when the control is animating.
  	 */
  var transitionProgress: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the value at which to point the needle of the gauge.
  	 */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Occurs when the Value property changes.
  	 */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.undefined
  /**
  	 * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

