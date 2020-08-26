package typings.hammerjs

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerInput extends js.Object {
  /** Angle moved. */
  var angle: Double = js.native
  /** Center position for multi-touch, or just the single pointer. */
  var center: HammerPoint = js.native
  /** Array with all new/moved/lost pointers. */
  var changedPointers: js.Array[_] = js.native
  /** Total time in ms since the first input. */
  var deltaTime: Double = js.native
  /** Movement of the X axis. */
  var deltaX: Double = js.native
  /** Movement of the Y axis. */
  var deltaY: Double = js.native
  /** Direction moved. Matches the DIRECTION constants. */
  var direction: Double = js.native
  /** Distance moved. */
  var distance: Double = js.native
  /** Event type, matches the INPUT constants. */
  var eventType: Double = js.native
  /** true when the final (last) input. */
  var isFinal: Boolean = js.native
  /** true when the first input. */
  var isFirst: Boolean = js.native
  /** Direction moved from it's starting point. Matches the DIRECTION constants. */
  var offsetDirection: Double = js.native
  /** Primary pointer type, could be touch, mouse, pen or kinect. */
  var pointerType: String = js.native
  /** Array with all pointers, including the ended pointers (touchend, mouseup). */
  var pointers: js.Array[_] = js.native
  /** Reference to the srcEvent.preventDefault() method. Only for experts! */
  var preventDefault: js.Function = js.native
  /** Rotation that has been done when multi-touch. 0 on a single touch. */
  var rotation: Double = js.native
  /** Scaling that has been done when multi-touch. 1 on a single touch. */
  var scale: Double = js.native
  /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
  var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
  /** Target that received the event. */
  var target: HTMLElement = js.native
  /** Name of the event. Like panstart. */
  var `type`: String = js.native
  /** Highest velocityX/Y value. */
  var velocity: Double = js.native
  /** Velocity on the X axis, in px/ms. */
  var velocityX: Double = js.native
  /** Velocity on the Y axis, in px/ms */
  var velocityY: Double = js.native
  def destroy(): Unit = js.native
  def handler(): Unit = js.native
  def init(): Unit = js.native
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
  @scala.inline
  implicit class HammerInputOps[Self <: HammerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: HammerPoint): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedPointersVarargs(value: js.Any*): Self = this.set("changedPointers", js.Array(value :_*))
    @scala.inline
    def setChangedPointers(value: js.Array[_]): Self = this.set("changedPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaTime(value: Double): Self = this.set("deltaTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: Double): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandler(value: () => Unit): Self = this.set("handler", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFinal(value: Boolean): Self = this.set("isFinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFirst(value: Boolean): Self = this.set("isFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetDirection(value: Double): Self = this.set("offsetDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerType(value: String): Self = this.set("pointerType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointersVarargs(value: js.Any*): Self = this.set("pointers", js.Array(value :_*))
    @scala.inline
    def setPointers(value: js.Array[_]): Self = this.set("pointers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcEvent(value: TouchEvent | MouseEvent | PointerEvent): Self = this.set("srcEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: Double): Self = this.set("velocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityX(value: Double): Self = this.set("velocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityY(value: Double): Self = this.set("velocityY", value.asInstanceOf[js.Any])
  }
  
}

