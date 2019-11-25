package typings.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grecaptcha.grecaptchaStrings.normal
  - typings.grecaptcha.grecaptchaStrings.compact
  - typings.grecaptcha.grecaptchaStrings.invisible
*/
trait Size extends js.Object

object Size {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compact: typings.grecaptcha.grecaptchaStrings.compact = this.cast("compact")
  @scala.inline
  def invisible: typings.grecaptcha.grecaptchaStrings.invisible = this.cast("invisible")
  @scala.inline
  def normal: typings.grecaptcha.grecaptchaStrings.normal = this.cast("normal")
}

