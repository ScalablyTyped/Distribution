package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.fn")
@js.native
object fn extends js.Object {
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  def apply(): Mock[_, _] = js.native
  def apply[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): Mock[T, Y] = js.native
}

