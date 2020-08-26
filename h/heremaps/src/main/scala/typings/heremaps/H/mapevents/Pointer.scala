package typings.heremaps.H.mapevents

import typings.heremaps.H.Map_
import typings.heremaps.H.map.Object
import typings.heremaps.H.mapevents.Pointer.Button
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
@js.native
trait Pointer extends js.Object {
  var button: Button = js.native
  var dragTarget: Object | Map_ = js.native
  var id: Double = js.native
  var target: Object | Map_ = js.native
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

