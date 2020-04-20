package typings.jweixin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultStr extends js.Object {
  var resultStr: String
}

object AnonResultStr {
  @scala.inline
  def apply(resultStr: String): AnonResultStr = {
    val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultStr]
  }
}

