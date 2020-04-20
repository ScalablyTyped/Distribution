package typings.ldapjs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttribute extends js.Object {
  var attribute: String
  var value: String | Buffer
}

object AnonAttribute {
  @scala.inline
  def apply(attribute: String, value: String | Buffer): AnonAttribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttribute]
  }
}

