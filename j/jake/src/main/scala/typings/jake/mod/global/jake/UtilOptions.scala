package typings.jake.mod.global.jake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////
// File-utils //////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
@js.native
trait UtilOptions extends js.Object {
  var silent: js.UndefOr[Boolean] = js.native
}

object UtilOptions {
  @scala.inline
  def apply(): UtilOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilOptions]
  }
  @scala.inline
  implicit class UtilOptionsOps[Self <: UtilOptions] (val x: Self) extends AnyVal {
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
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

