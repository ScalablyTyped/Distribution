package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activities extends StObject {
  
  /** Activity group. */
  var activities: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Activities] = js.undefined
  
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[
    typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
  ] = js.undefined
  
  /** The date range for which this report should be run. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.undefined
  
  /** The list of filters on which dimensions are filtered. Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The list of standard dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
}
object Activities {
  
  @scala.inline
  def apply(): Activities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities]
  }
  
  @scala.inline
  implicit class ActivitiesMutableBuilder[Self <: Activities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Activities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setCustomRichMediaEvents(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    @scala.inline
    def setDateRange(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
  }
}
