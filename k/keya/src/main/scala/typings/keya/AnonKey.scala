package typings.keya

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var value: js.Any
}

object AnonKey {
  @scala.inline
  def apply(key: String, value: js.Any): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

