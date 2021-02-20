package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A worker_message response allows the server to pass information to the
  * sender.
  */
@js.native
trait SchemaWorkerMessageResponse extends StObject {
  
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
  implicit class SchemaWorkerMessageResponseMutableBuilder[Self <: SchemaWorkerMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkerHealthReportResponse(value: SchemaWorkerHealthReportResponse): Self = StObject.set(x, "workerHealthReportResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerHealthReportResponseUndefined: Self = StObject.set(x, "workerHealthReportResponse", js.undefined)
    
    @scala.inline
    def setWorkerMetricsResponse(value: SchemaResourceUtilizationReportResponse): Self = StObject.set(x, "workerMetricsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMetricsResponseUndefined: Self = StObject.set(x, "workerMetricsResponse", js.undefined)
    
    @scala.inline
    def setWorkerShutdownNoticeResponse(value: SchemaWorkerShutdownNoticeResponse): Self = StObject.set(x, "workerShutdownNoticeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerShutdownNoticeResponseUndefined: Self = StObject.set(x, "workerShutdownNoticeResponse", js.undefined)
  }
}
