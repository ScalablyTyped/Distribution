package typings.ionic.libEventsMod

import typings.ionic.ionicStrings.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPCEvent[E /* <: String */, D /* <: js.Object */] extends js.Object {
  var data: D
  var event: E
  var `type`: event
}

object IPCEvent {
  @scala.inline
  def apply[E /* <: String */, D /* <: js.Object */](data: D, event: E, `type`: event): IPCEvent[E, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCEvent[E, D]]
  }
}

