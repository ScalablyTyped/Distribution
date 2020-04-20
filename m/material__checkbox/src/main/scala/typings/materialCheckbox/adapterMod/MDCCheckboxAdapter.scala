package typings.materialCheckbox.adapterMod

import typings.materialSelectionControl.mod.MDCSelectionControlState
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterAnimationEndHandler(handler: EventListener): Unit
  def deregisterChangeHandler(handler: EventListener): Unit
  def forceLayout(): Unit
  def getNativeControl(): MDCSelectionControlState
  def isAttachedToDOM(): Boolean
  def registerAnimationEndHandler(handler: EventListener): Unit
  def registerChangeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def removeNativeControlAttr(attr: String): Unit
  def setNativeControlAttr(attr: String, value: String): Unit
}

object MDCCheckboxAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterAnimationEndHandler: EventListener => Unit,
    deregisterChangeHandler: EventListener => Unit,
    forceLayout: () => Unit,
    getNativeControl: () => MDCSelectionControlState,
    isAttachedToDOM: () => Boolean,
    registerAnimationEndHandler: EventListener => Unit,
    registerChangeHandler: EventListener => Unit,
    removeClass: String => Unit,
    removeNativeControlAttr: String => Unit,
    setNativeControlAttr: (String, String) => Unit
  ): MDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterAnimationEndHandler = js.Any.fromFunction1(deregisterAnimationEndHandler), deregisterChangeHandler = js.Any.fromFunction1(deregisterChangeHandler), forceLayout = js.Any.fromFunction0(forceLayout), getNativeControl = js.Any.fromFunction0(getNativeControl), isAttachedToDOM = js.Any.fromFunction0(isAttachedToDOM), registerAnimationEndHandler = js.Any.fromFunction1(registerAnimationEndHandler), registerChangeHandler = js.Any.fromFunction1(registerChangeHandler), removeClass = js.Any.fromFunction1(removeClass), removeNativeControlAttr = js.Any.fromFunction1(removeNativeControlAttr), setNativeControlAttr = js.Any.fromFunction2(setNativeControlAttr))
    __obj.asInstanceOf[MDCCheckboxAdapter]
  }
}

