package typings.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grecaptcha.grecaptchaStrings.bottomright
  - typings.grecaptcha.grecaptchaStrings.bottomleft
  - typings.grecaptcha.grecaptchaStrings.`inline`
*/
trait Badge extends js.Object

object Badge {
  @scala.inline
  def bottomleft: typings.grecaptcha.grecaptchaStrings.bottomleft = this.cast("bottomleft")
  @scala.inline
  def bottomright: typings.grecaptcha.grecaptchaStrings.bottomright = this.cast("bottomright")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `inline`: typings.grecaptcha.grecaptchaStrings.`inline` = this.cast("inline")
}

