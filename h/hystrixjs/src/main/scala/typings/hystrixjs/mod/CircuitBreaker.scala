package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircuitBreaker extends js.Object {
  def allowRequest(): Boolean = js.native
  def allowSingleTest(): Boolean = js.native
  def isOpen(): Boolean = js.native
  def markSuccess(): Unit = js.native
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
  @scala.inline
  implicit class CircuitBreakerOps[Self <: CircuitBreaker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowRequest(value: () => Boolean): Self = this.set("allowRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setAllowSingleTest(value: () => Boolean): Self = this.set("allowSingleTest", js.Any.fromFunction0(value))
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = this.set("isOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setMarkSuccess(value: () => Unit): Self = this.set("markSuccess", js.Any.fromFunction0(value))
  }
  
}

