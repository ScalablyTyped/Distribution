package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemStatus extends js.Object {
  
  /** True if the WorkItem was completed (successfully or unsuccessfully). */
  var completed: js.UndefOr[Boolean] = js.native
  
  /** Worker output counters for this WorkItem. */
  var counterUpdates: js.UndefOr[js.Array[CounterUpdate]] = js.native
  
  /** See documentation of stop_position. */
  var dynamicSourceSplit: js.UndefOr[DynamicSourceSplit] = js.native
  
  /** Specifies errors which occurred during processing. If errors are provided, and completed = true, then the WorkItem is considered to have failed. */
  var errors: js.UndefOr[js.Array[Status]] = js.native
  
  /** DEPRECATED in favor of counter_updates. */
  var metricUpdates: js.UndefOr[js.Array[MetricUpdate]] = js.native
  
  /** DEPRECATED in favor of reported_progress. */
  var progress: js.UndefOr[ApproximateProgress] = js.native
  
  /**
    * The report index. When a WorkItem is leased, the lease will contain an initial report index. When a WorkItem's status is reported to the system, the report should be sent with that
    * report index, and the response will contain the index the worker should use for the next report. Reports received with unexpected index values will be rejected by the service. In
    * order to preserve idempotency, the worker should not alter the contents of a report, even if the worker must submit the same report multiple times before getting back a response.
    * The worker should not submit a subsequent report until the response for the previous report had been received from the service.
    */
  var reportIndex: js.UndefOr[String] = js.native
  
  /** The worker's progress through this WorkItem. */
  var reportedProgress: js.UndefOr[ApproximateReportedProgress] = js.native
  
  /** Amount of time the worker requests for its lease. */
  var requestedLeaseDuration: js.UndefOr[String] = js.native
  
  /** DEPRECATED in favor of dynamic_source_split. */
  var sourceFork: js.UndefOr[SourceFork] = js.native
  
  /** If the work item represented a SourceOperationRequest, and the work is completed, contains the result of the operation. */
  var sourceOperationResponse: js.UndefOr[SourceOperationResponse] = js.native
  
  /**
    * A worker may split an active map task in two parts, "primary" and "residual", continuing to process the primary part and returning the residual part into the pool of available work.
    * This event is called a "dynamic split" and is critical to the dynamic work rebalancing feature. The two obtained sub-tasks are called "parts" of the split. The parts, if
    * concatenated, must represent the same input as would be read by the current task if the split did not happen. The exact way in which the original task is decomposed into the two
    * parts is specified either as a position demarcating them (stop_position), or explicitly as two DerivedSources, if this task consumes a user-defined source type
    * (dynamic_source_split). The "current" task is adjusted as a result of the split: after a task with range [A, B) sends a stop_position update at C, its range is considered to be [A,
    * C), e.g.: * Progress should be interpreted relative to the new range, e.g. "75% completed" means "75% of [A, C) completed" * The worker should interpret proposed_stop_position
    * relative to the new range, e.g. "split at 68%" should be interpreted as "split at 68% of [A, C)". * If the worker chooses to split again using stop_position, only stop_positions in
    * [A, C) will be accepted. * Etc. dynamic_source_split has similar semantics: e.g., if a task with source S splits using dynamic_source_split into {P, R} (where P and R must be
    * together equivalent to S), then subsequent progress and proposed_stop_position should be interpreted relative to P, and in a potential subsequent dynamic_source_split into {P', R'},
    * P' and R' must be together equivalent to P, etc.
    */
  var stopPosition: js.UndefOr[Position] = js.native
  
  /** Total time the worker spent being throttled by external systems. */
  var totalThrottlerWaitTimeSeconds: js.UndefOr[Double] = js.native
  
  /** Identifies the WorkItem. */
  var workItemId: js.UndefOr[String] = js.native
}
object WorkItemStatus {
  
  @scala.inline
  def apply(): WorkItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemStatus]
  }
  
  @scala.inline
  implicit class WorkItemStatusOps[Self <: WorkItemStatus] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    
    @scala.inline
    def setCounterUpdatesVarargs(value: CounterUpdate*): Self = this.set("counterUpdates", js.Array(value :_*))
    
    @scala.inline
    def setCounterUpdates(value: js.Array[CounterUpdate]): Self = this.set("counterUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterUpdates: Self = this.set("counterUpdates", js.undefined)
    
    @scala.inline
    def setDynamicSourceSplit(value: DynamicSourceSplit): Self = this.set("dynamicSourceSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicSourceSplit: Self = this.set("dynamicSourceSplit", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Status*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Status]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setMetricUpdatesVarargs(value: MetricUpdate*): Self = this.set("metricUpdates", js.Array(value :_*))
    
    @scala.inline
    def setMetricUpdates(value: js.Array[MetricUpdate]): Self = this.set("metricUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricUpdates: Self = this.set("metricUpdates", js.undefined)
    
    @scala.inline
    def setProgress(value: ApproximateProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setReportIndex(value: String): Self = this.set("reportIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportIndex: Self = this.set("reportIndex", js.undefined)
    
    @scala.inline
    def setReportedProgress(value: ApproximateReportedProgress): Self = this.set("reportedProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportedProgress: Self = this.set("reportedProgress", js.undefined)
    
    @scala.inline
    def setRequestedLeaseDuration(value: String): Self = this.set("requestedLeaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedLeaseDuration: Self = this.set("requestedLeaseDuration", js.undefined)
    
    @scala.inline
    def setSourceFork(value: SourceFork): Self = this.set("sourceFork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFork: Self = this.set("sourceFork", js.undefined)
    
    @scala.inline
    def setSourceOperationResponse(value: SourceOperationResponse): Self = this.set("sourceOperationResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceOperationResponse: Self = this.set("sourceOperationResponse", js.undefined)
    
    @scala.inline
    def setStopPosition(value: Position): Self = this.set("stopPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPosition: Self = this.set("stopPosition", js.undefined)
    
    @scala.inline
    def setTotalThrottlerWaitTimeSeconds(value: Double): Self = this.set("totalThrottlerWaitTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalThrottlerWaitTimeSeconds: Self = this.set("totalThrottlerWaitTimeSeconds", js.undefined)
    
    @scala.inline
    def setWorkItemId(value: String): Self = this.set("workItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkItemId: Self = this.set("workItemId", js.undefined)
  }
}
