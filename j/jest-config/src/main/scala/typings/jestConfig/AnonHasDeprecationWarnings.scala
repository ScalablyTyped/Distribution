package typings.jestConfig

import typings.jestConfig.normalizeMod.AllOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean
  var options: AllOptions
}

object AnonHasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, options: AllOptions): AnonHasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasDeprecationWarnings]
  }
}

