package typings.materialChips.trailingactionAdapterMod

import typings.materialChips.trailingactionConstantsMod.InteractionTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCChipTrailingActionAdapter extends js.Object {
  
  def focus(): Unit = js.native
  
  def getAttribute(attr: String): String | Null = js.native
  
  def notifyInteraction(trigger: InteractionTrigger): Unit = js.native
  
  def notifyNavigation(key: String): Unit = js.native
  
  def setAttribute(attr: String, value: String): Unit = js.native
}
object MDCChipTrailingActionAdapter {
  
  @scala.inline
  def apply(
    focus: () => Unit,
    getAttribute: String => String | Null,
    notifyInteraction: InteractionTrigger => Unit,
    notifyNavigation: String => Unit,
    setAttribute: (String, String) => Unit
  ): MDCChipTrailingActionAdapter = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), getAttribute = js.Any.fromFunction1(getAttribute), notifyInteraction = js.Any.fromFunction1(notifyInteraction), notifyNavigation = js.Any.fromFunction1(notifyNavigation), setAttribute = js.Any.fromFunction2(setAttribute))
    __obj.asInstanceOf[MDCChipTrailingActionAdapter]
  }
  
  @scala.inline
  implicit class MDCChipTrailingActionAdapterOps[Self <: MDCChipTrailingActionAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetAttribute(value: String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyInteraction(value: InteractionTrigger => Unit): Self = this.set("notifyInteraction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyNavigation(value: String => Unit): Self = this.set("notifyNavigation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttribute(value: (String, String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
  }
}
