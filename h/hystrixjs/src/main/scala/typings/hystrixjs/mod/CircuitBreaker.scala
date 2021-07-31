package typings.hystrixjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircuitBreaker extends StObject {
  
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
  
  @scala.inline
  implicit class CircuitBreakerMutableBuilder[Self <: CircuitBreaker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowRequest(value: () => Boolean): Self = StObject.set(x, "allowRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllowSingleTest(value: () => Boolean): Self = StObject.set(x, "allowSingleTest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkSuccess(value: () => Unit): Self = StObject.set(x, "markSuccess", js.Any.fromFunction0(value))
  }
}
