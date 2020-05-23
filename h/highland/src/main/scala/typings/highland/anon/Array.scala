package typings.highland.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[R] extends js.Object {
  var array: js.Any
  var stream: js.Any
  var value: R
}

object Array {
  @scala.inline
  def apply[R](array: js.Any, stream: js.Any, value: R): Array[R] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[R]]
  }
}

