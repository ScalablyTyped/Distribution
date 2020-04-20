package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventLoopDelay extends js.Object {
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

object AnonEventLoopDelay {
  @scala.inline
  def apply(concurrent: Double, eventLoopDelay: Double, heapUsed: Double, rss: Double): AnonEventLoopDelay = {
    val __obj = js.Dynamic.literal(concurrent = concurrent.asInstanceOf[js.Any], eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventLoopDelay]
  }
}

