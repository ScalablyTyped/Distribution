package typings
package atMaterialSnackbarLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSnackbarAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit
  def deregisterActionClickHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterCapturedBlurHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterCapturedInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterTransitionEndHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterVisibilityChangeHandler(handler: stdLib.EventListener): scala.Unit
  def notifyHide(): scala.Unit
  def notifyShow(): scala.Unit
  def registerActionClickHandler(handler: stdLib.EventListener): scala.Unit
  def registerCapturedBlurHandler(handler: stdLib.EventListener): scala.Unit
  def registerCapturedInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerTransitionEndHandler(handler: stdLib.EventListener): scala.Unit
  def registerVisibilityChangeHandler(handler: stdLib.EventListener): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def setActionAriaHidden(): scala.Unit
  def setActionText(actionText: java.lang.String): scala.Unit
  def setAriaHidden(): scala.Unit
  def setFocus(): scala.Unit
  def setMessageText(message: java.lang.String): scala.Unit
  def unsetActionAriaHidden(): scala.Unit
  def unsetAriaHidden(): scala.Unit
  def visibilityIsHidden(): scala.Boolean
}

object MDCSnackbarAdapter {
  @scala.inline
  def apply(
    addClass: java.lang.String => scala.Unit,
    deregisterActionClickHandler: stdLib.EventListener => scala.Unit,
    deregisterCapturedBlurHandler: stdLib.EventListener => scala.Unit,
    deregisterCapturedInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterTransitionEndHandler: stdLib.EventListener => scala.Unit,
    deregisterVisibilityChangeHandler: stdLib.EventListener => scala.Unit,
    notifyHide: () => scala.Unit,
    notifyShow: () => scala.Unit,
    registerActionClickHandler: stdLib.EventListener => scala.Unit,
    registerCapturedBlurHandler: stdLib.EventListener => scala.Unit,
    registerCapturedInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerTransitionEndHandler: stdLib.EventListener => scala.Unit,
    registerVisibilityChangeHandler: stdLib.EventListener => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    setActionAriaHidden: () => scala.Unit,
    setActionText: java.lang.String => scala.Unit,
    setAriaHidden: () => scala.Unit,
    setFocus: () => scala.Unit,
    setMessageText: java.lang.String => scala.Unit,
    unsetActionAriaHidden: () => scala.Unit,
    unsetAriaHidden: () => scala.Unit,
    visibilityIsHidden: () => scala.Boolean
  ): MDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), deregisterActionClickHandler = js.Any.fromFunction1(deregisterActionClickHandler), deregisterCapturedBlurHandler = js.Any.fromFunction1(deregisterCapturedBlurHandler), deregisterCapturedInteractionHandler = js.Any.fromFunction2(deregisterCapturedInteractionHandler), deregisterTransitionEndHandler = js.Any.fromFunction1(deregisterTransitionEndHandler), deregisterVisibilityChangeHandler = js.Any.fromFunction1(deregisterVisibilityChangeHandler), notifyHide = js.Any.fromFunction0(notifyHide), notifyShow = js.Any.fromFunction0(notifyShow), registerActionClickHandler = js.Any.fromFunction1(registerActionClickHandler), registerCapturedBlurHandler = js.Any.fromFunction1(registerCapturedBlurHandler), registerCapturedInteractionHandler = js.Any.fromFunction2(registerCapturedInteractionHandler), registerTransitionEndHandler = js.Any.fromFunction1(registerTransitionEndHandler), registerVisibilityChangeHandler = js.Any.fromFunction1(registerVisibilityChangeHandler), removeClass = js.Any.fromFunction1(removeClass), setActionAriaHidden = js.Any.fromFunction0(setActionAriaHidden), setActionText = js.Any.fromFunction1(setActionText), setAriaHidden = js.Any.fromFunction0(setAriaHidden), setFocus = js.Any.fromFunction0(setFocus), setMessageText = js.Any.fromFunction1(setMessageText), unsetActionAriaHidden = js.Any.fromFunction0(unsetActionAriaHidden), unsetAriaHidden = js.Any.fromFunction0(unsetAriaHidden), visibilityIsHidden = js.Any.fromFunction0(visibilityIsHidden))
  
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
}

