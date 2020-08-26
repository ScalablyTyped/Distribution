package typings.kefir.anon

import typings.kefir.kefirStrings.error
import typings.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeValue[E]
  extends Event[js.Any, E] {
  var `type`: error = js.native
  var value: E = js.native
}

object TypeValue {
  @scala.inline
  def apply[E](`type`: error, value: E): TypeValue[E] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue[E]]
  }
  @scala.inline
  implicit class TypeValueOps[Self <: TypeValue[_], E] (val x: Self with TypeValue[E]) extends AnyVal {
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
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: E): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

