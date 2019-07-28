package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hammerjs {
  type HammerListener = js.Function1[/* event */ HammerInput, Unit]
  type PanRecognizer = AttrRecognizer
  type PinchRecognizer = AttrRecognizer
  type PressRecognizer = AttrRecognizer
  type RecognizerTuple = js.Array[RecognizerStatic] | (js.Tuple2[RecognizerStatic, RecognizerOptions]) | (js.Tuple3[RecognizerStatic, RecognizerOptions, String | js.Array[String]]) | (js.Tuple4[
    RecognizerStatic, 
    RecognizerOptions, 
    String | js.Array[String], 
    String | Recognizer | (js.Array[String | Recognizer])
  ])
  type RotateRecognizer = AttrRecognizer
  type SwipeRecognizer = AttrRecognizer
  type TapRecognizer = AttrRecognizer
}
