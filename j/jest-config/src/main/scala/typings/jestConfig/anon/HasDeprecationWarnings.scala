package typings.jestConfig.anon

import typings.jestConfig.normalizeMod.AllOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean = js.native
  var options: AllOptions = js.native
}

object HasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, options: AllOptions): HasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasDeprecationWarnings]
  }
  @scala.inline
  implicit class HasDeprecationWarningsOps[Self <: HasDeprecationWarnings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasDeprecationWarnings(value: Boolean): Self = this.set("hasDeprecationWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: AllOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

