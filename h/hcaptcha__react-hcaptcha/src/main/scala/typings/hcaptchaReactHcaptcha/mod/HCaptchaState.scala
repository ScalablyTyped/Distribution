package typings.hcaptchaReactHcaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCaptchaState extends js.Object {
  var captchaId: String = js.native
  var elementId: String = js.native
  var isApiReady: Boolean = js.native
  var isRemoved: Boolean = js.native
}

object HCaptchaState {
  @scala.inline
  def apply(captchaId: String, elementId: String, isApiReady: Boolean, isRemoved: Boolean): HCaptchaState = {
    val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isApiReady = isApiReady.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaState]
  }
  @scala.inline
  implicit class HCaptchaStateOps[Self <: HCaptchaState] (val x: Self) extends AnyVal {
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
    def setCaptchaId(value: String): Self = this.set("captchaId", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementId(value: String): Self = this.set("elementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsApiReady(value: Boolean): Self = this.set("isApiReady", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRemoved(value: Boolean): Self = this.set("isRemoved", value.asInstanceOf[js.Any])
  }
  
}

