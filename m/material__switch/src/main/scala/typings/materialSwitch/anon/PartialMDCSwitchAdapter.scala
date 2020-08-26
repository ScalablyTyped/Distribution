package typings.materialSwitch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/switch.@material/switch/adapter.MDCSwitchAdapter> */
@js.native
trait PartialMDCSwitchAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setNativeControlAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  var setNativeControlChecked: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.native
}

object PartialMDCSwitchAdapter {
  @scala.inline
  def apply(): PartialMDCSwitchAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSwitchAdapter]
  }
  @scala.inline
  implicit class PartialMDCSwitchAdapterOps[Self <: PartialMDCSwitchAdapter] (val x: Self) extends AnyVal {
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
    def setSetNativeControlAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setNativeControlAttr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetNativeControlAttr: Self = this.set("setNativeControlAttr", js.undefined)
    @scala.inline
    def setSetNativeControlChecked(value: /* checked */ Boolean => Unit): Self = this.set("setNativeControlChecked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNativeControlChecked: Self = this.set("setNativeControlChecked", js.undefined)
    @scala.inline
    def setSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = this.set("setNativeControlDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNativeControlDisabled: Self = this.set("setNativeControlDisabled", js.undefined)
  }
  
}

