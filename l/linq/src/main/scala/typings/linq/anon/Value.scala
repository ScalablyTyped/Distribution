package typings.linq.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value[TKey, TValue] extends js.Object {
  var key: TKey
  var value: TValue
}

object Value {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): Value[TKey, TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TKey, TValue]]
  }
}

