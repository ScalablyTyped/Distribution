package typings
package jestDashValidateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: scala.Boolean
  var isValid: scala.Boolean
}

object Anon_HasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: scala.Boolean, isValid: scala.Boolean): Anon_HasDeprecationWarnings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasDeprecationWarnings")(hasDeprecationWarnings)
    __obj.updateDynamic("isValid")(isValid)
    __obj.asInstanceOf[Anon_HasDeprecationWarnings]
  }
}

