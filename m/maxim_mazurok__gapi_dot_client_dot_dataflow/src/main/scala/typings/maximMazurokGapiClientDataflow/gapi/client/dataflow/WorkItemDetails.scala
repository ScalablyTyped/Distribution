package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemDetails extends StObject {
  
  /** Attempt ID of this work item */
  var attemptId: js.UndefOr[String] = js.undefined
  
  /** End time of this work item attempt. If the work item is completed, this is the actual end time of the work item. Otherwise, it is the predicted end time. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Metrics for this work item. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.undefined
  
  /** Progress of this work item. */
  var progress: js.UndefOr[ProgressTimeseries] = js.undefined
  
  /** Start time of this work item attempt. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** State of this work item. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Information about straggler detections for this work item. */
  var stragglerInfo: js.UndefOr[StragglerInfo] = js.undefined
  
  /** Name of this work item. */
  var taskId: js.UndefOr[String] = js.undefined
}
object WorkItemDetails {
  
  inline def apply(): WorkItemDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkItemDetails] (val x: Self) extends AnyVal {
    
    inline def setAttemptId(value: String): Self = StObject.set(x, "attemptId", value.asInstanceOf[js.Any])
    
    inline def setAttemptIdUndefined: Self = StObject.set(x, "attemptId", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMetrics(value: js.Array[MetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setProgress(value: ProgressTimeseries): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStragglerInfo(value: StragglerInfo): Self = StObject.set(x, "stragglerInfo", value.asInstanceOf[js.Any])
    
    inline def setStragglerInfoUndefined: Self = StObject.set(x, "stragglerInfo", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
