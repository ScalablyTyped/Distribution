package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the Report method.
  */
@js.native
trait SchemaReportRequest extends js.Object {
  /**
    * Operations to be reported.  Typically the service should report one
    * operation per request. Putting multiple operations into a single request
    * is allowed, but should be used only when multiple operations are natually
    * available at the time of the report.  If multiple operations are in a
    * single request, the total request size should be no larger than 1MB. See
    * ReportResponse.report_errors for partial failure behavior.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
  /**
    * Specifies which version of service config should be used to process the
    * request.  If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaReportRequest {
  @scala.inline
  def apply(operations: js.Array[SchemaOperation] = null, serviceConfigId: String = null): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportRequest]
  }
}

