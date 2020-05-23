package typings.hammerjs

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Hammer protected () extends HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  
  @js.native
  class HammerInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    /** Angle moved. */
    /* CompleteClass */
    override var angle: Double = js.native
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    override var center: HammerPoint = js.native
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    override var changedPointers: js.Array[_] = js.native
    /** Total time in ms since the first input. */
    /* CompleteClass */
    override var deltaTime: Double = js.native
    /** Movement of the X axis. */
    /* CompleteClass */
    override var deltaX: Double = js.native
    /** Movement of the Y axis. */
    /* CompleteClass */
    override var deltaY: Double = js.native
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var direction: Double = js.native
    /** Distance moved. */
    /* CompleteClass */
    override var distance: Double = js.native
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    override var eventType: Double = js.native
    /** true when the final (last) input. */
    /* CompleteClass */
    override var isFinal: Boolean = js.native
    /** true when the first input. */
    /* CompleteClass */
    override var isFirst: Boolean = js.native
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var offsetDirection: Double = js.native
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    override var pointerType: String = js.native
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    override var pointers: js.Array[_] = js.native
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    override var preventDefault: js.Function = js.native
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    override var rotation: Double = js.native
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    override var scale: Double = js.native
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    override var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    /** Target that received the event. */
    /* CompleteClass */
    override var target: HTMLElement = js.native
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    override var velocity: Double = js.native
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    override var velocityX: Double = js.native
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    override var velocityY: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def handler(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  class MouseInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    /** Angle moved. */
    /* CompleteClass */
    override var angle: Double = js.native
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    override var center: HammerPoint = js.native
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    override var changedPointers: js.Array[_] = js.native
    /** Total time in ms since the first input. */
    /* CompleteClass */
    override var deltaTime: Double = js.native
    /** Movement of the X axis. */
    /* CompleteClass */
    override var deltaX: Double = js.native
    /** Movement of the Y axis. */
    /* CompleteClass */
    override var deltaY: Double = js.native
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var direction: Double = js.native
    /** Distance moved. */
    /* CompleteClass */
    override var distance: Double = js.native
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    override var eventType: Double = js.native
    /** true when the final (last) input. */
    /* CompleteClass */
    override var isFinal: Boolean = js.native
    /** true when the first input. */
    /* CompleteClass */
    override var isFirst: Boolean = js.native
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var offsetDirection: Double = js.native
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    override var pointerType: String = js.native
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    override var pointers: js.Array[_] = js.native
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    override var preventDefault: js.Function = js.native
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    override var rotation: Double = js.native
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    override var scale: Double = js.native
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    override var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    /** Target that received the event. */
    /* CompleteClass */
    override var target: HTMLElement = js.native
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    override var velocity: Double = js.native
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    override var velocityX: Double = js.native
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    override var velocityY: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def handler(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  class PointerEventInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    /** Angle moved. */
    /* CompleteClass */
    override var angle: Double = js.native
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    override var center: HammerPoint = js.native
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    override var changedPointers: js.Array[_] = js.native
    /** Total time in ms since the first input. */
    /* CompleteClass */
    override var deltaTime: Double = js.native
    /** Movement of the X axis. */
    /* CompleteClass */
    override var deltaX: Double = js.native
    /** Movement of the Y axis. */
    /* CompleteClass */
    override var deltaY: Double = js.native
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var direction: Double = js.native
    /** Distance moved. */
    /* CompleteClass */
    override var distance: Double = js.native
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    override var eventType: Double = js.native
    /** true when the final (last) input. */
    /* CompleteClass */
    override var isFinal: Boolean = js.native
    /** true when the first input. */
    /* CompleteClass */
    override var isFirst: Boolean = js.native
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var offsetDirection: Double = js.native
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    override var pointerType: String = js.native
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    override var pointers: js.Array[_] = js.native
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    override var preventDefault: js.Function = js.native
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    override var rotation: Double = js.native
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    override var scale: Double = js.native
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    override var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    /** Target that received the event. */
    /* CompleteClass */
    override var target: HTMLElement = js.native
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    override var velocity: Double = js.native
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    override var velocityX: Double = js.native
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    override var velocityY: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def handler(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  class SingleTouchInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    /** Angle moved. */
    /* CompleteClass */
    override var angle: Double = js.native
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    override var center: HammerPoint = js.native
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    override var changedPointers: js.Array[_] = js.native
    /** Total time in ms since the first input. */
    /* CompleteClass */
    override var deltaTime: Double = js.native
    /** Movement of the X axis. */
    /* CompleteClass */
    override var deltaX: Double = js.native
    /** Movement of the Y axis. */
    /* CompleteClass */
    override var deltaY: Double = js.native
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var direction: Double = js.native
    /** Distance moved. */
    /* CompleteClass */
    override var distance: Double = js.native
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    override var eventType: Double = js.native
    /** true when the final (last) input. */
    /* CompleteClass */
    override var isFinal: Boolean = js.native
    /** true when the first input. */
    /* CompleteClass */
    override var isFirst: Boolean = js.native
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var offsetDirection: Double = js.native
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    override var pointerType: String = js.native
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    override var pointers: js.Array[_] = js.native
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    override var preventDefault: js.Function = js.native
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    override var rotation: Double = js.native
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    override var scale: Double = js.native
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    override var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    /** Target that received the event. */
    /* CompleteClass */
    override var target: HTMLElement = js.native
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    override var velocity: Double = js.native
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    override var velocityX: Double = js.native
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    override var velocityY: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def handler(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  class TouchAction protected ()
    extends typings.hammerjs.TouchAction {
    def this(manager: HammerManager, value: String) = this()
    /* CompleteClass */
    override def compute(): String = js.native
    /* CompleteClass */
    override def preventDefaults(input: typings.hammerjs.HammerInput): Unit = js.native
    /* CompleteClass */
    override def preventSrc(srcEvent: js.Any): Unit = js.native
    /* CompleteClass */
    override def set(value: String): Unit = js.native
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  
  @js.native
  class TouchInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    /** Angle moved. */
    /* CompleteClass */
    override var angle: Double = js.native
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    override var center: HammerPoint = js.native
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    override var changedPointers: js.Array[_] = js.native
    /** Total time in ms since the first input. */
    /* CompleteClass */
    override var deltaTime: Double = js.native
    /** Movement of the X axis. */
    /* CompleteClass */
    override var deltaX: Double = js.native
    /** Movement of the Y axis. */
    /* CompleteClass */
    override var deltaY: Double = js.native
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var direction: Double = js.native
    /** Distance moved. */
    /* CompleteClass */
    override var distance: Double = js.native
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    override var eventType: Double = js.native
    /** true when the final (last) input. */
    /* CompleteClass */
    override var isFinal: Boolean = js.native
    /** true when the first input. */
    /* CompleteClass */
    override var isFirst: Boolean = js.native
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var offsetDirection: Double = js.native
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    override var pointerType: String = js.native
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    override var pointers: js.Array[_] = js.native
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    override var preventDefault: js.Function = js.native
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    override var rotation: Double = js.native
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    override var scale: Double = js.native
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    override var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    /** Target that received the event. */
    /* CompleteClass */
    override var target: HTMLElement = js.native
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    override var velocity: Double = js.native
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    override var velocityX: Double = js.native
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    override var velocityY: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def handler(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  class TouchMouseInput protected ()
    extends typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    /** Angle moved. */
    /* CompleteClass */
    override var angle: Double = js.native
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    override var center: HammerPoint = js.native
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    override var changedPointers: js.Array[_] = js.native
    /** Total time in ms since the first input. */
    /* CompleteClass */
    override var deltaTime: Double = js.native
    /** Movement of the X axis. */
    /* CompleteClass */
    override var deltaX: Double = js.native
    /** Movement of the Y axis. */
    /* CompleteClass */
    override var deltaY: Double = js.native
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var direction: Double = js.native
    /** Distance moved. */
    /* CompleteClass */
    override var distance: Double = js.native
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    override var eventType: Double = js.native
    /** true when the final (last) input. */
    /* CompleteClass */
    override var isFinal: Boolean = js.native
    /** true when the first input. */
    /* CompleteClass */
    override var isFirst: Boolean = js.native
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    override var offsetDirection: Double = js.native
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    override var pointerType: String = js.native
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    override var pointers: js.Array[_] = js.native
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    override var preventDefault: js.Function = js.native
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    override var rotation: Double = js.native
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    override var scale: Double = js.native
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    override var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    /** Target that received the event. */
    /* CompleteClass */
    override var target: HTMLElement = js.native
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    override var velocity: Double = js.native
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    override var velocityX: Double = js.native
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    override var velocityY: Double = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def handler(): Unit = js.native
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
  @js.native
  object Hammer extends TopLevel[HammerStatic]
  
}

