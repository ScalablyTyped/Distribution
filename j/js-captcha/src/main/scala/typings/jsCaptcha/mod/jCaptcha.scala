package typings.jsCaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jCaptcha extends js.Object {
  def reset(): Unit
  def validate(): Unit
}

object jCaptcha {
  @scala.inline
  def apply(reset: () => Unit, validate: () => Unit): jCaptcha = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate))
  
    __obj.asInstanceOf[jCaptcha]
  }
}

