package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaWorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerMessageResponse]
  }
  
  @scala.inline
  implicit class SchemaWorkerMessageResponseOps[Self <: SchemaWorkerMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkerHealthReportResponse(value: SchemaWorkerHealthReportResponse): Self = this.set("workerHealthReportResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerHealthReportResponse: Self = this.set("workerHealthReportResponse", js.undefined)
    
    @scala.inline
    def setWorkerMetricsResponse(value: SchemaResourceUtilizationReportResponse): Self = this.set("workerMetricsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerMetricsResponse: Self = this.set("workerMetricsResponse", js.undefined)
    
    @scala.inline
    def setWorkerShutdownNoticeResponse(value: SchemaWorkerShutdownNoticeResponse): Self = this.set("workerShutdownNoticeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerShutdownNoticeResponse: Self = this.set("workerShutdownNoticeResponse", js.undefined)
  }
}
