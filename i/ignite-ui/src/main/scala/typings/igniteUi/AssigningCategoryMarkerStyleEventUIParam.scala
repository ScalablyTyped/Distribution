package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssigningCategoryMarkerStyleEventUIParam extends StObject {
  
  /**
    * Used to get reference to chart object.
    */
  var chart: js.UndefOr[Any] = js.undefined
  
  var endDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the end index for the current items.
    */
  var endIndex: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get or set the fill to use for the current item.
    */
  var fill: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get all the items associated with the event (only if necessary).
    */
  var getItems: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to tell if you should use the startDate and endDate to know the current items instead of startIndex/endIndex.
    */
  var hasDateRange: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to set if the default highlighting behavior should not run, given that you are handling it in this event.
    */
  var highlightingHandled: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the maximum highlighted progress across all series.
    */
  var maxAllSeriesHighlightingProgress: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get or set the opacity to use for the current item.
    */
  var opacity: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get reference to current series object.
    */
  var series: js.UndefOr[Any] = js.undefined
  
  var startDate: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the start index for the current items.
    */
  var startIndex: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get or set the stroke to use for the current item.
    */
  var stroke: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to get the sum of highlighting progtess across all series.
    */
  var sumAllSeriesHighlightingProgress: js.UndefOr[Any] = js.undefined
}
object AssigningCategoryMarkerStyleEventUIParam {
  
  inline def apply(): AssigningCategoryMarkerStyleEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssigningCategoryMarkerStyleEventUIParam]
  }
  
  extension [Self <: AssigningCategoryMarkerStyleEventUIParam](x: Self) {
    
    inline def setChart(value: Any): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setChartUndefined: Self = StObject.set(x, "chart", js.undefined)
    
    inline def setEndDate(value: Any): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEndIndex(value: Any): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setFill(value: Any): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGetItems(value: Any): Self = StObject.set(x, "getItems", value.asInstanceOf[js.Any])
    
    inline def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
    
    inline def setHasDateRange(value: Any): Self = StObject.set(x, "hasDateRange", value.asInstanceOf[js.Any])
    
    inline def setHasDateRangeUndefined: Self = StObject.set(x, "hasDateRange", js.undefined)
    
    inline def setHighlightingHandled(value: Any): Self = StObject.set(x, "highlightingHandled", value.asInstanceOf[js.Any])
    
    inline def setHighlightingHandledUndefined: Self = StObject.set(x, "highlightingHandled", js.undefined)
    
    inline def setMaxAllSeriesHighlightingProgress(value: Any): Self = StObject.set(x, "maxAllSeriesHighlightingProgress", value.asInstanceOf[js.Any])
    
    inline def setMaxAllSeriesHighlightingProgressUndefined: Self = StObject.set(x, "maxAllSeriesHighlightingProgress", js.undefined)
    
    inline def setOpacity(value: Any): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSeries(value: Any): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setStartDate(value: Any): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartIndex(value: Any): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setStroke(value: Any): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setSumAllSeriesHighlightingProgress(value: Any): Self = StObject.set(x, "sumAllSeriesHighlightingProgress", value.asInstanceOf[js.Any])
    
    inline def setSumAllSeriesHighlightingProgressUndefined: Self = StObject.set(x, "sumAllSeriesHighlightingProgress", js.undefined)
  }
}
