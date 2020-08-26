package typings.jsmediatags.typesMod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jsmediatagsError extends js.Object {
  var info: String = js.native
  var `type`: String = js.native
  var xhr: js.UndefOr[XMLHttpRequest] = js.native
}

object jsmediatagsError {
  @scala.inline
  def apply(info: String, `type`: String): jsmediatagsError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[jsmediatagsError]
  }
  @scala.inline
  implicit class jsmediatagsErrorOps[Self <: jsmediatagsError] (val x: Self) extends AnyVal {
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
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

