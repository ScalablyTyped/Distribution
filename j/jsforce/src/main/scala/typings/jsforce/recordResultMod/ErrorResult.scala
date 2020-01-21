package typings.jsforce.recordResultMod

import typings.jsforce.jsforceBooleans.`false`
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
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorResult]
  }
}

