package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaAutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoscalingEvent]
  }
  
  @scala.inline
  implicit class SchemaAutoscalingEventOps[Self <: SchemaAutoscalingEvent] (val x: Self) extends AnyVal {
    
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
    def setCurrentNumWorkers(value: String): Self = this.set("currentNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentNumWorkers: Self = this.set("currentNumWorkers", js.undefined)
    
    @scala.inline
    def setDescription(value: SchemaStructuredMessage): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setTargetNumWorkers(value: String): Self = this.set("targetNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNumWorkers: Self = this.set("targetNumWorkers", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setWorkerPool(value: String): Self = this.set("workerPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerPool: Self = this.set("workerPool", js.undefined)
  }
}
