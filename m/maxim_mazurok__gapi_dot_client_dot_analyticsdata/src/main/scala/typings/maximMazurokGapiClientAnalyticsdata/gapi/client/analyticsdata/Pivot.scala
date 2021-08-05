package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pivot extends StObject {
  
  /**
    * Dimension names for visible columns in the report response. Including "dateRange" produces a date range column; for each row in the response, dimension values in the date range
    * column will indicate the corresponding date range from the request.
    */
  var fieldNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The number of rows to return in this pivot. If unspecified, 10 rows are returned. If -1, all rows are returned. */
  var limit: js.UndefOr[String] = js.undefined
  
  /** Aggregate the metrics by dimensions in this pivot using the specified metric_aggregations. */
  var metricAggregations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The row count of the start row. The first row is counted as row 0. */
  var offset: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how dimensions are ordered in the pivot. In the first Pivot, the OrderBys determine Row and PivotDimensionHeader ordering; in subsequent Pivots, the OrderBys determine
    * only PivotDimensionHeader ordering. Dimensions specified in these OrderBys must be a subset of Pivot.field_names.
    */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.undefined
}
object Pivot {
  
  inline def apply(): Pivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pivot]
  }
  
  extension [Self <: Pivot](x: Self) {
    
    inline def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value :_*))
    
    inline def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetricAggregations(value: js.Array[String]): Self = StObject.set(x, "metricAggregations", value.asInstanceOf[js.Any])
    
    inline def setMetricAggregationsUndefined: Self = StObject.set(x, "metricAggregations", js.undefined)
    
    inline def setMetricAggregationsVarargs(value: String*): Self = StObject.set(x, "metricAggregations", js.Array(value :_*))
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBys(value: js.Array[OrderBy]): Self = StObject.set(x, "orderBys", value.asInstanceOf[js.Any])
    
    inline def setOrderBysUndefined: Self = StObject.set(x, "orderBys", js.undefined)
    
    inline def setOrderBysVarargs(value: OrderBy*): Self = StObject.set(x, "orderBys", js.Array(value :_*))
  }
}
