package typings
package atMaterialRippleLib.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCRippleAdapter extends js.Object {
  def addClass(className: java.lang.String): scala.Unit = js.native
  def browserSupportsCssVars(): scala.Boolean = js.native
  def computeBoundingRect(): stdLib.ClientRect = js.native
  def containsEventTarget(target: stdLib.EventTarget): scala.Unit = js.native
  def deregisterDocumentInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def deregisterInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def deregisterResizeHandler(handler: stdLib.EventListener): scala.Unit = js.native
  def getWindowPageOffset(): atMaterialRippleLib.Anon_X = js.native
  def isSurfaceActive(): scala.Boolean = js.native
  def isSurfaceDisabled(): scala.Boolean = js.native
  def isUnbounded(): scala.Boolean = js.native
  def registerDocumentInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def registerInteractionHandler(evtType: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def registerResizeHandler(handler: stdLib.EventListener): scala.Unit = js.native
  def removeClass(className: java.lang.String): scala.Unit = js.native
  def updateCssVariable(varName: java.lang.String): scala.Unit = js.native
  def updateCssVariable(varName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def updateCssVariable(varName: java.lang.String, value: scala.Double): scala.Unit = js.native
}

