package typings.materialSegmentedButton.anon

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/segmented-button.@material/segmented-button/segment/adapter.MDCSegmentedButtonSegmentAdapter> */
@js.native
trait PartialMDCSegmentedButtonAddClass extends js.Object {
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var getAttr: js.UndefOr[js.Function1[/* attrName */ String, String | Null]] = js.native
  
  var getRootBoundingClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var isSingleSelect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var notifySelectedChange: js.UndefOr[js.Function1[/* selected */ Boolean, Unit]] = js.native
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  
  var setAttr: js.UndefOr[js.Function2[/* attrName */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCSegmentedButtonAddClass {
  
  @scala.inline
  def apply(): PartialMDCSegmentedButtonAddClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSegmentedButtonAddClass]
  }
  
  @scala.inline
  implicit class PartialMDCSegmentedButtonAddClassOps[Self <: PartialMDCSegmentedButtonAddClass] (val x: Self) extends AnyVal {
    
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
    def setGetRootBoundingClientRect(value: () => ClientRect): Self = this.set("getRootBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRootBoundingClientRect: Self = this.set("getRootBoundingClientRect", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setIsSingleSelect(value: () => Boolean): Self = this.set("isSingleSelect", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsSingleSelect: Self = this.set("isSingleSelect", js.undefined)
    
    @scala.inline
    def setNotifySelectedChange(value: /* selected */ Boolean => Unit): Self = this.set("notifySelectedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifySelectedChange: Self = this.set("notifySelectedChange", js.undefined)
    
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    
    @scala.inline
    def setSetAttr(value: (/* attrName */ String, /* value */ String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttr: Self = this.set("setAttr", js.undefined)
  }
}
