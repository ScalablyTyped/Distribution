package typings
package atMaterialCheckboxLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterAnimationEndHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterChangeHandler(handler: stdLib.EventListener): scala.Unit
  def forceLayout(): scala.Unit
  def getNativeControl(): atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState
  def isAttachedToDOM(): scala.Boolean
  def registerAnimationEndHandler(handler: stdLib.EventListener): scala.Unit
  def registerChangeHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def removeNativeControlAttr(attr: java.lang.String): scala.Unit
  def setNativeControlAttr(attr: java.lang.String, value: java.lang.String): scala.Unit
}

object MDCCheckboxAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    deregisterAnimationEndHandler: stdLib.EventListener => scala.Unit,
    deregisterChangeHandler: stdLib.EventListener => scala.Unit,
    forceLayout: () => scala.Unit,
    getNativeControl: () => atMaterialSelectionDashControlLib.atMaterialSelectionDashControlMod.MDCSelectionControlState,
    isAttachedToDOM: () => scala.Boolean,
    registerAnimationEndHandler: stdLib.EventListener => scala.Unit,
    registerChangeHandler: stdLib.EventListener => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    removeNativeControlAttr: java.lang.String => scala.Unit,
    setNativeControlAttr: (java.lang.String, java.lang.String) => scala.Unit
  ): MDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterAnimationEndHandler = js.Any.fromFunction1(deregisterAnimationEndHandler), deregisterChangeHandler = js.Any.fromFunction1(deregisterChangeHandler), forceLayout = js.Any.fromFunction0(forceLayout), getNativeControl = js.Any.fromFunction0(getNativeControl), isAttachedToDOM = js.Any.fromFunction0(isAttachedToDOM), registerAnimationEndHandler = js.Any.fromFunction1(registerAnimationEndHandler), registerChangeHandler = js.Any.fromFunction1(registerChangeHandler), removeClass = js.Any.fromFunction1(removeClass), removeNativeControlAttr = js.Any.fromFunction1(removeNativeControlAttr), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr))
  
    __obj.asInstanceOf[MDCCheckboxAdapter]
  }
}

