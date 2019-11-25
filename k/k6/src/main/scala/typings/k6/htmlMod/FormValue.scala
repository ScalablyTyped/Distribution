package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValue extends js.Object {
  /** Field name. */
  var name: String
  /** Field value. */
  var value: String
}

object FormValue {
  @scala.inline
  def apply(name: String, value: String): FormValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormValue]
  }
}

