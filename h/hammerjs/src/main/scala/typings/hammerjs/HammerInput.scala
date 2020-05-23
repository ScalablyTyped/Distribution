package typings.hammerjs

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HammerInput extends js.Object {
  /** Angle moved. */
  var angle: Double
  /** Center position for multi-touch, or just the single pointer. */
  var center: HammerPoint
  /** Array with all new/moved/lost pointers. */
  var changedPointers: js.Array[_]
  /** Total time in ms since the first input. */
  var deltaTime: Double
  /** Movement of the X axis. */
  var deltaX: Double
  /** Movement of the Y axis. */
  var deltaY: Double
  /** Direction moved. Matches the DIRECTION constants. */
  var direction: Double
  /** Distance moved. */
  var distance: Double
  /** Event type, matches the INPUT constants. */
  var eventType: Double
  /** true when the final (last) input. */
  var isFinal: Boolean
  /** true when the first input. */
  var isFirst: Boolean
  /** Direction moved from it's starting point. Matches the DIRECTION constants. */
  var offsetDirection: Double
  /** Primary pointer type, could be touch, mouse, pen or kinect. */
  var pointerType: String
  /** Array with all pointers, including the ended pointers (touchend, mouseup). */
  var pointers: js.Array[_]
  /** Reference to the srcEvent.preventDefault() method. Only for experts! */
  var preventDefault: js.Function
  /** Rotation that has been done when multi-touch. 0 on a single touch. */
  var rotation: Double
  /** Scaling that has been done when multi-touch. 1 on a single touch. */
  var scale: Double
  /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
  var srcEvent: TouchEvent | MouseEvent | PointerEvent
  /** Target that received the event. */
  var target: HTMLElement
  /** Name of the event. Like panstart. */
  var `type`: String
  /** Highest velocityX/Y value. */
  var velocity: Double
  /** Velocity on the X axis, in px/ms. */
  var velocityX: Double
  /** Velocity on the Y axis, in px/ms */
  var velocityY: Double
  def destroy(): Unit
  def handler(): Unit
  def init(): Unit
}

object HammerInput {
  @scala.inline
  def apply(
    angle: Double,
    center: HammerPoint,
    changedPointers: js.Array[_],
    deltaTime: Double,
    deltaX: Double,
    deltaY: Double,
    destroy: () => Unit,
    direction: Double,
    distance: Double,
    eventType: Double,
    handler: () => Unit,
    init: () => Unit,
    isFinal: Boolean,
    isFirst: Boolean,
    offsetDirection: Double,
    pointerType: String,
    pointers: js.Array[_],
    preventDefault: js.Function,
    rotation: Double,
    scale: Double,
    srcEvent: TouchEvent | MouseEvent | PointerEvent,
    target: HTMLElement,
    `type`: String,
    velocity: Double,
    velocityX: Double,
    velocityY: Double
  ): HammerInput = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], changedPointers = changedPointers.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], handler = js.Any.fromFunction0(handler), init = js.Any.fromFunction0(init), isFinal = isFinal.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], offsetDirection = offsetDirection.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], srcEvent = srcEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerInput]
  }
}

