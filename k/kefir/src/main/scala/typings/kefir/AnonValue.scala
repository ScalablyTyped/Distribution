package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[U] extends js.Object {
  var convert: Boolean
  var value: U
}

object AnonValue {
  @scala.inline
  def apply[U](convert: Boolean, value: U): AnonValue[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue[U]]
  }
}

