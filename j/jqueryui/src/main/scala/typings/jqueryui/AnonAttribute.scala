package typings.jqueryui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttribute extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
}

object AnonAttribute {
  @scala.inline
  def apply(attribute: String = null): AnonAttribute = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttribute]
  }
}

