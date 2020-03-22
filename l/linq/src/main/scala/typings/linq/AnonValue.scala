package typings.linq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue[TKey, TValue] extends js.Object {
  var key: TKey
  var value: TValue
}

object AnonValue {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): AnonValue[TKey, TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValue[TKey, TValue]]
  }
}

