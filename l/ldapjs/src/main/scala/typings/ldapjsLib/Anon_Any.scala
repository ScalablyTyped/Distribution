package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  var any: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var attribute: java.lang.String
  var `final`: js.UndefOr[java.lang.String] = js.undefined
  var initial: java.lang.String
}

object Anon_Any {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    initial: java.lang.String,
    any: js.Array[java.lang.String] = null,
    `final`: java.lang.String = null
  ): Anon_Any = {
    val __obj = js.Dynamic.literal(attribute = attribute, initial = initial)
    if (any != null) __obj.updateDynamic("any")(any)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    __obj.asInstanceOf[Anon_Any]
  }
}

