package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockContext[T, Y /* <: js.Array[_] */] extends js.Object {
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
  def apply[T, /* <: js.Array[_] */ Y](
    calls: js.Array[Y],
    instances: js.Array[T],
    invocationCallOrder: js.Array[Double],
    results: js.Array[MockResult[T]]
  ): MockContext[T, Y] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], invocationCallOrder = invocationCallOrder.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockContext[T, Y]]
  }
}

