package typings.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculationCache[Result] extends js.Object {
  
  /**
    * Manually invalidates the cached outcome.
    */
  def invalidate(): Unit = js.native
  
  /**
    * If the inputs array matches the inputs array from the previous invocation, this method returns the result of the previous invocation.
    * Otherwise, the calculation function is invoked and its result is cached and returned.
    * Objects in the inputs array are compared using ===.
    * @param inputs - Array of objects that are to be compared using === with the inputs from the previous invocation.
    * These objects are assumed to be immutable primitive values.
    * @param calculation - Function that takes zero arguments and returns an object (A [[VNode]] presumably) that can be cached.
    */
  def result(inputs: js.Array[_], calculation: js.Function0[Result]): Result = js.native
}
object CalculationCache {
  
  @scala.inline
  def apply[Result](invalidate: () => Unit, result: (js.Array[_], js.Function0[Result]) => Result): CalculationCache[Result] = {
    val __obj = js.Dynamic.literal(invalidate = js.Any.fromFunction0(invalidate), result = js.Any.fromFunction2(result))
    __obj.asInstanceOf[CalculationCache[Result]]
  }
  
  @scala.inline
  implicit class CalculationCacheOps[Self <: CalculationCache[_], Result] (val x: Self with CalculationCache[Result]) extends AnyVal {
    
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
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResult(value: (js.Array[_], js.Function0[Result]) => Result): Self = this.set("result", js.Any.fromFunction2(value))
  }
}
