package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitBreaker extends js.Object {
  def allowRequest(): scala.Boolean
  def allowSingleTest(): scala.Boolean
  def isOpen(): scala.Boolean
  def markSuccess(): scala.Unit
}

object CircuitBreaker {
  @scala.inline
  def apply(
    allowRequest: js.Function0[scala.Boolean],
    allowSingleTest: js.Function0[scala.Boolean],
    isOpen: js.Function0[scala.Boolean],
    markSuccess: js.Function0[scala.Unit]
  ): CircuitBreaker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowRequest")(allowRequest)
    __obj.updateDynamic("allowSingleTest")(allowSingleTest)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("markSuccess")(markSuccess)
    __obj.asInstanceOf[CircuitBreaker]
  }
}

