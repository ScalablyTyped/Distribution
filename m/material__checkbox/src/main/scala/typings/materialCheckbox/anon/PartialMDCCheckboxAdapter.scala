package typings.materialCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/checkbox.@material/checkbox/adapter.MDCCheckboxAdapter> */
@js.native
trait PartialMDCCheckboxAdapter extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var forceLayout: js.UndefOr[js.Function0[Unit]] = js.native
  var hasNativeControl: js.UndefOr[js.Function0[Boolean]] = js.native
  var isAttachedToDOM: js.UndefOr[js.Function0[Boolean]] = js.native
  var isChecked: js.UndefOr[js.Function0[Boolean]] = js.native
  var isIndeterminate: js.UndefOr[js.Function0[Boolean]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var removeNativeControlAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.native
  var setNativeControlAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
  var setNativeControlDisabled: js.UndefOr[js.Function1[/* disabled */ Boolean, Unit]] = js.native
}

object PartialMDCCheckboxAdapter {
  @scala.inline
  def apply(): PartialMDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCCheckboxAdapter]
  }
  @scala.inline
  implicit class PartialMDCCheckboxAdapterOps[Self <: PartialMDCCheckboxAdapter] (val x: Self) extends AnyVal {
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
    def setForceLayout(value: () => Unit): Self = this.set("forceLayout", js.Any.fromFunction0(value))
    @scala.inline
    def deleteForceLayout: Self = this.set("forceLayout", js.undefined)
    @scala.inline
    def setHasNativeControl(value: () => Boolean): Self = this.set("hasNativeControl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasNativeControl: Self = this.set("hasNativeControl", js.undefined)
    @scala.inline
    def setIsAttachedToDOM(value: () => Boolean): Self = this.set("isAttachedToDOM", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsAttachedToDOM: Self = this.set("isAttachedToDOM", js.undefined)
    @scala.inline
    def setIsChecked(value: () => Boolean): Self = this.set("isChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setIsIndeterminate(value: () => Boolean): Self = this.set("isIndeterminate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsIndeterminate: Self = this.set("isIndeterminate", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setRemoveNativeControlAttr(value: /* attr */ String => Unit): Self = this.set("removeNativeControlAttr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveNativeControlAttr: Self = this.set("removeNativeControlAttr", js.undefined)
    @scala.inline
    def setSetNativeControlAttr(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setNativeControlAttr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetNativeControlAttr: Self = this.set("setNativeControlAttr", js.undefined)
    @scala.inline
    def setSetNativeControlDisabled(value: /* disabled */ Boolean => Unit): Self = this.set("setNativeControlDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNativeControlDisabled: Self = this.set("setNativeControlDisabled", js.undefined)
  }
  
}

