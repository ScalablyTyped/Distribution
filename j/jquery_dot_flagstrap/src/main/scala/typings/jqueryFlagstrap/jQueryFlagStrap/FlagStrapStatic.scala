package typings.jqueryFlagstrap.jQueryFlagStrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagStrapStatic extends js.Object {
  var flagStrap: js.UndefOr[Unit] = js.native
}

object FlagStrapStatic {
  @scala.inline
  def apply(): FlagStrapStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagStrapStatic]
  }
  @scala.inline
  implicit class FlagStrapStaticOps[Self <: FlagStrapStatic] (val x: Self) extends AnyVal {
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
    def setFlagStrap(value: Unit): Self = this.set("flagStrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlagStrap: Self = this.set("flagStrap", js.undefined)
  }
  
}

