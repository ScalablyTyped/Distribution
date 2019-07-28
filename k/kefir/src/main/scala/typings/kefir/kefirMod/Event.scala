package typings.kefir.kefirMod

import typings.kefir.kefirStrings.end
import typings.kefir.kefirStrings.error
import typings.kefir.kefirStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event[V, E] extends js.Object {
  var `type`: js.UndefOr[end | error | value] = js.undefined
  var value: js.UndefOr[E | Unit | V] = js.undefined
}

object Event {
  @scala.inline
  def apply[V, E](`type`: value = null, value: V = null): Event[V, E] = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[V, E]]
  }
}

