package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var `type`: java.lang.String
  def matches(obj: js.Any): scala.Boolean
}

object Filter {
  @scala.inline
  def apply(matches: js.Function1[js.Any, scala.Boolean], `type`: java.lang.String): Filter = {
    val __obj = js.Dynamic.literal(matches = matches)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Filter]
  }
}

