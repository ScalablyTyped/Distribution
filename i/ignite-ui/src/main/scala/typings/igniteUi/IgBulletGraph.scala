package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBulletGraph
  extends /**
	 * Option for igBulletGraph
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is raised when a label of the bullet graph is aligned along the scale.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of the bullet graph scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of the bullet graph scale.
  	 * Use ui.value to obtain the value on the the bullet graph scale associated with the label.
  	 * Use ui.label to obtain the string value of the label.
  	 * Use ui.width to obtain the width of the label.
  	 * Use ui.height to obtain the height of the label.
  	 * Use ui.offsetX to obtain the X offset of the label on the bullet graph scale.
  	 * Use ui.offsetY to obtain the Y offset of the label on the bullet graph scale.
  	 */
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.undefined
  /**
  	 * Gets or sets the brush to use to fill the backing of the bullet graph.
  	 */
  var backingBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the inner extent of the bullet graph backing.
  	 */
  var backingInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the outer extent of the bullet graph backing.
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
  	 * Event which is raised when a label of the bullet graph is formatted.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to the bullet graph widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of the bullet graph scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of the bullet graph scale.
  	 * Use ui.value to obtain the value on the the bullet graph scale associated with the label.
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
  	 * Gets or sets a value indicating whether the scale is inverted.
  	 * When the scale is inverted the direction in which the scale values increase is right to left.
  	 */
  var isScaleInverted: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
  	 * Values further from zero than 1 can be used to hide the labels of the bullet graph.
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
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var minorTickEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var minorTickStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.undefined
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
  	 * Gets or sets a collection of brushes to be used as the palette for bullet graph ranges.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeBrushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var rangeInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var rangeOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for bullet graph outlines.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeOutlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the ranges' tooltip template.
  	 */
  var rangeToolTipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the scale ranges to render on the bullet graph.
  	 */
  var ranges: js.UndefOr[js.Array[IgBulletGraphRange]] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Gets or sets the background brush for the scale.
  	 */
  var scaleBackgroundBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the background outline for the scale.
  	 */
  var scaleBackgroundOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the background outline thickness for the scale.
  	 */
  var scaleBackgroundThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var scaleEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the bullet graph as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var scaleStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets a value indicating whether tooltips are enabled.
  	 */
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
  	 */
  var showToolTipTimeout: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the value indicated by the target value bar.
  	 */
  var targetValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Get or sets the breadth of the target value element.
  	 */
  var targetValueBreadth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use when rendering the fill of the comparative marker.
  	 */
  var targetValueBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the target value, measured from the front/bottom of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var targetValueInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the name used for the target value. The name is displayed in the default target value tooltip.
  	 */
  var targetValueName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the target value, measured from the front/bottom of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var targetValueOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use when rendering the outline of the target value.
  	 */
  var targetValueOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness of the outline of the target value bar.
  	 */
  var targetValueStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the target value's tooltip template.
  	 */
  var targetValueToolTipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var tickEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
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
  	 * Gets or sets the number of milliseconds over which changes to the bullet graph should be animated.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the value at which the bar ends.
  	 */
  var value: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the actual value element.
  	 */
  var valueBrush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to start rendering the actual value geometries, measured from the front/bottom of the bullet graph as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var valueInnerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the name used for actual value.
  	 */
  var valueName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position at which to stop rendering the actual value geometries as a value from 0 to 1 measured from the front/bottom of the bullet graph.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
  	 */
  var valueOuterExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush to use for the outline of actual value element.
  	 */
  var valueOutline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering single actual value element.
  	 */
  var valueStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the value's tooltip template.
  	 */
  var valueToolTipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgBulletGraph {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igBulletGraph
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    alignLabel: (/* event */ Event_, /* ui */ AlignLabelEventUIParam) => Unit = null,
    backingBrush: String = null,
    backingInnerExtent: Int | Double = null,
    backingOuterExtent: Int | Double = null,
    backingOutline: String = null,
    backingStrokeThickness: Int | Double = null,
    font: String = null,
    fontBrush: String = null,
    formatLabel: (/* event */ Event_, /* ui */ FormatLabelEventUIParam) => Unit = null,
    height: String | Double = null,
    interval: Int | Double = null,
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
    orientation: String = null,
    pixelScalingRatio: Int | Double = null,
    rangeBrushes: js.Any = null,
    rangeInnerExtent: Int | Double = null,
    rangeOuterExtent: Int | Double = null,
    rangeOutlines: js.Any = null,
    rangeToolTipTemplate: String = null,
    ranges: js.Array[IgBulletGraphRange] = null,
    regional: String | js.Object = null,
    scaleBackgroundBrush: String = null,
    scaleBackgroundOutline: String = null,
    scaleBackgroundThickness: Int | Double = null,
    scaleEndExtent: Int | Double = null,
    scaleStartExtent: Int | Double = null,
    showToolTip: js.UndefOr[Boolean] = js.undefined,
    showToolTipTimeout: Int | Double = null,
    targetValue: Int | Double = null,
    targetValueBreadth: Int | Double = null,
    targetValueBrush: String = null,
    targetValueInnerExtent: Int | Double = null,
    targetValueName: String = null,
    targetValueOuterExtent: Int | Double = null,
    targetValueOutline: String = null,
    targetValueStrokeThickness: Int | Double = null,
    targetValueToolTipTemplate: String = null,
    tickBrush: String = null,
    tickEndExtent: Int | Double = null,
    tickStartExtent: Int | Double = null,
    tickStrokeThickness: Int | Double = null,
    ticksPostInitial: Int | Double = null,
    ticksPreTerminal: Int | Double = null,
    transitionDuration: Int | Double = null,
    value: Int | Double = null,
    valueBrush: String = null,
    valueInnerExtent: Int | Double = null,
    valueName: String = null,
    valueOuterExtent: Int | Double = null,
    valueOutline: String = null,
    valueStrokeThickness: Int | Double = null,
    valueToolTipTemplate: String = null,
    width: String | Double = null
  ): IgBulletGraph = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignLabel != null) __obj.updateDynamic("alignLabel")(js.Any.fromFunction2(alignLabel))
    if (backingBrush != null) __obj.updateDynamic("backingBrush")(backingBrush.asInstanceOf[js.Any])
    if (backingInnerExtent != null) __obj.updateDynamic("backingInnerExtent")(backingInnerExtent.asInstanceOf[js.Any])
    if (backingOuterExtent != null) __obj.updateDynamic("backingOuterExtent")(backingOuterExtent.asInstanceOf[js.Any])
    if (backingOutline != null) __obj.updateDynamic("backingOutline")(backingOutline.asInstanceOf[js.Any])
    if (backingStrokeThickness != null) __obj.updateDynamic("backingStrokeThickness")(backingStrokeThickness.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontBrush != null) __obj.updateDynamic("fontBrush")(fontBrush.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(isScaleInverted)) __obj.updateDynamic("isScaleInverted")(isScaleInverted.asInstanceOf[js.Any])
    if (labelExtent != null) __obj.updateDynamic("labelExtent")(labelExtent.asInstanceOf[js.Any])
    if (labelInterval != null) __obj.updateDynamic("labelInterval")(labelInterval.asInstanceOf[js.Any])
    if (labelsPostInitial != null) __obj.updateDynamic("labelsPostInitial")(labelsPostInitial.asInstanceOf[js.Any])
    if (labelsPreTerminal != null) __obj.updateDynamic("labelsPreTerminal")(labelsPreTerminal.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (minorTickBrush != null) __obj.updateDynamic("minorTickBrush")(minorTickBrush.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickEndExtent != null) __obj.updateDynamic("minorTickEndExtent")(minorTickEndExtent.asInstanceOf[js.Any])
    if (minorTickStartExtent != null) __obj.updateDynamic("minorTickStartExtent")(minorTickStartExtent.asInstanceOf[js.Any])
    if (minorTickStrokeThickness != null) __obj.updateDynamic("minorTickStrokeThickness")(minorTickStrokeThickness.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (rangeBrushes != null) __obj.updateDynamic("rangeBrushes")(rangeBrushes.asInstanceOf[js.Any])
    if (rangeInnerExtent != null) __obj.updateDynamic("rangeInnerExtent")(rangeInnerExtent.asInstanceOf[js.Any])
    if (rangeOuterExtent != null) __obj.updateDynamic("rangeOuterExtent")(rangeOuterExtent.asInstanceOf[js.Any])
    if (rangeOutlines != null) __obj.updateDynamic("rangeOutlines")(rangeOutlines.asInstanceOf[js.Any])
    if (rangeToolTipTemplate != null) __obj.updateDynamic("rangeToolTipTemplate")(rangeToolTipTemplate.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (scaleBackgroundBrush != null) __obj.updateDynamic("scaleBackgroundBrush")(scaleBackgroundBrush.asInstanceOf[js.Any])
    if (scaleBackgroundOutline != null) __obj.updateDynamic("scaleBackgroundOutline")(scaleBackgroundOutline.asInstanceOf[js.Any])
    if (scaleBackgroundThickness != null) __obj.updateDynamic("scaleBackgroundThickness")(scaleBackgroundThickness.asInstanceOf[js.Any])
    if (scaleEndExtent != null) __obj.updateDynamic("scaleEndExtent")(scaleEndExtent.asInstanceOf[js.Any])
    if (scaleStartExtent != null) __obj.updateDynamic("scaleStartExtent")(scaleStartExtent.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip.asInstanceOf[js.Any])
    if (showToolTipTimeout != null) __obj.updateDynamic("showToolTipTimeout")(showToolTipTimeout.asInstanceOf[js.Any])
    if (targetValue != null) __obj.updateDynamic("targetValue")(targetValue.asInstanceOf[js.Any])
    if (targetValueBreadth != null) __obj.updateDynamic("targetValueBreadth")(targetValueBreadth.asInstanceOf[js.Any])
    if (targetValueBrush != null) __obj.updateDynamic("targetValueBrush")(targetValueBrush.asInstanceOf[js.Any])
    if (targetValueInnerExtent != null) __obj.updateDynamic("targetValueInnerExtent")(targetValueInnerExtent.asInstanceOf[js.Any])
    if (targetValueName != null) __obj.updateDynamic("targetValueName")(targetValueName.asInstanceOf[js.Any])
    if (targetValueOuterExtent != null) __obj.updateDynamic("targetValueOuterExtent")(targetValueOuterExtent.asInstanceOf[js.Any])
    if (targetValueOutline != null) __obj.updateDynamic("targetValueOutline")(targetValueOutline.asInstanceOf[js.Any])
    if (targetValueStrokeThickness != null) __obj.updateDynamic("targetValueStrokeThickness")(targetValueStrokeThickness.asInstanceOf[js.Any])
    if (targetValueToolTipTemplate != null) __obj.updateDynamic("targetValueToolTipTemplate")(targetValueToolTipTemplate.asInstanceOf[js.Any])
    if (tickBrush != null) __obj.updateDynamic("tickBrush")(tickBrush.asInstanceOf[js.Any])
    if (tickEndExtent != null) __obj.updateDynamic("tickEndExtent")(tickEndExtent.asInstanceOf[js.Any])
    if (tickStartExtent != null) __obj.updateDynamic("tickStartExtent")(tickStartExtent.asInstanceOf[js.Any])
    if (tickStrokeThickness != null) __obj.updateDynamic("tickStrokeThickness")(tickStrokeThickness.asInstanceOf[js.Any])
    if (ticksPostInitial != null) __obj.updateDynamic("ticksPostInitial")(ticksPostInitial.asInstanceOf[js.Any])
    if (ticksPreTerminal != null) __obj.updateDynamic("ticksPreTerminal")(ticksPreTerminal.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBrush != null) __obj.updateDynamic("valueBrush")(valueBrush.asInstanceOf[js.Any])
    if (valueInnerExtent != null) __obj.updateDynamic("valueInnerExtent")(valueInnerExtent.asInstanceOf[js.Any])
    if (valueName != null) __obj.updateDynamic("valueName")(valueName.asInstanceOf[js.Any])
    if (valueOuterExtent != null) __obj.updateDynamic("valueOuterExtent")(valueOuterExtent.asInstanceOf[js.Any])
    if (valueOutline != null) __obj.updateDynamic("valueOutline")(valueOutline.asInstanceOf[js.Any])
    if (valueStrokeThickness != null) __obj.updateDynamic("valueStrokeThickness")(valueStrokeThickness.asInstanceOf[js.Any])
    if (valueToolTipTemplate != null) __obj.updateDynamic("valueToolTipTemplate")(valueToolTipTemplate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgBulletGraph]
  }
}

