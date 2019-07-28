package typings.ldapjs.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var `type`: String
  def matches(obj: js.Any): Boolean
}

object Filter {
  @scala.inline
  def apply(matches: js.Any => Boolean, `type`: String): Filter = {
    val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Filter]
  }
}

