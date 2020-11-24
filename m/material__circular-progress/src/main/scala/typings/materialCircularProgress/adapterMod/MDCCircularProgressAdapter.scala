package typings.materialCircularProgress.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCCircularProgressAdapter extends js.Object {
  
  def addClass(className: String): Unit = js.native
  
  def getDeterminateCircleAttribute(attributeName: String): String | Null = js.native
  
  def hasClass(className: String): Boolean = js.native
  
  def removeAttribute(attributeName: String): Unit = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def setAttribute(attributeName: String, value: String): Unit = js.native
  
  def setDeterminateCircleAttribute(attributeName: String, value: String): Unit = js.native
}
object MDCCircularProgressAdapter {
  
  @scala.inline
  def apply(
    addClass: String => Unit,
    getDeterminateCircleAttribute: String => String | Null,
    hasClass: String => Boolean,
    removeAttribute: String => Unit,
    removeClass: String => Unit,
    setAttribute: (String, String) => Unit,
    setDeterminateCircleAttribute: (String, String) => Unit
  ): MDCCircularProgressAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), getDeterminateCircleAttribute = js.Any.fromFunction1(getDeterminateCircleAttribute), hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1(removeAttribute), removeClass = js.Any.fromFunction1(removeClass), setAttribute = js.Any.fromFunction2(setAttribute), setDeterminateCircleAttribute = js.Any.fromFunction2(setDeterminateCircleAttribute))
    __obj.asInstanceOf[MDCCircularProgressAdapter]
  }
  
  @scala.inline
  implicit class MDCCircularProgressAdapterOps[Self <: MDCCircularProgressAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetDeterminateCircleAttribute(value: String => String | Null): Self = this.set("getDeterminateCircleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttribute(value: String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttribute(value: (String, String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDeterminateCircleAttribute(value: (String, String) => Unit): Self = this.set("setDeterminateCircleAttribute", js.Any.fromFunction2(value))
  }
}
