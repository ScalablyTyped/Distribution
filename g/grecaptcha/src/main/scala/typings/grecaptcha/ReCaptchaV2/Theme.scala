package typings.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grecaptcha.grecaptchaStrings.light
  - typings.grecaptcha.grecaptchaStrings.dark
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.grecaptcha.grecaptchaStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.grecaptcha.grecaptchaStrings.light = this.cast("light")
}

