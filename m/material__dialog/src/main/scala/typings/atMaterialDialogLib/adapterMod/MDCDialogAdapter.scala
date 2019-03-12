package typings
package atMaterialDialogLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCDialogAdapter extends js.Object {
  def addBodyClass(className: java.lang.String): scala.Unit
  def addClass(className: java.lang.String): scala.Unit
  def deregisterDocumentKeydownHandler(handler: stdLib.EventListener): scala.Unit
  def deregisterInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterSurfaceInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def deregisterTransitionEndHandler(handler: stdLib.EventListener): scala.Unit
  def eventTargetHasClass(target: stdLib.EventTarget, className: java.lang.String): scala.Boolean
  def isDialog(el: stdLib.Element): scala.Boolean
  def notifyAccept(): scala.Unit
  def notifyCancel(): scala.Unit
  def registerDocumentKeydownHandler(handler: stdLib.EventListener): scala.Unit
  def registerInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerSurfaceInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit
  def registerTransitionEndHandler(handler: stdLib.EventListener): scala.Unit
  def removeBodyClass(className: java.lang.String): scala.Unit
  def removeClass(className: java.lang.String): scala.Unit
  def trapFocusOnSurface(): scala.Unit
  def untrapFocusOnSurface(): scala.Unit
}

object MDCDialogAdapter {
  @scala.inline
  def apply(
    addBodyClass: java.lang.String => scala.Unit,
    addClass: java.lang.String => scala.Unit,
    deregisterDocumentKeydownHandler: stdLib.EventListener => scala.Unit,
    deregisterInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterSurfaceInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    deregisterTransitionEndHandler: stdLib.EventListener => scala.Unit,
    eventTargetHasClass: (stdLib.EventTarget, java.lang.String) => scala.Boolean,
    isDialog: stdLib.Element => scala.Boolean,
    notifyAccept: () => scala.Unit,
    notifyCancel: () => scala.Unit,
    registerDocumentKeydownHandler: stdLib.EventListener => scala.Unit,
    registerInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerSurfaceInteractionHandler: (java.lang.String, stdLib.EventListener) => scala.Unit,
    registerTransitionEndHandler: stdLib.EventListener => scala.Unit,
    removeBodyClass: java.lang.String => scala.Unit,
    removeClass: java.lang.String => scala.Unit,
    trapFocusOnSurface: () => scala.Unit,
    untrapFocusOnSurface: () => scala.Unit
  ): MDCDialogAdapter = {
    val __obj = js.Dynamic.literal(addBodyClass = js.Any.fromFunction1(addBodyClass), addClass = js.Any.fromFunction1(addClass), deregisterDocumentKeydownHandler = js.Any.fromFunction1(deregisterDocumentKeydownHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterSurfaceInteractionHandler = js.Any.fromFunction2(deregisterSurfaceInteractionHandler), deregisterTransitionEndHandler = js.Any.fromFunction1(deregisterTransitionEndHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), isDialog = js.Any.fromFunction1(isDialog), notifyAccept = js.Any.fromFunction0(notifyAccept), notifyCancel = js.Any.fromFunction0(notifyCancel), registerDocumentKeydownHandler = js.Any.fromFunction1(registerDocumentKeydownHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerSurfaceInteractionHandler = js.Any.fromFunction2(registerSurfaceInteractionHandler), registerTransitionEndHandler = js.Any.fromFunction1(registerTransitionEndHandler), removeBodyClass = js.Any.fromFunction1(removeBodyClass), removeClass = js.Any.fromFunction1(removeClass), trapFocusOnSurface = js.Any.fromFunction0(trapFocusOnSurface), untrapFocusOnSurface = js.Any.fromFunction0(untrapFocusOnSurface))
  
    __obj.asInstanceOf[MDCDialogAdapter]
  }
}

