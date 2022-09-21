package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTask extends StObject {
  
  /**
    * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[SchemaAppEngineHttpRequest] = js.undefined
  
  /**
    * Output only. The time that the task was created. `create_time` will be truncated to the nearest second.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of attempts dispatched. This count includes attempts which have been dispatched but haven't received a response.
    */
  var dispatchCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task's `dispatch_deadline`, the app handler will not run for longer than than the service's timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler's timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
    */
  var dispatchDeadline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The status of the task's first attempt. Only dispatch_time will be set. The other Attempt information is not retained by Cloud Tasks.
    */
  var firstAttempt: js.UndefOr[SchemaAttempt] = js.undefined
  
  /**
    * HTTP request that is sent to the worker. An HTTP task is a task that has HttpRequest set.
    */
  var httpRequest: js.UndefOr[SchemaHttpRequest] = js.undefined
  
  /**
    * Output only. The status of the task's last attempt.
    */
  var lastAttempt: js.UndefOr[SchemaAttempt] = js.undefined
  
  /**
    * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The number of attempts which have received a response.
    */
  var responseCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time when the task is scheduled to be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
    */
  var scheduleTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The view specifies which subset of the Task has been returned.
    */
  var view: js.UndefOr[String | Null] = js.undefined
}
object SchemaTask {
  
  inline def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  extension [Self <: SchemaTask](x: Self) {
    
    inline def setAppEngineHttpRequest(value: SchemaAppEngineHttpRequest): Self = StObject.set(x, "appEngineHttpRequest", value.asInstanceOf[js.Any])
    
    inline def setAppEngineHttpRequestUndefined: Self = StObject.set(x, "appEngineHttpRequest", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDispatchCount(value: Double): Self = StObject.set(x, "dispatchCount", value.asInstanceOf[js.Any])
    
    inline def setDispatchCountNull: Self = StObject.set(x, "dispatchCount", null)
    
    inline def setDispatchCountUndefined: Self = StObject.set(x, "dispatchCount", js.undefined)
    
    inline def setDispatchDeadline(value: String): Self = StObject.set(x, "dispatchDeadline", value.asInstanceOf[js.Any])
    
    inline def setDispatchDeadlineNull: Self = StObject.set(x, "dispatchDeadline", null)
    
    inline def setDispatchDeadlineUndefined: Self = StObject.set(x, "dispatchDeadline", js.undefined)
    
    inline def setFirstAttempt(value: SchemaAttempt): Self = StObject.set(x, "firstAttempt", value.asInstanceOf[js.Any])
    
    inline def setFirstAttemptUndefined: Self = StObject.set(x, "firstAttempt", js.undefined)
    
    inline def setHttpRequest(value: SchemaHttpRequest): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    inline def setLastAttempt(value: SchemaAttempt): Self = StObject.set(x, "lastAttempt", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptUndefined: Self = StObject.set(x, "lastAttempt", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResponseCount(value: Double): Self = StObject.set(x, "responseCount", value.asInstanceOf[js.Any])
    
    inline def setResponseCountNull: Self = StObject.set(x, "responseCount", null)
    
    inline def setResponseCountUndefined: Self = StObject.set(x, "responseCount", js.undefined)
    
    inline def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeNull: Self = StObject.set(x, "scheduleTime", null)
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
