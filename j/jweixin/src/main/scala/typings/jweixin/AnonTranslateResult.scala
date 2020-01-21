package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranslateResult extends js.Object {
  var translateResult: String
}

object AnonTranslateResult {
  @scala.inline
  def apply(translateResult: String): AnonTranslateResult = {
    val __obj = js.Dynamic.literal(translateResult = translateResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTranslateResult]
  }
}

