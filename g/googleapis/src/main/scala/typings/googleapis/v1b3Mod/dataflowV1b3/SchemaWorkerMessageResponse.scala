package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A worker_message response allows the server to pass information to the
  * sender.
  */
@js.native
trait SchemaWorkerMessageResponse extends js.Object {
  /**
    * The service&#39;s response to a worker&#39;s health report.
    */
  var workerHealthReportResponse: js.UndefOr[SchemaWorkerHealthReportResponse] = js.native
  /**
    * Service&#39;s response to reporting worker metrics (currently empty).
    */
  var workerMetricsResponse: js.UndefOr[SchemaResourceUtilizationReportResponse] = js.native
  /**
    * Service&#39;s response to shutdown notice (currently empty).
    */
  var workerShutdownNoticeResponse: js.UndefOr[SchemaWorkerShutdownNoticeResponse] = js.native
}

object SchemaWorkerMessageResponse {
  @scala.inline
  def apply(
    workerHealthReportResponse: SchemaWorkerHealthReportResponse = null,
    workerMetricsResponse: SchemaResourceUtilizationReportResponse = null,
    workerShutdownNoticeResponse: SchemaWorkerShutdownNoticeResponse = null
  ): SchemaWorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (workerHealthReportResponse != null) __obj.updateDynamic("workerHealthReportResponse")(workerHealthReportResponse.asInstanceOf[js.Any])
    if (workerMetricsResponse != null) __obj.updateDynamic("workerMetricsResponse")(workerMetricsResponse.asInstanceOf[js.Any])
    if (workerShutdownNoticeResponse != null) __obj.updateDynamic("workerShutdownNoticeResponse")(workerShutdownNoticeResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkerMessageResponse]
  }
}

