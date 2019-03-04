package typings
package linqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue[TKey, TValue] extends js.Object {
  var key: TKey
  var value: TValue
}

object Anon_KeyValue {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): Anon_KeyValue[TKey, TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyValue[TKey, TValue]]
  }
}

