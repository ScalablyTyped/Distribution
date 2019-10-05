package typings.jsmockito

import typings.jsmockito.JsMockito.Verifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("verify")
@js.native
object verify extends js.Object {
  /**
    * Verify that a mock object method or mock function was invoked
    *
    * @param mock A mock object or mock anonymous function
    * @param verifier Optional JsMockito.Verifier instance (default: JsMockito.Verifiers.once())
    * @return {T} A verifier on which the method or function to be verified can be invoked
    */
  def apply[T](mock: T): T = js.native
  def apply[T](mock: T, verifier: Verifier): T = js.native
}

