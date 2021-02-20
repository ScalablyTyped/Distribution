package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomRichMediaEvents extends StObject {
  
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  
  /** The list of filters on which dimensions are filtered. Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the value needs to be
    * 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The properties of the report. */
  var reportProperties: js.UndefOr[IncludeAttributedIPConversions] = js.native
}
object CustomRichMediaEvents {
  
  @scala.inline
  def apply(): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
  
  @scala.inline
  implicit class CustomRichMediaEventsMutableBuilder[Self <: CustomRichMediaEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomRichMediaEvents(value: js.Array[DimensionValue]): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    @scala.inline
    def setCustomRichMediaEventsVarargs(value: DimensionValue*): Self = StObject.set(x, "customRichMediaEvents", js.Array(value :_*))
    
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
    def setReportProperties(value: IncludeAttributedIPConversions): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
