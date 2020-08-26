package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionHoldOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var useUpdate: js.UndefOr[Boolean] = js.native
}

object SessionHoldOptions {
  @scala.inline
  def apply(): SessionHoldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionHoldOptions]
  }
  @scala.inline
  implicit class SessionHoldOptionsOps[Self <: SessionHoldOptions] (val x: Self) extends AnyVal {
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
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setUseUpdate(value: Boolean): Self = this.set("useUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUpdate: Self = this.set("useUpdate", js.undefined)
  }
  
}

