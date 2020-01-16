package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventLoopDelay extends js.Object {
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

object Anon_EventLoopDelay {
  @scala.inline
  def apply(eventLoopDelay: Double, heapUsed: Double, rss: Double): Anon_EventLoopDelay = {
    val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventLoopDelay]
  }
}

