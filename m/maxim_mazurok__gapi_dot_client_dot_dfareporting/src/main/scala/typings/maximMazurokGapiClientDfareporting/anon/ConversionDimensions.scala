package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionDimensions extends StObject {
  
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The list of conversion dimensions the report should include. */
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /** The list of custom floodlight variables the report should include. */
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.undefined
  
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the value needs to be
    * 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.undefined
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of per interaction dimensions the report should include. */
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /** The properties of the report. */
  var reportProperties: js.UndefOr[ClicksLookbackWindow] = js.undefined
}
object ConversionDimensions {
  
  inline def apply(): ConversionDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionDimensions]
  }
  
  extension [Self <: ConversionDimensions](x: Self) {
    
    inline def setActivityFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "activityFilters", value.asInstanceOf[js.Any])
    
    inline def setActivityFiltersUndefined: Self = StObject.set(x, "activityFilters", js.undefined)
    
    inline def setActivityFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "activityFilters", js.Array(value :_*))
    
    inline def setConversionDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "conversionDimensions", value.asInstanceOf[js.Any])
    
    inline def setConversionDimensionsUndefined: Self = StObject.set(x, "conversionDimensions", js.undefined)
    
    inline def setConversionDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "conversionDimensions", js.Array(value :_*))
    
    inline def setCustomFloodlightVariables(value: js.Array[SortedDimension]): Self = StObject.set(x, "customFloodlightVariables", value.asInstanceOf[js.Any])
    
    inline def setCustomFloodlightVariablesUndefined: Self = StObject.set(x, "customFloodlightVariables", js.undefined)
    
    inline def setCustomFloodlightVariablesVarargs(value: SortedDimension*): Self = StObject.set(x, "customFloodlightVariables", js.Array(value :_*))
    
    inline def setCustomRichMediaEvents(value: js.Array[DimensionValue]): Self = StObject.set(x, "customRichMediaEvents", value.asInstanceOf[js.Any])
    
    inline def setCustomRichMediaEventsUndefined: Self = StObject.set(x, "customRichMediaEvents", js.undefined)
    
    inline def setCustomRichMediaEventsVarargs(value: DimensionValue*): Self = StObject.set(x, "customRichMediaEvents", js.Array(value :_*))
    
    inline def setDateRange(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setFloodlightConfigId(value: DimensionValue): Self = StObject.set(x, "floodlightConfigId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightConfigIdUndefined: Self = StObject.set(x, "floodlightConfigId", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    inline def setPerInteractionDimensions(value: js.Array[SortedDimension]): Self = StObject.set(x, "perInteractionDimensions", value.asInstanceOf[js.Any])
    
    inline def setPerInteractionDimensionsUndefined: Self = StObject.set(x, "perInteractionDimensions", js.undefined)
    
    inline def setPerInteractionDimensionsVarargs(value: SortedDimension*): Self = StObject.set(x, "perInteractionDimensions", js.Array(value :_*))
    
    inline def setReportProperties(value: ClicksLookbackWindow): Self = StObject.set(x, "reportProperties", value.asInstanceOf[js.Any])
    
    inline def setReportPropertiesUndefined: Self = StObject.set(x, "reportProperties", js.undefined)
  }
}
