package typings
package heremapsLib.HNs.mapeventsNs

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
  def this(viewportX: scala.Double, viewportY: scala.Double, id: scala.Double, `type`: java.lang.String) = this()
  def this(viewportX: scala.Double, viewportY: scala.Double, id: scala.Double, `type`: java.lang.String, opt_button: heremapsLib.HNs.mapeventsNs.PointerNs.Button) = this()
  def this(viewportX: scala.Double, viewportY: scala.Double, id: scala.Double, `type`: java.lang.String, opt_button: heremapsLib.HNs.mapeventsNs.PointerNs.Button, opt_buttons: heremapsLib.HNs.mathNs.BitMask) = this()
}

/* static members */
@JSGlobal("H.mapevents.Pointer")
@js.native
object Pointer extends js.Object {
  var button: heremapsLib.HNs.mapeventsNs.PointerNs.Button = js.native
  var dragTarget: heremapsLib.HNs.mapNs.Object | heremapsLib.HNs.Map = js.native
  var id: scala.Double = js.native
  var target: heremapsLib.HNs.mapNs.Object | heremapsLib.HNs.Map = js.native
  var `type`: java.lang.String = js.native
  var viewportX: scala.Double = js.native
  var viewportY: scala.Double = js.native
}

