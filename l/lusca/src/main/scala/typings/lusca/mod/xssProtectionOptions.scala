package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait xssProtectionOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
}

object xssProtectionOptions {
  @scala.inline
  def apply(): xssProtectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[xssProtectionOptions]
  }
  @scala.inline
  implicit class xssProtectionOptionsOps[Self <: xssProtectionOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

