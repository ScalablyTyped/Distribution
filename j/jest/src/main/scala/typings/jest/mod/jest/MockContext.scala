package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockContext[T, Y /* <: js.Array[_] */] extends StObject {
  
  var calls: js.Array[Y] = js.native
  
  var instances: js.Array[T] = js.native
  
  var invocationCallOrder: js.Array[Double] = js.native
  
  /**
    * List of results of calls to the mock function.
    */
  var results: js.Array[MockResult[T]] = js.native
}
object MockContext {
  
  @scala.inline
  def apply[T, Y /* <: js.Array[_] */](
    calls: js.Array[Y],
    instances: js.Array[T],
    invocationCallOrder: js.Array[Double],
    results: js.Array[MockResult[T]]
  ): MockContext[T, Y] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockContext[T, Y]]
  }
  
  @scala.inline
  implicit class MockContextMutableBuilder[Self <: MockContext[_, _], T, Y /* <: js.Array[_] */] (val x: Self with (MockContext[T, Y])) extends AnyVal {
    
    @scala.inline
    def setCalls(value: js.Array[Y]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallsVarargs(value: Y*): Self = StObject.set(x, "calls", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[T]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: T*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setInvocationCallOrder(value: js.Array[Double]): Self = StObject.set(x, "invocationCallOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationCallOrderVarargs(value: Double*): Self = StObject.set(x, "invocationCallOrder", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[MockResult[T]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: MockResult[T]*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
