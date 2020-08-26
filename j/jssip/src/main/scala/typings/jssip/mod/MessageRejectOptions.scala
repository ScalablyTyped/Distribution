package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRejectOptions extends js.Object {
  var body: js.UndefOr[String] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var reason_phrase: String = js.native
  var status_code: js.UndefOr[js.Array[Double]] = js.native
}

object MessageRejectOptions {
  @scala.inline
  def apply(reason_phrase: String): MessageRejectOptions = {
    val __obj = js.Dynamic.literal(reason_phrase = reason_phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRejectOptions]
  }
  @scala.inline
  implicit class MessageRejectOptionsOps[Self <: MessageRejectOptions] (val x: Self) extends AnyVal {
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
    def setReason_phrase(value: String): Self = this.set("reason_phrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setStatus_codeVarargs(value: Double*): Self = this.set("status_code", js.Array(value :_*))
    @scala.inline
    def setStatus_code(value: js.Array[Double]): Self = this.set("status_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus_code: Self = this.set("status_code", js.undefined)
  }
  
}

