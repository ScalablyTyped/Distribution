package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.ChannelGrouping
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.PathFilter
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityFilters extends StObject {
  
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** Channel Grouping. */
  var customChannelGrouping: js.UndefOr[ChannelGrouping] = js.native
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the value needs to be
    * 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Path Filters. */
  var pathFilters: js.UndefOr[js.Array[PathFilter]] = js.native
}
object ActivityFilters {
  
  @scala.inline
  def apply(): ActivityFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityFilters]
  }
  
  @scala.inline
  implicit class ActivityFiltersMutableBuilder[Self <: ActivityFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    @scala.inline
    def setActivityFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value :_*))
    
    @scala.inline
    def setCustomChannelGrouping(value: ChannelGrouping): Self = StObject.set(x, "customChannelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomChannelGroupingUndefined: Self = StObject.set(x, "customChannelGrouping", js.undefined)
    
    @scala.inline
    def setDateRange(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setFloodlightConfigId(value: DimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setPathFilters(value: js.Array[PathFilter]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    @scala.inline
    def setPathFiltersVarargs(value: PathFilter*): Self = StObject.set(x, "pathFilters", js.Array(value :_*))
  }
}
