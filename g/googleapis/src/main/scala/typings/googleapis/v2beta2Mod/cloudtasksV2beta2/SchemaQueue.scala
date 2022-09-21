package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueue extends StObject {
  
  /**
    * App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
    */
  var appEngineHttpTarget: js.UndefOr[SchemaAppEngineHttpTarget] = js.undefined
  
  /**
    * An http_target is used to override the target values for HTTP tasks.
    */
  var httpTarget: js.UndefOr[SchemaHttpTarget] = js.undefined
  
  /**
    * Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pull target. A pull queue is a queue that has a PullTarget.
    */
  var pullTarget: js.UndefOr[SchemaPullTarget] = js.undefined
  
  /**
    * Output only. The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
    */
  var purgeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts however they control how tasks are attempted in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc).
    */
  var rateLimits: js.UndefOr[SchemaRateLimits] = js.undefined
  
  /**
    * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
    */
  var retryConfig: js.UndefOr[SchemaRetryConfig] = js.undefined
  
  /**
    * Output only. The state of the queue. `state` can only be changed by called PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The realtime, informational statistics for a queue. In order to receive the statistics the caller should include this field in the FieldMask.
    */
  var stats: js.UndefOr[SchemaQueueStats] = js.undefined
  
  /**
    * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
    */
  var taskTtl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The task tombstone time to live (TTL). After a task is deleted or completed, the task's tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can't be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
    */
  var tombstoneTtl: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueue {
  
  inline def apply(): SchemaQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueue]
  }
  
  extension [Self <: SchemaQueue](x: Self) {
    
    inline def setAppEngineHttpTarget(value: SchemaAppEngineHttpTarget): Self = StObject.set(x, "appEngineHttpTarget", value.asInstanceOf[js.Any])
    
    inline def setAppEngineHttpTargetUndefined: Self = StObject.set(x, "appEngineHttpTarget", js.undefined)
    
    inline def setHttpTarget(value: SchemaHttpTarget): Self = StObject.set(x, "httpTarget", value.asInstanceOf[js.Any])
    
    inline def setHttpTargetUndefined: Self = StObject.set(x, "httpTarget", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPullTarget(value: SchemaPullTarget): Self = StObject.set(x, "pullTarget", value.asInstanceOf[js.Any])
    
    inline def setPullTargetUndefined: Self = StObject.set(x, "pullTarget", js.undefined)
    
    inline def setPurgeTime(value: String): Self = StObject.set(x, "purgeTime", value.asInstanceOf[js.Any])
    
    inline def setPurgeTimeNull: Self = StObject.set(x, "purgeTime", null)
    
    inline def setPurgeTimeUndefined: Self = StObject.set(x, "purgeTime", js.undefined)
    
    inline def setRateLimits(value: SchemaRateLimits): Self = StObject.set(x, "rateLimits", value.asInstanceOf[js.Any])
    
    inline def setRateLimitsUndefined: Self = StObject.set(x, "rateLimits", js.undefined)
    
    inline def setRetryConfig(value: SchemaRetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
    
    inline def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStats(value: SchemaQueueStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setTaskTtl(value: String): Self = StObject.set(x, "taskTtl", value.asInstanceOf[js.Any])
    
    inline def setTaskTtlNull: Self = StObject.set(x, "taskTtl", null)
    
    inline def setTaskTtlUndefined: Self = StObject.set(x, "taskTtl", js.undefined)
    
    inline def setTombstoneTtl(value: String): Self = StObject.set(x, "tombstoneTtl", value.asInstanceOf[js.Any])
    
    inline def setTombstoneTtlNull: Self = StObject.set(x, "tombstoneTtl", null)
    
    inline def setTombstoneTtlUndefined: Self = StObject.set(x, "tombstoneTtl", js.undefined)
  }
}
