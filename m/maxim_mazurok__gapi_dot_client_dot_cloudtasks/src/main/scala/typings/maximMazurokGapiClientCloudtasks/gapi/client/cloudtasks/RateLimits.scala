package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateLimits extends StObject {
  
  /**
    * Output only. The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to
    * have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token
    * bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum
    * specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket
    * will be continuously refilled with new tokens based on max_dispatches_per_second. Cloud Tasks will pick the value of `max_burst_size` based on the value of
    * max_dispatches_per_second. For queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to
    * [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). Since `max_burst_size` is output only, if UpdateQueue is called on a queue
    * created by `queue.yaml/xml`, `max_burst_size` will be reset based on the value of max_dispatches_per_second, regardless of whether max_dispatches_per_second is updated.
    */
  var maxBurstSize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the
    * number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field has the same
    * meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
    */
  var maxConcurrentDispatches: js.UndefOr[Double] = js.native
  
  /**
    * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * The maximum allowed value is 500. This
    * field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
    */
  var maxDispatchesPerSecond: js.UndefOr[Double] = js.native
}
object RateLimits {
  
  @scala.inline
  def apply(): RateLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateLimits]
  }
  
  @scala.inline
  implicit class RateLimitsMutableBuilder[Self <: RateLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxBurstSize(value: Double): Self = StObject.set(x, "maxBurstSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBurstSizeUndefined: Self = StObject.set(x, "maxBurstSize", js.undefined)
    
    @scala.inline
    def setMaxConcurrentDispatches(value: Double): Self = StObject.set(x, "maxConcurrentDispatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentDispatchesUndefined: Self = StObject.set(x, "maxConcurrentDispatches", js.undefined)
    
    @scala.inline
    def setMaxDispatchesPerSecond(value: Double): Self = StObject.set(x, "maxDispatchesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDispatchesPerSecondUndefined: Self = StObject.set(x, "maxDispatchesPerSecond", js.undefined)
  }
}
