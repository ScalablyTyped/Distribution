package typings.hcaptchaVueHcaptcha.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCaptchaMethods extends js.Object {
  def execute(): Unit = js.native
  def onError(e: Error): Unit = js.native
  def onExpired(): Unit = js.native
  def onVerify(response: String): Unit = js.native
  def onloadScript(): Unit = js.native
  def reset(): Unit = js.native
}

object HCaptchaMethods {
  @scala.inline
  def apply(
    execute: () => Unit,
    onError: Error => Unit,
    onExpired: () => Unit,
    onVerify: String => Unit,
    onloadScript: () => Unit,
    reset: () => Unit
  ): HCaptchaMethods = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), onError = js.Any.fromFunction1(onError), onExpired = js.Any.fromFunction0(onExpired), onVerify = js.Any.fromFunction1(onVerify), onloadScript = js.Any.fromFunction0(onloadScript), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[HCaptchaMethods]
  }
  @scala.inline
  implicit class HCaptchaMethodsOps[Self <: HCaptchaMethods] (val x: Self) extends AnyVal {
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
    def setExecute(value: () => Unit): Self = this.set("execute", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnExpired(value: () => Unit): Self = this.set("onExpired", js.Any.fromFunction0(value))
    @scala.inline
    def setOnVerify(value: String => Unit): Self = this.set("onVerify", js.Any.fromFunction1(value))
    @scala.inline
    def setOnloadScript(value: () => Unit): Self = this.set("onloadScript", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
  
}

