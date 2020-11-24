package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.ChannelGrouping
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.PathFilter
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityFilters extends js.Object {
  
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
  implicit class ActivityFiltersOps[Self <: ActivityFilters] (val x: Self) extends AnyVal {
    
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
    def setActivityFiltersVarargs(value: DimensionValue*): Self = this.set("activityFilters", js.Array(value :_*))
    
    @scala.inline
    def setActivityFilters(value: js.Array[DimensionValue]): Self = this.set("activityFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityFilters: Self = this.set("activityFilters", js.undefined)
    
    @scala.inline
    def setCustomChannelGrouping(value: ChannelGrouping): Self = this.set("customChannelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomChannelGrouping: Self = this.set("customChannelGrouping", js.undefined)
    
    @scala.inline
    def setDateRange(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SortedDimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[SortedDimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setFloodlightConfigId(value: DimensionValue): Self = this.set("floodlightConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightConfigId: Self = this.set("floodlightConfigId", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = this.set("metricNames", js.Array(value :_*))
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = this.set("metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricNames: Self = this.set("metricNames", js.undefined)
    
    @scala.inline
    def setPathFiltersVarargs(value: PathFilter*): Self = this.set("pathFilters", js.Array(value :_*))
    
    @scala.inline
    def setPathFilters(value: js.Array[PathFilter]): Self = this.set("pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathFilters: Self = this.set("pathFilters", js.undefined)
  }
}
