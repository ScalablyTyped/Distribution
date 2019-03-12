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
    allowRequest: () => scala.Boolean,
    allowSingleTest: () => scala.Boolean,
    isOpen: () => scala.Boolean,
    markSuccess: () => scala.Unit
  ): CircuitBreaker = {
    val __obj = js.Dynamic.literal(allowRequest = js.Any.fromFunction0(allowRequest), allowSingleTest = js.Any.fromFunction0(allowSingleTest), isOpen = js.Any.fromFunction0(isOpen), markSuccess = js.Any.fromFunction0(markSuccess))
  
    __obj.asInstanceOf[CircuitBreaker]
  }
}

