package typings.googleapis.v2beta3Mod.cloudtasksV2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A unit of scheduled work.
  */
@js.native
trait SchemaTask extends js.Object {
  
  /**
    * HTTP request that is sent to the App Engine app handler.  An App Engine
    * task is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[SchemaAppEngineHttpRequest] = js.native
  
  /**
    * Output only. The time that the task was created.  `create_time` will be
    * truncated to the nearest second.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The number of attempts dispatched.  This count includes
    * attempts which have been dispatched but haven&#39;t received a response.
    */
  var dispatchCount: js.UndefOr[Double] = js.native
  
  /**
    * The deadline for requests sent to the worker. If the worker does not
    * respond by this deadline then the request is cancelled and the attempt is
    * marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task
    * according to the RetryConfig.  Note that when the request is cancelled,
    * Cloud Tasks will stop listing for the response, but whether the worker
    * stops processing depends on the worker. For example, if the worker is
    * stuck, it may not react to cancelled requests.  The default and maximum
    * values depend on the type of request:   * For App Engine tasks, 0
    * indicates that the   request has the default deadline. The default
    * deadline depends on the   [scaling
    * type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling)
    * of the service: 10 minutes for standard apps with automatic scaling, 24
    * hours for standard apps with manual and basic scaling, and 60 minutes for
    * flex apps. If the request deadline is set, it must be in the interval [15
    * seconds, 24 hours 15 seconds]. Regardless of the task&#39;s
    * `dispatch_deadline`, the app handler will not run for longer than than
    * the service&#39;s timeout. We recommend setting the `dispatch_deadline`
    * to   at most a few seconds more than the app handler&#39;s timeout. For
    * more   information see
    * [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts).
    * `dispatch_deadline` will be truncated to the nearest millisecond. The
    * deadline is an approximate deadline.
    */
  var dispatchDeadline: js.UndefOr[String] = js.native
  
  /**
    * Output only. The status of the task&#39;s first attempt.  Only
    * dispatch_time will be set. The other Attempt information is not retained
    * by Cloud Tasks.
    */
  var firstAttempt: js.UndefOr[SchemaAttempt] = js.native
  
  /**
    * Output only. The status of the task&#39;s last attempt.
    */
  var lastAttempt: js.UndefOr[SchemaAttempt] = js.native
  
  /**
    * Optionally caller-specified in CreateTask.  The task name.  The task name
    * must have the following format:
    * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    * * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens
    * (-), colons (:), or periods (.).    For more information, see
    * [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the task&#39;s location.    The
    * list of available locations can be obtained by calling    ListLocations.
    * For more information, see https://cloud.google.com/about/locations/. *
    * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or   hyphens
    * (-). The maximum length is 100 characters. * `TASK_ID` can contain only
    * letters ([A-Za-z]), numbers ([0-9]),   hyphens (-), or underscores (_).
    * The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The number of attempts which have received a response.
    */
  var responseCount: js.UndefOr[Double] = js.native
  
  /**
    * The time when the task is scheduled to be attempted.  For App Engine
    * queues, this is when the task will be attempted or retried.
    * `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The view specifies which subset of the Task has been
    * returned.
    */
  var view: js.UndefOr[String] = js.native
}
object SchemaTask {
  
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  @scala.inline
  implicit class SchemaTaskOps[Self <: SchemaTask] (val x: Self) extends AnyVal {
    
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
    def setAppEngineHttpRequest(value: SchemaAppEngineHttpRequest): Self = this.set("appEngineHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngineHttpRequest: Self = this.set("appEngineHttpRequest", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDispatchCount(value: Double): Self = this.set("dispatchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatchCount: Self = this.set("dispatchCount", js.undefined)
    
    @scala.inline
    def setDispatchDeadline(value: String): Self = this.set("dispatchDeadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatchDeadline: Self = this.set("dispatchDeadline", js.undefined)
    
    @scala.inline
    def setFirstAttempt(value: SchemaAttempt): Self = this.set("firstAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstAttempt: Self = this.set("firstAttempt", js.undefined)
    
    @scala.inline
    def setLastAttempt(value: SchemaAttempt): Self = this.set("lastAttempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAttempt: Self = this.set("lastAttempt", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResponseCount(value: Double): Self = this.set("responseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCount: Self = this.set("responseCount", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: String): Self = this.set("scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleTime: Self = this.set("scheduleTime", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
