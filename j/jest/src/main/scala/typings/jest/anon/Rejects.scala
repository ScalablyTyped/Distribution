package typings.jest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rejects[TPromise /* <: js.Object */] extends js.Object {
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: typings.jest.mod.jest.AndNot[TPromise]
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: typings.jest.mod.jest.AndNot[TPromise]
}

object Rejects {
  @scala.inline
  def apply[/* <: js.Object */ TPromise](rejects: typings.jest.mod.jest.AndNot[TPromise], resolves: typings.jest.mod.jest.AndNot[TPromise]): Rejects[TPromise] = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejects[TPromise]]
  }
}

