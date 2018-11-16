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

