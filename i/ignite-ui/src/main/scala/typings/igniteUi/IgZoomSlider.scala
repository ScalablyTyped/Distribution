package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgZoomSlider
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var actualPixelScalingRatio: js.UndefOr[Double] = js.undefined
  
  var areThumbCalloutsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var barBrush: js.UndefOr[Any] = js.undefined
  
  var barExtent: js.UndefOr[Double] = js.undefined
  
  var barOutline: js.UndefOr[Any] = js.undefined
  
  var barStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var endInset: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  var higherCalloutBrush: js.UndefOr[Any] = js.undefined
  
  var higherCalloutOutline: js.UndefOr[Any] = js.undefined
  
  var higherCalloutStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var higherCalloutTextColor: js.UndefOr[Any] = js.undefined
  
  var higherShadeBrush: js.UndefOr[Any] = js.undefined
  
  var higherShadeOutline: js.UndefOr[Any] = js.undefined
  
  var higherShadeStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var higherThumbBrush: js.UndefOr[Any] = js.undefined
  
  var higherThumbHeight: js.UndefOr[Double] = js.undefined
  
  var higherThumbOutline: js.UndefOr[Any] = js.undefined
  
  var higherThumbRidgesBrush: js.UndefOr[Any] = js.undefined
  
  var higherThumbStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var higherThumbWidth: js.UndefOr[Double] = js.undefined
  
  var lowerCalloutBrush: js.UndefOr[Any] = js.undefined
  
  var lowerCalloutOutline: js.UndefOr[Any] = js.undefined
  
  var lowerCalloutStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var lowerCalloutTextColor: js.UndefOr[Any] = js.undefined
  
  var lowerShadeBrush: js.UndefOr[Any] = js.undefined
  
  var lowerShadeOutline: js.UndefOr[Any] = js.undefined
  
  var lowerShadeStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var lowerThumbBrush: js.UndefOr[Any] = js.undefined
  
  var lowerThumbHeight: js.UndefOr[Double] = js.undefined
  
  var lowerThumbOutline: js.UndefOr[Any] = js.undefined
  
  var lowerThumbRidgesBrush: js.UndefOr[Any] = js.undefined
  
  var lowerThumbStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var lowerThumbWidth: js.UndefOr[Double] = js.undefined
  
  var maxZoomWidth: js.UndefOr[Double] = js.undefined
  
  var minZoomWidth: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var panTransitionDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  
  var propertyChanged: js.UndefOr[PropertyChangedEvent] = js.undefined
  
  var rangeThumbBrush: js.UndefOr[Any] = js.undefined
  
  var rangeThumbOutline: js.UndefOr[Any] = js.undefined
  
  var rangeThumbRidgesBrush: js.UndefOr[Any] = js.undefined
  
  var rangeThumbStrokeThickness: js.UndefOr[Double] = js.undefined
  
  var resolvingAxisValue: js.UndefOr[ResolvingAxisValueEvent] = js.undefined
  
  var startInset: js.UndefOr[Double] = js.undefined
  
  var thumbCalloutTextStyle: js.UndefOr[Any] = js.undefined
  
  var trackEndInset: js.UndefOr[Double] = js.undefined
  
  var trackStartInset: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.undefined
  
  var windowRect: js.UndefOr[Any] = js.undefined
  
  /**
    * Occurs just after the current ZoomSlider's window rectangle is changed.
    */
  var windowRectChanged: js.UndefOr[WindowRectChangedEvent] = js.undefined
}
object IgZoomSlider {
  
  inline def apply(): IgZoomSlider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgZoomSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgZoomSlider] (val x: Self) extends AnyVal {
    
    inline def setActualPixelScalingRatio(value: Double): Self = StObject.set(x, "actualPixelScalingRatio", value.asInstanceOf[js.Any])
    
    inline def setActualPixelScalingRatioUndefined: Self = StObject.set(x, "actualPixelScalingRatio", js.undefined)
    
    inline def setAreThumbCalloutsEnabled(value: Boolean): Self = StObject.set(x, "areThumbCalloutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAreThumbCalloutsEnabledUndefined: Self = StObject.set(x, "areThumbCalloutsEnabled", js.undefined)
    
    inline def setBarBrush(value: Any): Self = StObject.set(x, "barBrush", value.asInstanceOf[js.Any])
    
    inline def setBarBrushUndefined: Self = StObject.set(x, "barBrush", js.undefined)
    
    inline def setBarExtent(value: Double): Self = StObject.set(x, "barExtent", value.asInstanceOf[js.Any])
    
    inline def setBarExtentUndefined: Self = StObject.set(x, "barExtent", js.undefined)
    
    inline def setBarOutline(value: Any): Self = StObject.set(x, "barOutline", value.asInstanceOf[js.Any])
    
    inline def setBarOutlineUndefined: Self = StObject.set(x, "barOutline", js.undefined)
    
    inline def setBarStrokeThickness(value: Double): Self = StObject.set(x, "barStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setBarStrokeThicknessUndefined: Self = StObject.set(x, "barStrokeThickness", js.undefined)
    
    inline def setEndInset(value: Double): Self = StObject.set(x, "endInset", value.asInstanceOf[js.Any])
    
    inline def setEndInsetUndefined: Self = StObject.set(x, "endInset", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHigherCalloutBrush(value: Any): Self = StObject.set(x, "higherCalloutBrush", value.asInstanceOf[js.Any])
    
    inline def setHigherCalloutBrushUndefined: Self = StObject.set(x, "higherCalloutBrush", js.undefined)
    
    inline def setHigherCalloutOutline(value: Any): Self = StObject.set(x, "higherCalloutOutline", value.asInstanceOf[js.Any])
    
    inline def setHigherCalloutOutlineUndefined: Self = StObject.set(x, "higherCalloutOutline", js.undefined)
    
    inline def setHigherCalloutStrokeThickness(value: Double): Self = StObject.set(x, "higherCalloutStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setHigherCalloutStrokeThicknessUndefined: Self = StObject.set(x, "higherCalloutStrokeThickness", js.undefined)
    
    inline def setHigherCalloutTextColor(value: Any): Self = StObject.set(x, "higherCalloutTextColor", value.asInstanceOf[js.Any])
    
    inline def setHigherCalloutTextColorUndefined: Self = StObject.set(x, "higherCalloutTextColor", js.undefined)
    
    inline def setHigherShadeBrush(value: Any): Self = StObject.set(x, "higherShadeBrush", value.asInstanceOf[js.Any])
    
    inline def setHigherShadeBrushUndefined: Self = StObject.set(x, "higherShadeBrush", js.undefined)
    
    inline def setHigherShadeOutline(value: Any): Self = StObject.set(x, "higherShadeOutline", value.asInstanceOf[js.Any])
    
    inline def setHigherShadeOutlineUndefined: Self = StObject.set(x, "higherShadeOutline", js.undefined)
    
    inline def setHigherShadeStrokeThickness(value: Double): Self = StObject.set(x, "higherShadeStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setHigherShadeStrokeThicknessUndefined: Self = StObject.set(x, "higherShadeStrokeThickness", js.undefined)
    
    inline def setHigherThumbBrush(value: Any): Self = StObject.set(x, "higherThumbBrush", value.asInstanceOf[js.Any])
    
    inline def setHigherThumbBrushUndefined: Self = StObject.set(x, "higherThumbBrush", js.undefined)
    
    inline def setHigherThumbHeight(value: Double): Self = StObject.set(x, "higherThumbHeight", value.asInstanceOf[js.Any])
    
    inline def setHigherThumbHeightUndefined: Self = StObject.set(x, "higherThumbHeight", js.undefined)
    
    inline def setHigherThumbOutline(value: Any): Self = StObject.set(x, "higherThumbOutline", value.asInstanceOf[js.Any])
    
    inline def setHigherThumbOutlineUndefined: Self = StObject.set(x, "higherThumbOutline", js.undefined)
    
    inline def setHigherThumbRidgesBrush(value: Any): Self = StObject.set(x, "higherThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    inline def setHigherThumbRidgesBrushUndefined: Self = StObject.set(x, "higherThumbRidgesBrush", js.undefined)
    
    inline def setHigherThumbStrokeThickness(value: Double): Self = StObject.set(x, "higherThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setHigherThumbStrokeThicknessUndefined: Self = StObject.set(x, "higherThumbStrokeThickness", js.undefined)
    
    inline def setHigherThumbWidth(value: Double): Self = StObject.set(x, "higherThumbWidth", value.asInstanceOf[js.Any])
    
    inline def setHigherThumbWidthUndefined: Self = StObject.set(x, "higherThumbWidth", js.undefined)
    
    inline def setLowerCalloutBrush(value: Any): Self = StObject.set(x, "lowerCalloutBrush", value.asInstanceOf[js.Any])
    
    inline def setLowerCalloutBrushUndefined: Self = StObject.set(x, "lowerCalloutBrush", js.undefined)
    
    inline def setLowerCalloutOutline(value: Any): Self = StObject.set(x, "lowerCalloutOutline", value.asInstanceOf[js.Any])
    
    inline def setLowerCalloutOutlineUndefined: Self = StObject.set(x, "lowerCalloutOutline", js.undefined)
    
    inline def setLowerCalloutStrokeThickness(value: Double): Self = StObject.set(x, "lowerCalloutStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setLowerCalloutStrokeThicknessUndefined: Self = StObject.set(x, "lowerCalloutStrokeThickness", js.undefined)
    
    inline def setLowerCalloutTextColor(value: Any): Self = StObject.set(x, "lowerCalloutTextColor", value.asInstanceOf[js.Any])
    
    inline def setLowerCalloutTextColorUndefined: Self = StObject.set(x, "lowerCalloutTextColor", js.undefined)
    
    inline def setLowerShadeBrush(value: Any): Self = StObject.set(x, "lowerShadeBrush", value.asInstanceOf[js.Any])
    
    inline def setLowerShadeBrushUndefined: Self = StObject.set(x, "lowerShadeBrush", js.undefined)
    
    inline def setLowerShadeOutline(value: Any): Self = StObject.set(x, "lowerShadeOutline", value.asInstanceOf[js.Any])
    
    inline def setLowerShadeOutlineUndefined: Self = StObject.set(x, "lowerShadeOutline", js.undefined)
    
    inline def setLowerShadeStrokeThickness(value: Double): Self = StObject.set(x, "lowerShadeStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setLowerShadeStrokeThicknessUndefined: Self = StObject.set(x, "lowerShadeStrokeThickness", js.undefined)
    
    inline def setLowerThumbBrush(value: Any): Self = StObject.set(x, "lowerThumbBrush", value.asInstanceOf[js.Any])
    
    inline def setLowerThumbBrushUndefined: Self = StObject.set(x, "lowerThumbBrush", js.undefined)
    
    inline def setLowerThumbHeight(value: Double): Self = StObject.set(x, "lowerThumbHeight", value.asInstanceOf[js.Any])
    
    inline def setLowerThumbHeightUndefined: Self = StObject.set(x, "lowerThumbHeight", js.undefined)
    
    inline def setLowerThumbOutline(value: Any): Self = StObject.set(x, "lowerThumbOutline", value.asInstanceOf[js.Any])
    
    inline def setLowerThumbOutlineUndefined: Self = StObject.set(x, "lowerThumbOutline", js.undefined)
    
    inline def setLowerThumbRidgesBrush(value: Any): Self = StObject.set(x, "lowerThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    inline def setLowerThumbRidgesBrushUndefined: Self = StObject.set(x, "lowerThumbRidgesBrush", js.undefined)
    
    inline def setLowerThumbStrokeThickness(value: Double): Self = StObject.set(x, "lowerThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setLowerThumbStrokeThicknessUndefined: Self = StObject.set(x, "lowerThumbStrokeThickness", js.undefined)
    
    inline def setLowerThumbWidth(value: Double): Self = StObject.set(x, "lowerThumbWidth", value.asInstanceOf[js.Any])
    
    inline def setLowerThumbWidthUndefined: Self = StObject.set(x, "lowerThumbWidth", js.undefined)
    
    inline def setMaxZoomWidth(value: Double): Self = StObject.set(x, "maxZoomWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomWidthUndefined: Self = StObject.set(x, "maxZoomWidth", js.undefined)
    
    inline def setMinZoomWidth(value: Double): Self = StObject.set(x, "minZoomWidth", value.asInstanceOf[js.Any])
    
    inline def setMinZoomWidthUndefined: Self = StObject.set(x, "minZoomWidth", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPanTransitionDuration(value: Double): Self = StObject.set(x, "panTransitionDuration", value.asInstanceOf[js.Any])
    
    inline def setPanTransitionDurationUndefined: Self = StObject.set(x, "panTransitionDuration", js.undefined)
    
    inline def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    inline def setPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction2(value))
    
    inline def setPropertyChangedUndefined: Self = StObject.set(x, "propertyChanged", js.undefined)
    
    inline def setRangeThumbBrush(value: Any): Self = StObject.set(x, "rangeThumbBrush", value.asInstanceOf[js.Any])
    
    inline def setRangeThumbBrushUndefined: Self = StObject.set(x, "rangeThumbBrush", js.undefined)
    
    inline def setRangeThumbOutline(value: Any): Self = StObject.set(x, "rangeThumbOutline", value.asInstanceOf[js.Any])
    
    inline def setRangeThumbOutlineUndefined: Self = StObject.set(x, "rangeThumbOutline", js.undefined)
    
    inline def setRangeThumbRidgesBrush(value: Any): Self = StObject.set(x, "rangeThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    inline def setRangeThumbRidgesBrushUndefined: Self = StObject.set(x, "rangeThumbRidgesBrush", js.undefined)
    
    inline def setRangeThumbStrokeThickness(value: Double): Self = StObject.set(x, "rangeThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setRangeThumbStrokeThicknessUndefined: Self = StObject.set(x, "rangeThumbStrokeThickness", js.undefined)
    
    inline def setResolvingAxisValue(value: (/* event */ Event, /* ui */ ResolvingAxisValueEventUIParam) => Unit): Self = StObject.set(x, "resolvingAxisValue", js.Any.fromFunction2(value))
    
    inline def setResolvingAxisValueUndefined: Self = StObject.set(x, "resolvingAxisValue", js.undefined)
    
    inline def setStartInset(value: Double): Self = StObject.set(x, "startInset", value.asInstanceOf[js.Any])
    
    inline def setStartInsetUndefined: Self = StObject.set(x, "startInset", js.undefined)
    
    inline def setThumbCalloutTextStyle(value: Any): Self = StObject.set(x, "thumbCalloutTextStyle", value.asInstanceOf[js.Any])
    
    inline def setThumbCalloutTextStyleUndefined: Self = StObject.set(x, "thumbCalloutTextStyle", js.undefined)
    
    inline def setTrackEndInset(value: Double): Self = StObject.set(x, "trackEndInset", value.asInstanceOf[js.Any])
    
    inline def setTrackEndInsetUndefined: Self = StObject.set(x, "trackEndInset", js.undefined)
    
    inline def setTrackStartInset(value: Double): Self = StObject.set(x, "trackStartInset", value.asInstanceOf[js.Any])
    
    inline def setTrackStartInsetUndefined: Self = StObject.set(x, "trackStartInset", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWindowRect(value: Any): Self = StObject.set(x, "windowRect", value.asInstanceOf[js.Any])
    
    inline def setWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = StObject.set(x, "windowRectChanged", js.Any.fromFunction2(value))
    
    inline def setWindowRectChangedUndefined: Self = StObject.set(x, "windowRectChanged", js.undefined)
    
    inline def setWindowRectUndefined: Self = StObject.set(x, "windowRect", js.undefined)
  }
}
