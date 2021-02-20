package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional statistics about a ResultSet or PartialResultSet.
  */
@js.native
trait SchemaResultSetStats extends StObject {
  
  /**
    * QueryPlan for the query associated with this result.
    */
  var queryPlan: js.UndefOr[SchemaQueryPlan] = js.native
  
  /**
    * Aggregated statistics from the execution of the query. Only present when
    * the query is profiled. For example, a query could return the statistics
    * as follows:      {       &quot;rows_returned&quot;: &quot;3&quot;,
    * &quot;elapsed_time&quot;: &quot;1.22 secs&quot;, &quot;cpu_time&quot;:
    * &quot;1.19 secs&quot;     }
    */
  var queryStats: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Standard DML returns an exact count of rows that were modified.
    */
  var rowCountExact: js.UndefOr[String] = js.native
  
  /**
    * Partitioned DML does not offer exactly-once semantics, so it returns a
    * lower bound of the rows modified.
    */
  var rowCountLowerBound: js.UndefOr[String] = js.native
}
object SchemaResultSetStats {
  
  @scala.inline
  def apply(): SchemaResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetStats]
  }
  
  @scala.inline
  implicit class SchemaResultSetStatsMutableBuilder[Self <: SchemaResultSetStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryPlan(value: SchemaQueryPlan): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    @scala.inline
    def setQueryStats(value: StringDictionary[js.Any]): Self = StObject.set(x, "queryStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStatsUndefined: Self = StObject.set(x, "queryStats", js.undefined)
    
    @scala.inline
    def setRowCountExact(value: String): Self = StObject.set(x, "rowCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountExactUndefined: Self = StObject.set(x, "rowCountExact", js.undefined)
    
    @scala.inline
    def setRowCountLowerBound(value: String): Self = StObject.set(x, "rowCountLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountLowerBoundUndefined: Self = StObject.set(x, "rowCountLowerBound", js.undefined)
  }
}
