package typings.materialIconButton.anon

import typings.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/icon-button.@material/icon-button/adapter.MDCIconButtonToggleAdapter> */
@js.native
trait PartialMDCIconButtonToggl extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var getAttr: js.UndefOr[js.Function1[/* attrName */ String, String | Null]] = js.native
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  var notifyChange: js.UndefOr[js.Function1[/* evtData */ MDCIconButtonToggleEventDetail, Unit]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* attrValue */ String, Unit]] = js.native
}

object PartialMDCIconButtonToggl {
  @scala.inline
  def apply(): PartialMDCIconButtonToggl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCIconButtonToggl]
  }
  @scala.inline
  implicit class PartialMDCIconButtonTogglOps[Self <: PartialMDCIconButtonToggl] (val x: Self) extends AnyVal {
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
    def setGetAttr(value: /* attrName */ String => String | Null): Self = this.set("getAttr", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAttr: Self = this.set("getAttr", js.undefined)
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    @scala.inline
    def setNotifyChange(value: /* evtData */ MDCIconButtonToggleEventDetail => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNotifyChange: Self = this.set("notifyChange", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetAttr(value: (/* attrName */ String, /* attrValue */ String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetAttr: Self = this.set("setAttr", js.undefined)
  }
  
}

