package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.native
  
  /**
    * Gets or sets the brush to use to fill the backing of the gauge.
    */
  var backingBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the corner rounding radius to use for the fitted scale backings.
    */
  var backingCornerRadius: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the inner extent of the gauge backing.
    */
  var backingInnerExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the outer extent of the gauge backing.
    */
  var backingOuterExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use for the outline of the backing.
    */
  var backingOutline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the over sweep angle to apply to the backing if it is displaying fitted (in degrees). Must be greater or equal to 0.
    */
  var backingOversweep: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the type of shape to use for the backing of the gauge.
    *
    * Valid values:
    * "circular" A circular backing shape.
    * "fitted" A fitted backing shape.
    */
  var backingShape: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the stroke thickness of the backing outline.
    */
  var backingStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the x position of the center of the gauge with the value ranging from 0 to 1.
    */
  var centerX: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the y position of the center of the gauge with the value ranging from 0 to 1.
    */
  var centerY: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the strategy to use for omitting labels if the first and last label have the same value.
    *
    * Valid values:
    * "omitLast" Omit the last label.
    * "omitFirst" Omit the first label.
    * "omitNeither" Omit no labels.
    * "omitBoth" Omit both labels.
    */
  var duplicateLabelOmissionStrategy: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the font.
    */
  var font: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the brush to use for the label font.
    */
  var fontBrush: js.UndefOr[String] = js.native
  
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
    * Gets or sets whether the needle is constrained within the minimum and maximum value range during dragging.
    */
  var isNeedleDraggingConstrained: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether needle dragging is enabled or not.
    */
  var isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the position at which to put the labels as a value from 0 to 1, measured form the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var labelExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
    */
  var labelInterval: js.UndefOr[Double] = js.native
  
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
    * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var minorTickEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var minorTickStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the stroke thickness to use when rendering minor ticks.
    */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the extent of the feature which is closest to the base (e.g. a bulb) with a value from -1 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needleBaseFeatureExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the width of the needle at its feature which is closest to the base (e.g. a bulb) with a value from 0 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needleBaseFeatureWidthRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use when rendering the fill of the needle.
    */
  var needleBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the extent (from -1 to 1) at which to end rendering the needle, measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needleEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needleEndWidthRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use when rendering the outline of the needle.
    */
  var needleOutline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the brush to use for filling the needle cap. Note: this only applies to certain cap shapes.
    */
  var needlePivotBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the width of the inner cutout section of the needle cap with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle that has a cutout section.
    */
  var needlePivotInnerWidthRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use for the outlines of the needle cap.
    */
  var needlePivotOutline: js.UndefOr[String] = js.native
  
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
  var needlePivotShape: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the stroke thickness to use for the outline of the needle cap.
    */
  var needlePivotStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the width of the cap of the needle with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needlePivotWidthRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the extent of the feature which is closest to the point (e.g. the tapering point of a needle) with a value from -1 to 1. Note: Only some needle shapes respect this property.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needlePointFeatureExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the width of the needle at its feature which is closest to the point (e.g. the tapering point of a needle) with a value from 0 to 1. Note: Only some needle shapes respect this property.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needlePointFeatureWidthRatio: js.UndefOr[Double] = js.native
  
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
  var needleShape: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the extent (from -1 to 1) at which to start rendering the needle, measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needleStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var needleStartWidthRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the stroke thickness of the needle outline.
    */
  var needleStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the multiplying factor to apply to the normal radius of the gauge.
    * The radius of the gauge is defined by the minimum of the width and height of the control divided by 2.0.
    * This introduces a multiplicative factor to that value.
    */
  var radiusMultiplier: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets a collection of brushes to be used as the palette for gauge ranges.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets a collection of brushes to be used as the palette for gauge outlines.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeOutlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the scale ranges to render on the linear gauge.
    */
  var ranges: js.UndefOr[js.Array[IgRadialGaugeRange]] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Gets or sets the brush to use to fill the background of the scale.
    */
  var scaleBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the end angle for the scale in degrees.
    */
  var scaleEndAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var scaleEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the extra degrees of sweep to apply to the scale background. Must be greater or equal to 0.
    */
  var scaleOversweep: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the oversweep shape to use for the excess fill area for the scale.
    *
    * Valid values:
    * "auto" A default oversweep shape.
    * "circular" A circular oversweep shape.
    * "fitted" A fitted oversweep shape.
    */
  var scaleOversweepShape: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the start angle for the scale in degrees.
    */
  var scaleStartAngle: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the scale, measured from the center of the gauge as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var scaleStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the direction in which the scale sweeps around the center from the start angle to end angle.
    *
    * Valid values:
    * "counterclockwise" In a direction opposite the typical forward movement of the hands of a clock.
    * "clockwise" In a direction corresponding to the typical forward movement of the hands of a clock.
    */
  var scaleSweepDirection: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the brush to use for the major tickmarks.
    */
  var tickBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var tickEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
    * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
    */
  var tickStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the stroke thickness to use when rendering ticks.
    */
  var tickStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the number of milliseconds over which changes to the gauge should be animated.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the easing function used to morph the current series.
    */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the transition progress of the animation when the control is animating.
    */
  var transitionProgress: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the value at which to point the needle of the gauge.
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
object IgRadialGauge {
  
  @scala.inline
  def apply(): IgRadialGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialGauge]
  }
  
  @scala.inline
  implicit class IgRadialGaugeOps[Self <: IgRadialGauge] (val x: Self) extends AnyVal {
    
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
    def setBackingCornerRadius(value: Double): Self = this.set("backingCornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackingCornerRadius: Self = this.set("backingCornerRadius", js.undefined)
    
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
    def setBackingOversweep(value: Double): Self = this.set("backingOversweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackingOversweep: Self = this.set("backingOversweep", js.undefined)
    
    @scala.inline
    def setBackingShape(value: String): Self = this.set("backingShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackingShape: Self = this.set("backingShape", js.undefined)
    
    @scala.inline
    def setBackingStrokeThickness(value: Double): Self = this.set("backingStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackingStrokeThickness: Self = this.set("backingStrokeThickness", js.undefined)
    
    @scala.inline
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterX: Self = this.set("centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterY: Self = this.set("centerY", js.undefined)
    
    @scala.inline
    def setDuplicateLabelOmissionStrategy(value: String): Self = this.set("duplicateLabelOmissionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicateLabelOmissionStrategy: Self = this.set("duplicateLabelOmissionStrategy", js.undefined)
    
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
    def setIsNeedleDraggingConstrained(value: Boolean): Self = this.set("isNeedleDraggingConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNeedleDraggingConstrained: Self = this.set("isNeedleDraggingConstrained", js.undefined)
    
    @scala.inline
    def setIsNeedleDraggingEnabled(value: Boolean): Self = this.set("isNeedleDraggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNeedleDraggingEnabled: Self = this.set("isNeedleDraggingEnabled", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = this.set("labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelExtent: Self = this.set("labelExtent", js.undefined)
    
    @scala.inline
    def setLabelInterval(value: Double): Self = this.set("labelInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInterval: Self = this.set("labelInterval", js.undefined)
    
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
    def setNeedleBaseFeatureExtent(value: Double): Self = this.set("needleBaseFeatureExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleBaseFeatureExtent: Self = this.set("needleBaseFeatureExtent", js.undefined)
    
    @scala.inline
    def setNeedleBaseFeatureWidthRatio(value: Double): Self = this.set("needleBaseFeatureWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleBaseFeatureWidthRatio: Self = this.set("needleBaseFeatureWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleBrush(value: String): Self = this.set("needleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleBrush: Self = this.set("needleBrush", js.undefined)
    
    @scala.inline
    def setNeedleEndExtent(value: Double): Self = this.set("needleEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleEndExtent: Self = this.set("needleEndExtent", js.undefined)
    
    @scala.inline
    def setNeedleEndWidthRatio(value: Double): Self = this.set("needleEndWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleEndWidthRatio: Self = this.set("needleEndWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleOutline(value: String): Self = this.set("needleOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleOutline: Self = this.set("needleOutline", js.undefined)
    
    @scala.inline
    def setNeedlePivotBrush(value: String): Self = this.set("needlePivotBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePivotBrush: Self = this.set("needlePivotBrush", js.undefined)
    
    @scala.inline
    def setNeedlePivotInnerWidthRatio(value: Double): Self = this.set("needlePivotInnerWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePivotInnerWidthRatio: Self = this.set("needlePivotInnerWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedlePivotOutline(value: String): Self = this.set("needlePivotOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePivotOutline: Self = this.set("needlePivotOutline", js.undefined)
    
    @scala.inline
    def setNeedlePivotShape(value: String): Self = this.set("needlePivotShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePivotShape: Self = this.set("needlePivotShape", js.undefined)
    
    @scala.inline
    def setNeedlePivotStrokeThickness(value: Double): Self = this.set("needlePivotStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePivotStrokeThickness: Self = this.set("needlePivotStrokeThickness", js.undefined)
    
    @scala.inline
    def setNeedlePivotWidthRatio(value: Double): Self = this.set("needlePivotWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePivotWidthRatio: Self = this.set("needlePivotWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedlePointFeatureExtent(value: Double): Self = this.set("needlePointFeatureExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePointFeatureExtent: Self = this.set("needlePointFeatureExtent", js.undefined)
    
    @scala.inline
    def setNeedlePointFeatureWidthRatio(value: Double): Self = this.set("needlePointFeatureWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedlePointFeatureWidthRatio: Self = this.set("needlePointFeatureWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleShape(value: String): Self = this.set("needleShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleShape: Self = this.set("needleShape", js.undefined)
    
    @scala.inline
    def setNeedleStartExtent(value: Double): Self = this.set("needleStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleStartExtent: Self = this.set("needleStartExtent", js.undefined)
    
    @scala.inline
    def setNeedleStartWidthRatio(value: Double): Self = this.set("needleStartWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleStartWidthRatio: Self = this.set("needleStartWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleStrokeThickness(value: Double): Self = this.set("needleStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedleStrokeThickness: Self = this.set("needleStrokeThickness", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setRadiusMultiplier(value: Double): Self = this.set("radiusMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusMultiplier: Self = this.set("radiusMultiplier", js.undefined)
    
    @scala.inline
    def setRangeBrushes(value: js.Any): Self = this.set("rangeBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeBrushes: Self = this.set("rangeBrushes", js.undefined)
    
    @scala.inline
    def setRangeOutlines(value: js.Any): Self = this.set("rangeOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeOutlines: Self = this.set("rangeOutlines", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: IgRadialGaugeRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[IgRadialGaugeRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
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
    def setScaleEndAngle(value: Double): Self = this.set("scaleEndAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleEndAngle: Self = this.set("scaleEndAngle", js.undefined)
    
    @scala.inline
    def setScaleEndExtent(value: Double): Self = this.set("scaleEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleEndExtent: Self = this.set("scaleEndExtent", js.undefined)
    
    @scala.inline
    def setScaleOversweep(value: Double): Self = this.set("scaleOversweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleOversweep: Self = this.set("scaleOversweep", js.undefined)
    
    @scala.inline
    def setScaleOversweepShape(value: String): Self = this.set("scaleOversweepShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleOversweepShape: Self = this.set("scaleOversweepShape", js.undefined)
    
    @scala.inline
    def setScaleStartAngle(value: Double): Self = this.set("scaleStartAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleStartAngle: Self = this.set("scaleStartAngle", js.undefined)
    
    @scala.inline
    def setScaleStartExtent(value: Double): Self = this.set("scaleStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleStartExtent: Self = this.set("scaleStartExtent", js.undefined)
    
    @scala.inline
    def setScaleSweepDirection(value: String): Self = this.set("scaleSweepDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleSweepDirection: Self = this.set("scaleSweepDirection", js.undefined)
    
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
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEasingFunction(value: js.Any): Self = this.set("transitionEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionEasingFunction: Self = this.set("transitionEasingFunction", js.undefined)
    
    @scala.inline
    def setTransitionProgress(value: Double): Self = this.set("transitionProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionProgress: Self = this.set("transitionProgress", js.undefined)
    
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
