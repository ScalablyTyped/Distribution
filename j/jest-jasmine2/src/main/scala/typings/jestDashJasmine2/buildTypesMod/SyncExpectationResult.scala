package typings.jestDashJasmine2.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncExpectationResult extends js.Object {
  var pass: Boolean
  def message(): String
}

object SyncExpectationResult {
  @scala.inline
  def apply(message: () => String, pass: Boolean): SyncExpectationResult = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyncExpectationResult]
  }
}

