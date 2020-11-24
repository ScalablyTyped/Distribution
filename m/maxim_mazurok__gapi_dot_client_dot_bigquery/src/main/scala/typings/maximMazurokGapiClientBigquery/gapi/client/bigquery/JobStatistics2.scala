package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics2 extends js.Object {
  
  /** [Output-only] Billing tier for the job. */
  var billingTier: js.UndefOr[Double] = js.native
  
  /** [Output-only] Whether the query result was fetched from the query cache. */
  var cacheHit: js.UndefOr[Boolean] = js.native
  
  /** [Output-only] [Preview] The number of row access policies affected by a DDL statement. Present only for DROP ALL ROW ACCESS POLICIES queries. */
  var ddlAffectedRowAccessPolicyCount: js.UndefOr[String] = js.native
  
  /**
    * The DDL operation performed, possibly dependent on the pre-existence of the DDL target. Possible values (new values might be added in the future): "CREATE": The query created the
    * DDL target. "SKIP": No-op. Example cases: the query is CREATE TABLE IF NOT EXISTS while the table already exists, or the query is DROP TABLE IF EXISTS while the table does not
    * exist. "REPLACE": The query replaced the DDL target. Example case: the query is CREATE OR REPLACE TABLE, and the table already exists. "DROP": The query deleted the DDL target.
    */
  var ddlOperationPerformed: js.UndefOr[String] = js.native
  
  /** The DDL target routine. Present only for CREATE/DROP FUNCTION/PROCEDURE queries. */
  var ddlTargetRoutine: js.UndefOr[RoutineReference] = js.native
  
  /** [Output-only] [Preview] The DDL target row access policy. Present only for CREATE/DROP ROW ACCESS POLICY queries. */
  var ddlTargetRowAccessPolicy: js.UndefOr[RowAccessPolicyReference] = js.native
  
  /** [Output-only] The DDL target table. Present only for CREATE/DROP TABLE/VIEW and DROP ALL ROW ACCESS POLICIES queries. */
  var ddlTargetTable: js.UndefOr[TableReference] = js.native
  
  /** [Output-only] The original estimate of bytes processed for the job. */
  var estimatedBytesProcessed: js.UndefOr[String] = js.native
  
  /** [Output-only, Beta] Information about create model query job progress. */
  var modelTraining: js.UndefOr[BigQueryModelTraining] = js.native
  
  /** [Output-only, Beta] Deprecated; do not use. */
  var modelTrainingCurrentIteration: js.UndefOr[Double] = js.native
  
  /** [Output-only, Beta] Deprecated; do not use. */
  var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.native
  
  /** [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE. */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  
  /** [Output-only] Describes execution plan for the query. */
  var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.native
  
  /** [Output-only] Referenced routines (persistent user-defined functions and stored procedures) for the job. */
  var referencedRoutines: js.UndefOr[js.Array[RoutineReference]] = js.native
  
  /** [Output-only] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list. */
  var referencedTables: js.UndefOr[js.Array[TableReference]] = js.native
  
  /** [Output-only] Job resource usage breakdown by reservation. */
  var reservationUsage: js.UndefOr[js.Array[Name]] = js.native
  
  /** [Output-only] The schema of the results. Present only for successful dry run of non-legacy SQL queries. */
  var schema: js.UndefOr[TableSchema] = js.native
  
  /**
    * The type of query statement, if valid. Possible values (new values might be added in the future): "SELECT": SELECT query. "INSERT": INSERT query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "UPDATE": UPDATE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "DELETE": DELETE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "MERGE": MERGE query; see
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-manipulation-language. "ALTER_TABLE": ALTER TABLE query. "ALTER_VIEW": ALTER VIEW query. "ASSERT": ASSERT
    * condition AS 'description'. "CREATE_FUNCTION": CREATE FUNCTION query. "CREATE_MODEL": CREATE [OR REPLACE] MODEL ... AS SELECT ... . "CREATE_PROCEDURE": CREATE PROCEDURE query.
    * "CREATE_TABLE": CREATE [OR REPLACE] TABLE without AS SELECT. "CREATE_TABLE_AS_SELECT": CREATE [OR REPLACE] TABLE ... AS SELECT ... . "CREATE_VIEW": CREATE [OR REPLACE] VIEW ... AS
    * SELECT ... . "DROP_FUNCTION" : DROP FUNCTION query. "DROP_PROCEDURE": DROP PROCEDURE query. "DROP_TABLE": DROP TABLE query. "DROP_VIEW": DROP VIEW query.
    */
  var statementType: js.UndefOr[String] = js.native
  
  /** [Output-only] [Beta] Describes a timeline of job execution. */
  var timeline: js.UndefOr[js.Array[QueryTimelineSample]] = js.native
  
  /** [Output-only] Total bytes billed for the job. */
  var totalBytesBilled: js.UndefOr[String] = js.native
  
  /** [Output-only] Total bytes processed for the job. */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] For dry-run jobs, totalBytesProcessed is an estimate and this field specifies the accuracy of the estimate. Possible values can be: UNKNOWN: accuracy of the estimate
    * is unknown. PRECISE: estimate is precise. LOWER_BOUND: estimate is lower bound of what the query would cost. UPPER_BOUND: estimate is upper bound of what the query would cost.
    */
  var totalBytesProcessedAccuracy: js.UndefOr[String] = js.native
  
  /** [Output-only] Total number of partitions processed from all partitioned tables referenced in the job. */
  var totalPartitionsProcessed: js.UndefOr[String] = js.native
  
  /** [Output-only] Slot-milliseconds for the job. */
  var totalSlotMs: js.UndefOr[String] = js.native
  
  /** Standard SQL only: list of undeclared query parameters detected during a dry run validation. */
  var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
}
object JobStatistics2 {
  
  @scala.inline
  def apply(): JobStatistics2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics2]
  }
  
  @scala.inline
  implicit class JobStatistics2Ops[Self <: JobStatistics2] (val x: Self) extends AnyVal {
    
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
    def setBillingTier(value: Double): Self = this.set("billingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingTier: Self = this.set("billingTier", js.undefined)
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = this.set("cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHit: Self = this.set("cacheHit", js.undefined)
    
    @scala.inline
    def setDdlAffectedRowAccessPolicyCount(value: String): Self = this.set("ddlAffectedRowAccessPolicyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlAffectedRowAccessPolicyCount: Self = this.set("ddlAffectedRowAccessPolicyCount", js.undefined)
    
    @scala.inline
    def setDdlOperationPerformed(value: String): Self = this.set("ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlOperationPerformed: Self = this.set("ddlOperationPerformed", js.undefined)
    
    @scala.inline
    def setDdlTargetRoutine(value: RoutineReference): Self = this.set("ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetRoutine: Self = this.set("ddlTargetRoutine", js.undefined)
    
    @scala.inline
    def setDdlTargetRowAccessPolicy(value: RowAccessPolicyReference): Self = this.set("ddlTargetRowAccessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetRowAccessPolicy: Self = this.set("ddlTargetRowAccessPolicy", js.undefined)
    
    @scala.inline
    def setDdlTargetTable(value: TableReference): Self = this.set("ddlTargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdlTargetTable: Self = this.set("ddlTargetTable", js.undefined)
    
    @scala.inline
    def setEstimatedBytesProcessed(value: String): Self = this.set("estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedBytesProcessed: Self = this.set("estimatedBytesProcessed", js.undefined)
    
    @scala.inline
    def setModelTraining(value: BigQueryModelTraining): Self = this.set("modelTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTraining: Self = this.set("modelTraining", js.undefined)
    
    @scala.inline
    def setModelTrainingCurrentIteration(value: Double): Self = this.set("modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTrainingCurrentIteration: Self = this.set("modelTrainingCurrentIteration", js.undefined)
    
    @scala.inline
    def setModelTrainingExpectedTotalIteration(value: String): Self = this.set("modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelTrainingExpectedTotalIteration: Self = this.set("modelTrainingExpectedTotalIteration", js.undefined)
    
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = this.set("numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumDmlAffectedRows: Self = this.set("numDmlAffectedRows", js.undefined)
    
    @scala.inline
    def setQueryPlanVarargs(value: ExplainQueryStage*): Self = this.set("queryPlan", js.Array(value :_*))
    
    @scala.inline
    def setQueryPlan(value: js.Array[ExplainQueryStage]): Self = this.set("queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryPlan: Self = this.set("queryPlan", js.undefined)
    
    @scala.inline
    def setReferencedRoutinesVarargs(value: RoutineReference*): Self = this.set("referencedRoutines", js.Array(value :_*))
    
    @scala.inline
    def setReferencedRoutines(value: js.Array[RoutineReference]): Self = this.set("referencedRoutines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedRoutines: Self = this.set("referencedRoutines", js.undefined)
    
    @scala.inline
    def setReferencedTablesVarargs(value: TableReference*): Self = this.set("referencedTables", js.Array(value :_*))
    
    @scala.inline
    def setReferencedTables(value: js.Array[TableReference]): Self = this.set("referencedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedTables: Self = this.set("referencedTables", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: Name*): Self = this.set("reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[Name]): Self = this.set("reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationUsage: Self = this.set("reservationUsage", js.undefined)
    
    @scala.inline
    def setSchema(value: TableSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setStatementType(value: String): Self = this.set("statementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementType: Self = this.set("statementType", js.undefined)
    
    @scala.inline
    def setTimelineVarargs(value: QueryTimelineSample*): Self = this.set("timeline", js.Array(value :_*))
    
    @scala.inline
    def setTimeline(value: js.Array[QueryTimelineSample]): Self = this.set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeline: Self = this.set("timeline", js.undefined)
    
    @scala.inline
    def setTotalBytesBilled(value: String): Self = this.set("totalBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesBilled: Self = this.set("totalBytesBilled", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessedAccuracy(value: String): Self = this.set("totalBytesProcessedAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessedAccuracy: Self = this.set("totalBytesProcessedAccuracy", js.undefined)
    
    @scala.inline
    def setTotalPartitionsProcessed(value: String): Self = this.set("totalPartitionsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPartitionsProcessed: Self = this.set("totalPartitionsProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
    
    @scala.inline
    def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = this.set("undeclaredQueryParameters", js.Array(value :_*))
    
    @scala.inline
    def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = this.set("undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndeclaredQueryParameters: Self = this.set("undeclaredQueryParameters", js.undefined)
  }
}
