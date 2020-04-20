package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventLoopDelay extends js.Object {
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
  def apply(eventLoopDelay: Double, heapUsed: Double, rss: Double): AnonEventLoopDelay = {
    val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventLoopDelay]
  }
}

