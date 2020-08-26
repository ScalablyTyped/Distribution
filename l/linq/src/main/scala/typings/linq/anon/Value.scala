package typings.linq.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[TKey, TValue] extends js.Object {
  var key: TKey = js.native
  var value: TValue = js.native
}

object Value {
  @scala.inline
  def apply[TKey, TValue](key: TKey, value: TValue): Value[TKey, TValue] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[TKey, TValue]]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value[_, _], TKey, TValue] (val x: Self with (Value[TKey, TValue])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: TKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: TValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

