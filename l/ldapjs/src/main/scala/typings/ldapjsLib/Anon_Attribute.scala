package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: java.lang.String
  var value: java.lang.String
}

object Anon_Attribute {
  @scala.inline
  def apply(attribute: java.lang.String, value: java.lang.String): Anon_Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attribute")(attribute)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Attribute]
  }
}

