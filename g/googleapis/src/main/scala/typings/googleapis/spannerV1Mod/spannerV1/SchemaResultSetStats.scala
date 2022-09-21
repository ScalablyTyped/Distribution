package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultSetStats extends StObject {
  
  /**
    * QueryPlan for the query associated with this result.
    */
  var queryPlan: js.UndefOr[SchemaQueryPlan] = js.undefined
  
  /**
    * Aggregated statistics from the execution of the query. Only present when the query is profiled. For example, a query could return the statistics as follows: { "rows_returned": "3", "elapsed_time": "1.22 secs", "cpu_time": "1.19 secs" \}
    */
  var queryStats: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Standard DML returns an exact count of rows that were modified.
    */
  var rowCountExact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Partitioned DML does not offer exactly-once semantics, so it returns a lower bound of the rows modified.
    */
  var rowCountLowerBound: js.UndefOr[String | Null] = js.undefined
}
object SchemaResultSetStats {
  
  inline def apply(): SchemaResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetStats]
  }
  
  extension [Self <: SchemaResultSetStats](x: Self) {
    
    inline def setQueryPlan(value: SchemaQueryPlan): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setQueryStats(value: StringDictionary[Any]): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
    
    inline def setQueryStatsNull: Self = StObject.set(x, "queryStats", null)
    
    inline def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    
    inline def setRowCountExact(value: String): Self = StObject.set(x, "rowCountExact", value.asInstanceOf[js.Any])
    
    inline def setRowCountExactNull: Self = StObject.set(x, "rowCountExact", null)
    
    inline def setRowCountExactUndefined: Self = StObject.set(x, "rowCountExact", js.undefined)
    
    inline def setRowCountLowerBound(value: String): Self = StObject.set(x, "rowCountLowerBound", value.asInstanceOf[js.Any])
    
    inline def setRowCountLowerBoundNull: Self = StObject.set(x, "rowCountLowerBound", null)
    
    inline def setRowCountLowerBoundUndefined: Self = StObject.set(x, "rowCountLowerBound", js.undefined)
  }
}
