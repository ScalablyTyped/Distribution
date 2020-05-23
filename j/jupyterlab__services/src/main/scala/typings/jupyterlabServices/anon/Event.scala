package typings.jupyterlabServices.anon

import typings.jupyterlabServices.jupyterlabServicesStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var event: String
  var seq: Double
  var `type`: event
}

object Event {
  @scala.inline
  def apply(event: String, seq: Double, `type`: event, body: js.Any = null): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

