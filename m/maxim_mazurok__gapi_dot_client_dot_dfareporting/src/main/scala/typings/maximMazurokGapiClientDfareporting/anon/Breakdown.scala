package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Breakdown extends StObject {
  
  /** The list of dimensions the report should include. */
  var breakdown: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.undefined
  
  /** The dimension option. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /** The list of filters on which dimensions are filtered. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The list of names of overlap metrics the report should include. */
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether the report is pivoted or not. Defaults to true. */
  var pivoted: js.UndefOr[Boolean] = js.undefined
}
object Breakdown {
  
  inline def apply(): Breakdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakdown]
  }
  
  extension [Self <: Breakdown](x: Self) {
    
    inline def setBreakdown(value: js.Array[SortedDimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    inline def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    inline def setBreakdownVarargs(value: SortedDimension*): Self = StObject.set(x, "breakdown", js.Array(value*))
    
    inline def setDateRange(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    inline def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    inline def setDimensionFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value*))
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    inline def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    inline def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value*))
    
    inline def setOverlapMetricNames(value: js.Array[String]): Self = StObject.set(x, "overlapMetricNames", value.asInstanceOf[js.Any])
    
    inline def setOverlapMetricNamesUndefined: Self = StObject.set(x, "overlapMetricNames", js.undefined)
    
    inline def setOverlapMetricNamesVarargs(value: String*): Self = StObject.set(x, "overlapMetricNames", js.Array(value*))
    
    inline def setPivoted(value: Boolean): Self = StObject.set(x, "pivoted", value.asInstanceOf[js.Any])
    
    inline def setPivotedUndefined: Self = StObject.set(x, "pivoted", js.undefined)
  }
}
