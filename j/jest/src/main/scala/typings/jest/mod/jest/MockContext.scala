package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockContext[T, Y /* <: js.Array[_] */] extends js.Object {
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
  def apply[T, /* <: js.Array[_] */ Y](
    calls: js.Array[Y],
    instances: js.Array[T],
    invocationCallOrder: js.Array[Double],
    results: js.Array[MockResult[T]]
  ): MockContext[T, Y] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockContext[T, Y]]
  }
  @scala.inline
  implicit class MockContextOps[Self <: MockContext[_, _], T, /* <: js.Array[_] */ Y] (val x: Self with (MockContext[T, Y])) extends AnyVal {
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
    def setCallsVarargs(value: Y*): Self = this.set("calls", js.Array(value :_*))
    @scala.inline
    def setCalls(value: js.Array[Y]): Self = this.set("calls", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstancesVarargs(value: T*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[T]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvocationCallOrderVarargs(value: Double*): Self = this.set("invocationCallOrder", js.Array(value :_*))
    @scala.inline
    def setInvocationCallOrder(value: js.Array[Double]): Self = this.set("invocationCallOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: MockResult[T]*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[MockResult[T]]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

