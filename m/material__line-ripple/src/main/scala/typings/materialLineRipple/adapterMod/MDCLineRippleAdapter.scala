package typings.materialLineRipple.adapterMod

import typings.materialBase.typesMod.EventType
import typings.materialBase.typesMod.SpecificEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCLineRippleAdapter extends js.Object {
  /**
    * Adds a class to the line ripple element.
    */
  def addClass(className: String): Unit = js.native
  /**
    * Deregisters an event listener on the line ripple element for a given event.
    */
  def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  def hasClass(className: String): Boolean = js.native
  /**
    * Registers an event listener on the line ripple element for a given event.
    */
  def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit = js.native
  /**
    * Removes a class from the line ripple element.
    */
  def removeClass(className: String): Unit = js.native
  /**
    * Sets the style property with propertyName to value on the root element.
    */
  def setStyle(propertyName: String, value: String): Unit = js.native
}

object MDCLineRippleAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    hasClass: String => Boolean,
    registerEventHandler: (js.Any, SpecificEventListener[js.Any]) => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit
  ): MDCLineRippleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), hasClass = js.Any.fromFunction1(hasClass), registerEventHandler = js.Any.fromFunction2(registerEventHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
    __obj.asInstanceOf[MDCLineRippleAdapter]
  }
  @scala.inline
  implicit class MDCLineRippleAdapterOps[Self <: MDCLineRippleAdapter] (val x: Self) extends AnyVal {
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
    def setDeregisterEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("deregisterEventHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setHasClass(value: String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterEventHandler(value: (js.Any, SpecificEventListener[js.Any]) => Unit): Self = this.set("registerEventHandler", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveClass(value: String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStyle(value: (String, String) => Unit): Self = this.set("setStyle", js.Any.fromFunction2(value))
  }
  
}

