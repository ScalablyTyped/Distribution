package typings.heremaps.HNs.mapeventsNs.PointerNs

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
  sealed trait LEFT extends Button
  
  /** Middle mouse button */
  @js.native
  sealed trait MIDDLE extends Button
  
  /** No button */
  @js.native
  sealed trait NONE extends Button
  
  /** Right mouse button or Pen barrel button */
  @js.native
  sealed trait RIGHT extends Button
  
  /* 1 */ val LEFT: typings.heremaps.HNs.mapeventsNs.PointerNs.Button.LEFT with Double = js.native
  /* 2 */ val MIDDLE: typings.heremaps.HNs.mapeventsNs.PointerNs.Button.MIDDLE with Double = js.native
  /* 0 */ val NONE: typings.heremaps.HNs.mapeventsNs.PointerNs.Button.NONE with Double = js.native
  /* 3 */ val RIGHT: typings.heremaps.HNs.mapeventsNs.PointerNs.Button.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
}

