package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssigningCategoryMarkerStyleEventUIParam extends js.Object {
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
  var endDate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the end index for the current items.
  	 */
  var endIndex: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get or set the fill to use for the current item.
  	 */
  var fill: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get all the items associated with the event (only if necessary).
  	 */
  var getItems: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
  	 */
  var hasDateRange: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to set if the default highlighting behavior should not run, given that you are handling it in this event.
  	 */
  var highlightingHandled: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the maximum highlighted progress across all series.
  	 */
  var maxAllSeriesHighlightingProgress: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get or set the opacity to use for the current item.
  	 */
  var opacity: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to current series object.
  	 */
  var series: js.UndefOr[js.Any] = js.undefined
  var startDate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the start index for the current items.
  	 */
  var startIndex: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get or set the stroke to use for the current item.
  	 */
  var stroke: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get the sum of highlighting progtess across all series.
  	 */
  var sumAllSeriesHighlightingProgress: js.UndefOr[js.Any] = js.undefined
}

object AssigningCategoryMarkerStyleEventUIParam {
  @scala.inline
  def apply(
    chart: js.Any = null,
    endDate: js.Any = null,
    endIndex: js.Any = null,
    fill: js.Any = null,
    getItems: js.Any = null,
    hasDateRange: js.Any = null,
    highlightingHandled: js.Any = null,
    maxAllSeriesHighlightingProgress: js.Any = null,
    opacity: js.Any = null,
    series: js.Any = null,
    startDate: js.Any = null,
    startIndex: js.Any = null,
    stroke: js.Any = null,
    sumAllSeriesHighlightingProgress: js.Any = null
  ): AssigningCategoryMarkerStyleEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (getItems != null) __obj.updateDynamic("getItems")(getItems)
    if (hasDateRange != null) __obj.updateDynamic("hasDateRange")(hasDateRange)
    if (highlightingHandled != null) __obj.updateDynamic("highlightingHandled")(highlightingHandled)
    if (maxAllSeriesHighlightingProgress != null) __obj.updateDynamic("maxAllSeriesHighlightingProgress")(maxAllSeriesHighlightingProgress)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (series != null) __obj.updateDynamic("series")(series)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (sumAllSeriesHighlightingProgress != null) __obj.updateDynamic("sumAllSeriesHighlightingProgress")(sumAllSeriesHighlightingProgress)
    __obj.asInstanceOf[AssigningCategoryMarkerStyleEventUIParam]
  }
}

