package typings.jasminePromiseMatchers.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matchers[T] extends js.Object {
  
  /**
    * Verifies that a value is a $q Promise.
    */
  def toBePromise(): Boolean = js.native
  
  /**
    * Verifies that a Promise is (or has been) rejected.
    */
  def toBeRejected(): Boolean = js.native
  
  /**
    * Verifies that a Promise is (or has been) rejected with the specified parameter.
    */
  def toBeRejectedWith(value: js.Any): Boolean = js.native
  
  /**
    * Verifies that a Promise is (or has been) resolved.
    */
  def toBeResolved(): Boolean = js.native
  
  /**
    * Verifies that a Promise is (or has been) resolved with the specified parameter.
    */
  def toBeResolvedWith(value: js.Any): Boolean = js.native
}
object Matchers {
  
  @scala.inline
  def apply[T](
    toBePromise: () => Boolean,
    toBeRejected: () => Boolean,
    toBeRejectedWith: js.Any => Boolean,
    toBeResolved: () => Boolean,
    toBeResolvedWith: js.Any => Boolean
  ): Matchers[T] = {
    val __obj = js.Dynamic.literal(toBePromise = js.Any.fromFunction0(toBePromise), toBeRejected = js.Any.fromFunction0(toBeRejected), toBeRejectedWith = js.Any.fromFunction1(toBeRejectedWith), toBeResolved = js.Any.fromFunction0(toBeResolved), toBeResolvedWith = js.Any.fromFunction1(toBeResolvedWith))
    __obj.asInstanceOf[Matchers[T]]
  }
  
  @scala.inline
  implicit class MatchersOps[Self <: Matchers[_], T] (val x: Self with Matchers[T]) extends AnyVal {
    
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
    def setToBePromise(value: () => Boolean): Self = this.set("toBePromise", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeRejected(value: () => Boolean): Self = this.set("toBeRejected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeRejectedWith(value: js.Any => Boolean): Self = this.set("toBeRejectedWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBeResolved(value: () => Boolean): Self = this.set("toBeResolved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeResolvedWith(value: js.Any => Boolean): Self = this.set("toBeResolvedWith", js.Any.fromFunction1(value))
  }
}
