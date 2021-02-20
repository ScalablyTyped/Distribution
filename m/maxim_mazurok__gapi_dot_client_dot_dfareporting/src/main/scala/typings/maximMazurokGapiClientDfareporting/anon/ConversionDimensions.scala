package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionDimensions extends StObject {
  
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The list of conversion dimensions the report should include. */
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /** The list of custom floodlight variables the report should include. */
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the value needs to be
    * 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of per interaction dimensions the report should include. */
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /** The properties of the report. */
  var reportProperties: js.UndefOr[ClicksLookbackWindow] = js.native
}
object ConversionDimensions {
  
  @scala.inline
  def apply(): ConversionDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionDimensions]
  }
  
  @scala.inline
  implicit class ConversionDimensionsMutableBuilder[Self <: ConversionDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    @scala.inline
    def setActivityFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value :_*))
    
    @scala.inline
    def setConversionDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    @scala.inline
    def setConversionDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[SortedDimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: SortedDimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value :_*))
    
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
    def setPerInteractionDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value :_*))
    
    @scala.inline
    def setReportProperties(value: ClicksLookbackWindow): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
