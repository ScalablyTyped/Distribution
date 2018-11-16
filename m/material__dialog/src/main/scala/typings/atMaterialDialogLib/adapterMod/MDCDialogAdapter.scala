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

