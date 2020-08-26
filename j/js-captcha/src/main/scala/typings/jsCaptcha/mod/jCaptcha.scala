package typings.jsCaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jCaptcha extends js.Object {
  def reset(): Unit = js.native
  def validate(): Unit = js.native
}

object jCaptcha {
  @scala.inline
  def apply(reset: () => Unit, validate: () => Unit): jCaptcha = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[jCaptcha]
  }
  @scala.inline
  implicit class jCaptchaOps[Self <: jCaptcha] (val x: Self) extends AnyVal {
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
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setValidate(value: () => Unit): Self = this.set("validate", js.Any.fromFunction0(value))
  }
  
}

