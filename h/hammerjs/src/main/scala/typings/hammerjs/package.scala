package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hammerjs {
  type HammerListener = js.Function1[/* event */ typings.hammerjs.HammerInput, scala.Unit]
  type MouseInput = typings.hammerjs.HammerInput
  type PanRecognizer = typings.hammerjs.AttrRecognizer
  type PinchRecognizer = typings.hammerjs.AttrRecognizer
  type PointerEventInput = typings.hammerjs.HammerInput
  type PressRecognizer = typings.hammerjs.AttrRecognizer
  type RecognizerTuple = js.Array[typings.hammerjs.RecognizerStatic] | (js.Tuple2[typings.hammerjs.RecognizerStatic, typings.hammerjs.RecognizerOptions]) | (js.Tuple3[
    typings.hammerjs.RecognizerStatic, 
    typings.hammerjs.RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]) | (js.Tuple4[
    typings.hammerjs.RecognizerStatic, 
    typings.hammerjs.RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String], 
    java.lang.String | typings.hammerjs.Recognizer | (js.Array[java.lang.String | typings.hammerjs.Recognizer])
  ])
  type RotateRecognizer = typings.hammerjs.AttrRecognizer
  type SingleTouchInput = typings.hammerjs.HammerInput
  type SwipeRecognizer = typings.hammerjs.AttrRecognizer
  type TapRecognizer = typings.hammerjs.AttrRecognizer
  type TouchInput = typings.hammerjs.HammerInput
  type TouchMouseInput = typings.hammerjs.HammerInput
}
