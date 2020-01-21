package typings.hapiHoek.mod

import typings.hapiHoek.mod.internals.Without
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hoek", "ts")
@js.native
object ts extends js.Object {
  /**
    * Defines a type that can must be one of T or U but not both.
    */
  type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
}

