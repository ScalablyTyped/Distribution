package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentUnregisterOptions extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
}

object UserAgentUnregisterOptions {
  @scala.inline
  def apply(): UserAgentUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentUnregisterOptions]
  }
  @scala.inline
  implicit class UserAgentUnregisterOptionsOps[Self <: UserAgentUnregisterOptions] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
  }
  
}

