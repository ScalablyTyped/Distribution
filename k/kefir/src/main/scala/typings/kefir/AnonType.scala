package typings.kefir

import typings.kefir.kefirStrings.value
import typings.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[V]
  extends Event[V, js.Any] {
  var `type`: value
  var value: V
}

object AnonType {
  @scala.inline
  def apply[V](`type`: value, value: V): AnonType[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[V]]
  }
}

