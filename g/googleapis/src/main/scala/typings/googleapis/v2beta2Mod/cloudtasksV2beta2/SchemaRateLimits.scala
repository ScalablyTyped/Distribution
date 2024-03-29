package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRateLimits extends StObject {
  
  /**
    * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. The default value of `max_burst_size` is picked by Cloud Tasks based on the value of max_dispatches_per_second. The maximum value of `max_burst_size` is 500. For App Engine queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). If UpdateQueue is called on a queue without explicitly setting a value for `max_burst_size`, `max_burst_size` value will get updated if UpdateQueue is updating max_dispatches_per_second.
    */
  var maxBurstSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field is output only for pull queues and always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
    */
  var maxConcurrentTasks: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed value is 500. * This field is output only for pull queues. In addition to the `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed per pull queue. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
    */
  var maxTasksDispatchedPerSecond: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRateLimits {
  
  inline def apply(): SchemaRateLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRateLimits]
  }
  
  extension [Self <: SchemaRateLimits](x: Self) {
    
    inline def setMaxBurstSize(value: Double): Self = StObject.set(x, "maxBurstSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBurstSizeNull: Self = StObject.set(x, "maxBurstSize", null)
    
    inline def setMaxBurstSizeUndefined: Self = StObject.set(x, "maxBurstSize", js.undefined)
    
    inline def setMaxConcurrentTasks(value: Double): Self = StObject.set(x, "maxConcurrentTasks", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentTasksNull: Self = StObject.set(x, "maxConcurrentTasks", null)
    
    inline def setMaxConcurrentTasksUndefined: Self = StObject.set(x, "maxConcurrentTasks", js.undefined)
    
    inline def setMaxTasksDispatchedPerSecond(value: Double): Self = StObject.set(x, "maxTasksDispatchedPerSecond", value.asInstanceOf[js.Any])
    
    inline def setMaxTasksDispatchedPerSecondNull: Self = StObject.set(x, "maxTasksDispatchedPerSecond", null)
    
    inline def setMaxTasksDispatchedPerSecondUndefined: Self = StObject.set(x, "maxTasksDispatchedPerSecond", js.undefined)
  }
}
