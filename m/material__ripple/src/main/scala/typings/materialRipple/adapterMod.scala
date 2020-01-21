package typings.materialRipple

import typings.std.ClientRect
import typings.std.EventListener
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/adapter", JSImport.Namespace)
@js.native
object adapterMod extends js.Object {
  @js.native
  trait MDCRippleAdapter extends js.Object {
    def addClass(className: String): Unit = js.native
    def browserSupportsCssVars(): Boolean = js.native
    def computeBoundingRect(): ClientRect = js.native
    def containsEventTarget(target: EventTarget): Unit = js.native
    def deregisterDocumentInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
    def deregisterInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
    def deregisterResizeHandler(handler: EventListener): Unit = js.native
    def getWindowPageOffset(): AnonX = js.native
    def isSurfaceActive(): Boolean = js.native
    def isSurfaceDisabled(): Boolean = js.native
    def isUnbounded(): Boolean = js.native
    def registerDocumentInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
    def registerInteractionHandler(evtType: String, handler: EventListener): Unit = js.native
    def registerResizeHandler(handler: EventListener): Unit = js.native
    def removeClass(className: String): Unit = js.native
    def updateCssVariable(varName: String): Unit = js.native
    def updateCssVariable(varName: String, value: String): Unit = js.native
    def updateCssVariable(varName: String, value: Double): Unit = js.native
  }
  
}

