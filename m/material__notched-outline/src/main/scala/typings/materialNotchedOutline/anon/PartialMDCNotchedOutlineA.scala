package typings.materialNotchedOutline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/notched-outline.@material/notched-outline/adapter.MDCNotchedOutlineAdapter> */
@js.native
trait PartialMDCNotchedOutlineA extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var removeNotchWidthProperty: js.UndefOr[js.Function0[Unit]] = js.native
  var setNotchWidthProperty: js.UndefOr[js.Function1[/* width */ Double, Unit]] = js.native
}

object PartialMDCNotchedOutlineA {
  @scala.inline
  def apply(): PartialMDCNotchedOutlineA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCNotchedOutlineA]
  }
  @scala.inline
  implicit class PartialMDCNotchedOutlineAOps[Self <: PartialMDCNotchedOutlineA] (val x: Self) extends AnyVal {
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setRemoveNotchWidthProperty(value: () => Unit): Self = this.set("removeNotchWidthProperty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRemoveNotchWidthProperty: Self = this.set("removeNotchWidthProperty", js.undefined)
    @scala.inline
    def setSetNotchWidthProperty(value: /* width */ Double => Unit): Self = this.set("setNotchWidthProperty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNotchWidthProperty: Self = this.set("setNotchWidthProperty", js.undefined)
  }
  
}

