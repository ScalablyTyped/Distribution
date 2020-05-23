package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeString extends js.Object {
  var attribute: String
}

object AttributeString {
  @scala.inline
  def apply(attribute: String): AttributeString = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeString]
  }
}

