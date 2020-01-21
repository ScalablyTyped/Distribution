package typings.materialTab.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Returns whether the root element has the given className.
    */
  def hasClass(className: String): Boolean
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Removes the given className from the root element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the given attrName of the root element to the given value.
    */
  def setAttr(attr: String, value: String): Unit
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterEventHandler: (String, EventListener) => Unit,
    hasClass: String => Boolean,
    registerEventHandler: (String, EventListener) => Unit,
    removeClass: String => Unit,
    setAttr: (String, String) => Unit
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterEventHandler = js.Any.fromFunction2(deregisterEventHandler), hasClass = js.Any.fromFunction1(hasClass), registerEventHandler = js.Any.fromFunction2(registerEventHandler), removeClass = js.Any.fromFunction1(removeClass), setAttr = js.Any.fromFunction2(setAttr))
  
    __obj.asInstanceOf[MDCTabAdapter]
  }
}

