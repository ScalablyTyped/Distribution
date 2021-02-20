package typings.maximMazurokGapiClientDfareporting.anon

import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breakdown extends StObject {
  
  /** The list of dimensions the report should include. */
  var breakdown: js.UndefOr[js.Array[SortedDimension]] = js.native
  
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  
  /** The dimension option. */
  var dimension: js.UndefOr[String] = js.native
  
  /** The list of filters on which dimensions are filtered. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** The list of names of overlap metrics the report should include. */
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the report is pivoted or not. Defaults to true. */
  var pivoted: js.UndefOr[Boolean] = js.native
}
object Breakdown {
  
  @scala.inline
  def apply(): Breakdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakdown]
  }
  
  @scala.inline
  implicit class BreakdownMutableBuilder[Self <: Breakdown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakdown(value: js.Array[SortedDimension]): Self = StObject.set(x, "breakdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakdownUndefined: Self = StObject.set(x, "breakdown", js.undefined)
    
    @scala.inline
    def setBreakdownVarargs(value: SortedDimension*): Self = StObject.set(x, "breakdown", js.Array(value :_*))
    
    @scala.inline
    def setDateRange(value: typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    @scala.inline
    def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFilters(value: js.Array[DimensionValue]): Self = StObject.set(x, "dimensionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionFiltersUndefined: Self = StObject.set(x, "dimensionFilters", js.undefined)
    
    @scala.inline
    def setDimensionFiltersVarargs(value: DimensionValue*): Self = StObject.set(x, "dimensionFilters", js.Array(value :_*))
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setMetricNames(value: js.Array[String]): Self = StObject.set(x, "metricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNamesUndefined: Self = StObject.set(x, "metricNames", js.undefined)
    
    @scala.inline
    def setMetricNamesVarargs(value: String*): Self = StObject.set(x, "metricNames", js.Array(value :_*))
    
    @scala.inline
    def setOverlapMetricNames(value: js.Array[String]): Self = StObject.set(x, "overlapMetricNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapMetricNamesUndefined: Self = StObject.set(x, "overlapMetricNames", js.undefined)
    
    @scala.inline
    def setOverlapMetricNamesVarargs(value: String*): Self = StObject.set(x, "overlapMetricNames", js.Array(value :_*))
    
    @scala.inline
    def setPivoted(value: Boolean): Self = StObject.set(x, "pivoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotedUndefined: Self = StObject.set(x, "pivoted", js.undefined)
  }
}
