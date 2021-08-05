package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerMessage provides information to the backend about a worker.
  */
trait SchemaWorkerMessage extends StObject {
  
  /**
    * Labels are used to group WorkerMessages. For example, a worker_message
    * about a particular container might have the labels: { &quot;JOB_ID&quot;:
    * &quot;2015-04-22&quot;,   &quot;WORKER_ID&quot;:
    * &quot;wordcount-vm-2015…&quot;   &quot;CONTAINER_TYPE&quot;:
    * &quot;worker&quot;,   &quot;CONTAINER_ID&quot;: &quot;ac1234def&quot;}
    * Label tags typically correspond to Label enum values. However, for ease
    * of development other strings can be used as tags. LABEL_UNSPECIFIED
    * should not be used here.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The timestamp of the worker_message.
    */
  var time: js.UndefOr[String] = js.undefined
  
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
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
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
