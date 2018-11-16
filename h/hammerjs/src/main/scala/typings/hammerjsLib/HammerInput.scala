package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HammerInput")
@js.native
class HammerInput protected () extends js.Object {
  def this(manager: HammerManager, callback: js.Function) = this()
  /** Angle moved. */
  var angle: scala.Double = js.native
  /** Center position for multi-touch, or just the single pointer. */
  var center: HammerPoint = js.native
  /** Array with all new/moved/lost pointers. */
  var changedPointers: js.Array[_] = js.native
  /** Total time in ms since the first input. */
  var deltaTime: scala.Double = js.native
  /** Movement of the X axis. */
  var deltaX: scala.Double = js.native
  /** Movement of the Y axis. */
  var deltaY: scala.Double = js.native
  /** Direction moved. Matches the DIRECTION constants. */
  var direction: scala.Double = js.native
  /** Distance moved. */
  var distance: scala.Double = js.native
  /** Event type, matches the INPUT constants. */
  var eventType: scala.Double = js.native
  /** true when the final (last) input. */
  var isFinal: scala.Boolean = js.native
  /** true when the first input. */
  var isFirst: scala.Boolean = js.native
  /** Direction moved from it's starting point. Matches the DIRECTION constants. */
  var offsetDirection: scala.Double = js.native
  /** Primary pointer type, could be touch, mouse, pen or kinect. */
  var pointerType: java.lang.String = js.native
  /** Array with all pointers, including the ended pointers (touchend, mouseup). */
  var pointers: js.Array[_] = js.native
  /** Reference to the srcEvent.preventDefault() method. Only for experts! */
  var preventDefault: js.Function = js.native
  /** Rotation that has been done when multi-touch. 0 on a single touch. */
  var rotation: scala.Double = js.native
  /** Scaling that has been done when multi-touch. 1 on a single touch. */
  var scale: scala.Double = js.native
  /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
  var srcEvent: stdLib.TouchEvent | stdLib.MouseEvent | stdLib.PointerEvent = js.native
  /** Target that received the event. */
  var target: stdLib.HTMLElement = js.native
  /** Name of the event. Like panstart. */
  var `type`: java.lang.String = js.native
  /** Highest velocityX/Y value. */
  var velocity: scala.Double = js.native
  /** Velocity on the X axis, in px/ms. */
  var velocityX: scala.Double = js.native
  /** Velocity on the Y axis, in px/ms */
  var velocityY: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def handler(): scala.Unit = js.native
  def init(): scala.Unit = js.native
}

