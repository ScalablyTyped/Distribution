package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: String
  var value: String
}

object Anon_Attribute {
  @scala.inline
  def apply(attribute: String, value: String): Anon_Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute, value = value)
  
    __obj.asInstanceOf[Anon_Attribute]
  }
}

