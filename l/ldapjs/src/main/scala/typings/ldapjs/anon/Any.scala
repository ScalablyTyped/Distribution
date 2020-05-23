package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Any extends js.Object {
  var any: js.UndefOr[js.Array[String]] = js.undefined
  var attribute: String
  var `final`: js.UndefOr[String] = js.undefined
  var initial: String
}

object Any {
  @scala.inline
  def apply(attribute: String, initial: String, any: js.Array[String] = null, `final`: String = null): Any = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    if (any != null) __obj.updateDynamic("any")(any.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
}

