package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributeString extends js.Object {
  var attribute: String
}

object AnonAttributeString {
  @scala.inline
  def apply(attribute: String): AnonAttributeString = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributeString]
  }
}

