package typings.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pending")
@js.native
object pending extends js.Object {
  /**
    * Mark a spec as pending, expectation results will be ignored.
    * If you call the function pending anywhere in the spec body, no matter the expectations, the spec will be marked pending.
    * @param reason Reason the spec is pending.
    */
  def apply(): Unit = js.native
  def apply(reason: String): Unit = js.native
}

