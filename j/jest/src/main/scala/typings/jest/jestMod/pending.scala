package typings.jest.jestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "pending")
@js.native
object pending extends js.Object {
  /**
    * If you call the function pending anywhere in the spec body,
    * no matter the expectations, the spec will be marked pending.
    */
  def apply(): Unit = js.native
  def apply(reason: String): Unit = js.native
}

