package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaseTasksRequest extends StObject {
  
  /**
    * `filter` can be used to specify a subset of tasks to lease. When `filter` is set to `tag=` then the response will contain only tasks whose tag is equal to ``. `` must be less than 500 characters. When `filter` is set to `tag_function=oldest_tag()`, only tasks which have the same tag as the task with the oldest schedule_time will be returned. Grammar Syntax: * `filter = "tag=" tag | "tag_function=" function` * `tag = string` * `function = "oldest_tag()"` The `oldest_tag()` function returns tasks which have the same tag as the oldest task (ordered by schedule time). SDK compatibility: Although the SDK allows tags to be either string or [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-), only UTF-8 encoded tags can be used in Cloud Tasks. Tag which aren't UTF-8 encoded can't be used in the filter and the task's tag will be displayed as empty in Cloud Tasks.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The duration of the lease. Each task returned in the response will have its schedule_time set to the current time plus the `lease_duration`. The task is leased until its schedule_time; thus, the task will not be returned to another LeaseTasks call before its schedule_time. After the worker has successfully finished the work associated with the task, the worker must call via AcknowledgeTask before the schedule_time. Otherwise the task will be returned to a later LeaseTasks call so that another worker can retry it. The maximum lease duration is 1 week. `lease_duration` will be truncated to the nearest second.
    */
  var leaseDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of tasks to lease. The system will make a best effort to return as close to as `max_tasks` as possible. The largest that `max_tasks` can be is 1000. The maximum total size of a lease tasks response is 32 MB. If the sum of all task sizes requested reaches this limit, fewer tasks than requested are returned.
    */
  var maxTasks: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
    */
  var responseView: js.UndefOr[String | Null] = js.undefined
}
object SchemaLeaseTasksRequest {
  
  inline def apply(): SchemaLeaseTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseTasksRequest]
  }
  
  extension [Self <: SchemaLeaseTasksRequest](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLeaseDuration(value: String): Self = StObject.set(x, "leaseDuration", value.asInstanceOf[js.Any])
    
    inline def setLeaseDurationNull: Self = StObject.set(x, "leaseDuration", null)
    
    inline def setLeaseDurationUndefined: Self = StObject.set(x, "leaseDuration", js.undefined)
    
    inline def setMaxTasks(value: Double): Self = StObject.set(x, "maxTasks", value.asInstanceOf[js.Any])
    
    inline def setMaxTasksNull: Self = StObject.set(x, "maxTasks", null)
    
    inline def setMaxTasksUndefined: Self = StObject.set(x, "maxTasks", js.undefined)
    
    inline def setResponseView(value: String): Self = StObject.set(x, "responseView", value.asInstanceOf[js.Any])
    
    inline def setResponseViewNull: Self = StObject.set(x, "responseView", null)
    
    inline def setResponseViewUndefined: Self = StObject.set(x, "responseView", js.undefined)
  }
}
