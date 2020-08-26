package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.native
  /**
    * Gets or sets the brush to use to fill the backing of the bullet graph.
    */
  var backingBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the inner extent of the bullet graph backing.
    */
  var backingInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the outer extent of the bullet graph backing.
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
    * Event which is raised when a label of the bullet graph is formatted.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to the bullet graph widget.
    * Use ui.actualMinimumValue to obtain the minimum value of the bullet graph scale.
    * Use ui.actualMaximumValue to obtain the maximum value of the bullet graph scale.
    * Use ui.value to obtain the value on the the bullet graph scale associated with the label.
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
    * Gets or sets a value indicating whether the scale is inverted.
    * When the scale is inverted the direction in which the scale values increase is right to left.
    */
  var isScaleInverted: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
    * Values further from zero than 1 can be used to hide the labels of the bullet graph.
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
    * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var minorTickEndExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var minorTickStartExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the stroke thickness to use when rendering minor ticks.
    */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.native
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
    * Gets or sets a collection of brushes to be used as the palette for bullet graph ranges.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeBrushes: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var rangeInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var rangeOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets a collection of brushes to be used as the palette for bullet graph outlines.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeOutlines: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the ranges' tooltip template.
    */
  var rangeToolTipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the scale ranges to render on the bullet graph.
    */
  var ranges: js.UndefOr[js.Array[IgBulletGraphRange]] = js.native
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
    * Gets or sets the background brush for the scale.
    */
  var scaleBackgroundBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the background outline for the scale.
    */
  var scaleBackgroundOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the background outline thickness for the scale.
    */
  var scaleBackgroundThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var scaleEndExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the bullet graph as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var scaleStartExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets a value indicating whether tooltips are enabled.
    */
  var showToolTip: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
    */
  var showToolTipTimeout: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the value indicated by the target value bar.
    */
  var targetValue: js.UndefOr[Double] = js.native
  /**
    * Get or sets the breadth of the target value element.
    */
  var targetValueBreadth: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use when rendering the fill of the comparative marker.
    */
  var targetValueBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to start rendering the target value, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var targetValueInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the name used for the target value. The name is displayed in the default target value tooltip.
    */
  var targetValueName: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to start rendering the target value, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var targetValueOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use when rendering the outline of the target value.
    */
  var targetValueOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the stroke thickness of the outline of the target value bar.
    */
  var targetValueStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the target value's tooltip template.
    */
  var targetValueToolTipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the brush to use for the major tickmarks.
    */
  var tickBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var tickEndExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
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
    * Gets or sets the number of milliseconds over which changes to the bullet graph should be animated.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the value at which the bar ends.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the actual value element.
    */
  var valueBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to start rendering the actual value geometries, measured from the front/bottom of the bullet graph as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var valueInnerExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the name used for actual value.
    */
  var valueName: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position at which to stop rendering the actual value geometries as a value from 0 to 1 measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var valueOuterExtent: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the brush to use for the outline of actual value element.
    */
  var valueOutline: js.UndefOr[String] = js.native
  /**
    * Gets or sets the stroke thickness to use when rendering single actual value element.
    */
  var valueStrokeThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the value's tooltip template.
    */
  var valueToolTipTemplate: js.UndefOr[String] = js.native
  /**
    * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgBulletGraph {
  @scala.inline
  def apply(): IgBulletGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBulletGraph]
  }
  @scala.inline
  implicit class IgBulletGraphOps[Self <: IgBulletGraph] (val x: Self) extends AnyVal {
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
    def setRangesVarargs(value: IgBulletGraphRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[IgBulletGraphRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    @scala.inline
    def setScaleBackgroundBrush(value: String): Self = this.set("scaleBackgroundBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleBackgroundBrush: Self = this.set("scaleBackgroundBrush", js.undefined)
    @scala.inline
    def setScaleBackgroundOutline(value: String): Self = this.set("scaleBackgroundOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleBackgroundOutline: Self = this.set("scaleBackgroundOutline", js.undefined)
    @scala.inline
    def setScaleBackgroundThickness(value: Double): Self = this.set("scaleBackgroundThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleBackgroundThickness: Self = this.set("scaleBackgroundThickness", js.undefined)
    @scala.inline
    def setScaleEndExtent(value: Double): Self = this.set("scaleEndExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleEndExtent: Self = this.set("scaleEndExtent", js.undefined)
    @scala.inline
    def setScaleStartExtent(value: Double): Self = this.set("scaleStartExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleStartExtent: Self = this.set("scaleStartExtent", js.undefined)
    @scala.inline
    def setShowToolTip(value: Boolean): Self = this.set("showToolTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolTip: Self = this.set("showToolTip", js.undefined)
    @scala.inline
    def setShowToolTipTimeout(value: Double): Self = this.set("showToolTipTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolTipTimeout: Self = this.set("showToolTipTimeout", js.undefined)
    @scala.inline
    def setTargetValue(value: Double): Self = this.set("targetValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValue: Self = this.set("targetValue", js.undefined)
    @scala.inline
    def setTargetValueBreadth(value: Double): Self = this.set("targetValueBreadth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueBreadth: Self = this.set("targetValueBreadth", js.undefined)
    @scala.inline
    def setTargetValueBrush(value: String): Self = this.set("targetValueBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueBrush: Self = this.set("targetValueBrush", js.undefined)
    @scala.inline
    def setTargetValueInnerExtent(value: Double): Self = this.set("targetValueInnerExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueInnerExtent: Self = this.set("targetValueInnerExtent", js.undefined)
    @scala.inline
    def setTargetValueName(value: String): Self = this.set("targetValueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueName: Self = this.set("targetValueName", js.undefined)
    @scala.inline
    def setTargetValueOuterExtent(value: Double): Self = this.set("targetValueOuterExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueOuterExtent: Self = this.set("targetValueOuterExtent", js.undefined)
    @scala.inline
    def setTargetValueOutline(value: String): Self = this.set("targetValueOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueOutline: Self = this.set("targetValueOutline", js.undefined)
    @scala.inline
    def setTargetValueStrokeThickness(value: Double): Self = this.set("targetValueStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueStrokeThickness: Self = this.set("targetValueStrokeThickness", js.undefined)
    @scala.inline
    def setTargetValueToolTipTemplate(value: String): Self = this.set("targetValueToolTipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetValueToolTipTemplate: Self = this.set("targetValueToolTipTemplate", js.undefined)
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
    def setValueBrush(value: String): Self = this.set("valueBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueBrush: Self = this.set("valueBrush", js.undefined)
    @scala.inline
    def setValueInnerExtent(value: Double): Self = this.set("valueInnerExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInnerExtent: Self = this.set("valueInnerExtent", js.undefined)
    @scala.inline
    def setValueName(value: String): Self = this.set("valueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueName: Self = this.set("valueName", js.undefined)
    @scala.inline
    def setValueOuterExtent(value: Double): Self = this.set("valueOuterExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueOuterExtent: Self = this.set("valueOuterExtent", js.undefined)
    @scala.inline
    def setValueOutline(value: String): Self = this.set("valueOutline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueOutline: Self = this.set("valueOutline", js.undefined)
    @scala.inline
    def setValueStrokeThickness(value: Double): Self = this.set("valueStrokeThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueStrokeThickness: Self = this.set("valueStrokeThickness", js.undefined)
    @scala.inline
    def setValueToolTipTemplate(value: String): Self = this.set("valueToolTipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueToolTipTemplate: Self = this.set("valueToolTipTemplate", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

