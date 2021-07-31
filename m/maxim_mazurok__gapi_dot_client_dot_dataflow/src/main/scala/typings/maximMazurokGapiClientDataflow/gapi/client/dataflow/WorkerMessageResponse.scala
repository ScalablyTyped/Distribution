package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerMessageResponse extends StObject {
  
  /** The service's response to a worker's health report. */
  var workerHealthReportResponse: js.UndefOr[WorkerHealthReportResponse] = js.undefined
  
  /** Service's response to reporting worker metrics (currently empty). */
  var workerMetricsResponse: js.UndefOr[js.Any] = js.undefined
  
  /** Service's response to shutdown notice (currently empty). */
  var workerShutdownNoticeResponse: js.UndefOr[js.Any] = js.undefined
}
object WorkerMessageResponse {
  
  @scala.inline
  def apply(): WorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMessageResponse]
  }
  
  @scala.inline
  implicit class WorkerMessageResponseMutableBuilder[Self <: WorkerMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkerHealthReportResponse(value: WorkerHealthReportResponse): Self = StObject.set(x, "workerHealthReportResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerHealthReportResponseUndefined: Self = StObject.set(x, "workerHealthReportResponse", js.undefined)
    
    @scala.inline
    def setWorkerMetricsResponse(value: js.Any): Self = StObject.set(x, "workerMetricsResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMetricsResponseUndefined: Self = StObject.set(x, "workerMetricsResponse", js.undefined)
    
    @scala.inline
    def setWorkerShutdownNoticeResponse(value: js.Any): Self = StObject.set(x, "workerShutdownNoticeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerShutdownNoticeResponseUndefined: Self = StObject.set(x, "workerShutdownNoticeResponse", js.undefined)
  }
}
