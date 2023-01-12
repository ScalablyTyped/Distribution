package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerMessageResponse extends StObject {
  
  /** The service's response to a worker's health report. */
  var workerHealthReportResponse: js.UndefOr[WorkerHealthReportResponse] = js.undefined
  
  /** Service's response to reporting worker metrics (currently empty). */
  var workerMetricsResponse: js.UndefOr[Any] = js.undefined
  
  /** Service's response to shutdown notice (currently empty). */
  var workerShutdownNoticeResponse: js.UndefOr[Any] = js.undefined
}
object WorkerMessageResponse {
  
  inline def apply(): WorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMessageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerMessageResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkerHealthReportResponse(value: WorkerHealthReportResponse): Self = StObject.set(x, "workerHealthReportResponse", value.asInstanceOf[js.Any])
    
    inline def setWorkerHealthReportResponseUndefined: Self = StObject.set(x, "workerHealthReportResponse", js.undefined)
    
    inline def setWorkerMetricsResponse(value: Any): Self = StObject.set(x, "workerMetricsResponse", value.asInstanceOf[js.Any])
    
    inline def setWorkerMetricsResponseUndefined: Self = StObject.set(x, "workerMetricsResponse", js.undefined)
    
    inline def setWorkerShutdownNoticeResponse(value: Any): Self = StObject.set(x, "workerShutdownNoticeResponse", value.asInstanceOf[js.Any])
    
    inline def setWorkerShutdownNoticeResponseUndefined: Self = StObject.set(x, "workerShutdownNoticeResponse", js.undefined)
  }
}
