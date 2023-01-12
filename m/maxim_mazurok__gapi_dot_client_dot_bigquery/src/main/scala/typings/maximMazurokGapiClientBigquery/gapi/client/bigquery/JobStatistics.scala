package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStatistics extends StObject {
  
  /** [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs. */
  var completionRatio: js.UndefOr[Double] = js.undefined
  
  /** [Output-only] Statistics for a copy job. */
  var copy: js.UndefOr[JobStatistics5] = js.undefined
  
  /** [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** [Output-only] Statistics for an extract job. */
  var extract: js.UndefOr[JobStatistics4] = js.undefined
  
  /** [Output-only] Statistics for a load job. */
  var load: js.UndefOr[JobStatistics3] = js.undefined
  
  /** [Output-only] Number of child jobs executed. */
  var numChildJobs: js.UndefOr[String] = js.undefined
  
  /** [Output-only] If this is a child job, the id of the parent. */
  var parentJobId: js.UndefOr[String] = js.undefined
  
  /** [Output-only] Statistics for a query job. */
  var query: js.UndefOr[JobStatistics2] = js.undefined
  
  /** [Output-only] Quotas which delayed this job's start time. */
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.undefined
  
  /** [Output-only] Job resource usage breakdown by reservation. */
  var reservationUsage: js.UndefOr[js.Array[Name]] = js.undefined
  
  /**
    * [Output-only] Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent
    * reservations were used to execute this job.
    */
  var reservation_id: js.UndefOr[String] = js.undefined
  
  /** [Output-only] [Preview] Statistics for row-level security. Present only for query and extract jobs. */
  var rowLevelSecurityStatistics: js.UndefOr[RowLevelSecurityStatistics] = js.undefined
  
  /** [Output-only] Statistics for a child job of a script. */
  var scriptStatistics: js.UndefOr[ScriptStatistics] = js.undefined
  
  /** [Output-only] [Preview] Information of the session if this job is part of one. */
  var sessionInfo: js.UndefOr[SessionInfo] = js.undefined
  
  /** [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** [Output-only] [Deprecated] Use the bytes processed in the query statistics instead. */
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  
  /** [Output-only] Slot-milliseconds for the job. */
  var totalSlotMs: js.UndefOr[String] = js.undefined
  
  /** [Output-only] [Alpha] Information of the multi-statement transaction if this job is part of one. */
  var transactionInfo: js.UndefOr[TransactionInfo] = js.undefined
}
object JobStatistics {
  
  inline def apply(): JobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobStatistics] (val x: Self) extends AnyVal {
    
    inline def setCompletionRatio(value: Double): Self = StObject.set(x, "completionRatio", value.asInstanceOf[js.Any])
    
    inline def setCompletionRatioUndefined: Self = StObject.set(x, "completionRatio", js.undefined)
    
    inline def setCopy(value: JobStatistics5): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setExtract(value: JobStatistics4): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setLoad(value: JobStatistics3): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setNumChildJobs(value: String): Self = StObject.set(x, "numChildJobs", value.asInstanceOf[js.Any])
    
    inline def setNumChildJobsUndefined: Self = StObject.set(x, "numChildJobs", js.undefined)
    
    inline def setParentJobId(value: String): Self = StObject.set(x, "parentJobId", value.asInstanceOf[js.Any])
    
    inline def setParentJobIdUndefined: Self = StObject.set(x, "parentJobId", js.undefined)
    
    inline def setQuery(value: JobStatistics2): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setQuotaDeferments(value: js.Array[String]): Self = StObject.set(x, "quotaDeferments", value.asInstanceOf[js.Any])
    
    inline def setQuotaDefermentsUndefined: Self = StObject.set(x, "quotaDeferments", js.undefined)
    
    inline def setQuotaDefermentsVarargs(value: String*): Self = StObject.set(x, "quotaDeferments", js.Array(value*))
    
    inline def setReservationUsage(value: js.Array[Name]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
    
    inline def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
    
    inline def setReservationUsageVarargs(value: Name*): Self = StObject.set(x, "reservationUsage", js.Array(value*))
    
    inline def setReservation_id(value: String): Self = StObject.set(x, "reservation_id", value.asInstanceOf[js.Any])
    
    inline def setReservation_idUndefined: Self = StObject.set(x, "reservation_id", js.undefined)
    
    inline def setRowLevelSecurityStatistics(value: RowLevelSecurityStatistics): Self = StObject.set(x, "rowLevelSecurityStatistics", value.asInstanceOf[js.Any])
    
    inline def setRowLevelSecurityStatisticsUndefined: Self = StObject.set(x, "rowLevelSecurityStatistics", js.undefined)
    
    inline def setScriptStatistics(value: ScriptStatistics): Self = StObject.set(x, "scriptStatistics", value.asInstanceOf[js.Any])
    
    inline def setScriptStatisticsUndefined: Self = StObject.set(x, "scriptStatistics", js.undefined)
    
    inline def setSessionInfo(value: SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
    
    inline def setTransactionInfo(value: TransactionInfo): Self = StObject.set(x, "transactionInfo", value.asInstanceOf[js.Any])
    
    inline def setTransactionInfoUndefined: Self = StObject.set(x, "transactionInfo", js.undefined)
  }
}
