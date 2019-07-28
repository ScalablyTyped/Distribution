package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentEventLoopDelay extends js.Object {
  /**
    * Max concurrent requests.
    */
  var concurrent: Double
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: Double
  /**
    * V8 heap usage.
    */
  var heapUsed: Double
  /**
    * RSS memory usage.
    */
  var rss: Double
}

object Anon_ConcurrentEventLoopDelay {
  @scala.inline
  def apply(concurrent: Double, eventLoopDelay: Double, heapUsed: Double, rss: Double): Anon_ConcurrentEventLoopDelay = {
    val __obj = js.Dynamic.literal(concurrent = concurrent, eventLoopDelay = eventLoopDelay, heapUsed = heapUsed, rss = rss)
  
    __obj.asInstanceOf[Anon_ConcurrentEventLoopDelay]
  }
}

