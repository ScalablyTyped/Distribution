package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[U] extends js.Object {
  var convert: Boolean
  var value: U
}

object Value {
  @scala.inline
  def apply[U](convert: Boolean, value: U): Value[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[U]]
  }
}

