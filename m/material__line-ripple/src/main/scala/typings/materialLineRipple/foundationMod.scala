package typings.materialLineRipple

import typings.materialLineRipple.adapterMod.MDCLineRippleAdapter
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/line-ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCLineRippleFoundation
    extends typings.materialBase.foundationMod.default[MDCLineRippleAdapter] {
    /**
      * Activates the line ripple
      */
    def activate(): Unit = js.native
    /**
      * Deactivates the line ripple
      */
    def deactivate(): Unit = js.native
    /**
      * Handles a transition end event
      */
    def handleTransitionEnd(evt: Event_): Unit = js.native
    /**
      * Sets the center of the ripple animation to the given X coordinate.
      */
    def setRippleCenter(xCoordinate: Double): Unit = js.native
  }
  
  @js.native
  class default () extends MDCLineRippleFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typings.materialLineRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
}

