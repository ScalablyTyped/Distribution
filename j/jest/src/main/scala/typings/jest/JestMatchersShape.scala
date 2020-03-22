package typings.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jest.jest.jest.JestMatchersShape<{}, {}> */
trait JestMatchersShape extends js.Object {
  /**
    * Unwraps the reason of a rejected promise so any other matcher can be chained.
    * If the promise is fulfilled the assertion fails.
    */
  var rejects: AndNot
  /**
    * Use resolves to unwrap the value of a fulfilled promise so any other
    * matcher can be chained. If the promise is rejected the assertion fails.
    */
  var resolves: AndNot
}

object JestMatchersShape {
  @scala.inline
  def apply(rejects: AndNot, resolves: AndNot): JestMatchersShape = {
    val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JestMatchersShape]
  }
}

