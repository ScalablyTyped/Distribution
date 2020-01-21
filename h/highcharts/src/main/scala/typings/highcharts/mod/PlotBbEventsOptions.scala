package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBbEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Fires after the series has finished its
    * initial animation, or in case animation is disabled, immediately as the
    * series is displayed.
    */
  var afterAnimate: js.UndefOr[SeriesAfterAnimateCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the checkbox next to the series' name in the
    * legend is clicked. One parameter, `event`, is passed to the function. The
    * state of the checkbox is found by `event.checked`. The checked item is
    * found by `event.item`. Return `false` to prevent the default action which
    * is to toggle the select state of the series.
    */
  var checkboxClick: js.UndefOr[SeriesCheckboxClickCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the series is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    * Additionally, `event.point` holds a pointer to the nearest point on the
    * graph.
    */
  var click: js.UndefOr[SeriesClickCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the series is hidden after chart generation time,
    * either by clicking the legend item or by calling `.hide()`.
    */
  var hide: js.UndefOr[SeriesHideCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the legend item belonging to the series is
    * clicked. One parameter, `event`, is passed to the function. The default
    * action is to toggle the visibility of the series. This can be prevented
    * by returning `false` or calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[SeriesLegendItemClickCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the mouse leaves the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    * If the stickyTracking option is true, `mouseOut` doesn't happen before
    * the mouse enters another graph or leaves the plot area.
    */
  var mouseOut: js.UndefOr[SeriesMouseOutCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the mouse enters the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var mouseOver: js.UndefOr[SeriesMouseOverCallbackFunction] = js.undefined
  /**
    * (Highstock) Fires when the series is shown after chart generation time,
    * either by clicking the legend item or by calling `.show()`.
    */
  var show: js.UndefOr[SeriesShowCallbackFunction] = js.undefined
}

object PlotBbEventsOptions {
  @scala.inline
  def apply(
    afterAnimate: SeriesAfterAnimateCallbackFunction = null,
    checkboxClick: SeriesCheckboxClickCallbackFunction = null,
    click: SeriesClickCallbackFunction = null,
    hide: SeriesHideCallbackFunction = null,
    legendItemClick: SeriesLegendItemClickCallbackFunction = null,
    mouseOut: SeriesMouseOutCallbackFunction = null,
    mouseOver: SeriesMouseOverCallbackFunction = null,
    show: SeriesShowCallbackFunction = null
  ): PlotBbEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (afterAnimate != null) __obj.updateDynamic("afterAnimate")(afterAnimate.asInstanceOf[js.Any])
    if (checkboxClick != null) __obj.updateDynamic("checkboxClick")(checkboxClick.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(legendItemClick.asInstanceOf[js.Any])
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(mouseOut.asInstanceOf[js.Any])
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBbEventsOptions]
  }
}

