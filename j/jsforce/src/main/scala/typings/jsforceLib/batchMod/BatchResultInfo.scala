package typings
package jsforceLib.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResultInfo extends js.Object {
  var batchId: js.UndefOr[java.lang.String] = js.undefined
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: java.lang.String
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

object BatchResultInfo {
  @scala.inline
  def apply(
    id: java.lang.String,
    batchId: java.lang.String = null,
    errors: js.Array[java.lang.String] = null,
    jobId: java.lang.String = null,
    success: js.UndefOr[scala.Boolean] = js.undefined
  ): BatchResultInfo = {
    val __obj = js.Dynamic.literal(id = id)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[BatchResultInfo]
  }
}

