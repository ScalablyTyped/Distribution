package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDoughnutChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets whether the slices can be exploded.
    */
  var allowSliceExplosion: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether the slices can be selected.
    */
  var allowSliceSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired when the control is displayed on a non HTML5 compliant browser
    */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.native
  
  /**
    * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Raised when the dimensions (center point or radius) of the doughnut hole change.
    */
  var holeDimensionsChanged: js.UndefOr[HoleDimensionsChangedEvent] = js.native
  
  /**
    * Gets or sets the inner extent of the doughnut chart. It is percent from the outer ring's radius.
    */
  var innerExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets whether all surface interactions with the plot area should be disabled.
    */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the style used when a slice is selected.
    */
  var selectedStyle: js.UndefOr[js.Any] = js.native
  
  /**
    * An array of series objects.
    */
  var series: js.UndefOr[js.Array[IgDoughnutChartSeries]] = js.native
  
  /**
    * Raised when the slice is clicked.
    */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.native
  
  /**
    * Event fired after a tooltip is hidden
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.native
  
  /**
    * Event fired when the mouse has left a series and the tooltip is about to hide
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.native
  
  /**
    * Event fired when the mouse has hovered on a series and the tooltip is about to show
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.native
  
  /**
    * Event fired after a tooltip is shown
    * Function takes arguments evt and ui.
    * Use ui.element to get reference to tooltip DOM element.
    * Use ui.item to get reference to current series item object.
    * Use ui.chart to get reference to chart object.
    * Use ui.series to get reference to current series object.
    * Use ui.actualItemBrush to get item brush.
    * Use ui.actualSeriesBrush to get series brush.
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.native
  
  /**
    * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgDoughnutChart {
  
  @scala.inline
  def apply(): IgDoughnutChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDoughnutChart]
  }
  
  @scala.inline
  implicit class IgDoughnutChartOps[Self <: IgDoughnutChart] (val x: Self) extends AnyVal {
    
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
    def setAllowSliceExplosion(value: Boolean): Self = this.set("allowSliceExplosion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSliceExplosion: Self = this.set("allowSliceExplosion", js.undefined)
    
    @scala.inline
    def setAllowSliceSelection(value: Boolean): Self = this.set("allowSliceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSliceSelection: Self = this.set("allowSliceSelection", js.undefined)
    
    @scala.inline
    def setBrowserNotSupported(value: (/* event */ Event, /* ui */ BrowserNotSupportedEventUIParam) => Unit): Self = this.set("browserNotSupported", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBrowserNotSupported: Self = this.set("browserNotSupported", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHoleDimensionsChanged(value: (/* event */ Event, /* ui */ HoleDimensionsChangedEventUIParam) => Unit): Self = this.set("holeDimensionsChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHoleDimensionsChanged: Self = this.set("holeDimensionsChanged", js.undefined)
    
    @scala.inline
    def setInnerExtent(value: Double): Self = this.set("innerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerExtent: Self = this.set("innerExtent", js.undefined)
    
    @scala.inline
    def setIsSurfaceInteractionDisabled(value: Boolean): Self = this.set("isSurfaceInteractionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSurfaceInteractionDisabled: Self = this.set("isSurfaceInteractionDisabled", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setSelectedStyle(value: js.Any): Self = this.set("selectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedStyle: Self = this.set("selectedStyle", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: IgDoughnutChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[IgDoughnutChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSliceClick(value: (/* event */ Event, /* ui */ SliceClickEventUIParam) => Unit): Self = this.set("sliceClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSliceClick: Self = this.set("sliceClick", js.undefined)
    
    @scala.inline
    def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Unit): Self = this.set("tooltipHidden", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipHidden: Self = this.set("tooltipHidden", js.undefined)
    
    @scala.inline
    def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Unit): Self = this.set("tooltipHiding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipHiding: Self = this.set("tooltipHiding", js.undefined)
    
    @scala.inline
    def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Unit): Self = this.set("tooltipShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipShowing: Self = this.set("tooltipShowing", js.undefined)
    
    @scala.inline
    def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Unit): Self = this.set("tooltipShown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTooltipShown: Self = this.set("tooltipShown", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
