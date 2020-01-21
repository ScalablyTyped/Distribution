package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional info about the report operation.
  */
@js.native
trait SchemaReportInfo extends js.Object {
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota usage info when processing the `Operation`.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
}

object SchemaReportInfo {
  @scala.inline
  def apply(operationId: String = null, quotaInfo: SchemaQuotaInfo = null): SchemaReportInfo = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaInfo != null) __obj.updateDynamic("quotaInfo")(quotaInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportInfo]
  }
}

