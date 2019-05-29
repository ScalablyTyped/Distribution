package typings
package jsDashCaptchaLib.distJsJCaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jCaptcha extends js.Object {
  def reset(): scala.Unit
  def validate(): scala.Unit
}

object jCaptcha {
  @scala.inline
  def apply(reset: () => scala.Unit, validate: () => scala.Unit): jCaptcha = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate))
  
    __obj.asInstanceOf[jCaptcha]
  }
}

