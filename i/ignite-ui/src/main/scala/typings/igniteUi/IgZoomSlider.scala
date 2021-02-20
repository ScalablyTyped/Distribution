package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgZoomSlider
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var actualPixelScalingRatio: js.UndefOr[Double] = js.native
  
  var areThumbCalloutsEnabled: js.UndefOr[Boolean] = js.native
  
  var barBrush: js.UndefOr[js.Any] = js.native
  
  var barExtent: js.UndefOr[Double] = js.native
  
  var barOutline: js.UndefOr[js.Any] = js.native
  
  var barStrokeThickness: js.UndefOr[Double] = js.native
  
  var endInset: js.UndefOr[Double] = js.native
  
  /**
    * The height of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  
  var higherCalloutBrush: js.UndefOr[js.Any] = js.native
  
  var higherCalloutOutline: js.UndefOr[js.Any] = js.native
  
  var higherCalloutStrokeThickness: js.UndefOr[Double] = js.native
  
  var higherCalloutTextColor: js.UndefOr[js.Any] = js.native
  
  var higherShadeBrush: js.UndefOr[js.Any] = js.native
  
  var higherShadeOutline: js.UndefOr[js.Any] = js.native
  
  var higherShadeStrokeThickness: js.UndefOr[Double] = js.native
  
  var higherThumbBrush: js.UndefOr[js.Any] = js.native
  
  var higherThumbHeight: js.UndefOr[Double] = js.native
  
  var higherThumbOutline: js.UndefOr[js.Any] = js.native
  
  var higherThumbRidgesBrush: js.UndefOr[js.Any] = js.native
  
  var higherThumbStrokeThickness: js.UndefOr[Double] = js.native
  
  var higherThumbWidth: js.UndefOr[Double] = js.native
  
  var lowerCalloutBrush: js.UndefOr[js.Any] = js.native
  
  var lowerCalloutOutline: js.UndefOr[js.Any] = js.native
  
  var lowerCalloutStrokeThickness: js.UndefOr[Double] = js.native
  
  var lowerCalloutTextColor: js.UndefOr[js.Any] = js.native
  
  var lowerShadeBrush: js.UndefOr[js.Any] = js.native
  
  var lowerShadeOutline: js.UndefOr[js.Any] = js.native
  
  var lowerShadeStrokeThickness: js.UndefOr[Double] = js.native
  
  var lowerThumbBrush: js.UndefOr[js.Any] = js.native
  
  var lowerThumbHeight: js.UndefOr[Double] = js.native
  
  var lowerThumbOutline: js.UndefOr[js.Any] = js.native
  
  var lowerThumbRidgesBrush: js.UndefOr[js.Any] = js.native
  
  var lowerThumbStrokeThickness: js.UndefOr[Double] = js.native
  
  var lowerThumbWidth: js.UndefOr[Double] = js.native
  
  var maxZoomWidth: js.UndefOr[Double] = js.native
  
  var minZoomWidth: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var panTransitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.native
  
  var rangeThumbBrush: js.UndefOr[js.Any] = js.native
  
  var rangeThumbOutline: js.UndefOr[js.Any] = js.native
  
  var rangeThumbRidgesBrush: js.UndefOr[js.Any] = js.native
  
  var rangeThumbStrokeThickness: js.UndefOr[Double] = js.native
  
  var resolvingAxisValue: js.UndefOr[ResolvingAxisValueEvent] = js.native
  
  var startInset: js.UndefOr[Double] = js.native
  
  var thumbCalloutTextStyle: js.UndefOr[js.Any] = js.native
  
  var trackEndInset: js.UndefOr[Double] = js.native
  
  var trackStartInset: js.UndefOr[Double] = js.native
  
  /**
    * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
  
  var windowRect: js.UndefOr[js.Any] = js.native
  
  /**
    * Occurs just after the current ZoomSlider's window rectangle is changed.
    */
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.native
}
object IgZoomSlider {
  
  @scala.inline
  def apply(): IgZoomSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoomSlider]
  }
  
  @scala.inline
  implicit class IgZoomSliderMutableBuilder[Self <: IgZoomSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualPixelScalingRatio(value: Double): Self = StObject.set(x, "actualPixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualPixelScalingRatioUndefined: Self = StObject.set(x, "actualPixelScalingRatio", js.undefined)
    
    @scala.inline
    def setAreThumbCalloutsEnabled(value: Boolean): Self = StObject.set(x, "areThumbCalloutsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreThumbCalloutsEnabledUndefined: Self = StObject.set(x, "areThumbCalloutsEnabled", js.undefined)
    
    @scala.inline
    def setBarBrush(value: js.Any): Self = StObject.set(x, "barBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBrushUndefined: Self = StObject.set(x, "barBrush", js.undefined)
    
    @scala.inline
    def setBarExtent(value: Double): Self = StObject.set(x, "barExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarExtentUndefined: Self = StObject.set(x, "barExtent", js.undefined)
    
    @scala.inline
    def setBarOutline(value: js.Any): Self = StObject.set(x, "barOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarOutlineUndefined: Self = StObject.set(x, "barOutline", js.undefined)
    
    @scala.inline
    def setBarStrokeThickness(value: Double): Self = StObject.set(x, "barStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStrokeThicknessUndefined: Self = StObject.set(x, "barStrokeThickness", js.undefined)
    
    @scala.inline
    def setEndInset(value: Double): Self = StObject.set(x, "endInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndInsetUndefined: Self = StObject.set(x, "endInset", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHigherCalloutBrush(value: js.Any): Self = StObject.set(x, "higherCalloutBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherCalloutBrushUndefined: Self = StObject.set(x, "higherCalloutBrush", js.undefined)
    
    @scala.inline
    def setHigherCalloutOutline(value: js.Any): Self = StObject.set(x, "higherCalloutOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherCalloutOutlineUndefined: Self = StObject.set(x, "higherCalloutOutline", js.undefined)
    
    @scala.inline
    def setHigherCalloutStrokeThickness(value: Double): Self = StObject.set(x, "higherCalloutStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherCalloutStrokeThicknessUndefined: Self = StObject.set(x, "higherCalloutStrokeThickness", js.undefined)
    
    @scala.inline
    def setHigherCalloutTextColor(value: js.Any): Self = StObject.set(x, "higherCalloutTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherCalloutTextColorUndefined: Self = StObject.set(x, "higherCalloutTextColor", js.undefined)
    
    @scala.inline
    def setHigherShadeBrush(value: js.Any): Self = StObject.set(x, "higherShadeBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherShadeBrushUndefined: Self = StObject.set(x, "higherShadeBrush", js.undefined)
    
    @scala.inline
    def setHigherShadeOutline(value: js.Any): Self = StObject.set(x, "higherShadeOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherShadeOutlineUndefined: Self = StObject.set(x, "higherShadeOutline", js.undefined)
    
    @scala.inline
    def setHigherShadeStrokeThickness(value: Double): Self = StObject.set(x, "higherShadeStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherShadeStrokeThicknessUndefined: Self = StObject.set(x, "higherShadeStrokeThickness", js.undefined)
    
    @scala.inline
    def setHigherThumbBrush(value: js.Any): Self = StObject.set(x, "higherThumbBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherThumbBrushUndefined: Self = StObject.set(x, "higherThumbBrush", js.undefined)
    
    @scala.inline
    def setHigherThumbHeight(value: Double): Self = StObject.set(x, "higherThumbHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherThumbHeightUndefined: Self = StObject.set(x, "higherThumbHeight", js.undefined)
    
    @scala.inline
    def setHigherThumbOutline(value: js.Any): Self = StObject.set(x, "higherThumbOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherThumbOutlineUndefined: Self = StObject.set(x, "higherThumbOutline", js.undefined)
    
    @scala.inline
    def setHigherThumbRidgesBrush(value: js.Any): Self = StObject.set(x, "higherThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherThumbRidgesBrushUndefined: Self = StObject.set(x, "higherThumbRidgesBrush", js.undefined)
    
    @scala.inline
    def setHigherThumbStrokeThickness(value: Double): Self = StObject.set(x, "higherThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherThumbStrokeThicknessUndefined: Self = StObject.set(x, "higherThumbStrokeThickness", js.undefined)
    
    @scala.inline
    def setHigherThumbWidth(value: Double): Self = StObject.set(x, "higherThumbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigherThumbWidthUndefined: Self = StObject.set(x, "higherThumbWidth", js.undefined)
    
    @scala.inline
    def setLowerCalloutBrush(value: js.Any): Self = StObject.set(x, "lowerCalloutBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerCalloutBrushUndefined: Self = StObject.set(x, "lowerCalloutBrush", js.undefined)
    
    @scala.inline
    def setLowerCalloutOutline(value: js.Any): Self = StObject.set(x, "lowerCalloutOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerCalloutOutlineUndefined: Self = StObject.set(x, "lowerCalloutOutline", js.undefined)
    
    @scala.inline
    def setLowerCalloutStrokeThickness(value: Double): Self = StObject.set(x, "lowerCalloutStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerCalloutStrokeThicknessUndefined: Self = StObject.set(x, "lowerCalloutStrokeThickness", js.undefined)
    
    @scala.inline
    def setLowerCalloutTextColor(value: js.Any): Self = StObject.set(x, "lowerCalloutTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerCalloutTextColorUndefined: Self = StObject.set(x, "lowerCalloutTextColor", js.undefined)
    
    @scala.inline
    def setLowerShadeBrush(value: js.Any): Self = StObject.set(x, "lowerShadeBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerShadeBrushUndefined: Self = StObject.set(x, "lowerShadeBrush", js.undefined)
    
    @scala.inline
    def setLowerShadeOutline(value: js.Any): Self = StObject.set(x, "lowerShadeOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerShadeOutlineUndefined: Self = StObject.set(x, "lowerShadeOutline", js.undefined)
    
    @scala.inline
    def setLowerShadeStrokeThickness(value: Double): Self = StObject.set(x, "lowerShadeStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerShadeStrokeThicknessUndefined: Self = StObject.set(x, "lowerShadeStrokeThickness", js.undefined)
    
    @scala.inline
    def setLowerThumbBrush(value: js.Any): Self = StObject.set(x, "lowerThumbBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerThumbBrushUndefined: Self = StObject.set(x, "lowerThumbBrush", js.undefined)
    
    @scala.inline
    def setLowerThumbHeight(value: Double): Self = StObject.set(x, "lowerThumbHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerThumbHeightUndefined: Self = StObject.set(x, "lowerThumbHeight", js.undefined)
    
    @scala.inline
    def setLowerThumbOutline(value: js.Any): Self = StObject.set(x, "lowerThumbOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerThumbOutlineUndefined: Self = StObject.set(x, "lowerThumbOutline", js.undefined)
    
    @scala.inline
    def setLowerThumbRidgesBrush(value: js.Any): Self = StObject.set(x, "lowerThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerThumbRidgesBrushUndefined: Self = StObject.set(x, "lowerThumbRidgesBrush", js.undefined)
    
    @scala.inline
    def setLowerThumbStrokeThickness(value: Double): Self = StObject.set(x, "lowerThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerThumbStrokeThicknessUndefined: Self = StObject.set(x, "lowerThumbStrokeThickness", js.undefined)
    
    @scala.inline
    def setLowerThumbWidth(value: Double): Self = StObject.set(x, "lowerThumbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerThumbWidthUndefined: Self = StObject.set(x, "lowerThumbWidth", js.undefined)
    
    @scala.inline
    def setMaxZoomWidth(value: Double): Self = StObject.set(x, "maxZoomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomWidthUndefined: Self = StObject.set(x, "maxZoomWidth", js.undefined)
    
    @scala.inline
    def setMinZoomWidth(value: Double): Self = StObject.set(x, "minZoomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomWidthUndefined: Self = StObject.set(x, "minZoomWidth", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPanTransitionDuration(value: Double): Self = StObject.set(x, "panTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanTransitionDurationUndefined: Self = StObject.set(x, "panTransitionDuration", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPropertyChangedUndefined: Self = StObject.set(x, "propertyChanged", js.undefined)
    
    @scala.inline
    def setRangeThumbBrush(value: js.Any): Self = StObject.set(x, "rangeThumbBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeThumbBrushUndefined: Self = StObject.set(x, "rangeThumbBrush", js.undefined)
    
    @scala.inline
    def setRangeThumbOutline(value: js.Any): Self = StObject.set(x, "rangeThumbOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeThumbOutlineUndefined: Self = StObject.set(x, "rangeThumbOutline", js.undefined)
    
    @scala.inline
    def setRangeThumbRidgesBrush(value: js.Any): Self = StObject.set(x, "rangeThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeThumbRidgesBrushUndefined: Self = StObject.set(x, "rangeThumbRidgesBrush", js.undefined)
    
    @scala.inline
    def setRangeThumbStrokeThickness(value: Double): Self = StObject.set(x, "rangeThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeThumbStrokeThicknessUndefined: Self = StObject.set(x, "rangeThumbStrokeThickness", js.undefined)
    
    @scala.inline
    def setResolvingAxisValue(value: (/* event */ Event, /* ui */ ResolvingAxisValueEventUIParam) => Unit): Self = StObject.set(x, "resolvingAxisValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolvingAxisValueUndefined: Self = StObject.set(x, "resolvingAxisValue", js.undefined)
    
    @scala.inline
    def setStartInset(value: Double): Self = StObject.set(x, "startInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartInsetUndefined: Self = StObject.set(x, "startInset", js.undefined)
    
    @scala.inline
    def setThumbCalloutTextStyle(value: js.Any): Self = StObject.set(x, "thumbCalloutTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbCalloutTextStyleUndefined: Self = StObject.set(x, "thumbCalloutTextStyle", js.undefined)
    
    @scala.inline
    def setTrackEndInset(value: Double): Self = StObject.set(x, "trackEndInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackEndInsetUndefined: Self = StObject.set(x, "trackEndInset", js.undefined)
    
    @scala.inline
    def setTrackStartInset(value: Double): Self = StObject.set(x, "trackStartInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackStartInsetUndefined: Self = StObject.set(x, "trackStartInset", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWindowRect(value: js.Any): Self = StObject.set(x, "windowRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = StObject.set(x, "windowRectChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWindowRectChangedUndefined: Self = StObject.set(x, "windowRectChanged", js.undefined)
    
    @scala.inline
    def setWindowRectUndefined: Self = StObject.set(x, "windowRect", js.undefined)
  }
}
