package typings.hammerjs

import org.scalablytyped.runtime.Shortcut
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.SVGElement
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Hammer")
  @js.native
  class Hammer protected ()
    extends StObject
       with HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  object Hammer extends Shortcut {
    
    @JSGlobal("Hammer")
    @js.native
    val ^ : js.Object & HammerStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Manager")
    @js.native
    class Manager protected ()
      extends StObject
         with HammerManager {
      def this(element: EventTarget) = this()
      def this(element: EventTarget, options: HammerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Pan")
    @js.native
    class Pan ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Pinch")
    @js.native
    class Pinch ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Press")
    @js.native
    class Press ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Recognizer")
    @js.native
    class Recognizer ()
      extends StObject
         with typings.hammerjs.Recognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Rotate")
    @js.native
    class Rotate ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Swipe")
    @js.native
    class Swipe ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Hammer.Tap")
    @js.native
    class Tap ()
      extends StObject
         with AttrRecognizer {
      def this(options: RecognizerOptions) = this()
    }
    
    type _To = js.Object & HammerStatic
    
    /* This means you don't have to write `^`, but can instead just say `Hammer.foo` */
    override def _to: js.Object & HammerStatic = ^
  }
  
  @JSGlobal("HammerInput")
  @js.native
  class HammerInput protected ()
    extends StObject
       with typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    
    /** Angle moved. */
    /* CompleteClass */
    var angle: Double = js.native
    
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    var center: HammerPoint = js.native
    
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    var changedPointers: js.Array[js.Any] = js.native
    
    /** Total time in ms since the first input. */
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /** Movement of the X axis. */
    /* CompleteClass */
    var deltaX: Double = js.native
    
    /** Movement of the Y axis. */
    /* CompleteClass */
    var deltaY: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    var direction: Double = js.native
    
    /** Distance moved. */
    /* CompleteClass */
    var distance: Double = js.native
    
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    var eventType: Double = js.native
    
    /* CompleteClass */
    override def handler(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** true when the final (last) input. */
    /* CompleteClass */
    var isFinal: Boolean = js.native
    
    /** true when the first input. */
    /* CompleteClass */
    var isFirst: Boolean = js.native
    
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    var offsetDirection: Double = js.native
    
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    var pointerType: String = js.native
    
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    var pointers: js.Array[js.Any] = js.native
    
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    var preventDefault: js.Function = js.native
    
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    var scale: Double = js.native
    
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    
    /** Target that received the event. */
    /* CompleteClass */
    var target: HTMLElement = js.native
    
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    var velocity: Double = js.native
    
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    var velocityY: Double = js.native
  }
  
  @JSGlobal("MouseInput")
  @js.native
  class MouseInput protected ()
    extends StObject
       with typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    
    /** Angle moved. */
    /* CompleteClass */
    var angle: Double = js.native
    
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    var center: HammerPoint = js.native
    
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    var changedPointers: js.Array[js.Any] = js.native
    
    /** Total time in ms since the first input. */
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /** Movement of the X axis. */
    /* CompleteClass */
    var deltaX: Double = js.native
    
    /** Movement of the Y axis. */
    /* CompleteClass */
    var deltaY: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    var direction: Double = js.native
    
    /** Distance moved. */
    /* CompleteClass */
    var distance: Double = js.native
    
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    var eventType: Double = js.native
    
    /* CompleteClass */
    override def handler(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** true when the final (last) input. */
    /* CompleteClass */
    var isFinal: Boolean = js.native
    
    /** true when the first input. */
    /* CompleteClass */
    var isFirst: Boolean = js.native
    
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    var offsetDirection: Double = js.native
    
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    var pointerType: String = js.native
    
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    var pointers: js.Array[js.Any] = js.native
    
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    var preventDefault: js.Function = js.native
    
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    var scale: Double = js.native
    
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    
    /** Target that received the event. */
    /* CompleteClass */
    var target: HTMLElement = js.native
    
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    var velocity: Double = js.native
    
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    var velocityY: Double = js.native
  }
  
  @JSGlobal("PointerEventInput")
  @js.native
  class PointerEventInput protected ()
    extends StObject
       with typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    
    /** Angle moved. */
    /* CompleteClass */
    var angle: Double = js.native
    
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    var center: HammerPoint = js.native
    
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    var changedPointers: js.Array[js.Any] = js.native
    
    /** Total time in ms since the first input. */
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /** Movement of the X axis. */
    /* CompleteClass */
    var deltaX: Double = js.native
    
    /** Movement of the Y axis. */
    /* CompleteClass */
    var deltaY: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    var direction: Double = js.native
    
    /** Distance moved. */
    /* CompleteClass */
    var distance: Double = js.native
    
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    var eventType: Double = js.native
    
    /* CompleteClass */
    override def handler(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** true when the final (last) input. */
    /* CompleteClass */
    var isFinal: Boolean = js.native
    
    /** true when the first input. */
    /* CompleteClass */
    var isFirst: Boolean = js.native
    
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    var offsetDirection: Double = js.native
    
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    var pointerType: String = js.native
    
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    var pointers: js.Array[js.Any] = js.native
    
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    var preventDefault: js.Function = js.native
    
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    var scale: Double = js.native
    
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    
    /** Target that received the event. */
    /* CompleteClass */
    var target: HTMLElement = js.native
    
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    var velocity: Double = js.native
    
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    var velocityY: Double = js.native
  }
  
  @JSGlobal("SingleTouchInput")
  @js.native
  class SingleTouchInput protected ()
    extends StObject
       with typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    
    /** Angle moved. */
    /* CompleteClass */
    var angle: Double = js.native
    
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    var center: HammerPoint = js.native
    
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    var changedPointers: js.Array[js.Any] = js.native
    
    /** Total time in ms since the first input. */
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /** Movement of the X axis. */
    /* CompleteClass */
    var deltaX: Double = js.native
    
    /** Movement of the Y axis. */
    /* CompleteClass */
    var deltaY: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    var direction: Double = js.native
    
    /** Distance moved. */
    /* CompleteClass */
    var distance: Double = js.native
    
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    var eventType: Double = js.native
    
    /* CompleteClass */
    override def handler(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** true when the final (last) input. */
    /* CompleteClass */
    var isFinal: Boolean = js.native
    
    /** true when the first input. */
    /* CompleteClass */
    var isFirst: Boolean = js.native
    
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    var offsetDirection: Double = js.native
    
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    var pointerType: String = js.native
    
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    var pointers: js.Array[js.Any] = js.native
    
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    var preventDefault: js.Function = js.native
    
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    var scale: Double = js.native
    
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    
    /** Target that received the event. */
    /* CompleteClass */
    var target: HTMLElement = js.native
    
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    var velocity: Double = js.native
    
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    var velocityY: Double = js.native
  }
  
  @JSGlobal("TouchAction")
  @js.native
  class TouchAction protected ()
    extends StObject
       with typings.hammerjs.TouchAction {
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
  
  @JSGlobal("TouchInput")
  @js.native
  class TouchInput protected ()
    extends StObject
       with typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    
    /** Angle moved. */
    /* CompleteClass */
    var angle: Double = js.native
    
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    var center: HammerPoint = js.native
    
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    var changedPointers: js.Array[js.Any] = js.native
    
    /** Total time in ms since the first input. */
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /** Movement of the X axis. */
    /* CompleteClass */
    var deltaX: Double = js.native
    
    /** Movement of the Y axis. */
    /* CompleteClass */
    var deltaY: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    var direction: Double = js.native
    
    /** Distance moved. */
    /* CompleteClass */
    var distance: Double = js.native
    
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    var eventType: Double = js.native
    
    /* CompleteClass */
    override def handler(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** true when the final (last) input. */
    /* CompleteClass */
    var isFinal: Boolean = js.native
    
    /** true when the first input. */
    /* CompleteClass */
    var isFirst: Boolean = js.native
    
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    var offsetDirection: Double = js.native
    
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    var pointerType: String = js.native
    
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    var pointers: js.Array[js.Any] = js.native
    
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    var preventDefault: js.Function = js.native
    
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    var scale: Double = js.native
    
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    
    /** Target that received the event. */
    /* CompleteClass */
    var target: HTMLElement = js.native
    
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    var velocity: Double = js.native
    
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    var velocityY: Double = js.native
  }
  
  @JSGlobal("TouchMouseInput")
  @js.native
  class TouchMouseInput protected ()
    extends StObject
       with typings.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
    
    /** Angle moved. */
    /* CompleteClass */
    var angle: Double = js.native
    
    /** Center position for multi-touch, or just the single pointer. */
    /* CompleteClass */
    var center: HammerPoint = js.native
    
    /** Array with all new/moved/lost pointers. */
    /* CompleteClass */
    var changedPointers: js.Array[js.Any] = js.native
    
    /** Total time in ms since the first input. */
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /** Movement of the X axis. */
    /* CompleteClass */
    var deltaX: Double = js.native
    
    /** Movement of the Y axis. */
    /* CompleteClass */
    var deltaY: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /** Direction moved. Matches the DIRECTION constants. */
    /* CompleteClass */
    var direction: Double = js.native
    
    /** Distance moved. */
    /* CompleteClass */
    var distance: Double = js.native
    
    /** Event type, matches the INPUT constants. */
    /* CompleteClass */
    var eventType: Double = js.native
    
    /* CompleteClass */
    override def handler(): Unit = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /** true when the final (last) input. */
    /* CompleteClass */
    var isFinal: Boolean = js.native
    
    /** true when the first input. */
    /* CompleteClass */
    var isFirst: Boolean = js.native
    
    /** Direction moved from it's starting point. Matches the DIRECTION constants. */
    /* CompleteClass */
    var offsetDirection: Double = js.native
    
    /** Primary pointer type, could be touch, mouse, pen or kinect. */
    /* CompleteClass */
    var pointerType: String = js.native
    
    /** Array with all pointers, including the ended pointers (touchend, mouseup). */
    /* CompleteClass */
    var pointers: js.Array[js.Any] = js.native
    
    /** Reference to the srcEvent.preventDefault() method. Only for experts! */
    /* CompleteClass */
    var preventDefault: js.Function = js.native
    
    /** Rotation that has been done when multi-touch. 0 on a single touch. */
    /* CompleteClass */
    var rotation: Double = js.native
    
    /** Scaling that has been done when multi-touch. 1 on a single touch. */
    /* CompleteClass */
    var scale: Double = js.native
    
    /** Source event object, type TouchEvent, MouseEvent or PointerEvent. */
    /* CompleteClass */
    var srcEvent: TouchEvent | MouseEvent | PointerEvent = js.native
    
    /** Target that received the event. */
    /* CompleteClass */
    var target: HTMLElement = js.native
    
    /** Name of the event. Like panstart. */
    /* CompleteClass */
    var `type`: String = js.native
    
    /** Highest velocityX/Y value. */
    /* CompleteClass */
    var velocity: Double = js.native
    
    /** Velocity on the X axis, in px/ms. */
    /* CompleteClass */
    var velocityX: Double = js.native
    
    /** Velocity on the Y axis, in px/ms */
    /* CompleteClass */
    var velocityY: Double = js.native
  }
}
