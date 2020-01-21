package typings.jsCaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-captcha/dist/js/jCaptcha", JSImport.Namespace)
@js.native
class ^ () extends jCaptcha {
  def this(options: Options) = this()
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def validate(): Unit = js.native
}

