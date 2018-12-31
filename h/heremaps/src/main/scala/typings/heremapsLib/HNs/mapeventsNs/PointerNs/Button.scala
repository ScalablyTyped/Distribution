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
  
  val LEFT: LEFT with java.lang.String = js.native
  val MIDDLE: MIDDLE with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val RIGHT: RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.mapeventsNs.PointerNs.Button with java.lang.String] = js.native
}

