package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import typings.maximMazurokGapiClientBigquery.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatistics extends js.Object {
  
  /** [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs. */
  var completionRatio: js.UndefOr[Double] = js.native
  
  /** [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state. */
  var endTime: js.UndefOr[String] = js.native
  
  /** [Output-only] Statistics for an extract job. */
  var extract: js.UndefOr[JobStatistics4] = js.native
  
  /** [Output-only] Statistics for a load job. */
  var load: js.UndefOr[JobStatistics3] = js.native
  
  /** [Output-only] Number of child jobs executed. */
  var numChildJobs: js.UndefOr[String] = js.native
  
  /** [Output-only] If this is a child job, the id of the parent. */
  var parentJobId: js.UndefOr[String] = js.native
  
  /** [Output-only] Statistics for a query job. */
  var query: js.UndefOr[JobStatistics2] = js.native
  
  /** [Output-only] Quotas which delayed this job's start time. */
  var quotaDeferments: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output-only] Job resource usage breakdown by reservation. */
  var reservationUsage: js.UndefOr[js.Array[Name]] = js.native
  
  /**
    * [Output-only] Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent
    * reservations were used to execute this job.
    */
  var reservation_id: js.UndefOr[String] = js.native
  
  /** [Output-only] [Preview] Statistics for row-level security. Present only for query and extract jobs. */
  var rowLevelSecurityStatistics: js.UndefOr[RowLevelSecurityStatistics] = js.native
  
  /** [Output-only] Statistics for a child job of a script. */
  var scriptStatistics: js.UndefOr[ScriptStatistics] = js.native
  
  /** [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE. */
  var startTime: js.UndefOr[String] = js.native
  
  /** [Output-only] [Deprecated] Use the bytes processed in the query statistics instead. */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  
  /** [Output-only] Slot-milliseconds for the job. */
  var totalSlotMs: js.UndefOr[String] = js.native
  
  /** [Output-only] [Alpha] Information of the multi-statement transaction if this job is part of one. */
  var transactionInfoTemplate: js.UndefOr[TransactionInfo] = js.native
}
object JobStatistics {
  
  @scala.inline
  def apply(): JobStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatistics]
  }
  
  @scala.inline
  implicit class JobStatisticsOps[Self <: JobStatistics] (val x: Self) extends AnyVal {
    
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
    def setCompletionRatio(value: Double): Self = this.set("completionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionRatio: Self = this.set("completionRatio", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setExtract(value: JobStatistics4): Self = this.set("extract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtract: Self = this.set("extract", js.undefined)
    
    @scala.inline
    def setLoad(value: JobStatistics3): Self = this.set("load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setNumChildJobs(value: String): Self = this.set("numChildJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumChildJobs: Self = this.set("numChildJobs", js.undefined)
    
    @scala.inline
    def setParentJobId(value: String): Self = this.set("parentJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentJobId: Self = this.set("parentJobId", js.undefined)
    
    @scala.inline
    def setQuery(value: JobStatistics2): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQuotaDefermentsVarargs(value: String*): Self = this.set("quotaDeferments", js.Array(value :_*))
    
    @scala.inline
    def setQuotaDeferments(value: js.Array[String]): Self = this.set("quotaDeferments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaDeferments: Self = this.set("quotaDeferments", js.undefined)
    
    @scala.inline
    def setReservationUsageVarargs(value: Name*): Self = this.set("reservationUsage", js.Array(value :_*))
    
    @scala.inline
    def setReservationUsage(value: js.Array[Name]): Self = this.set("reservationUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservationUsage: Self = this.set("reservationUsage", js.undefined)
    
    @scala.inline
    def setReservation_id(value: String): Self = this.set("reservation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservation_id: Self = this.set("reservation_id", js.undefined)
    
    @scala.inline
    def setRowLevelSecurityStatistics(value: RowLevelSecurityStatistics): Self = this.set("rowLevelSecurityStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLevelSecurityStatistics: Self = this.set("rowLevelSecurityStatistics", js.undefined)
    
    @scala.inline
    def setScriptStatistics(value: ScriptStatistics): Self = this.set("scriptStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptStatistics: Self = this.set("scriptStatistics", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = this.set("totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesProcessed: Self = this.set("totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = this.set("totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSlotMs: Self = this.set("totalSlotMs", js.undefined)
    
    @scala.inline
    def setTransactionInfoTemplate(value: TransactionInfo): Self = this.set("transactionInfoTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionInfoTemplate: Self = this.set("transactionInfoTemplate", js.undefined)
  }
}
