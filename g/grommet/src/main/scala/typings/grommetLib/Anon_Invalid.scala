package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Invalid extends js.Object {
  var invalid: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Invalid {
  @scala.inline
  def apply(invalid: java.lang.String = null, required: java.lang.String = null): Anon_Invalid = {
    val __obj = js.Dynamic.literal()
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Invalid]
  }
}

