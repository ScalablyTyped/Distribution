package typings.ionic.libOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenUrlOptions extends js.Object {
  var app: js.UndefOr[String | js.Array[String]] = js.native
  var encode: js.UndefOr[Boolean] = js.native
}

object OpenUrlOptions {
  @scala.inline
  def apply(): OpenUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenUrlOptions]
  }
  @scala.inline
  implicit class OpenUrlOptionsOps[Self <: OpenUrlOptions] (val x: Self) extends AnyVal {
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
    def setAppVarargs(value: String*): Self = this.set("app", js.Array(value :_*))
    @scala.inline
    def setApp(value: String | js.Array[String]): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setEncode(value: Boolean): Self = this.set("encode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
  }
  
}

