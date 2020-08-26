package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotAttributes extends js.Object {
  var name: js.UndefOr[String] = js.native
  var onSlotchange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var slot: js.UndefOr[String] = js.native
}

object SlotAttributes {
  @scala.inline
  def apply(): SlotAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotAttributes]
  }
  @scala.inline
  implicit class SlotAttributesOps[Self <: SlotAttributes] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnSlotchange(value: /* event */ Event => Unit): Self = this.set("onSlotchange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSlotchange: Self = this.set("onSlotchange", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
  }
  
}

