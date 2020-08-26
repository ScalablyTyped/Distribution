package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value[U] extends js.Object {
  var convert: Boolean = js.native
  var value: U = js.native
}

object Value {
  @scala.inline
  def apply[U](convert: Boolean, value: U): Value[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[U]]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value[_], U] (val x: Self with Value[U]) extends AnyVal {
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
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: U): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

