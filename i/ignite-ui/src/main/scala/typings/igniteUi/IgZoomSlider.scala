package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
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
  implicit class IgZoomSliderOps[Self <: IgZoomSlider] (val x: Self) extends AnyVal {
    
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
    def setActualPixelScalingRatio(value: Double): Self = this.set("actualPixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualPixelScalingRatio: Self = this.set("actualPixelScalingRatio", js.undefined)
    
    @scala.inline
    def setAreThumbCalloutsEnabled(value: Boolean): Self = this.set("areThumbCalloutsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreThumbCalloutsEnabled: Self = this.set("areThumbCalloutsEnabled", js.undefined)
    
    @scala.inline
    def setBarBrush(value: js.Any): Self = this.set("barBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarBrush: Self = this.set("barBrush", js.undefined)
    
    @scala.inline
    def setBarExtent(value: Double): Self = this.set("barExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarExtent: Self = this.set("barExtent", js.undefined)
    
    @scala.inline
    def setBarOutline(value: js.Any): Self = this.set("barOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarOutline: Self = this.set("barOutline", js.undefined)
    
    @scala.inline
    def setBarStrokeThickness(value: Double): Self = this.set("barStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStrokeThickness: Self = this.set("barStrokeThickness", js.undefined)
    
    @scala.inline
    def setEndInset(value: Double): Self = this.set("endInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndInset: Self = this.set("endInset", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHigherCalloutBrush(value: js.Any): Self = this.set("higherCalloutBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherCalloutBrush: Self = this.set("higherCalloutBrush", js.undefined)
    
    @scala.inline
    def setHigherCalloutOutline(value: js.Any): Self = this.set("higherCalloutOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherCalloutOutline: Self = this.set("higherCalloutOutline", js.undefined)
    
    @scala.inline
    def setHigherCalloutStrokeThickness(value: Double): Self = this.set("higherCalloutStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherCalloutStrokeThickness: Self = this.set("higherCalloutStrokeThickness", js.undefined)
    
    @scala.inline
    def setHigherCalloutTextColor(value: js.Any): Self = this.set("higherCalloutTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherCalloutTextColor: Self = this.set("higherCalloutTextColor", js.undefined)
    
    @scala.inline
    def setHigherShadeBrush(value: js.Any): Self = this.set("higherShadeBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherShadeBrush: Self = this.set("higherShadeBrush", js.undefined)
    
    @scala.inline
    def setHigherShadeOutline(value: js.Any): Self = this.set("higherShadeOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherShadeOutline: Self = this.set("higherShadeOutline", js.undefined)
    
    @scala.inline
    def setHigherShadeStrokeThickness(value: Double): Self = this.set("higherShadeStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherShadeStrokeThickness: Self = this.set("higherShadeStrokeThickness", js.undefined)
    
    @scala.inline
    def setHigherThumbBrush(value: js.Any): Self = this.set("higherThumbBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherThumbBrush: Self = this.set("higherThumbBrush", js.undefined)
    
    @scala.inline
    def setHigherThumbHeight(value: Double): Self = this.set("higherThumbHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherThumbHeight: Self = this.set("higherThumbHeight", js.undefined)
    
    @scala.inline
    def setHigherThumbOutline(value: js.Any): Self = this.set("higherThumbOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherThumbOutline: Self = this.set("higherThumbOutline", js.undefined)
    
    @scala.inline
    def setHigherThumbRidgesBrush(value: js.Any): Self = this.set("higherThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherThumbRidgesBrush: Self = this.set("higherThumbRidgesBrush", js.undefined)
    
    @scala.inline
    def setHigherThumbStrokeThickness(value: Double): Self = this.set("higherThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherThumbStrokeThickness: Self = this.set("higherThumbStrokeThickness", js.undefined)
    
    @scala.inline
    def setHigherThumbWidth(value: Double): Self = this.set("higherThumbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigherThumbWidth: Self = this.set("higherThumbWidth", js.undefined)
    
    @scala.inline
    def setLowerCalloutBrush(value: js.Any): Self = this.set("lowerCalloutBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCalloutBrush: Self = this.set("lowerCalloutBrush", js.undefined)
    
    @scala.inline
    def setLowerCalloutOutline(value: js.Any): Self = this.set("lowerCalloutOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCalloutOutline: Self = this.set("lowerCalloutOutline", js.undefined)
    
    @scala.inline
    def setLowerCalloutStrokeThickness(value: Double): Self = this.set("lowerCalloutStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCalloutStrokeThickness: Self = this.set("lowerCalloutStrokeThickness", js.undefined)
    
    @scala.inline
    def setLowerCalloutTextColor(value: js.Any): Self = this.set("lowerCalloutTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCalloutTextColor: Self = this.set("lowerCalloutTextColor", js.undefined)
    
    @scala.inline
    def setLowerShadeBrush(value: js.Any): Self = this.set("lowerShadeBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerShadeBrush: Self = this.set("lowerShadeBrush", js.undefined)
    
    @scala.inline
    def setLowerShadeOutline(value: js.Any): Self = this.set("lowerShadeOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerShadeOutline: Self = this.set("lowerShadeOutline", js.undefined)
    
    @scala.inline
    def setLowerShadeStrokeThickness(value: Double): Self = this.set("lowerShadeStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerShadeStrokeThickness: Self = this.set("lowerShadeStrokeThickness", js.undefined)
    
    @scala.inline
    def setLowerThumbBrush(value: js.Any): Self = this.set("lowerThumbBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerThumbBrush: Self = this.set("lowerThumbBrush", js.undefined)
    
    @scala.inline
    def setLowerThumbHeight(value: Double): Self = this.set("lowerThumbHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerThumbHeight: Self = this.set("lowerThumbHeight", js.undefined)
    
    @scala.inline
    def setLowerThumbOutline(value: js.Any): Self = this.set("lowerThumbOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerThumbOutline: Self = this.set("lowerThumbOutline", js.undefined)
    
    @scala.inline
    def setLowerThumbRidgesBrush(value: js.Any): Self = this.set("lowerThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerThumbRidgesBrush: Self = this.set("lowerThumbRidgesBrush", js.undefined)
    
    @scala.inline
    def setLowerThumbStrokeThickness(value: Double): Self = this.set("lowerThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerThumbStrokeThickness: Self = this.set("lowerThumbStrokeThickness", js.undefined)
    
    @scala.inline
    def setLowerThumbWidth(value: Double): Self = this.set("lowerThumbWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerThumbWidth: Self = this.set("lowerThumbWidth", js.undefined)
    
    @scala.inline
    def setMaxZoomWidth(value: Double): Self = this.set("maxZoomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoomWidth: Self = this.set("maxZoomWidth", js.undefined)
    
    @scala.inline
    def setMinZoomWidth(value: Double): Self = this.set("minZoomWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoomWidth: Self = this.set("minZoomWidth", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPanTransitionDuration(value: Double): Self = this.set("panTransitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanTransitionDuration: Self = this.set("panTransitionDuration", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setPropertyChanged(value: (/* event */ Event, /* ui */ PropertyChangedEventUIParam) => Unit): Self = this.set("propertyChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePropertyChanged: Self = this.set("propertyChanged", js.undefined)
    
    @scala.inline
    def setRangeThumbBrush(value: js.Any): Self = this.set("rangeThumbBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeThumbBrush: Self = this.set("rangeThumbBrush", js.undefined)
    
    @scala.inline
    def setRangeThumbOutline(value: js.Any): Self = this.set("rangeThumbOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeThumbOutline: Self = this.set("rangeThumbOutline", js.undefined)
    
    @scala.inline
    def setRangeThumbRidgesBrush(value: js.Any): Self = this.set("rangeThumbRidgesBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeThumbRidgesBrush: Self = this.set("rangeThumbRidgesBrush", js.undefined)
    
    @scala.inline
    def setRangeThumbStrokeThickness(value: Double): Self = this.set("rangeThumbStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeThumbStrokeThickness: Self = this.set("rangeThumbStrokeThickness", js.undefined)
    
    @scala.inline
    def setResolvingAxisValue(value: (/* event */ Event, /* ui */ ResolvingAxisValueEventUIParam) => Unit): Self = this.set("resolvingAxisValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResolvingAxisValue: Self = this.set("resolvingAxisValue", js.undefined)
    
    @scala.inline
    def setStartInset(value: Double): Self = this.set("startInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartInset: Self = this.set("startInset", js.undefined)
    
    @scala.inline
    def setThumbCalloutTextStyle(value: js.Any): Self = this.set("thumbCalloutTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbCalloutTextStyle: Self = this.set("thumbCalloutTextStyle", js.undefined)
    
    @scala.inline
    def setTrackEndInset(value: Double): Self = this.set("trackEndInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackEndInset: Self = this.set("trackEndInset", js.undefined)
    
    @scala.inline
    def setTrackStartInset(value: Double): Self = this.set("trackStartInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackStartInset: Self = this.set("trackStartInset", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWindowRect(value: js.Any): Self = this.set("windowRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowRect: Self = this.set("windowRect", js.undefined)
    
    @scala.inline
    def setWindowRectChanged(value: (/* event */ Event, /* ui */ WindowRectChangedEventUIParam) => Unit): Self = this.set("windowRectChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWindowRectChanged: Self = this.set("windowRectChanged", js.undefined)
  }
}
