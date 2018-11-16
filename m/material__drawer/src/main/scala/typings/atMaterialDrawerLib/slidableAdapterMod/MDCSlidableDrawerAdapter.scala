package typings
package atMaterialDrawerLib.slidableAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCSlidableDrawerAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit = js.native
  def deregisterDocumentKeydownHandler(handler: stdLib.EventListener): scala.Unit = js.native
  def deregisterDrawerInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def deregisterInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def deregisterTransitionEndHandler(handler: stdLib.EventListener): scala.Unit = js.native
  def getDrawerWidth(): scala.Double = js.native
  def getFocusableElements(): stdLib.NodeList = js.native
  def hasClass(className: java.lang.String): scala.Unit = js.native
  def hasNecessaryDom(): scala.Boolean = js.native
  def isRtl(): scala.Boolean = js.native
  def makeElementUntabbable(el: stdLib.Element): scala.Unit = js.native
  def notifyClose(): scala.Unit = js.native
  def notifyOpen(): scala.Unit = js.native
  def registerDocumentKeydownHandler(handler: stdLib.EventListener): scala.Unit = js.native
  def registerDrawerInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def registerInteractionHandler(evt: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def registerTransitionEndHandler(handler: stdLib.EventListener): scala.Unit = js.native
  def removeClass(className: java.lang.String): scala.Unit = js.native
  def restoreElementTabState(el: stdLib.Element): scala.Unit = js.native
  def saveElementTabState(el: stdLib.Element): scala.Unit = js.native
  def setTranslateX(): scala.Unit = js.native
  def setTranslateX(value: scala.Double): scala.Unit = js.native
}

