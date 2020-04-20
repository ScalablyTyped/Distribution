package typings.materialDialog.adapterMod

import typings.std.Element
import typings.std.EventListener
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCDialogAdapter extends js.Object {
  def addBodyClass(className: String): Unit
  def addClass(className: String): Unit
  def deregisterDocumentKeydownHandler(handler: EventListener): Unit
  def deregisterInteractionHandler(evt: String, handler: EventListener): Unit
  def deregisterSurfaceInteractionHandler(evt: String, handler: EventListener): Unit
  def deregisterTransitionEndHandler(handler: EventListener): Unit
  def eventTargetHasClass(target: EventTarget, className: String): Boolean
  def isDialog(el: Element): Boolean
  def notifyAccept(): Unit
  def notifyCancel(): Unit
  def registerDocumentKeydownHandler(handler: EventListener): Unit
  def registerInteractionHandler(evt: String, handler: EventListener): Unit
  def registerSurfaceInteractionHandler(evt: String, handler: EventListener): Unit
  def registerTransitionEndHandler(handler: EventListener): Unit
  def removeBodyClass(className: String): Unit
  def removeClass(className: String): Unit
  def trapFocusOnSurface(): Unit
  def untrapFocusOnSurface(): Unit
}

object MDCDialogAdapter {
  @scala.inline
  def apply(
    addBodyClass: String => Unit,
    addClass: String => Unit,
    deregisterDocumentKeydownHandler: EventListener => Unit,
    deregisterInteractionHandler: (String, EventListener) => Unit,
    deregisterSurfaceInteractionHandler: (String, EventListener) => Unit,
    deregisterTransitionEndHandler: EventListener => Unit,
    eventTargetHasClass: (EventTarget, String) => Boolean,
    isDialog: Element => Boolean,
    notifyAccept: () => Unit,
    notifyCancel: () => Unit,
    registerDocumentKeydownHandler: EventListener => Unit,
    registerInteractionHandler: (String, EventListener) => Unit,
    registerSurfaceInteractionHandler: (String, EventListener) => Unit,
    registerTransitionEndHandler: EventListener => Unit,
    removeBodyClass: String => Unit,
    removeClass: String => Unit,
    trapFocusOnSurface: () => Unit,
    untrapFocusOnSurface: () => Unit
  ): MDCDialogAdapter = {
    val __obj = js.Dynamic.literal(addBodyClass = js.Any.fromFunction1(addBodyClass), addClass = js.Any.fromFunction1(addClass), deregisterDocumentKeydownHandler = js.Any.fromFunction1(deregisterDocumentKeydownHandler), deregisterInteractionHandler = js.Any.fromFunction2(deregisterInteractionHandler), deregisterSurfaceInteractionHandler = js.Any.fromFunction2(deregisterSurfaceInteractionHandler), deregisterTransitionEndHandler = js.Any.fromFunction1(deregisterTransitionEndHandler), eventTargetHasClass = js.Any.fromFunction2(eventTargetHasClass), isDialog = js.Any.fromFunction1(isDialog), notifyAccept = js.Any.fromFunction0(notifyAccept), notifyCancel = js.Any.fromFunction0(notifyCancel), registerDocumentKeydownHandler = js.Any.fromFunction1(registerDocumentKeydownHandler), registerInteractionHandler = js.Any.fromFunction2(registerInteractionHandler), registerSurfaceInteractionHandler = js.Any.fromFunction2(registerSurfaceInteractionHandler), registerTransitionEndHandler = js.Any.fromFunction1(registerTransitionEndHandler), removeBodyClass = js.Any.fromFunction1(removeBodyClass), removeClass = js.Any.fromFunction1(removeClass), trapFocusOnSurface = js.Any.fromFunction0(trapFocusOnSurface), untrapFocusOnSurface = js.Any.fromFunction0(untrapFocusOnSurface))
    __obj.asInstanceOf[MDCDialogAdapter]
  }
}

