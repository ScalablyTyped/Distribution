package typings.kefir

import typings.kefir.kefirMod.Event
import typings.kefir.kefirStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[V]
  extends Event[V, js.Any] {
  var `type`: value
  var value: V
}

object Anon_Type {
  @scala.inline
  def apply[V](`type`: value, value: V): Anon_Type[V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type[V]]
  }
}

