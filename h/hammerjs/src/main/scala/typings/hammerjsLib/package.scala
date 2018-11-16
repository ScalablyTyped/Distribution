package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hammerjsLib {
  type HammerListener = js.Function1[/* event */ HammerInput, scala.Unit]
  type PanRecognizer = AttrRecognizer
  type PinchRecognizer = AttrRecognizer
  type PressRecognizer = AttrRecognizer
  type RecognizerTuple = js.Array[RecognizerStatic] | (js.Tuple2[RecognizerStatic, RecognizerOptions]) | (js.Tuple3[RecognizerStatic, RecognizerOptions, java.lang.String | js.Array[java.lang.String]]) | (js.Tuple4[
    RecognizerStatic, 
    RecognizerOptions, 
    java.lang.String | js.Array[java.lang.String], 
    java.lang.String | Recognizer | (js.Array[java.lang.String | Recognizer])
  ])
  type RotateRecognizer = AttrRecognizer
  type SwipeRecognizer = AttrRecognizer
  type TapRecognizer = AttrRecognizer
}
