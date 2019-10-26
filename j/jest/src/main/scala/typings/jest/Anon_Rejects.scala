package typings.jest

import typings.jest.jestMod.jest.AndNot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rejects[TPromise /* <: js.Object */] extends js.Object {
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: AndNot[TPromise]
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: AndNot[TPromise]
}

object Anon_Rejects {
  @scala.inline
  def apply[TPromise /* <: js.Object */](rejects: AndNot[TPromise], resolves: AndNot[TPromise]): Anon_Rejects[TPromise] = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rejects[TPromise]]
  }
}

