package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDoughnutChart
  extends /**
	 * Option for igDoughnutChart
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether the slices can be exploded.
  	 */
  var allowSliceExplosion: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether the slices can be selected.
  	 */
  var allowSliceSelection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired when the control is displayed on a non HTML5 compliant browser
  	 */
  var browserNotSupported: js.UndefOr[BrowserNotSupportedEvent] = js.undefined
  /**
  	 * The height of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Raised when the dimensions (center point or radius) of the doughnut hole change.
  	 */
  var holeDimensionsChanged: js.UndefOr[HoleDimensionsChangedEvent] = js.undefined
  /**
  	 * Gets or sets the inner extent of the doughnut chart. It is percent from the outer ring's radius.
  	 */
  var innerExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether all surface interactions with the plot area should be disabled.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * An array of series objects.
  	 */
  var series: js.UndefOr[js.Array[IgDoughnutChartSeries]] = js.undefined
  /**
  	 * Raised when the slice is clicked.
  	 */
  var sliceClick: js.UndefOr[SliceClickEvent] = js.undefined
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
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
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
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
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
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
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
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  /**
  	 * The width of the chart. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgDoughnutChart {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igDoughnutChart
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowSliceExplosion: js.UndefOr[Boolean] = js.undefined,
    allowSliceSelection: js.UndefOr[Boolean] = js.undefined,
    browserNotSupported: (/* event */ Event_, /* ui */ BrowserNotSupportedEventUIParam) => Unit = null,
    height: String | Double = null,
    holeDimensionsChanged: (/* event */ Event_, /* ui */ HoleDimensionsChangedEventUIParam) => Unit = null,
    innerExtent: Int | Double = null,
    isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined,
    pixelScalingRatio: Int | Double = null,
    selectedStyle: js.Any = null,
    series: js.Array[IgDoughnutChartSeries] = null,
    sliceClick: (/* event */ Event_, /* ui */ SliceClickEventUIParam) => Unit = null,
    tooltipHidden: (/* event */ Event_, /* ui */ TooltipHiddenEventUIParam) => Unit = null,
    tooltipHiding: (/* event */ Event_, /* ui */ TooltipHidingEventUIParam) => Unit = null,
    tooltipShowing: (/* event */ Event_, /* ui */ TooltipShowingEventUIParam) => Unit = null,
    tooltipShown: (/* event */ Event_, /* ui */ TooltipShownEventUIParam) => Unit = null,
    width: String | Double = null
  ): IgDoughnutChart = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowSliceExplosion)) __obj.updateDynamic("allowSliceExplosion")(allowSliceExplosion.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSliceSelection)) __obj.updateDynamic("allowSliceSelection")(allowSliceSelection.asInstanceOf[js.Any])
    if (browserNotSupported != null) __obj.updateDynamic("browserNotSupported")(js.Any.fromFunction2(browserNotSupported))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (holeDimensionsChanged != null) __obj.updateDynamic("holeDimensionsChanged")(js.Any.fromFunction2(holeDimensionsChanged))
    if (innerExtent != null) __obj.updateDynamic("innerExtent")(innerExtent.asInstanceOf[js.Any])
    if (!js.isUndefined(isSurfaceInteractionDisabled)) __obj.updateDynamic("isSurfaceInteractionDisabled")(isSurfaceInteractionDisabled.asInstanceOf[js.Any])
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (sliceClick != null) __obj.updateDynamic("sliceClick")(js.Any.fromFunction2(sliceClick))
    if (tooltipHidden != null) __obj.updateDynamic("tooltipHidden")(js.Any.fromFunction2(tooltipHidden))
    if (tooltipHiding != null) __obj.updateDynamic("tooltipHiding")(js.Any.fromFunction2(tooltipHiding))
    if (tooltipShowing != null) __obj.updateDynamic("tooltipShowing")(js.Any.fromFunction2(tooltipShowing))
    if (tooltipShown != null) __obj.updateDynamic("tooltipShown")(js.Any.fromFunction2(tooltipShown))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDoughnutChart]
  }
}

