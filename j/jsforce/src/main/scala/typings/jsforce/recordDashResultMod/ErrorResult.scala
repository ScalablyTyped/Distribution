package typings.jsforce.recordDashResultMod

import typings.jsforce.jsforceNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResult extends RecordResult {
  var errors: js.Array[String]
  var success: `false`
}

object ErrorResult {
  @scala.inline
  def apply(errors: js.Array[String], success: `false`): ErrorResult = {
    val __obj = js.Dynamic.literal(errors = errors, success = success)
  
    __obj.asInstanceOf[ErrorResult]
  }
}

