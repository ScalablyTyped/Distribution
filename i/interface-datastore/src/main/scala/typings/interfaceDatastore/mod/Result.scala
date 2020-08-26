package typings.interfaceDatastore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result[Value] extends js.Object {
  var key: Key = js.native
  var value: Value = js.native
}

object Result {
  @scala.inline
  def apply[Value](key: Key, value: Value): Result[Value] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[Value]]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result[_], Value] (val x: Self with Result[Value]) extends AnyVal {
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
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

