package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBulletGraph
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    alignLabel: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit = null,
    backingBrush: String = null,
    backingInnerExtent: js.UndefOr[Double] = js.undefined,
    backingOuterExtent: js.UndefOr[Double] = js.undefined,
    backingOutline: String = null,
    backingStrokeThickness: js.UndefOr[Double] = js.undefined,
    font: String = null,
    fontBrush: String = null,
    formatLabel: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit = null,
    height: String | Double = null,
    interval: js.UndefOr[Double] = js.undefined,
    isScaleInverted: js.UndefOr[Boolean] = js.undefined,
    labelExtent: js.UndefOr[Double] = js.undefined,
    labelInterval: js.UndefOr[Double] = js.undefined,
    labelsPostInitial: js.UndefOr[Double] = js.undefined,
    labelsPreTerminal: js.UndefOr[Double] = js.undefined,
    language: String = null,
    locale: js.Any = null,
    maximumValue: js.UndefOr[Double] = js.undefined,
    minimumValue: js.UndefOr[Double] = js.undefined,
    minorTickBrush: String = null,
    minorTickCount: js.UndefOr[Double] = js.undefined,
    minorTickEndExtent: js.UndefOr[Double] = js.undefined,
    minorTickStartExtent: js.UndefOr[Double] = js.undefined,
    minorTickStrokeThickness: js.UndefOr[Double] = js.undefined,
    orientation: String = null,
    pixelScalingRatio: js.UndefOr[Double] = js.undefined,
    rangeBrushes: js.Any = null,
    rangeInnerExtent: js.UndefOr[Double] = js.undefined,
    rangeOuterExtent: js.UndefOr[Double] = js.undefined,
    rangeOutlines: js.Any = null,
    rangeToolTipTemplate: String = null,
    ranges: js.Array[IgBulletGraphRange] = null,
    regional: String | js.Object = null,
    scaleBackgroundBrush: String = null,
    scaleBackgroundOutline: String = null,
    scaleBackgroundThickness: js.UndefOr[Double] = js.undefined,
    scaleEndExtent: js.UndefOr[Double] = js.undefined,
    scaleStartExtent: js.UndefOr[Double] = js.undefined,
    showToolTip: js.UndefOr[Boolean] = js.undefined,
    showToolTipTimeout: js.UndefOr[Double] = js.undefined,
    targetValue: js.UndefOr[Double] = js.undefined,
    targetValueBreadth: js.UndefOr[Double] = js.undefined,
    targetValueBrush: String = null,
    targetValueInnerExtent: js.UndefOr[Double] = js.undefined,
    targetValueName: String = null,
    targetValueOuterExtent: js.UndefOr[Double] = js.undefined,
    targetValueOutline: String = null,
    targetValueStrokeThickness: js.UndefOr[Double] = js.undefined,
    targetValueToolTipTemplate: String = null,
    tickBrush: String = null,
    tickEndExtent: js.UndefOr[Double] = js.undefined,
    tickStartExtent: js.UndefOr[Double] = js.undefined,
    tickStrokeThickness: js.UndefOr[Double] = js.undefined,
    ticksPostInitial: js.UndefOr[Double] = js.undefined,
    ticksPreTerminal: js.UndefOr[Double] = js.undefined,
    transitionDuration: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    valueBrush: String = null,
    valueInnerExtent: js.UndefOr[Double] = js.undefined,
    valueName: String = null,
    valueOuterExtent: js.UndefOr[Double] = js.undefined,
    valueOutline: String = null,
    valueStrokeThickness: js.UndefOr[Double] = js.undefined,
    valueToolTipTemplate: String = null,
    width: String | Double = null
  ): IgBulletGraph = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignLabel != null) __obj.updateDynamic("alignLabel")(js.Any.fromFunction2(alignLabel))
    if (backingBrush != null) __obj.updateDynamic("backingBrush")(backingBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(backingInnerExtent)) __obj.updateDynamic("backingInnerExtent")(backingInnerExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backingOuterExtent)) __obj.updateDynamic("backingOuterExtent")(backingOuterExtent.get.asInstanceOf[js.Any])
    if (backingOutline != null) __obj.updateDynamic("backingOutline")(backingOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(backingStrokeThickness)) __obj.updateDynamic("backingStrokeThickness")(backingStrokeThickness.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontBrush != null) __obj.updateDynamic("fontBrush")(fontBrush.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(js.Any.fromFunction2(formatLabel))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isScaleInverted)) __obj.updateDynamic("isScaleInverted")(isScaleInverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelExtent)) __obj.updateDynamic("labelExtent")(labelExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInterval)) __obj.updateDynamic("labelInterval")(labelInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsPostInitial)) __obj.updateDynamic("labelsPostInitial")(labelsPostInitial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelsPreTerminal)) __obj.updateDynamic("labelsPreTerminal")(labelsPreTerminal.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumValue)) __obj.updateDynamic("maximumValue")(maximumValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumValue)) __obj.updateDynamic("minimumValue")(minimumValue.get.asInstanceOf[js.Any])
    if (minorTickBrush != null) __obj.updateDynamic("minorTickBrush")(minorTickBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickCount)) __obj.updateDynamic("minorTickCount")(minorTickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickEndExtent)) __obj.updateDynamic("minorTickEndExtent")(minorTickEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickStartExtent)) __obj.updateDynamic("minorTickStartExtent")(minorTickStartExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickStrokeThickness)) __obj.updateDynamic("minorTickStrokeThickness")(minorTickStrokeThickness.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelScalingRatio)) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.get.asInstanceOf[js.Any])
    if (rangeBrushes != null) __obj.updateDynamic("rangeBrushes")(rangeBrushes.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeInnerExtent)) __obj.updateDynamic("rangeInnerExtent")(rangeInnerExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeOuterExtent)) __obj.updateDynamic("rangeOuterExtent")(rangeOuterExtent.get.asInstanceOf[js.Any])
    if (rangeOutlines != null) __obj.updateDynamic("rangeOutlines")(rangeOutlines.asInstanceOf[js.Any])
    if (rangeToolTipTemplate != null) __obj.updateDynamic("rangeToolTipTemplate")(rangeToolTipTemplate.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (scaleBackgroundBrush != null) __obj.updateDynamic("scaleBackgroundBrush")(scaleBackgroundBrush.asInstanceOf[js.Any])
    if (scaleBackgroundOutline != null) __obj.updateDynamic("scaleBackgroundOutline")(scaleBackgroundOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleBackgroundThickness)) __obj.updateDynamic("scaleBackgroundThickness")(scaleBackgroundThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleEndExtent)) __obj.updateDynamic("scaleEndExtent")(scaleEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleStartExtent)) __obj.updateDynamic("scaleStartExtent")(scaleStartExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolTip)) __obj.updateDynamic("showToolTip")(showToolTip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolTipTimeout)) __obj.updateDynamic("showToolTipTimeout")(showToolTipTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetValue)) __obj.updateDynamic("targetValue")(targetValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetValueBreadth)) __obj.updateDynamic("targetValueBreadth")(targetValueBreadth.get.asInstanceOf[js.Any])
    if (targetValueBrush != null) __obj.updateDynamic("targetValueBrush")(targetValueBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(targetValueInnerExtent)) __obj.updateDynamic("targetValueInnerExtent")(targetValueInnerExtent.get.asInstanceOf[js.Any])
    if (targetValueName != null) __obj.updateDynamic("targetValueName")(targetValueName.asInstanceOf[js.Any])
    if (!js.isUndefined(targetValueOuterExtent)) __obj.updateDynamic("targetValueOuterExtent")(targetValueOuterExtent.get.asInstanceOf[js.Any])
    if (targetValueOutline != null) __obj.updateDynamic("targetValueOutline")(targetValueOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(targetValueStrokeThickness)) __obj.updateDynamic("targetValueStrokeThickness")(targetValueStrokeThickness.get.asInstanceOf[js.Any])
    if (targetValueToolTipTemplate != null) __obj.updateDynamic("targetValueToolTipTemplate")(targetValueToolTipTemplate.asInstanceOf[js.Any])
    if (tickBrush != null) __obj.updateDynamic("tickBrush")(tickBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(tickEndExtent)) __obj.updateDynamic("tickEndExtent")(tickEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickStartExtent)) __obj.updateDynamic("tickStartExtent")(tickStartExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickStrokeThickness)) __obj.updateDynamic("tickStrokeThickness")(tickStrokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticksPostInitial)) __obj.updateDynamic("ticksPostInitial")(ticksPostInitial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticksPreTerminal)) __obj.updateDynamic("ticksPreTerminal")(ticksPreTerminal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueBrush != null) __obj.updateDynamic("valueBrush")(valueBrush.asInstanceOf[js.Any])
    if (!js.isUndefined(valueInnerExtent)) __obj.updateDynamic("valueInnerExtent")(valueInnerExtent.get.asInstanceOf[js.Any])
    if (valueName != null) __obj.updateDynamic("valueName")(valueName.asInstanceOf[js.Any])
    if (!js.isUndefined(valueOuterExtent)) __obj.updateDynamic("valueOuterExtent")(valueOuterExtent.get.asInstanceOf[js.Any])
    if (valueOutline != null) __obj.updateDynamic("valueOutline")(valueOutline.asInstanceOf[js.Any])
    if (!js.isUndefined(valueStrokeThickness)) __obj.updateDynamic("valueStrokeThickness")(valueStrokeThickness.get.asInstanceOf[js.Any])
    if (valueToolTipTemplate != null) __obj.updateDynamic("valueToolTipTemplate")(valueToolTipTemplate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgBulletGraph]
  }
}

