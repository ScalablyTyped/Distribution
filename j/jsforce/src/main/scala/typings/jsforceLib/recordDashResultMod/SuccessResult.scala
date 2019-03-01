package typings
package jsforceLib.recordDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessResult extends RecordResult {
  var id: jsforceLib.salesforceDashIdMod.SalesforceId
  var success: jsforceLib.jsforceLibNumbers.`true`
}

object SuccessResult {
  @scala.inline
  def apply(id: jsforceLib.salesforceDashIdMod.SalesforceId, success: jsforceLib.jsforceLibNumbers.`true`): SuccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SuccessResult]
  }
}

