package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recognizer extends js.Object {
  var defaults: js.Any = js.native
  def canEmit(): Boolean = js.native
  def canRecognizeWith(otherRecognizer: Recognizer): Boolean = js.native
  def dropRecognizeWith(otherRecognizer: String): Recognizer = js.native
  def dropRecognizeWith(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def dropRecognizeWith(otherRecognizer: Recognizer): Recognizer = js.native
  def dropRequireFailure(otherRecognizer: String): Recognizer = js.native
  def dropRequireFailure(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def dropRequireFailure(otherRecognizer: Recognizer): Recognizer = js.native
  def emit(input: HammerInput): Unit = js.native
  def getTouchAction(): js.Array[_] = js.native
  def hasRequireFailures(): Boolean = js.native
  def process(inputData: HammerInput): String = js.native
  def recognize(inputData: HammerInput): Unit = js.native
  def recognizeWith(otherRecognizer: String): Recognizer = js.native
  def recognizeWith(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def recognizeWith(otherRecognizer: Recognizer): Recognizer = js.native
  def requireFailure(otherRecognizer: String): Recognizer = js.native
  def requireFailure(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def requireFailure(otherRecognizer: Recognizer): Recognizer = js.native
  def reset(): Unit = js.native
  def set(): Recognizer = js.native
  def set(options: RecognizerOptions): Recognizer = js.native
  def tryEmit(input: HammerInput): Unit = js.native
}

