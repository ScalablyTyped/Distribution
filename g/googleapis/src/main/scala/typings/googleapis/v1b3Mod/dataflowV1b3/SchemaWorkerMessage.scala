package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerMessage extends StObject {
  
  /**
    * Labels are used to group WorkerMessages. For example, a worker_message about a particular container might have the labels: { "JOB_ID": "2015-04-22", "WORKER_ID": "wordcount-vm-2015…" "CONTAINER_TYPE": "worker", "CONTAINER_ID": "ac1234def"\} Label tags typically correspond to Label enum values. However, for ease of development other strings can be used as tags. LABEL_UNSPECIFIED should not be used here.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The timestamp of the worker_message.
    */
  var time: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The health of a worker.
    */
  var workerHealthReport: js.UndefOr[SchemaWorkerHealthReport] = js.undefined
  
  /**
    * Record of worker lifecycle events.
    */
  var workerLifecycleEvent: js.UndefOr[SchemaWorkerLifecycleEvent] = js.undefined
  
  /**
    * A worker message code.
    */
  var workerMessageCode: js.UndefOr[SchemaWorkerMessageCode] = js.undefined
  
  /**
    * Resource metrics reported by workers.
    */
  var workerMetrics: js.UndefOr[SchemaResourceUtilizationReport] = js.undefined
  
  /**
    * Shutdown notice by workers.
    */
  var workerShutdownNotice: js.UndefOr[SchemaWorkerShutdownNotice] = js.undefined
}
object SchemaWorkerMessage {
  
  inline def apply(): SchemaWorkerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerMessage]
  }
  
  extension [Self <: SchemaWorkerMessage](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setWorkerHealthReport(value: SchemaWorkerHealthReport): Self = StObject.set(x, "workerHealthReport", value.asInstanceOf[js.Any])
    
    inline def setWorkerHealthReportUndefined: Self = StObject.set(x, "workerHealthReport", js.undefined)
    
    inline def setWorkerLifecycleEvent(value: SchemaWorkerLifecycleEvent): Self = StObject.set(x, "workerLifecycleEvent", value.asInstanceOf[js.Any])
    
    inline def setWorkerLifecycleEventUndefined: Self = StObject.set(x, "workerLifecycleEvent", js.undefined)
    
    inline def setWorkerMessageCode(value: SchemaWorkerMessageCode): Self = StObject.set(x, "workerMessageCode", value.asInstanceOf[js.Any])
    
    inline def setWorkerMessageCodeUndefined: Self = StObject.set(x, "workerMessageCode", js.undefined)
    
    inline def setWorkerMetrics(value: SchemaResourceUtilizationReport): Self = StObject.set(x, "workerMetrics", value.asInstanceOf[js.Any])
    
    inline def setWorkerMetricsUndefined: Self = StObject.set(x, "workerMetrics", js.undefined)
    
    inline def setWorkerShutdownNotice(value: SchemaWorkerShutdownNotice): Self = StObject.set(x, "workerShutdownNotice", value.asInstanceOf[js.Any])
    
    inline def setWorkerShutdownNoticeUndefined: Self = StObject.set(x, "workerShutdownNotice", js.undefined)
  }
}
