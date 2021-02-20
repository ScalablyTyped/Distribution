package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssigningCategoryStyleEventUIParam extends StObject {
  
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
object AssigningCategoryStyleEventUIParam {
  
  @scala.inline
  def apply(): AssigningCategoryStyleEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssigningCategoryStyleEventUIParam]
  }
  
  @scala.inline
  implicit class AssigningCategoryStyleEventUIParamMutableBuilder[Self <: AssigningCategoryStyleEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChart(value: js.Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    @scala.inline
    def setEndDate(value: js.Any): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setEndIndex(value: js.Any): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setFill(value: js.Any): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setGetItems(value: js.Any): Self = StObject.set(x, "getItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    @scala.inline
    def setHasDateRange(value: js.Any): Self = StObject.set(x, "hasDateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDateRangeUndefined: Self = StObject.set(x, "hasDateRange", js.undefined)
    
    @scala.inline
    def setHighlightingHandled(value: js.Any): Self = StObject.set(x, "highlightingHandled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightingHandledUndefined: Self = StObject.set(x, "highlightingHandled", js.undefined)
    
    @scala.inline
    def setMaxAllSeriesHighlightingProgress(value: js.Any): Self = StObject.set(x, "maxAllSeriesHighlightingProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllSeriesHighlightingProgressUndefined: Self = StObject.set(x, "maxAllSeriesHighlightingProgress", js.undefined)
    
    @scala.inline
    def setOpacity(value: js.Any): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setStartDate(value: js.Any): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setStartIndex(value: js.Any): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setStroke(value: js.Any): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setSumAllSeriesHighlightingProgress(value: js.Any): Self = StObject.set(x, "sumAllSeriesHighlightingProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumAllSeriesHighlightingProgressUndefined: Self = StObject.set(x, "sumAllSeriesHighlightingProgress", js.undefined)
  }
}
