package typings.keya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[T] extends js.Object {
  var key: js.Any
  var value: T
}

object Value {
  @scala.inline
  def apply[T](key: js.Any, value: T): Value[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[T]]
  }
}

