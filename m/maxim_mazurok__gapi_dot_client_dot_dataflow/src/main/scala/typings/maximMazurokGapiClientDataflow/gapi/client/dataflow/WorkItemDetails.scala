package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemDetails extends js.Object {
  
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
  implicit class WorkItemDetailsOps[Self <: WorkItemDetails] (val x: Self) extends AnyVal {
    
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
    def setAttemptId(value: String): Self = this.set("attemptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptId: Self = this.set("attemptId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricUpdate*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[MetricUpdate]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setProgress(value: ProgressTimeseries): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
}
