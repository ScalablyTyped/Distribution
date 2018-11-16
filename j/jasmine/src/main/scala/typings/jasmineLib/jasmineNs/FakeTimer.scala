package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeTimer
  extends ScalablyTyped.runtime.Instantiable0[js.Any] {
  def reset(): scala.Unit = js.native
  def runFunctionsWithinRange(oldMillis: scala.Double, nowMillis: scala.Double): scala.Unit = js.native
  def scheduleFunction(
    timeoutKey: js.Any,
    funcToCall: js.Function0[scala.Unit],
    millis: scala.Double,
    recurring: scala.Boolean
  ): scala.Unit = js.native
  def tick(millis: scala.Double): scala.Unit = js.native
}

