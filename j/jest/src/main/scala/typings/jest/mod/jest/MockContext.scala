package typings.jest.mod.jest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MockContext[T, Y /* <: js.Array[js.Any] */] extends StObject {
  
  var calls: js.Array[Y]
  
  var instances: js.Array[T]
  
  var invocationCallOrder: js.Array[Double]
  
  /**
    * List of results of calls to the mock function.
    */
  var results: js.Array[MockResult[T]]
}
object MockContext {
  
  @scala.inline
  def apply[T, Y /* <: js.Array[js.Any] */](
    calls: js.Array[Y],
    instances: js.Array[T],
    invocationCallOrder: js.Array[Double],
    results: js.Array[MockResult[T]]
  ): MockContext[T, Y] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockContext[T, Y]]
  }
  
  @scala.inline
  implicit class MockContextMutableBuilder[Self <: MockContext[?, ?], T, Y /* <: js.Array[js.Any] */] (val x: Self & (MockContext[T, Y])) extends AnyVal {
    
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
