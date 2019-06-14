package typings
package heremapsLib.HNs.mapeventsNs.PointerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

/**
  * Types of a button
  */
@JSGlobal("H.mapevents.Pointer.Button")
@js.native
object Button extends js.Object {
  /** Left mouse button or touch contact or pen contact */
  @js.native
  sealed trait LEFT
    extends heremapsLib.HNs.mapeventsNs.PointerNs.Button
  
  /** Middle mouse button */
  @js.native
  sealed trait MIDDLE
    extends heremapsLib.HNs.mapeventsNs.PointerNs.Button
  
  /** No button */
  @js.native
  sealed trait NONE
    extends heremapsLib.HNs.mapeventsNs.PointerNs.Button
  
  /** Right mouse button or Pen barrel button */
  @js.native
  sealed trait RIGHT
    extends heremapsLib.HNs.mapeventsNs.PointerNs.Button
  
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val MIDDLE: MIDDLE with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.mapeventsNs.PointerNs.Button with scala.Double] = js.native
}

