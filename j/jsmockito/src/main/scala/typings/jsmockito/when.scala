package typings.jsmockito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("when")
@js.native
object when extends js.Object {
  /**
    * Add a stub for a mock object method or mock function
    *
    * @param mock A mock object or mock anonymous function
    * @return {T} A stub builder on which the method or function to be stubbed can be invoked
    */
  def apply[T](mock: T): T = js.native
}

