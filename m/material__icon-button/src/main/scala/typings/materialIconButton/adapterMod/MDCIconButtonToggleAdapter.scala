package typings.materialIconButton.adapterMod

import typings.materialIconButton.typesMod.MDCIconButtonToggleEventDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCIconButtonToggleAdapter extends js.Object {
  
  def addClass(className: String): Unit = js.native
  
  /** Returns the given attribute value on the root element. */
  def getAttr(attrName: String): String | Null = js.native
  
  def hasClass(className: String): Boolean = js.native
  
  def notifyChange(evtData: MDCIconButtonToggleEventDetail): Unit = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def setAttr(attrName: String, attrValue: String): Unit = js.native
}
object MDCIconButtonToggleAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    getAttr: String => String | Null,
    hasClass: String => Boolean,
    notifyChange: MDCIconButtonToggleEventDetail => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCIconButtonToggleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getAttr = js.Any.fromFunction1(getAttr), hasClass = js.Any.fromFunction1(hasClass), notifyChange = js.Any.fromFunction1(notifyChange), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
    __obj.asInstanceOf[MDCIconButtonToggleAdapter]
  }
  
  @scala.inline
  implicit class MDCIconButtonToggleAdapterOps[Self <: MDCIconButtonToggleAdapter] (val x: Self) extends AnyVal {
    
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
    def setAddClass(value: String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttr(value: String => String | Null): Self = this.set("getAttr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyChange(value: MDCIconButtonToggleEventDetail => Unit): Self = this.set("notifyChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttr(value: (String, String) => Unit): Self = this.set("setAttr", js.Any.fromFunction2(value))
  }
}
