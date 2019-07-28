package typings.jsforce.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchResultInfo extends js.Object {
  var batchId: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  var id: String
  var jobId: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[Boolean] = js.undefined
}

object BatchResultInfo {
  @scala.inline
  def apply(
    id: String,
    batchId: String = null,
    errors: js.Array[String] = null,
    jobId: String = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): BatchResultInfo = {
    val __obj = js.Dynamic.literal(id = id)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[BatchResultInfo]
  }
}

