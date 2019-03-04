package typings
package atMaterialLineDashRippleLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCLineRippleAdapter extends js.Object {
  /**
    * Adds a class to the line ripple element.
    */
  def addClass(className: java.lang.String): scala.Unit
  /**
    * Deregisters an event listener on the line ripple element for a given event.
    */
  def deregisterEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def hasClass(className: java.lang.String): scala.Boolean
  /**
    * Registers an event listener on the line ripple element for a given event.
    */
  def registerEventHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  /**
    * Removes a class from the line ripple element.
    */
  def removeClass(className: java.lang.String): scala.Unit
  /**
    * Sets the style property with propertyName to value on the root element.
    */
  def setStyle(propertyName: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCLineRippleAdapter {
  @scala.inline
  def apply(
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterEventHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    hasClass: js.Function1[java.lang.String, scala.Boolean],
    registerEventHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setStyle: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): MDCLineRippleAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterEventHandler = deregisterEventHandler, hasClass = hasClass, registerEventHandler = registerEventHandler, removeClass = removeClass, setStyle = setStyle)
  
    __obj.asInstanceOf[MDCLineRippleAdapter]
  }
}

