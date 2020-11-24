package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemServiceState extends js.Object {
  
  /**
    * If set, a request to complete the work item with the given status. This will not be set to OK, unless supported by the specific kind of WorkItem. It can be used for the backend to
    * indicate a WorkItem must terminate, e.g., for aborting work.
    */
  var completeWorkStatus: js.UndefOr[Status] = js.native
  
  /** Other data returned by the service, specific to the particular worker harness. */
  var harnessData: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkItemServiceState with TopLevel[js.Any]
  ] = js.native
  
  /**
    * A hot key is a symptom of poor data distribution in which there are enough elements mapped to a single key to impact pipeline performance. When present, this field includes metadata
    * associated with any hot key.
    */
  var hotKeyDetection: js.UndefOr[HotKeyDetection] = js.native
  
  /** Time at which the current lease will expire. */
  var leaseExpireTime: js.UndefOr[String] = js.native
  
  /**
    * The short ids that workers should use in subsequent metric updates. Workers should strive to use short ids whenever possible, but it is ok to request the short_id again if a worker
    * lost track of it (e.g. if the worker is recovering from a crash). NOTE: it is possible that the response may have short ids for a subset of the metrics.
    */
  var metricShortId: js.UndefOr[js.Array[MetricShortId]] = js.native
  
  /** The index value to use for the next report sent by the worker. Note: If the report call fails for whatever reason, the worker should reuse this index for subsequent report attempts. */
  var nextReportIndex: js.UndefOr[String] = js.native
  
  /** New recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[String] = js.native
  
  /** The progress point in the WorkItem where the Dataflow service suggests that the worker truncate the task. */
  var splitRequest: js.UndefOr[ApproximateSplitRequest] = js.native
  
  /** DEPRECATED in favor of split_request. */
  var suggestedStopPoint: js.UndefOr[ApproximateProgress] = js.native
  
  /** Obsolete, always empty. */
  var suggestedStopPosition: js.UndefOr[Position] = js.native
}
object WorkItemServiceState {
  
  @scala.inline
  def apply(): WorkItemServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemServiceState]
  }
  
  @scala.inline
  implicit class WorkItemServiceStateOps[Self <: WorkItemServiceState] (val x: Self) extends AnyVal {
    
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
    def setCompleteWorkStatus(value: Status): Self = this.set("completeWorkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteWorkStatus: Self = this.set("completeWorkStatus", js.undefined)
    
    @scala.inline
    def setHarnessData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkItemServiceState with TopLevel[js.Any]
    ): Self = this.set("harnessData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHarnessData: Self = this.set("harnessData", js.undefined)
    
    @scala.inline
    def setHotKeyDetection(value: HotKeyDetection): Self = this.set("hotKeyDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotKeyDetection: Self = this.set("hotKeyDetection", js.undefined)
    
    @scala.inline
    def setLeaseExpireTime(value: String): Self = this.set("leaseExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseExpireTime: Self = this.set("leaseExpireTime", js.undefined)
    
    @scala.inline
    def setMetricShortIdVarargs(value: MetricShortId*): Self = this.set("metricShortId", js.Array(value :_*))
    
    @scala.inline
    def setMetricShortId(value: js.Array[MetricShortId]): Self = this.set("metricShortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricShortId: Self = this.set("metricShortId", js.undefined)
    
    @scala.inline
    def setNextReportIndex(value: String): Self = this.set("nextReportIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextReportIndex: Self = this.set("nextReportIndex", js.undefined)
    
    @scala.inline
    def setReportStatusInterval(value: String): Self = this.set("reportStatusInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportStatusInterval: Self = this.set("reportStatusInterval", js.undefined)
    
    @scala.inline
    def setSplitRequest(value: ApproximateSplitRequest): Self = this.set("splitRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitRequest: Self = this.set("splitRequest", js.undefined)
    
    @scala.inline
    def setSuggestedStopPoint(value: ApproximateProgress): Self = this.set("suggestedStopPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedStopPoint: Self = this.set("suggestedStopPoint", js.undefined)
    
    @scala.inline
    def setSuggestedStopPosition(value: Position): Self = this.set("suggestedStopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedStopPosition: Self = this.set("suggestedStopPosition", js.undefined)
  }
}
