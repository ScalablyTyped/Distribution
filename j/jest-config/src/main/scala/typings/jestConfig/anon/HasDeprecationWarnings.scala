package typings.jestConfig.anon

import typings.jestConfig.normalizeMod.AllOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean
  var options: AllOptions
}

object HasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, options: AllOptions): HasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasDeprecationWarnings]
  }
}

