package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitBreaker extends js.Object {
  def allowRequest(): Boolean
  def allowSingleTest(): Boolean
  def isOpen(): Boolean
  def markSuccess(): Unit
}

object CircuitBreaker {
  @scala.inline
  def apply(
    allowRequest: () => Boolean,
    allowSingleTest: () => Boolean,
    isOpen: () => Boolean,
    markSuccess: () => Unit
  ): CircuitBreaker = {
    val __obj = js.Dynamic.literal(allowRequest = js.Any.fromFunction0(allowRequest), allowSingleTest = js.Any.fromFunction0(allowSingleTest), isOpen = js.Any.fromFunction0(isOpen), markSuccess = js.Any.fromFunction0(markSuccess))
  
    __obj.asInstanceOf[CircuitBreaker]
  }
}

