package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRange extends StObject {
  
  /** Activity group. */
  var activities: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.Activities] = js.native
  
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[
    typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
  ] = js.native
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  
  /** The list of filters on which dimensions are filtered. Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /** Whether to enable all reach dimension combinations in the report. Defaults to false. If enabled, the date range of the report should be within the last 42 days. */
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.native
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of names of Reach By Frequency metrics the report should include. */
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.native
}
object DateRange {
  
  @scala.inline
  def apply(): DateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRange]
  }
  
  @scala.inline
  implicit class DateRangeMutableBuilder[Self <: DateRange] (val x: Self) extends AnyVal {
    
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
    def setEnableAllDimensionCombinations(value: Boolean): Self = StObject.set(x, "enableAllDimensionCombinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAllDimensionCombinationsUndefined: Self = StObject.set(x, "enableAllDimensionCombinations", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setReachByFrequencyMetricNames(value: js.Array[String]): Self = StObject.set(x, "reachByFrequencyMetricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachByFrequencyMetricNamesUndefined: Self = StObject.set(x, "reachByFrequencyMetricNames", js.undefined)
    
    @scala.inline
    def setReachByFrequencyMetricNamesVarargs(value: String*): Self = StObject.set(x, "reachByFrequencyMetricNames", js.Array(value :_*))
  }
}
