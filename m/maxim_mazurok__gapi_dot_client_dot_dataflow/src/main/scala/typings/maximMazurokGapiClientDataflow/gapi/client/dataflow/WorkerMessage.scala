package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerMessage extends StObject {
  
  /**
    * Labels are used to group WorkerMessages. For example, a worker_message about a particular container might have the labels: { "JOB_ID": "2015-04-22", "WORKER_ID":
    * "wordcount-vm-2015…" "CONTAINER_TYPE": "worker", "CONTAINER_ID": "ac1234def"} Label tags typically correspond to Label enum values. However, for ease of development other strings
    * can be used as tags. LABEL_UNSPECIFIED should not be used here.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerMessage & TopLevel[js.Any]
  ] = js.undefined
  
  /** The timestamp of the worker_message. */
  var time: js.UndefOr[String] = js.undefined
  
  /** The health of a worker. */
  var workerHealthReport: js.UndefOr[WorkerHealthReport] = js.undefined
  
  /** Record of worker lifecycle events. */
  var workerLifecycleEvent: js.UndefOr[WorkerLifecycleEvent] = js.undefined
  
  /** A worker message code. */
  var workerMessageCode: js.UndefOr[WorkerMessageCode] = js.undefined
  
  /** Resource metrics reported by workers. */
  var workerMetrics: js.UndefOr[ResourceUtilizationReport] = js.undefined
  
  /** Shutdown notice by workers. */
  var workerShutdownNotice: js.UndefOr[WorkerShutdownNotice] = js.undefined
}
object WorkerMessage {
  
  inline def apply(): WorkerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMessage]
  }
  
  extension [Self <: WorkerMessage](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.WorkerMessage & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setWorkerHealthReport(value: WorkerHealthReport): Self = StObject.set(x, "workerHealthReport", value.asInstanceOf[js.Any])
    
    inline def setWorkerHealthReportUndefined: Self = StObject.set(x, "workerHealthReport", js.undefined)
    
    inline def setWorkerLifecycleEvent(value: WorkerLifecycleEvent): Self = StObject.set(x, "workerLifecycleEvent", value.asInstanceOf[js.Any])
    
    inline def setWorkerLifecycleEventUndefined: Self = StObject.set(x, "workerLifecycleEvent", js.undefined)
    
    inline def setWorkerMessageCode(value: WorkerMessageCode): Self = StObject.set(x, "workerMessageCode", value.asInstanceOf[js.Any])
    
    inline def setWorkerMessageCodeUndefined: Self = StObject.set(x, "workerMessageCode", js.undefined)
    
    inline def setWorkerMetrics(value: ResourceUtilizationReport): Self = StObject.set(x, "workerMetrics", value.asInstanceOf[js.Any])
    
    inline def setWorkerMetricsUndefined: Self = StObject.set(x, "workerMetrics", js.undefined)
    
    inline def setWorkerShutdownNotice(value: WorkerShutdownNotice): Self = StObject.set(x, "workerShutdownNotice", value.asInstanceOf[js.Any])
    
    inline def setWorkerShutdownNoticeUndefined: Self = StObject.set(x, "workerShutdownNotice", js.undefined)
  }
}
