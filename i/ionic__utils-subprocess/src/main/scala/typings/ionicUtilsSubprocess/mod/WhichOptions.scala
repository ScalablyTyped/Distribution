package typings.ionicUtilsSubprocess.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhichOptions extends js.Object {
  var PATH: js.UndefOr[String] = js.native
  var PATHEXT: js.UndefOr[String] = js.native
}

object WhichOptions {
  @scala.inline
  def apply(): WhichOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhichOptions]
  }
  @scala.inline
  implicit class WhichOptionsOps[Self <: WhichOptions] (val x: Self) extends AnyVal {
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
    def setPATH(value: String): Self = this.set("PATH", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePATH: Self = this.set("PATH", js.undefined)
    @scala.inline
    def setPATHEXT(value: String): Self = this.set("PATHEXT", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePATHEXT: Self = this.set("PATHEXT", js.undefined)
  }
  
}

