package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A unit of scheduled work.
  */
trait SchemaTask extends StObject {
  
  /**
    * App Engine HTTP request that is sent to the task&#39;s target. Can be set
    * only if app_engine_http_target is set on the queue.  An App Engine task
    * is a task that has AppEngineHttpRequest set.
    */
  var appEngineHttpRequest: js.UndefOr[SchemaAppEngineHttpRequest] = js.undefined
  
  /**
    * Output only. The time that the task was created.  `create_time` will be
    * truncated to the nearest second.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
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
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * LeaseTasks to process the task. Can be set only if pull_target is set on
    * the queue.  A pull task is a task that has PullMessage set.
    */
  var pullMessage: js.UndefOr[SchemaPullMessage] = js.undefined
  
  /**
    * The time when the task is scheduled to be attempted.  For App Engine
    * queues, this is when the task will be attempted or retried.  For pull
    * queues, this is the time when the task is available to be leased; if a
    * task is currently leased, this is the time when the current lease
    * expires, that is, the time that the task was leased plus the
    * lease_duration.  `schedule_time` will be truncated to the nearest
    * microsecond.
    */
  var scheduleTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The task status.
    */
  var status: js.UndefOr[SchemaTaskStatus] = js.undefined
  
  /**
    * Output only. The view specifies which subset of the Task has been
    * returned.
    */
  var view: js.UndefOr[String] = js.undefined
}
object SchemaTask {
  
  @scala.inline
  def apply(): SchemaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTask]
  }
  
  @scala.inline
  implicit class SchemaTaskMutableBuilder[Self <: SchemaTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineHttpRequest(value: SchemaAppEngineHttpRequest): Self = StObject.set(x, "appEngineHttpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineHttpRequestUndefined: Self = StObject.set(x, "appEngineHttpRequest", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPullMessage(value: SchemaPullMessage): Self = StObject.set(x, "pullMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullMessageUndefined: Self = StObject.set(x, "pullMessage", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: String): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
