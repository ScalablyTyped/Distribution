package typings.jweixin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateResult extends js.Object {
  var translateResult: String
}

object TranslateResult {
  @scala.inline
  def apply(translateResult: String): TranslateResult = {
    val __obj = js.Dynamic.literal(translateResult = translateResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateResult]
  }
}

