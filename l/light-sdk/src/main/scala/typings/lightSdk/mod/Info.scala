package typings.lightSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var error_code: String
  var error_message: String
}

object Info {
  @scala.inline
  def apply(error_code: String, error_message: String): Info = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

