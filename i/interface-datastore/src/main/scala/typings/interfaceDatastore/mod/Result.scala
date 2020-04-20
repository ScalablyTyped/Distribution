package typings.interfaceDatastore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result[Value] extends js.Object {
  var key: Key
  var value: Value
}

object Result {
  @scala.inline
  def apply[Value](key: Key, value: Value): Result[Value] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[Value]]
  }
}

