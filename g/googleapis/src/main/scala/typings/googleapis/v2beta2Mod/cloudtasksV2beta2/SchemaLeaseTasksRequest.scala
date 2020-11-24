package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for leasing tasks using LeaseTasks.
  */
@js.native
trait SchemaLeaseTasksRequest extends js.Object {
  
  /**
    * `filter` can be used to specify a subset of tasks to lease.  When
    * `filter` is set to `tag=&lt;my-tag&gt;` then the response will contain
    * only tasks whose tag is equal to `&lt;my-tag&gt;`. `&lt;my-tag&gt;` must
    * be less than 500 characters.  When `filter` is set to
    * `tag_function=oldest_tag()`, only tasks which have the same tag as the
    * task with the oldest schedule_time will be returned.  Grammar Syntax:  *
    * `filter = &quot;tag=&quot; tag | &quot;tag_function=&quot; function`  *
    * `tag = string`  * `function = &quot;oldest_tag()&quot;`  The
    * `oldest_tag()` function returns tasks which have the same tag as the
    * oldest task (ordered by schedule time).  SDK compatibility: Although the
    * SDK allows tags to be either string or
    * [bytes](https://cloud.google.com/appengine/docs/standard/java/javadoc/com/google/appengine/api/taskqueue/TaskOptions.html#tag-byte:A-),
    * only UTF-8 encoded tags can be used in Cloud Tasks. Tag which aren&#39;t
    * UTF-8 encoded can&#39;t be used in the filter and the task&#39;s tag will
    * be displayed as empty in Cloud Tasks.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    *  After the worker has successfully finished the work associated with the
    * task, the worker must call via AcknowledgeTask before the schedule_time.
    * Otherwise the task will be returned to a later LeaseTasks call so that
    * another worker can retry it.  The maximum lease duration is 1 week.
    * `lease_duration` will be truncated to the nearest second.
    */
  var leaseDuration: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of tasks to lease.  The system will make a best effort
    * to return as close to as `max_tasks` as possible.  The largest that
    * `max_tasks` can be is 1000.  The maximum total size of a lease tasks
    * response is 32 MB. If the sum of all task sizes requested reaches this
    * limit, fewer tasks than requested are returned.
    */
  var maxTasks: js.UndefOr[Double] = js.native
  
  /**
    * The response_view specifies which subset of the Task will be returned. By
    * default response_view is BASIC; not all information is retrieved by
    * default because some data, such as payloads, might be desirable to return
    * only when needed because of its large size or because of the sensitivity
    * of data that it contains.  Authorization for FULL requires
    * `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/)
    * permission on the Task resource.
    */
  var responseView: js.UndefOr[String] = js.native
}
object SchemaLeaseTasksRequest {
  
  @scala.inline
  def apply(): SchemaLeaseTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseTasksRequest]
  }
  
  @scala.inline
  implicit class SchemaLeaseTasksRequestOps[Self <: SchemaLeaseTasksRequest] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLeaseDuration(value: String): Self = this.set("leaseDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseDuration: Self = this.set("leaseDuration", js.undefined)
    
    @scala.inline
    def setMaxTasks(value: Double): Self = this.set("maxTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTasks: Self = this.set("maxTasks", js.undefined)
    
    @scala.inline
    def setResponseView(value: String): Self = this.set("responseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseView: Self = this.set("responseView", js.undefined)
  }
}
