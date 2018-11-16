package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recognizer extends js.Object {
  var defaults: js.Any = js.native
  def canEmit(): scala.Boolean = js.native
  def canRecognizeWith(otherRecognizer: Recognizer): scala.Boolean = js.native
  def dropRecognizeWith(otherRecognizer: Recognizer): Recognizer = js.native
  def dropRecognizeWith(otherRecognizer: java.lang.String): Recognizer = js.native
  def dropRecognizeWith(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def dropRequireFailure(otherRecognizer: Recognizer): Recognizer = js.native
  def dropRequireFailure(otherRecognizer: java.lang.String): Recognizer = js.native
  def dropRequireFailure(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def emit(input: HammerInput): scala.Unit = js.native
  def getTouchAction(): js.Array[_] = js.native
  def hasRequireFailures(): scala.Boolean = js.native
  def process(inputData: HammerInput): java.lang.String = js.native
  def recognize(inputData: HammerInput): scala.Unit = js.native
  def recognizeWith(otherRecognizer: Recognizer): Recognizer = js.native
  def recognizeWith(otherRecognizer: java.lang.String): Recognizer = js.native
  def recognizeWith(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def requireFailure(otherRecognizer: Recognizer): Recognizer = js.native
  def requireFailure(otherRecognizer: java.lang.String): Recognizer = js.native
  def requireFailure(otherRecognizer: js.Array[Recognizer]): Recognizer = js.native
  def reset(): scala.Unit = js.native
  def set(): Recognizer = js.native
  def set(options: RecognizerOptions): Recognizer = js.native
  def tryEmit(input: HammerInput): scala.Unit = js.native
}

