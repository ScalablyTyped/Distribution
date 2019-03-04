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
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterActionClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterCapturedBlurHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterCapturedInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterTransitionEndHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterVisibilityChangeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    notifyHide: js.Function0[scala.Unit],
    notifyShow: js.Function0[scala.Unit],
    registerActionClickHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerCapturedBlurHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerCapturedInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerTransitionEndHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerVisibilityChangeHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    setActionAriaHidden: js.Function0[scala.Unit],
    setActionText: js.Function1[java.lang.String, scala.Unit],
    setAriaHidden: js.Function0[scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setMessageText: js.Function1[java.lang.String, scala.Unit],
    unsetActionAriaHidden: js.Function0[scala.Unit],
    unsetAriaHidden: js.Function0[scala.Unit],
    visibilityIsHidden: js.Function0[scala.Boolean]
  ): MDCSnackbarAdapter = {
    val __obj = js.Dynamic.literal(addClass = addClass, deregisterActionClickHandler = deregisterActionClickHandler, deregisterCapturedBlurHandler = deregisterCapturedBlurHandler, deregisterCapturedInteractionHandler = deregisterCapturedInteractionHandler, deregisterTransitionEndHandler = deregisterTransitionEndHandler, deregisterVisibilityChangeHandler = deregisterVisibilityChangeHandler, notifyHide = notifyHide, notifyShow = notifyShow, registerActionClickHandler = registerActionClickHandler, registerCapturedBlurHandler = registerCapturedBlurHandler, registerCapturedInteractionHandler = registerCapturedInteractionHandler, registerTransitionEndHandler = registerTransitionEndHandler, registerVisibilityChangeHandler = registerVisibilityChangeHandler, removeClass = removeClass, setActionAriaHidden = setActionAriaHidden, setActionText = setActionText, setAriaHidden = setAriaHidden, setFocus = setFocus, setMessageText = setMessageText, unsetActionAriaHidden = unsetActionAriaHidden, unsetAriaHidden = unsetAriaHidden, visibilityIsHidden = visibilityIsHidden)
  
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
}

