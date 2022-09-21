package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemStatus extends StObject {
  
  /** True if the WorkItem was completed (successfully or unsuccessfully). */
  var completed: js.UndefOr[Boolean] = js.undefined
  
  /** Worker output counters for this WorkItem. */
  var counterUpdates: js.UndefOr[js.Array[CounterUpdate]] = js.undefined
  
  /** See documentation of stop_position. */
  var dynamicSourceSplit: js.UndefOr[DynamicSourceSplit] = js.undefined
  
  /** Specifies errors which occurred during processing. If errors are provided, and completed = true, then the WorkItem is considered to have failed. */
  var errors: js.UndefOr[js.Array[Status]] = js.undefined
  
  /** DEPRECATED in favor of counter_updates. */
  var metricUpdates: js.UndefOr[js.Array[MetricUpdate]] = js.undefined
  
  /** DEPRECATED in favor of reported_progress. */
  var progress: js.UndefOr[ApproximateProgress] = js.undefined
  
  /**
    * The report index. When a WorkItem is leased, the lease will contain an initial report index. When a WorkItem's status is reported to the system, the report should be sent with that
    * report index, and the response will contain the index the worker should use for the next report. Reports received with unexpected index values will be rejected by the service. In
    * order to preserve idempotency, the worker should not alter the contents of a report, even if the worker must submit the same report multiple times before getting back a response.
    * The worker should not submit a subsequent report until the response for the previous report had been received from the service.
    */
  var reportIndex: js.UndefOr[String] = js.undefined
  
  /** The worker's progress through this WorkItem. */
  var reportedProgress: js.UndefOr[ApproximateReportedProgress] = js.undefined
  
  /** Amount of time the worker requests for its lease. */
  var requestedLeaseDuration: js.UndefOr[String] = js.undefined
  
  /** DEPRECATED in favor of dynamic_source_split. */
  var sourceFork: js.UndefOr[SourceFork] = js.undefined
  
  /** If the work item represented a SourceOperationRequest, and the work is completed, contains the result of the operation. */
  var sourceOperationResponse: js.UndefOr[SourceOperationResponse] = js.undefined
  
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
  var stopPosition: js.UndefOr[Position] = js.undefined
  
  /** Total time the worker spent being throttled by external systems. */
  var totalThrottlerWaitTimeSeconds: js.UndefOr[Double] = js.undefined
  
  /** Identifies the WorkItem. */
  var workItemId: js.UndefOr[String] = js.undefined
}
object WorkItemStatus {
  
  inline def apply(): WorkItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkItemStatus]
  }
  
  extension [Self <: WorkItemStatus](x: Self) {
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setCounterUpdates(value: js.Array[CounterUpdate]): Self = StObject.set(x, "counterUpdates", value.asInstanceOf[js.Any])
    
    inline def setCounterUpdatesUndefined: Self = StObject.set(x, "counterUpdates", js.undefined)
    
    inline def setCounterUpdatesVarargs(value: CounterUpdate*): Self = StObject.set(x, "counterUpdates", js.Array(value*))
    
    inline def setDynamicSourceSplit(value: DynamicSourceSplit): Self = StObject.set(x, "dynamicSourceSplit", value.asInstanceOf[js.Any])
    
    inline def setDynamicSourceSplitUndefined: Self = StObject.set(x, "dynamicSourceSplit", js.undefined)
    
    inline def setErrors(value: js.Array[Status]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Status*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMetricUpdates(value: js.Array[MetricUpdate]): Self = StObject.set(x, "metricUpdates", value.asInstanceOf[js.Any])
    
    inline def setMetricUpdatesUndefined: Self = StObject.set(x, "metricUpdates", js.undefined)
    
    inline def setMetricUpdatesVarargs(value: MetricUpdate*): Self = StObject.set(x, "metricUpdates", js.Array(value*))
    
    inline def setProgress(value: ApproximateProgress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setReportIndex(value: String): Self = StObject.set(x, "reportIndex", value.asInstanceOf[js.Any])
    
    inline def setReportIndexUndefined: Self = StObject.set(x, "reportIndex", js.undefined)
    
    inline def setReportedProgress(value: ApproximateReportedProgress): Self = StObject.set(x, "reportedProgress", value.asInstanceOf[js.Any])
    
    inline def setReportedProgressUndefined: Self = StObject.set(x, "reportedProgress", js.undefined)
    
    inline def setRequestedLeaseDuration(value: String): Self = StObject.set(x, "requestedLeaseDuration", value.asInstanceOf[js.Any])
    
    inline def setRequestedLeaseDurationUndefined: Self = StObject.set(x, "requestedLeaseDuration", js.undefined)
    
    inline def setSourceFork(value: SourceFork): Self = StObject.set(x, "sourceFork", value.asInstanceOf[js.Any])
    
    inline def setSourceForkUndefined: Self = StObject.set(x, "sourceFork", js.undefined)
    
    inline def setSourceOperationResponse(value: SourceOperationResponse): Self = StObject.set(x, "sourceOperationResponse", value.asInstanceOf[js.Any])
    
    inline def setSourceOperationResponseUndefined: Self = StObject.set(x, "sourceOperationResponse", js.undefined)
    
    inline def setStopPosition(value: Position): Self = StObject.set(x, "stopPosition", value.asInstanceOf[js.Any])
    
    inline def setStopPositionUndefined: Self = StObject.set(x, "stopPosition", js.undefined)
    
    inline def setTotalThrottlerWaitTimeSeconds(value: Double): Self = StObject.set(x, "totalThrottlerWaitTimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setTotalThrottlerWaitTimeSecondsUndefined: Self = StObject.set(x, "totalThrottlerWaitTimeSeconds", js.undefined)
    
    inline def setWorkItemId(value: String): Self = StObject.set(x, "workItemId", value.asInstanceOf[js.Any])
    
    inline def setWorkItemIdUndefined: Self = StObject.set(x, "workItemId", js.undefined)
  }
}
