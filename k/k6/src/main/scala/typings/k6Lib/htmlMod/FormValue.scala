package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValue extends js.Object {
  /** Field name. */
  var name: java.lang.String
  /** Field value. */
  var value: java.lang.String
}

object FormValue {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): FormValue = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[FormValue]
  }
}

