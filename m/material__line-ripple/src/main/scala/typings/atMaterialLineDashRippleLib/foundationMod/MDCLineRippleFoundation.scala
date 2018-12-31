package typings
package atMaterialLineDashRippleLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDCLineRippleFoundation
  extends atMaterialBaseLib.foundationMod.default[atMaterialLineDashRippleLib.adapterMod.MDCLineRippleAdapter] {
  /**
    * Activates the line ripple
    */
  def activate(): scala.Unit = js.native
  /**
    * Deactivates the line ripple
    */
  def deactivate(): scala.Unit = js.native
  /**
    * Handles a transition end event
    */
  def handleTransitionEnd(evt: stdLib.Event): scala.Unit = js.native
  /**
    * Sets the center of the ripple animation to the given X coordinate.
    */
  def setRippleCenter(xCoordinate: scala.Double): scala.Unit = js.native
}

