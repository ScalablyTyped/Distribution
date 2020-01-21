package typings.linq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyValue[TKey, TValue] extends js.Object {
  var key: TKey
  var value: TValue
}

object AnonKeyValue {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): AnonKeyValue[TKey, TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyValue[TKey, TValue]]
  }
}

