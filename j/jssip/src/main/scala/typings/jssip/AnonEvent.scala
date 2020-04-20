package typings.jssip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: String
  var params: js.Any
}

object AnonEvent {
  @scala.inline
  def apply(event: String, params: js.Any): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

