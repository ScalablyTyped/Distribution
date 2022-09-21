package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerMessageResponse extends StObject {
  
  /**
    * The service's response to a worker's health report.
    */
  var workerHealthReportResponse: js.UndefOr[SchemaWorkerHealthReportResponse] = js.undefined
  
  /**
    * Service's response to reporting worker metrics (currently empty).
    */
  var workerMetricsResponse: js.UndefOr[SchemaResourceUtilizationReportResponse] = js.undefined
  
  /**
    * Service's response to shutdown notice (currently empty).
    */
  var workerShutdownNoticeResponse: js.UndefOr[SchemaWorkerShutdownNoticeResponse] = js.undefined
}
object SchemaWorkerMessageResponse {
  
  inline def apply(): SchemaWorkerMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerMessageResponse]
  }
  
  extension [Self <: SchemaWorkerMessageResponse](x: Self) {
    
    inline def setWorkerHealthReportResponse(value: SchemaWorkerHealthReportResponse): Self = StObject.set(x, "workerHealthReportResponse", value.asInstanceOf[js.Any])
    
    inline def setWorkerHealthReportResponseUndefined: Self = StObject.set(x, "workerHealthReportResponse", js.undefined)
    
    inline def setWorkerMetricsResponse(value: SchemaResourceUtilizationReportResponse): Self = StObject.set(x, "workerMetricsResponse", value.asInstanceOf[js.Any])
    
    inline def setWorkerMetricsResponseUndefined: Self = StObject.set(x, "workerMetricsResponse", js.undefined)
    
    inline def setWorkerShutdownNoticeResponse(value: SchemaWorkerShutdownNoticeResponse): Self = StObject.set(x, "workerShutdownNoticeResponse", value.asInstanceOf[js.Any])
    
    inline def setWorkerShutdownNoticeResponseUndefined: Self = StObject.set(x, "workerShutdownNoticeResponse", js.undefined)
  }
}
