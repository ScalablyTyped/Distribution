package typings.jsforce.recordDashResultMod

import typings.jsforce.jsforceNumbers.`false`
import typings.jsforce.jsforceNumbers.`true`
import typings.jsforce.salesforceDashIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsforce.recordDashResultMod.SuccessResult
  - typings.jsforce.recordDashResultMod.ErrorResult
*/
trait RecordResult extends js.Object

object RecordResult {
  @scala.inline
  def SuccessResult(id: SalesforceId, success: `true`): RecordResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordResult]
  }
  @scala.inline
  def ErrorResult(errors: js.Array[String], success: `false`): RecordResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordResult]
  }
}

