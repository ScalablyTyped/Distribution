package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics2 extends StObject {
  
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
  implicit class JobStatistics2MutableBuilder[Self <: JobStatistics2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingTier(value: Double): Self = StObject.set(x, "billingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingTierUndefined: Self = StObject.set(x, "billingTier", js.undefined)
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    @scala.inline
    def setDdlAffectedRowAccessPolicyCount(value: String): Self = StObject.set(x, "ddlAffectedRowAccessPolicyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlAffectedRowAccessPolicyCountUndefined: Self = StObject.set(x, "ddlAffectedRowAccessPolicyCount", js.undefined)
    
    @scala.inline
    def setDdlOperationPerformed(value: String): Self = StObject.set(x, "ddlOperationPerformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlOperationPerformedUndefined: Self = StObject.set(x, "ddlOperationPerformed", js.undefined)
    
    @scala.inline
    def setDdlTargetRoutine(value: RoutineReference): Self = StObject.set(x, "ddlTargetRoutine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlTargetRoutineUndefined: Self = StObject.set(x, "ddlTargetRoutine", js.undefined)
    
    @scala.inline
    def setDdlTargetRowAccessPolicy(value: RowAccessPolicyReference): Self = StObject.set(x, "ddlTargetRowAccessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlTargetRowAccessPolicyUndefined: Self = StObject.set(x, "ddlTargetRowAccessPolicy", js.undefined)
    
    @scala.inline
    def setDdlTargetTable(value: TableReference): Self = StObject.set(x, "ddlTargetTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdlTargetTableUndefined: Self = StObject.set(x, "ddlTargetTable", js.undefined)
    
    @scala.inline
    def setEstimatedBytesProcessed(value: String): Self = StObject.set(x, "estimatedBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedBytesProcessedUndefined: Self = StObject.set(x, "estimatedBytesProcessed", js.undefined)
    
    @scala.inline
    def setModelTraining(value: BigQueryModelTraining): Self = StObject.set(x, "modelTraining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTrainingCurrentIteration(value: Double): Self = StObject.set(x, "modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTrainingCurrentIterationUndefined: Self = StObject.set(x, "modelTrainingCurrentIteration", js.undefined)
    
    @scala.inline
    def setModelTrainingExpectedTotalIteration(value: String): Self = StObject.set(x, "modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelTrainingExpectedTotalIterationUndefined: Self = StObject.set(x, "modelTrainingExpectedTotalIteration", js.undefined)
    
    @scala.inline
    def setModelTrainingUndefined: Self = StObject.set(x, "modelTraining", js.undefined)
    
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
    
    @scala.inline
    def setQueryPlan(value: js.Array[ExplainQueryStage]): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    @scala.inline
    def setQueryPlanVarargs(value: ExplainQueryStage*): Self = StObject.set(x, "queryPlan", js.Array(value :_*))
    
    @scala.inline
    def setReferencedRoutines(value: js.Array[RoutineReference]): Self = StObject.set(x, "referencedRoutines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedRoutinesUndefined: Self = StObject.set(x, "referencedRoutines", js.undefined)
    
    @scala.inline
    def setReferencedRoutinesVarargs(value: RoutineReference*): Self = StObject.set(x, "referencedRoutines", js.Array(value :_*))
    
    @scala.inline
    def setReferencedTables(value: js.Array[TableReference]): Self = StObject.set(x, "referencedTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedTablesUndefined: Self = StObject.set(x, "referencedTables", js.undefined)
    
    @scala.inline
    def setReferencedTablesVarargs(value: TableReference*): Self = StObject.set(x, "referencedTables", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[Name]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: Name*): Self = StObject.set(x, "reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setStatementType(value: String): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
    
    @scala.inline
    def setTimeline(value: js.Array[QueryTimelineSample]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    @scala.inline
    def setTimelineVarargs(value: QueryTimelineSample*): Self = StObject.set(x, "timeline", js.Array(value :_*))
    
    @scala.inline
    def setTotalBytesBilled(value: String): Self = StObject.set(x, "totalBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesBilledUndefined: Self = StObject.set(x, "totalBytesBilled", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedAccuracy(value: String): Self = StObject.set(x, "totalBytesProcessedAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedAccuracyUndefined: Self = StObject.set(x, "totalBytesProcessedAccuracy", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalPartitionsProcessed(value: String): Self = StObject.set(x, "totalPartitionsProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPartitionsProcessedUndefined: Self = StObject.set(x, "totalPartitionsProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
    
    @scala.inline
    def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "undeclaredQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeclaredQueryParametersUndefined: Self = StObject.set(x, "undeclaredQueryParameters", js.undefined)
    
    @scala.inline
    def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "undeclaredQueryParameters", js.Array(value :_*))
  }
}
