package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemDetails extends StObject {
  
  /** Attempt ID of this work item */
  var attemptId: js.UndefOr[String] = js.native
  
  /** End time of this work item attempt. If the work item is completed, this is the actual end time of the work item. Otherwise, it is the predicted end time. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Metrics for this work item. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.native
  
  /** Progress of this work item. */
  var progress: js.UndefOr[ProgressTimeseries] = js.native
  
  /** Start time of this work item attempt. */
  var startTime: js.UndefOr[String] = js.native
  
  /** State of this work item. */
  var state: js.UndefOr[String] = js.native
  
  /** Name of this work item. */
  var taskId: js.UndefOr[String] = js.native
}
object WorkItemDetails {
  
  @scala.inline
  def apply(): WorkItemDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemDetails]
  }
  
  @scala.inline
  implicit class WorkItemDetailsMutableBuilder[Self <: WorkItemDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptId(value: String): Self = StObject.set(x, "attemptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptIdUndefined: Self = StObject.set(x, "attemptId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[MetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setProgress(value: ProgressTimeseries): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
