package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConcurrentEventLoopDelay extends js.Object {
  /**
    * Max concurrent requests.
    */
  var concurrent: scala.Double
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: scala.Double
  /**
    * V8 heap usage.
    */
  var heapUsed: scala.Double
  /**
    * RSS memory usage.
    */
  var rss: scala.Double
}

object Anon_ConcurrentEventLoopDelay {
  @scala.inline
  def apply(concurrent: scala.Double, eventLoopDelay: scala.Double, heapUsed: scala.Double, rss: scala.Double): Anon_ConcurrentEventLoopDelay = {
    val __obj = js.Dynamic.literal(concurrent = concurrent, eventLoopDelay = eventLoopDelay, heapUsed = heapUsed, rss = rss)
  
    __obj.asInstanceOf[Anon_ConcurrentEventLoopDelay]
  }
}

