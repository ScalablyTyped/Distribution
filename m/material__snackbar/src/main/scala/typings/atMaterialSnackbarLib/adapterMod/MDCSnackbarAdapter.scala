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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(addClass)
    __obj.updateDynamic("deregisterActionClickHandler")(deregisterActionClickHandler)
    __obj.updateDynamic("deregisterCapturedBlurHandler")(deregisterCapturedBlurHandler)
    __obj.updateDynamic("deregisterCapturedInteractionHandler")(deregisterCapturedInteractionHandler)
    __obj.updateDynamic("deregisterTransitionEndHandler")(deregisterTransitionEndHandler)
    __obj.updateDynamic("deregisterVisibilityChangeHandler")(deregisterVisibilityChangeHandler)
    __obj.updateDynamic("notifyHide")(notifyHide)
    __obj.updateDynamic("notifyShow")(notifyShow)
    __obj.updateDynamic("registerActionClickHandler")(registerActionClickHandler)
    __obj.updateDynamic("registerCapturedBlurHandler")(registerCapturedBlurHandler)
    __obj.updateDynamic("registerCapturedInteractionHandler")(registerCapturedInteractionHandler)
    __obj.updateDynamic("registerTransitionEndHandler")(registerTransitionEndHandler)
    __obj.updateDynamic("registerVisibilityChangeHandler")(registerVisibilityChangeHandler)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("setActionAriaHidden")(setActionAriaHidden)
    __obj.updateDynamic("setActionText")(setActionText)
    __obj.updateDynamic("setAriaHidden")(setAriaHidden)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setMessageText")(setMessageText)
    __obj.updateDynamic("unsetActionAriaHidden")(unsetActionAriaHidden)
    __obj.updateDynamic("unsetAriaHidden")(unsetAriaHidden)
    __obj.updateDynamic("visibilityIsHidden")(visibilityIsHidden)
    __obj.asInstanceOf[MDCSnackbarAdapter]
  }
}

