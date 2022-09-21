package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemServiceState extends StObject {
  
  /**
    * If set, a request to complete the work item with the given status. This will not be set to OK, unless supported by the specific kind of WorkItem. It can be used for the backend to
    * indicate a WorkItem must terminate, e.g., for aborting work.
    */
  var completeWorkStatus: js.UndefOr[Status] = js.undefined
  
  /** Other data returned by the service, specific to the particular worker harness. */
  var harnessData: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkItemServiceState & TopLevel[Any]
  ] = js.undefined
  
  /**
    * A hot key is a symptom of poor data distribution in which there are enough elements mapped to a single key to impact pipeline performance. When present, this field includes metadata
    * associated with any hot key.
    */
  var hotKeyDetection: js.UndefOr[HotKeyDetection] = js.undefined
  
  /** Time at which the current lease will expire. */
  var leaseExpireTime: js.UndefOr[String] = js.undefined
  
  /**
    * The short ids that workers should use in subsequent metric updates. Workers should strive to use short ids whenever possible, but it is ok to request the short_id again if a worker
    * lost track of it (e.g. if the worker is recovering from a crash). NOTE: it is possible that the response may have short ids for a subset of the metrics.
    */
  var metricShortId: js.UndefOr[js.Array[MetricShortId]] = js.undefined
  
  /** The index value to use for the next report sent by the worker. Note: If the report call fails for whatever reason, the worker should reuse this index for subsequent report attempts. */
  var nextReportIndex: js.UndefOr[String] = js.undefined
  
  /** New recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[String] = js.undefined
  
  /** The progress point in the WorkItem where the Dataflow service suggests that the worker truncate the task. */
  var splitRequest: js.UndefOr[ApproximateSplitRequest] = js.undefined
  
  /** DEPRECATED in favor of split_request. */
  var suggestedStopPoint: js.UndefOr[ApproximateProgress] = js.undefined
  
  /** Obsolete, always empty. */
  var suggestedStopPosition: js.UndefOr[Position] = js.undefined
}
object WorkItemServiceState {
  
  inline def apply(): WorkItemServiceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemServiceState]
  }
  
  extension [Self <: WorkItemServiceState](x: Self) {
    
    inline def setCompleteWorkStatus(value: Status): Self = StObject.set(x, "completeWorkStatus", value.asInstanceOf[js.Any])
    
    inline def setCompleteWorkStatusUndefined: Self = StObject.set(x, "completeWorkStatus", js.undefined)
    
    inline def setHarnessData(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkItemServiceState & TopLevel[Any]
    ): Self = StObject.set(x, "harnessData", value.asInstanceOf[js.Any])
    
    inline def setHarnessDataUndefined: Self = StObject.set(x, "harnessData", js.undefined)
    
    inline def setHotKeyDetection(value: HotKeyDetection): Self = StObject.set(x, "hotKeyDetection", value.asInstanceOf[js.Any])
    
    inline def setHotKeyDetectionUndefined: Self = StObject.set(x, "hotKeyDetection", js.undefined)
    
    inline def setLeaseExpireTime(value: String): Self = StObject.set(x, "leaseExpireTime", value.asInstanceOf[js.Any])
    
    inline def setLeaseExpireTimeUndefined: Self = StObject.set(x, "leaseExpireTime", js.undefined)
    
    inline def setMetricShortId(value: js.Array[MetricShortId]): Self = StObject.set(x, "metricShortId", value.asInstanceOf[js.Any])
    
    inline def setMetricShortIdUndefined: Self = StObject.set(x, "metricShortId", js.undefined)
    
    inline def setMetricShortIdVarargs(value: MetricShortId*): Self = StObject.set(x, "metricShortId", js.Array(value*))
    
    inline def setNextReportIndex(value: String): Self = StObject.set(x, "nextReportIndex", value.asInstanceOf[js.Any])
    
    inline def setNextReportIndexUndefined: Self = StObject.set(x, "nextReportIndex", js.undefined)
    
    inline def setReportStatusInterval(value: String): Self = StObject.set(x, "reportStatusInterval", value.asInstanceOf[js.Any])
    
    inline def setReportStatusIntervalUndefined: Self = StObject.set(x, "reportStatusInterval", js.undefined)
    
    inline def setSplitRequest(value: ApproximateSplitRequest): Self = StObject.set(x, "splitRequest", value.asInstanceOf[js.Any])
    
    inline def setSplitRequestUndefined: Self = StObject.set(x, "splitRequest", js.undefined)
    
    inline def setSuggestedStopPoint(value: ApproximateProgress): Self = StObject.set(x, "suggestedStopPoint", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStopPointUndefined: Self = StObject.set(x, "suggestedStopPoint", js.undefined)
    
    inline def setSuggestedStopPosition(value: Position): Self = StObject.set(x, "suggestedStopPosition", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStopPositionUndefined: Self = StObject.set(x, "suggestedStopPosition", js.undefined)
  }
}
