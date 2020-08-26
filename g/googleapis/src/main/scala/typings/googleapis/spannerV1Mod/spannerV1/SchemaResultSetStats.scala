package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional statistics about a ResultSet or PartialResultSet.
  */
@js.native
trait SchemaResultSetStats extends js.Object {
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
  implicit class SchemaResultSetStatsOps[Self <: SchemaResultSetStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueryPlan(value: SchemaQueryPlan): Self = this.set("queryPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryPlan: Self = this.set("queryPlan", js.undefined)
    @scala.inline
    def setQueryStats(value: StringDictionary[js.Any]): Self = this.set("queryStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryStats: Self = this.set("queryStats", js.undefined)
    @scala.inline
    def setRowCountExact(value: String): Self = this.set("rowCountExact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCountExact: Self = this.set("rowCountExact", js.undefined)
    @scala.inline
    def setRowCountLowerBound(value: String): Self = this.set("rowCountLowerBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowCountLowerBound: Self = this.set("rowCountLowerBound", js.undefined)
  }
  
}

