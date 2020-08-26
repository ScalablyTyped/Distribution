package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventLoopDelay extends js.Object {
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: Double = js.native
  /**
    * V8 heap usage.
    */
  var heapUsed: Double = js.native
  /**
    * RSS memory usage.
    */
  var rss: Double = js.native
}

object EventLoopDelay {
  @scala.inline
  def apply(eventLoopDelay: Double, heapUsed: Double, rss: Double): EventLoopDelay = {
    val __obj = js.Dynamic.literal(eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopDelay]
  }
  @scala.inline
  implicit class EventLoopDelayOps[Self <: EventLoopDelay] (val x: Self) extends AnyVal {
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
    def setEventLoopDelay(value: Double): Self = this.set("eventLoopDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapUsed(value: Double): Self = this.set("heapUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRss(value: Double): Self = this.set("rss", value.asInstanceOf[js.Any])
  }
  
}

