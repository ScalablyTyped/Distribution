package typings.kefir

import typings.kefir.kefirStrings.end
import typings.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueVoid
  extends Event[js.Any, js.Any] {
  var `type`: end
  var value: Unit
}

object AnonValueVoid {
  @scala.inline
  def apply(`type`: end, value: Unit): AnonValueVoid = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueVoid]
  }
}

