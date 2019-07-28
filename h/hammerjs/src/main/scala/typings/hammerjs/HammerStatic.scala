package typings.hammerjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerStatic
  extends Instantiable2[
      (/* element */ HTMLElement) | (/* element */ SVGElement), 
      /* options */ HammerOptions, 
      HammerManager
    ]
     with Instantiable1[(/* element */ HTMLElement) | (/* element */ SVGElement), HammerManager] {
  var AttrRecognizer: AttrRecognizerStatic = js.native
  var DIRECTION_ALL: Double = js.native
  var DIRECTION_DOWN: Double = js.native
  var DIRECTION_HORIZONTAL: Double = js.native
  var DIRECTION_LEFT: Double = js.native
  var DIRECTION_NONE: Double = js.native
  var DIRECTION_RIGHT: Double = js.native
  var DIRECTION_UP: Double = js.native
  var DIRECTION_VERTICAL: Double = js.native
  var INPUT_CANCEL: Double = js.native
  var INPUT_END: Double = js.native
  var INPUT_MOVE: Double = js.native
  var INPUT_START: Double = js.native
  var Input: HammerInput = js.native
  var Manager: HammerManagerConstructor = js.native
  var MouseInput: typings.hammerjs.MouseInput = js.native
  var Pan: PanRecognizerStatic = js.native
  var Pinch: PinchRecognizerStatic = js.native
  var PointerEventInput: typings.hammerjs.PointerEventInput = js.native
  var Press: PressRecognizerStatic = js.native
  var Recognizer: RecognizerStatic = js.native
  var Rotate: RotateRecognizerStatic = js.native
  var STATE_BEGAN: Double = js.native
  var STATE_CANCELLED: Double = js.native
  var STATE_CHANGED: Double = js.native
  var STATE_ENDED: Double = js.native
  var STATE_FAILED: Double = js.native
  var STATE_POSSIBLE: Double = js.native
  var STATE_RECOGNIZED: Double = js.native
  var SingleTouchInput: typings.hammerjs.SingleTouchInput = js.native
  var Swipe: SwipeRecognizerStatic = js.native
  var Tap: TapRecognizerStatic = js.native
  var TouchAction: typings.hammerjs.TouchAction = js.native
  var TouchInput: typings.hammerjs.TouchInput = js.native
  var TouchMouseInput: typings.hammerjs.TouchMouseInput = js.native
  var VERSION: Double = js.native
  var defaults: HammerDefaults = js.native
  def bindFn(fn: js.Function, context: js.Any): js.Function = js.native
  def each(obj: js.Any, iterator: js.Function, context: js.Any): Unit = js.native
  def extend(dest: js.Any, src: js.Any, merge: Boolean): js.Any = js.native
  def inherit(child: js.Function, base: js.Function, properties: js.Any): js.Any = js.native
  def merge(dest: js.Any, src: js.Any): js.Any = js.native
  def off(target: EventTarget, types: String, handler: js.Function): Unit = js.native
  def on(target: EventTarget, types: String, handler: js.Function): Unit = js.native
  def prefixed(obj: js.Any, property: String): String = js.native
}

