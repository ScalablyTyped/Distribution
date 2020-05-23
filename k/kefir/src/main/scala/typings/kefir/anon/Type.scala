package typings.kefir.anon

import typings.kefir.kefirStrings.value
import typings.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[V]
  extends Event[V, js.Any] {
  var `type`: value
  var value: V
}

object Type {
  @scala.inline
  def apply[V](`type`: value, value: V): Type[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[V]]
  }
}

