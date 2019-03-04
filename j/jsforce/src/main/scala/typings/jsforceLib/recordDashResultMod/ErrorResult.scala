package typings
package jsforceLib.recordDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResult extends RecordResult {
  var errors: js.Array[java.lang.String]
  var success: jsforceLib.jsforceLibNumbers.`false`
}

object ErrorResult {
  @scala.inline
  def apply(errors: js.Array[java.lang.String], success: jsforceLib.jsforceLibNumbers.`false`): ErrorResult = {
    val __obj = js.Dynamic.literal(errors = errors, success = success)
  
    __obj.asInstanceOf[ErrorResult]
  }
}

