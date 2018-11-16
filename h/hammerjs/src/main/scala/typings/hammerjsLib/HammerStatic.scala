package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerStatic
  extends ScalablyTyped.runtime.Instantiable1[
      (/* element */ stdLib.HTMLElement) | (/* element */ stdLib.SVGElement), 
      HammerManager
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* element */ stdLib.HTMLElement) | (/* element */ stdLib.SVGElement), 
      /* options */ HammerOptions, 
      HammerManager
    ] {
  var AttrRecognizer: AttrRecognizerStatic = js.native
  var DIRECTION_ALL: scala.Double = js.native
  var DIRECTION_DOWN: scala.Double = js.native
  var DIRECTION_HORIZONTAL: scala.Double = js.native
  var DIRECTION_LEFT: scala.Double = js.native
  var DIRECTION_NONE: scala.Double = js.native
  var DIRECTION_RIGHT: scala.Double = js.native
  var DIRECTION_UP: scala.Double = js.native
  var DIRECTION_VERTICAL: scala.Double = js.native
  var INPUT_CANCEL: scala.Double = js.native
  var INPUT_END: scala.Double = js.native
  var INPUT_MOVE: scala.Double = js.native
  var INPUT_START: scala.Double = js.native
  var Input: HammerInput = js.native
  var Manager: HammerManagerConstructor = js.native
  var MouseInput: MouseInput = js.native
  var Pan: PanRecognizerStatic = js.native
  var Pinch: PinchRecognizerStatic = js.native
  var PointerEventInput: PointerEventInput = js.native
  var Press: PressRecognizerStatic = js.native
  var Recognizer: RecognizerStatic = js.native
  var Rotate: RotateRecognizerStatic = js.native
  var STATE_BEGAN: scala.Double = js.native
  var STATE_CANCELLED: scala.Double = js.native
  var STATE_CHANGED: scala.Double = js.native
  var STATE_ENDED: scala.Double = js.native
  var STATE_FAILED: scala.Double = js.native
  var STATE_POSSIBLE: scala.Double = js.native
  var STATE_RECOGNIZED: scala.Double = js.native
  var SingleTouchInput: SingleTouchInput = js.native
  var Swipe: SwipeRecognizerStatic = js.native
  var Tap: TapRecognizerStatic = js.native
  var TouchAction: TouchAction = js.native
  var TouchInput: TouchInput = js.native
  var TouchMouseInput: TouchMouseInput = js.native
  var VERSION: scala.Double = js.native
  var defaults: HammerDefaults = js.native
  def bindFn(fn: js.Function, context: js.Any): js.Function = js.native
  def each(obj: js.Any, iterator: js.Function, context: js.Any): scala.Unit = js.native
  def extend(dest: js.Any, src: js.Any, merge: scala.Boolean): js.Any = js.native
  def inherit(child: js.Function, base: js.Function, properties: js.Any): js.Any = js.native
  def merge(dest: js.Any, src: js.Any): js.Any = js.native
  def off(target: stdLib.EventTarget, types: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(target: stdLib.EventTarget, types: java.lang.String, handler: js.Function): scala.Unit = js.native
  def prefixed(obj: js.Any, property: java.lang.String): java.lang.String = js.native
}

