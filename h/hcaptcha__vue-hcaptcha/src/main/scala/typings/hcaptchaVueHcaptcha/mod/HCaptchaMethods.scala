package typings.hcaptchaVueHcaptcha.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HCaptchaMethods extends js.Object {
  def execute(): Unit
  def onError(e: Error): Unit
  def onExpired(): Unit
  def onVerify(response: String): Unit
  def onloadScript(): Unit
  def reset(): Unit
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
}

