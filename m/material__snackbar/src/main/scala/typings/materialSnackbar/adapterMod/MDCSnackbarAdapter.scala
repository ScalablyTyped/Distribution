package typings.materialSnackbar.adapterMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSnackbarAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterActionClickHandler(handler: EventListener): Unit
  def deregisterCapturedBlurHandler(handler: EventListener): Unit
  def deregisterCapturedInteractionHandler(evtType: String, handler: EventListener): Unit
  def deregisterTransitionEndHandler(handler: EventListener): Unit
  def deregisterVisibilityChangeHandler(handler: EventListener): Unit
  def notifyHide(): Unit
  def notifyShow(): Unit
  def registerActionClickHandler(handler: EventListener): Unit
  def registerCapturedBlurHandler(handler: EventListener): Unit
  def registerCapturedInteractionHandler(evtType: String, handler: EventListener): Unit
  def registerTransitionEndHandler(handler: EventListener): Unit
  def registerVisibilityChangeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setActionAriaHidden(): Unit
  def setActionText(actionText: String): Unit
  def setAriaHidden(): Unit
  def setFocus(): Unit
  def setMessageText(message: String): Unit
  def unsetActionAriaHidden(): Unit
  def unsetAriaHidden(): Unit
  def visibilityIsHidden(): Boolean
}

object MDCSnackbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Unit,
    deregisterActionClickHandler: EventListener => Unit,
    deregisterCapturedBlurHandler: EventListener => Unit,
    deregisterCapturedInteractionHandler: (String, EventListener) => Unit,
    deregisterTransitionEndHandler: EventListener => Unit,
    deregisterVisibilityChangeHandler: EventListener => Unit,
    notifyHide: () => Unit,
    notifyShow: () => Unit,
    registerActionClickHandler: EventListener => Unit,
    registerCapturedBlurHandler: EventListener => Unit,
    registerCapturedInteractionHandler: (String, EventListener) => Unit,
    registerTransitionEndHandler: EventListener => Unit,
    registerVisibilityChangeHandler: EventListener => Unit,
    removeClass: String => Unit,
    setActionAriaHidden: () => Unit,
    setActionText: String => Unit,
    setAriaHidden: () => Unit,
    setFocus: () => Unit,
    setMessageText: String => Unit,
    unsetActionAriaHidden: () => Unit,
    unsetAriaHidden: () => Unit,
    visibilityIsHidden: () => Boolean
  ): MDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterActionClickHandler = js.Any.fromFunction1(deregisterActionClickHandler), deregisterCapturedBlurHandler = js.Any.fromFunction1(deregisterCapturedBlurHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterTransitionEndHandler = js.Any.fromFunction1(deregisterTransitionEndHandler), deregisterVisibilityChangeHandler = js.Any.fromFunction1(deregisterVisibilityChangeHandler), notifyHide = js.Any.fromFunction0(notifyHide), notifyShow = js.Any.fromFunction0(notifyShow), registerActionClickHandler = js.Any.fromFunction1(registerActionClickHandler), registerCapturedBlurHandler = js.Any.fromFunction1(registerCapturedBlurHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerTransitionEndHandler = js.Any.fromFunction1(registerTransitionEndHandler), registerVisibilityChangeHandler = js.Any.fromFunction1(registerVisibilityChangeHandler), removeClass = js.Any.fromFunction1(removeClass), setActionAriaHidden = js.Any.fromFunction0(setActionAriaHidden), setActionText = js.Any.fromFunction1(setActionText), setAriaHidden = js.Any.fromFunction0(setAriaHidden), setFocus = js.Any.fromFunction0(setFocus), setMessageText = js.Any.fromFunction1(setMessageText), unsetActionAriaHidden = js.Any.fromFunction0(unsetActionAriaHidden), unsetAriaHidden = js.Any.fromFunction0(unsetAriaHidden), visibilityIsHidden = js.Any.fromFunction0(visibilityIsHidden))
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
}

