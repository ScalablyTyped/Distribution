package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssigningCategoryMarkerStyleEventUIParam extends js.Object {
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[js.Any] = js.native
  var endDate: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the end index for the current items.
    */
  var endIndex: js.UndefOr[js.Any] = js.native
  /**
    * Used to get or set the fill to use for the current item.
    */
  var fill: js.UndefOr[js.Any] = js.native
  /**
    * Used to get all the items associated with the event (only if necessary).
    */
  var getItems: js.UndefOr[js.Any] = js.native
  /**
    * Used to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
    */
  var hasDateRange: js.UndefOr[js.Any] = js.native
  /**
    * Used to set if the default highlighting behavior should not run, given that you are handling it in this event.
    */
  var highlightingHandled: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the maximum highlighted progress across all series.
    */
  var maxAllSeriesHighlightingProgress: js.UndefOr[js.Any] = js.native
  /**
    * Used to get or set the opacity to use for the current item.
    */
  var opacity: js.UndefOr[js.Any] = js.native
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[js.Any] = js.native
  var startDate: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the start index for the current items.
    */
  var startIndex: js.UndefOr[js.Any] = js.native
  /**
    * Used to get or set the stroke to use for the current item.
    */
  var stroke: js.UndefOr[js.Any] = js.native
  /**
    * Used to get the sum of highlighting progtess across all series.
    */
  var sumAllSeriesHighlightingProgress: js.UndefOr[js.Any] = js.native
}

object AssigningCategoryMarkerStyleEventUIParam {
  @scala.inline
  def apply(): AssigningCategoryMarkerStyleEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssigningCategoryMarkerStyleEventUIParam]
  }
  @scala.inline
  implicit class AssigningCategoryMarkerStyleEventUIParamOps[Self <: AssigningCategoryMarkerStyleEventUIParam] (val x: Self) extends AnyVal {
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
    def setChart(value: js.Any): Self = this.set("chart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChart: Self = this.set("chart", js.undefined)
    @scala.inline
    def setEndDate(value: js.Any): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setEndIndex(value: js.Any): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setFill(value: js.Any): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setGetItems(value: js.Any): Self = this.set("getItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetItems: Self = this.set("getItems", js.undefined)
    @scala.inline
    def setHasDateRange(value: js.Any): Self = this.set("hasDateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDateRange: Self = this.set("hasDateRange", js.undefined)
    @scala.inline
    def setHighlightingHandled(value: js.Any): Self = this.set("highlightingHandled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightingHandled: Self = this.set("highlightingHandled", js.undefined)
    @scala.inline
    def setMaxAllSeriesHighlightingProgress(value: js.Any): Self = this.set("maxAllSeriesHighlightingProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllSeriesHighlightingProgress: Self = this.set("maxAllSeriesHighlightingProgress", js.undefined)
    @scala.inline
    def setOpacity(value: js.Any): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setStartDate(value: js.Any): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setStartIndex(value: js.Any): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setStroke(value: js.Any): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setSumAllSeriesHighlightingProgress(value: js.Any): Self = this.set("sumAllSeriesHighlightingProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumAllSeriesHighlightingProgress: Self = this.set("sumAllSeriesHighlightingProgress", js.undefined)
  }
  
}

