package typings.kefir

import typings.kefir.kefirStrings.error
import typings.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[E]
  extends Event[js.Any, E] {
  var `type`: error
  var value: E
}

object AnonError {
  @scala.inline
  def apply[E](`type`: error, value: E): AnonError[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError[E]]
  }
}

