package typings.keya.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[T] extends js.Object {
  var key: String
  var value: T
}

object Key {
  @scala.inline
  def apply[T](key: String, value: T): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
}

