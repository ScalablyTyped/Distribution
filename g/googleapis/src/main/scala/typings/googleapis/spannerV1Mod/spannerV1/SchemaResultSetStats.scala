package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional statistics about a ResultSet or PartialResultSet.
  */
trait SchemaResultSetStats extends StObject {
  
  /**
    * QueryPlan for the query associated with this result.
    */
  var queryPlan: js.UndefOr[SchemaQueryPlan] = js.undefined
  
  /**
    * Aggregated statistics from the execution of the query. Only present when
    * the query is profiled. For example, a query could return the statistics
    * as follows:      {       &quot;rows_returned&quot;: &quot;3&quot;,
    * &quot;elapsed_time&quot;: &quot;1.22 secs&quot;, &quot;cpu_time&quot;:
    * &quot;1.19 secs&quot;     }
    */
  var queryStats: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Standard DML returns an exact count of rows that were modified.
    */
  var rowCountExact: js.UndefOr[String] = js.undefined
  
  /**
    * Partitioned DML does not offer exactly-once semantics, so it returns a
    * lower bound of the rows modified.
    */
  var rowCountLowerBound: js.UndefOr[String] = js.undefined
}
object SchemaResultSetStats {
  
  inline def apply(): SchemaResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetStats]
  }
  
  extension [Self <: SchemaResultSetStats](x: Self) {
    
    inline def setQueryPlan(value: SchemaQueryPlan): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setQueryStats(value: StringDictionary[js.Any]): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
    
    inline def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    
    inline def setRowCountExact(value: String): Self = StObject.set(x, "rowCountExact", value.asInstanceOf[js.Any])
    
    inline def setRowCountExactUndefined: Self = StObject.set(x, "rowCountExact", js.undefined)
    
    inline def setRowCountLowerBound(value: String): Self = StObject.set(x, "rowCountLowerBound", value.asInstanceOf[js.Any])
    
    inline def setRowCountLowerBoundUndefined: Self = StObject.set(x, "rowCountLowerBound", js.undefined)
  }
}
