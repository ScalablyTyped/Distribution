package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgLinearGauge
  extends /**
	 * Option for igLinearGauge
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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
  var backingBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the inner extent of the linear gauge backing.
  	 */
  var backingInnerExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the outer extent of the linear gauge backing.
  	 */
  var backingOuterExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the font.
  	 */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[java.lang.String] = js.undefined
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
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for the scale.
  	 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether needle dragging is enabled or not.
  	 */
  var isNeedleDraggingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets a value indicating whether the scale is inverted.
  	 * When the scale is inverted the direction in which the scale values increase is right to left.
  	 */
  var isScaleInverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
  	 * Values further from zero than 1 can be used to hide the labels of the linear gauge.
  	 */
  var labelExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
  	 */
  var labelInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A value to start adding labels, added to the scale's MinimumValue.
  	 */
  var labelsPostInitial: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A value to stop adding labels, subtracted from the scale's MaximumValue.
  	 */
  var labelsPreTerminal: js.UndefOr[scala.Double] = js.undefined
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
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var minorTickEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var minorTickStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the needle breadth.
  	 */
  var needleBreadth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for needle element.
  	 */
  var needleBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the width of the needle's inner base.
  	 */
  var needleInnerBaseWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the needle geometry, measured from the front/bottom of the linear gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var needleInnerExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the extent of the needle's inner point.
  	 */
  var needleInnerPointExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle's inner point.
  	 */
  var needleInnerPointWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the name used for needle.
  	 */
  var needleName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the width of the needle's outer base.
  	 */
  var needleOuterBaseWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the needle geometry as a value from 0 to 1 measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var needleOuterExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the extent of the needle's outer point.
  	 */
  var needleOuterPointExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the width of the needle's outer point.
  	 */
  var needleOuterPointWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of needle element.
  	 */
  var needleOutline: js.UndefOr[java.lang.String] = js.undefined
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
  var needleShape: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering single actual value element.
  	 */
  var needleStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the needle's tooltip template.
  	 */
  var needleToolTipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the orientation of the scale.
  	 *
  	 * Valid values:
  	 * "horizontal" The scale has a horizontal orientation.
  	 * "vertical" The scale has a vertical orientation.
  	 */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for linear gauge ranges.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var rangeInnerExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var rangeOuterExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for linear gauge outlines.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the ranges' tooltip template.
  	 */
  var rangeToolTipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the scale ranges to render on the linear gauge.
  	 */
  var ranges: js.UndefOr[js.Array[IgLinearGaugeRange]] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the scale of the linear gauge.
  	 */
  var scaleBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the bottom/front (when orientation is horizontal/vertical) of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleInnerExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the bottom/front (when orientation is horizontal/vertical) of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleOuterExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of the scale.
  	 */
  var scaleOutline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the linear gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the scale outline.
  	 */
  var scaleStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets a value indicating whether tooltips are enabled.
  	 */
  var showToolTip: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
  	 */
  var showToolTipTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var tickEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var tickStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering ticks.
  	 */
  var tickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A value to start adding tickmarks, added to the scale's MinimumValue.
  	 */
  var ticksPostInitial: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A value to stop adding tickmarks, subtracted from the scale's MaximumValue.
  	 */
  var ticksPreTerminal: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the number of milliseconds over which changes to the linear gauge should be animated.
  	 */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the value at which the needle is positioned.
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

