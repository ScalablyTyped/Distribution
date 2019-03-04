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
    addBodyClass: js.Function1[java.lang.String, scala.Unit],
    addClass: js.Function1[java.lang.String, scala.Unit],
    deregisterDocumentKeydownHandler: js.Function1[stdLib.EventListener, scala.Unit],
    deregisterInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterSurfaceInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    deregisterTransitionEndHandler: js.Function1[stdLib.EventListener, scala.Unit],
    eventTargetHasClass: js.Function2[stdLib.EventTarget, java.lang.String, scala.Boolean],
    isDialog: js.Function1[stdLib.Element, scala.Boolean],
    notifyAccept: js.Function0[scala.Unit],
    notifyCancel: js.Function0[scala.Unit],
    registerDocumentKeydownHandler: js.Function1[stdLib.EventListener, scala.Unit],
    registerInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerSurfaceInteractionHandler: js.Function2[java.lang.String, stdLib.EventListener, scala.Unit],
    registerTransitionEndHandler: js.Function1[stdLib.EventListener, scala.Unit],
    removeBodyClass: js.Function1[java.lang.String, scala.Unit],
    removeClass: js.Function1[java.lang.String, scala.Unit],
    trapFocusOnSurface: js.Function0[scala.Unit],
    untrapFocusOnSurface: js.Function0[scala.Unit]
  ): MDCDialogAdapter = {
    val __obj = js.Dynamic.literal(addBodyClass = addBodyClass, addClass = addClass, deregisterDocumentKeydownHandler = deregisterDocumentKeydownHandler, deregisterInteractionHandler = deregisterInteractionHandler, deregisterSurfaceInteractionHandler = deregisterSurfaceInteractionHandler, deregisterTransitionEndHandler = deregisterTransitionEndHandler, eventTargetHasClass = eventTargetHasClass, isDialog = isDialog, notifyAccept = notifyAccept, notifyCancel = notifyCancel, registerDocumentKeydownHandler = registerDocumentKeydownHandler, registerInteractionHandler = registerInteractionHandler, registerSurfaceInteractionHandler = registerSurfaceInteractionHandler, registerTransitionEndHandler = registerTransitionEndHandler, removeBodyClass = removeBodyClass, removeClass = removeClass, trapFocusOnSurface = trapFocusOnSurface, untrapFocusOnSurface = untrapFocusOnSurface)
  
    __obj.asInstanceOf[MDCDialogAdapter]
  }
}

