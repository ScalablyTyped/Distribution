package typings.atMaterialLineDashRipple.foundationMod

import typings.atMaterialLineDashRipple.adapterMod.MDCLineRippleAdapter
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCLineRippleFoundation
  extends typings.atMaterialBase.foundationMod.default[MDCLineRippleAdapter] {
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
  def handleTransitionEnd(evt: Event): Unit = js.native
  /**
    * Sets the center of the ripple animation to the given X coordinate.
    */
  def setRippleCenter(xCoordinate: Double): Unit = js.native
}

