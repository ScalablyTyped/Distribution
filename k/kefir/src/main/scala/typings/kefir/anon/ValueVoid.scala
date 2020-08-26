package typings.kefir.anon

import typings.kefir.kefirStrings.end
import typings.kefir.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueVoid
  extends Event[js.Any, js.Any] {
  var `type`: end = js.native
  var value: Unit = js.native
}

object ValueVoid {
  @scala.inline
  def apply(`type`: end, value: Unit): ValueVoid = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueVoid]
  }
  @scala.inline
  implicit class ValueVoidOps[Self <: ValueVoid] (val x: Self) extends AnyVal {
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
    def setType(value: end): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Unit): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

