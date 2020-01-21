package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structured message reporting an autoscaling decision made by the Dataflow
  * service.
  */
@js.native
trait SchemaAutoscalingEvent extends js.Object {
  /**
    * The current number of workers the job has.
    */
  var currentNumWorkers: js.UndefOr[String] = js.native
  /**
    * A message describing why the system decided to adjust the current number
    * of workers, why it failed, or why the system decided to not make any
    * changes to the number of workers.
    */
  var description: js.UndefOr[SchemaStructuredMessage] = js.native
  /**
    * The type of autoscaling event to report.
    */
  var eventType: js.UndefOr[String] = js.native
  /**
    * The target number of workers the worker pool wants to resize to use.
    */
  var targetNumWorkers: js.UndefOr[String] = js.native
  /**
    * The time this event was emitted to indicate a new target or current
    * num_workers value.
    */
  var time: js.UndefOr[String] = js.native
  /**
    * A short and friendly name for the worker pool this event refers to,
    * populated from the value of PoolStageRelation::user_pool_name.
    */
  var workerPool: js.UndefOr[String] = js.native
}

object SchemaAutoscalingEvent {
  @scala.inline
  def apply(
    currentNumWorkers: String = null,
    description: SchemaStructuredMessage = null,
    eventType: String = null,
    targetNumWorkers: String = null,
    time: String = null,
    workerPool: String = null
  ): SchemaAutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    if (currentNumWorkers != null) __obj.updateDynamic("currentNumWorkers")(currentNumWorkers.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (targetNumWorkers != null) __obj.updateDynamic("targetNumWorkers")(targetNumWorkers.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (workerPool != null) __obj.updateDynamic("workerPool")(workerPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoscalingEvent]
  }
}

