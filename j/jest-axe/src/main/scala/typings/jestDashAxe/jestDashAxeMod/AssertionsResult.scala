package typings.jestDashAxe.jestDashAxeMod

import typings.axeDashCore.axeDashCoreMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionsResult extends js.Object {
  /**
    * Actual checked aXe verification results.
    */
  var actual: js.Array[Result]
  /**
    * Whether the assertion passed.
    */
  var pass: Boolean
  /**
    * @returns Message from the Jest assertion.
    */
  def message(): String
}

object AssertionsResult {
  @scala.inline
  def apply(actual: js.Array[Result], message: () => String, pass: Boolean): AssertionsResult = {
    val __obj = js.Dynamic.literal(actual = actual, message = js.Any.fromFunction0(message), pass = pass)
  
    __obj.asInstanceOf[AssertionsResult]
  }
}

