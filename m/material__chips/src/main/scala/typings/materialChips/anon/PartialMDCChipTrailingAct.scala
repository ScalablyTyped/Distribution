package typings.materialChips.anon

import typings.materialChips.trailingactionConstantsMod.InteractionTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/chips.@material/chips/trailingaction/adapter.MDCChipTrailingActionAdapter> */
@js.native
trait PartialMDCChipTrailingAct extends js.Object {
  
  var focus: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getAttribute: js.UndefOr[js.Function1[/* attr */ String, String | Null]] = js.native
  
  var notifyInteraction: js.UndefOr[js.Function1[/* trigger */ InteractionTrigger, Unit]] = js.native
  
  var notifyNavigation: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  
  var setAttribute: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.native
}
object PartialMDCChipTrailingAct {
  
  @scala.inline
  def apply(): PartialMDCChipTrailingAct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCChipTrailingAct]
  }
  
  @scala.inline
  implicit class PartialMDCChipTrailingActOps[Self <: PartialMDCChipTrailingAct] (val x: Self) extends AnyVal {
    
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setGetAttribute(value: /* attr */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAttribute: Self = this.set("getAttribute", js.undefined)
    
    @scala.inline
    def setNotifyInteraction(value: /* trigger */ InteractionTrigger => Unit): Self = this.set("notifyInteraction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyInteraction: Self = this.set("notifyInteraction", js.undefined)
    
    @scala.inline
    def setNotifyNavigation(value: /* key */ String => Unit): Self = this.set("notifyNavigation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyNavigation: Self = this.set("notifyNavigation", js.undefined)
    
    @scala.inline
    def setSetAttribute(value: (/* attr */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetAttribute: Self = this.set("setAttribute", js.undefined)
  }
}
