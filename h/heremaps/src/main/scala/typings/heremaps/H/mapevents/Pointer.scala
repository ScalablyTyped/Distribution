package typings.heremaps.H.mapevents

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.Map
import typings.heremaps.H.map.Object
import typings.heremaps.H.mapevents.Pointer.Button
import typings.heremaps.H.mapevents.Pointer.Button.LEFT
import typings.heremaps.H.mapevents.Pointer.Button.MIDDLE
import typings.heremaps.H.mapevents.Pointer.Button.NONE
import typings.heremaps.H.mapevents.Pointer.Button.RIGHT
import typings.heremaps.H.math.BitMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class representing pointer on the map surface. A pointer in platform specific definition would mean either mouse, touch, pen or any pointing device which can trigger browser events.
  * @property viewportX {number} - X coordinate on the map's viewport
  * @property viewportY {number} - Y coordinate on the map's viewport
  * @property target {(H.map.Object | H.Map)} - Map object directly under the pointer. Can be null if if pointer is out of the map viewport
  * @property id {number} - Pointer unique identifier.
  * @property type {string} - Pointer type can be: 'mouse', 'touch' or 'pen'
  * @property dragTarget {(H.map.Object | H.Map)} - Object which is currently dragged by the pointer
  * @property button {H.mapevents.Pointer.Button} - Indicates which pointer device button has changed.
  */
@JSGlobal("H.mapevents.Pointer")
@js.native
class Pointer protected () extends js.Object {
  /**
    * Constructor
    * @param viewportX {number} - pointer position on x-axis
    * @param viewportY {number} - pointer position on y-axis
    * @param id {number} - unique pointer identifier among currently available pointers
    * @param type {string} - type of pointer can be i.e 'mouse', 'touch'. 'pen'
    * @param opt_button {H.mapevents.Pointer.Button=} - Indicates which pointer device button has changed.
    * @param opt_buttons {number=} - Indicates which pointer device buttons are being pressed, expressed as a bitmask. Uses the same values, as "buttons" in Pointer Events spec.
    */
  def this(viewportX: Double, viewportY: Double, id: Double, `type`: String) = this()
  def this(viewportX: Double, viewportY: Double, id: Double, `type`: String, opt_button: Button) = this()
  def this(
    viewportX: Double,
    viewportY: Double,
    id: Double,
    `type`: String,
    opt_button: Button,
    opt_buttons: BitMask
  ) = this()
  var button: Button = js.native
  var dragTarget: Object | Map = js.native
  var id: Double = js.native
  var target: Object | Map = js.native
  var `type`: String = js.native
  var viewportX: Double = js.native
  var viewportY: Double = js.native
}

@JSGlobal("H.mapevents.Pointer")
@js.native
object Pointer extends js.Object {
  @js.native
  sealed trait Button extends js.Object
  
  /**
    * Types of a button
    */
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Button with Double] = js.native
    /* 1 */ @js.native
    object LEFT extends TopLevel[LEFT with Double]
    
    /* 2 */ @js.native
    object MIDDLE extends TopLevel[MIDDLE with Double]
    
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    /* 3 */ @js.native
    object RIGHT extends TopLevel[RIGHT with Double]
    
  }
  
  /**
    * Indicates which pointer device buttons are being pressed, expressed as a bitmask. Bit values are:
    *
    *   - 0: No button pressed
    *   - 1: Left mouse button pressed, or Touch contact or Pen contact
    *   - 2: Right mouse button pressed, or Pen contact with barrel button pressed
    *   - 4: Middle mouse button pressed
    */
  // TODO not sure this is the right interpretation of the docs
  type Buttons = BitMask
}

