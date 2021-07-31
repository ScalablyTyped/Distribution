package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRadialGauge
  extends StObject
     with /**
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
  def apply(): IgRadialGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialGauge]
  }
  
  @scala.inline
  implicit class IgRadialGaugeMutableBuilder[Self <: IgRadialGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignLabel(value: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit): Self = StObject.set(x, "alignLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAlignLabelUndefined: Self = StObject.set(x, "alignLabel", js.undefined)
    
    @scala.inline
    def setBackingBrush(value: String): Self = StObject.set(x, "backingBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingBrushUndefined: Self = StObject.set(x, "backingBrush", js.undefined)
    
    @scala.inline
    def setBackingCornerRadius(value: Double): Self = StObject.set(x, "backingCornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingCornerRadiusUndefined: Self = StObject.set(x, "backingCornerRadius", js.undefined)
    
    @scala.inline
    def setBackingInnerExtent(value: Double): Self = StObject.set(x, "backingInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingInnerExtentUndefined: Self = StObject.set(x, "backingInnerExtent", js.undefined)
    
    @scala.inline
    def setBackingOuterExtent(value: Double): Self = StObject.set(x, "backingOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingOuterExtentUndefined: Self = StObject.set(x, "backingOuterExtent", js.undefined)
    
    @scala.inline
    def setBackingOutline(value: String): Self = StObject.set(x, "backingOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingOutlineUndefined: Self = StObject.set(x, "backingOutline", js.undefined)
    
    @scala.inline
    def setBackingOversweep(value: Double): Self = StObject.set(x, "backingOversweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingOversweepUndefined: Self = StObject.set(x, "backingOversweep", js.undefined)
    
    @scala.inline
    def setBackingShape(value: String): Self = StObject.set(x, "backingShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingShapeUndefined: Self = StObject.set(x, "backingShape", js.undefined)
    
    @scala.inline
    def setBackingStrokeThickness(value: Double): Self = StObject.set(x, "backingStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingStrokeThicknessUndefined: Self = StObject.set(x, "backingStrokeThickness", js.undefined)
    
    @scala.inline
    def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
    
    @scala.inline
    def setDuplicateLabelOmissionStrategy(value: String): Self = StObject.set(x, "duplicateLabelOmissionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateLabelOmissionStrategyUndefined: Self = StObject.set(x, "duplicateLabelOmissionStrategy", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBrush(value: String): Self = StObject.set(x, "fontBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBrushUndefined: Self = StObject.set(x, "fontBrush", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit): Self = StObject.set(x, "formatLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setIsNeedleDraggingConstrained(value: Boolean): Self = StObject.set(x, "isNeedleDraggingConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNeedleDraggingConstrainedUndefined: Self = StObject.set(x, "isNeedleDraggingConstrained", js.undefined)
    
    @scala.inline
    def setIsNeedleDraggingEnabled(value: Boolean): Self = StObject.set(x, "isNeedleDraggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNeedleDraggingEnabledUndefined: Self = StObject.set(x, "isNeedleDraggingEnabled", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = StObject.set(x, "labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExtentUndefined: Self = StObject.set(x, "labelExtent", js.undefined)
    
    @scala.inline
    def setLabelInterval(value: Double): Self = StObject.set(x, "labelInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIntervalUndefined: Self = StObject.set(x, "labelInterval", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setMinorTickBrush(value: String): Self = StObject.set(x, "minorTickBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickBrushUndefined: Self = StObject.set(x, "minorTickBrush", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTickEndExtent(value: Double): Self = StObject.set(x, "minorTickEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickEndExtentUndefined: Self = StObject.set(x, "minorTickEndExtent", js.undefined)
    
    @scala.inline
    def setMinorTickStartExtent(value: Double): Self = StObject.set(x, "minorTickStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickStartExtentUndefined: Self = StObject.set(x, "minorTickStartExtent", js.undefined)
    
    @scala.inline
    def setMinorTickStrokeThickness(value: Double): Self = StObject.set(x, "minorTickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickStrokeThicknessUndefined: Self = StObject.set(x, "minorTickStrokeThickness", js.undefined)
    
    @scala.inline
    def setNeedleBaseFeatureExtent(value: Double): Self = StObject.set(x, "needleBaseFeatureExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleBaseFeatureExtentUndefined: Self = StObject.set(x, "needleBaseFeatureExtent", js.undefined)
    
    @scala.inline
    def setNeedleBaseFeatureWidthRatio(value: Double): Self = StObject.set(x, "needleBaseFeatureWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleBaseFeatureWidthRatioUndefined: Self = StObject.set(x, "needleBaseFeatureWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleBrush(value: String): Self = StObject.set(x, "needleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleBrushUndefined: Self = StObject.set(x, "needleBrush", js.undefined)
    
    @scala.inline
    def setNeedleEndExtent(value: Double): Self = StObject.set(x, "needleEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleEndExtentUndefined: Self = StObject.set(x, "needleEndExtent", js.undefined)
    
    @scala.inline
    def setNeedleEndWidthRatio(value: Double): Self = StObject.set(x, "needleEndWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleEndWidthRatioUndefined: Self = StObject.set(x, "needleEndWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleOutline(value: String): Self = StObject.set(x, "needleOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleOutlineUndefined: Self = StObject.set(x, "needleOutline", js.undefined)
    
    @scala.inline
    def setNeedlePivotBrush(value: String): Self = StObject.set(x, "needlePivotBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePivotBrushUndefined: Self = StObject.set(x, "needlePivotBrush", js.undefined)
    
    @scala.inline
    def setNeedlePivotInnerWidthRatio(value: Double): Self = StObject.set(x, "needlePivotInnerWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePivotInnerWidthRatioUndefined: Self = StObject.set(x, "needlePivotInnerWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedlePivotOutline(value: String): Self = StObject.set(x, "needlePivotOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePivotOutlineUndefined: Self = StObject.set(x, "needlePivotOutline", js.undefined)
    
    @scala.inline
    def setNeedlePivotShape(value: String): Self = StObject.set(x, "needlePivotShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePivotShapeUndefined: Self = StObject.set(x, "needlePivotShape", js.undefined)
    
    @scala.inline
    def setNeedlePivotStrokeThickness(value: Double): Self = StObject.set(x, "needlePivotStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePivotStrokeThicknessUndefined: Self = StObject.set(x, "needlePivotStrokeThickness", js.undefined)
    
    @scala.inline
    def setNeedlePivotWidthRatio(value: Double): Self = StObject.set(x, "needlePivotWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePivotWidthRatioUndefined: Self = StObject.set(x, "needlePivotWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedlePointFeatureExtent(value: Double): Self = StObject.set(x, "needlePointFeatureExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePointFeatureExtentUndefined: Self = StObject.set(x, "needlePointFeatureExtent", js.undefined)
    
    @scala.inline
    def setNeedlePointFeatureWidthRatio(value: Double): Self = StObject.set(x, "needlePointFeatureWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedlePointFeatureWidthRatioUndefined: Self = StObject.set(x, "needlePointFeatureWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleShape(value: String): Self = StObject.set(x, "needleShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleShapeUndefined: Self = StObject.set(x, "needleShape", js.undefined)
    
    @scala.inline
    def setNeedleStartExtent(value: Double): Self = StObject.set(x, "needleStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleStartExtentUndefined: Self = StObject.set(x, "needleStartExtent", js.undefined)
    
    @scala.inline
    def setNeedleStartWidthRatio(value: Double): Self = StObject.set(x, "needleStartWidthRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleStartWidthRatioUndefined: Self = StObject.set(x, "needleStartWidthRatio", js.undefined)
    
    @scala.inline
    def setNeedleStrokeThickness(value: Double): Self = StObject.set(x, "needleStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleStrokeThicknessUndefined: Self = StObject.set(x, "needleStrokeThickness", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setRadiusMultiplier(value: Double): Self = StObject.set(x, "radiusMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusMultiplierUndefined: Self = StObject.set(x, "radiusMultiplier", js.undefined)
    
    @scala.inline
    def setRangeBrushes(value: js.Any): Self = StObject.set(x, "rangeBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeBrushesUndefined: Self = StObject.set(x, "rangeBrushes", js.undefined)
    
    @scala.inline
    def setRangeOutlines(value: js.Any): Self = StObject.set(x, "rangeOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOutlinesUndefined: Self = StObject.set(x, "rangeOutlines", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[IgRadialGaugeRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: IgRadialGaugeRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setScaleBrush(value: String): Self = StObject.set(x, "scaleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleBrushUndefined: Self = StObject.set(x, "scaleBrush", js.undefined)
    
    @scala.inline
    def setScaleEndAngle(value: Double): Self = StObject.set(x, "scaleEndAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEndAngleUndefined: Self = StObject.set(x, "scaleEndAngle", js.undefined)
    
    @scala.inline
    def setScaleEndExtent(value: Double): Self = StObject.set(x, "scaleEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEndExtentUndefined: Self = StObject.set(x, "scaleEndExtent", js.undefined)
    
    @scala.inline
    def setScaleOversweep(value: Double): Self = StObject.set(x, "scaleOversweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleOversweepShape(value: String): Self = StObject.set(x, "scaleOversweepShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleOversweepShapeUndefined: Self = StObject.set(x, "scaleOversweepShape", js.undefined)
    
    @scala.inline
    def setScaleOversweepUndefined: Self = StObject.set(x, "scaleOversweep", js.undefined)
    
    @scala.inline
    def setScaleStartAngle(value: Double): Self = StObject.set(x, "scaleStartAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleStartAngleUndefined: Self = StObject.set(x, "scaleStartAngle", js.undefined)
    
    @scala.inline
    def setScaleStartExtent(value: Double): Self = StObject.set(x, "scaleStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleStartExtentUndefined: Self = StObject.set(x, "scaleStartExtent", js.undefined)
    
    @scala.inline
    def setScaleSweepDirection(value: String): Self = StObject.set(x, "scaleSweepDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleSweepDirectionUndefined: Self = StObject.set(x, "scaleSweepDirection", js.undefined)
    
    @scala.inline
    def setTickBrush(value: String): Self = StObject.set(x, "tickBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickBrushUndefined: Self = StObject.set(x, "tickBrush", js.undefined)
    
    @scala.inline
    def setTickEndExtent(value: Double): Self = StObject.set(x, "tickEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickEndExtentUndefined: Self = StObject.set(x, "tickEndExtent", js.undefined)
    
    @scala.inline
    def setTickStartExtent(value: Double): Self = StObject.set(x, "tickStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStartExtentUndefined: Self = StObject.set(x, "tickStartExtent", js.undefined)
    
    @scala.inline
    def setTickStrokeThickness(value: Double): Self = StObject.set(x, "tickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStrokeThicknessUndefined: Self = StObject.set(x, "tickStrokeThickness", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionEasingFunction(value: js.Any): Self = StObject.set(x, "transitionEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEasingFunctionUndefined: Self = StObject.set(x, "transitionEasingFunction", js.undefined)
    
    @scala.inline
    def setTransitionProgress(value: Double): Self = StObject.set(x, "transitionProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionProgressUndefined: Self = StObject.set(x, "transitionProgress", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = StObject.set(x, "valueChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueChangedUndefined: Self = StObject.set(x, "valueChanged", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
