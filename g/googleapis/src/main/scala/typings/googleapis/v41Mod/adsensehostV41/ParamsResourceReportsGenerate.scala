package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReportsGenerate
  extends StObject
     with StandardParameters {
  
  /**
    * Dimensions to base the report on.
    */
  var dimension: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * End of the date range to report on in "YYYY-MM-DD" format, inclusive.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Filters to be run on the report.
    */
  var filter: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of rows of report data to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Numeric columns to include in the report.
    */
  var metric: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of a dimension or metric to sort the resulting report on, optionally prefixed with "+" to sort ascending or "-" to sort descending. If no prefix is specified, the column is sorted ascending.
    */
  var sort: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Start of the date range to report on in "YYYY-MM-DD" format, inclusive.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * Index of the first row of report data to return.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object ParamsResourceReportsGenerate {
  
  inline def apply(): ParamsResourceReportsGenerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsGenerate]
  }
  
  extension [Self <: ParamsResourceReportsGenerate](x: Self) {
    
    inline def setDimension(value: js.Array[String]): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setDimensionVarargs(value: String*): Self = StObject.set(x, "dimension", js.Array(value*))
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFilter(value: js.Array[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMetric(value: js.Array[String]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setMetricVarargs(value: String*): Self = StObject.set(x, "metric", js.Array(value*))
    
    inline def setSort(value: js.Array[String]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: String*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
