package typings.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValuePair[TKey, TValue] extends js.Object {
  var key: TKey
  var value: TValue
}

object KeyValuePair {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): KeyValuePair[TKey, TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[TKey, TValue]]
  }
}

