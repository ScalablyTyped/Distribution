package typings
package jqueryuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Attribute {
  @scala.inline
  def apply(attribute: java.lang.String = null): Anon_Attribute = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    __obj.asInstanceOf[Anon_Attribute]
  }
}

