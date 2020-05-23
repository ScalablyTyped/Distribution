package typings.jqueryui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(attribute: String = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

