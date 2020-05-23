package typings.jssip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: String
  var params: js.Any
}

object Event {
  @scala.inline
  def apply(event: String, params: js.Any): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

