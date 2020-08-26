package typings.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionSendDtmfOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  var interToneGap: Double = js.native
}

object SessionSendDtmfOptions {
  @scala.inline
  def apply(interToneGap: Double): SessionSendDtmfOptions = {
    val __obj = js.Dynamic.literal(interToneGap = interToneGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionSendDtmfOptions]
  }
  @scala.inline
  implicit class SessionSendDtmfOptionsOps[Self <: SessionSendDtmfOptions] (val x: Self) extends AnyVal {
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
    def setInterToneGap(value: Double): Self = this.set("interToneGap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
  }
  
}

