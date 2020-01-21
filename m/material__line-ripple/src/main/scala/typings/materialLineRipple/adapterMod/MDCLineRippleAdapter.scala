package typings.materialLineRipple.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCLineRippleAdapter extends js.Object {
  /**
    * Adds a class to the line ripple element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event listener on the line ripple element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit
  def hasClass(className: String): Boolean
  /**
    * Registers an event listener on the line ripple element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes a class from the line ripple element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the style property with propertyName to value on the root element.
    */
  def setStyle(propertyName: String, value: String): Unit
}

object MDCLineRippleAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterEventHandler: (String, EventListener) => Unit,
    hasClass: String => Boolean,
    registerEventHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    setStyle: (String, String) => Unit
  ): MDCLineRippleAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), hasClass = js.Any.fromFunction1(hasClass), registerEventHandler = js.Any.fromFunction2(registerEventHandler), removeClass = js.Any.fromFunction1(removeClass), setStyle = js.Any.fromFunction2(setStyle))
  
    __obj.asInstanceOf[MDCLineRippleAdapter]
  }
}

