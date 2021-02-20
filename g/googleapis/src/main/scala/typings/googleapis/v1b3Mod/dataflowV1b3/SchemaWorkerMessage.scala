package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerMessage provides information to the backend about a worker.
  */
@js.native
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
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The timestamp of the worker_message.
    */
  var time: js.UndefOr[String] = js.native
  
  /**
    * The health of a worker.
    */
  var workerHealthReport: js.UndefOr[SchemaWorkerHealthReport] = js.native
  
  /**
    * Record of worker lifecycle events.
    */
  var workerLifecycleEvent: js.UndefOr[SchemaWorkerLifecycleEvent] = js.native
  
  /**
    * A worker message code.
    */
  var workerMessageCode: js.UndefOr[SchemaWorkerMessageCode] = js.native
  
  /**
    * Resource metrics reported by workers.
    */
  var workerMetrics: js.UndefOr[SchemaResourceUtilizationReport] = js.native
  
  /**
    * Shutdown notice by workers.
    */
  var workerShutdownNotice: js.UndefOr[SchemaWorkerShutdownNotice] = js.native
}
object SchemaWorkerMessage {
  
  @scala.inline
  def apply(): SchemaWorkerMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerMessage]
  }
  
  @scala.inline
  implicit class SchemaWorkerMessageMutableBuilder[Self <: SchemaWorkerMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setWorkerHealthReport(value: SchemaWorkerHealthReport): Self = StObject.set(x, "workerHealthReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerHealthReportUndefined: Self = StObject.set(x, "workerHealthReport", js.undefined)
    
    @scala.inline
    def setWorkerLifecycleEvent(value: SchemaWorkerLifecycleEvent): Self = StObject.set(x, "workerLifecycleEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerLifecycleEventUndefined: Self = StObject.set(x, "workerLifecycleEvent", js.undefined)
    
    @scala.inline
    def setWorkerMessageCode(value: SchemaWorkerMessageCode): Self = StObject.set(x, "workerMessageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMessageCodeUndefined: Self = StObject.set(x, "workerMessageCode", js.undefined)
    
    @scala.inline
    def setWorkerMetrics(value: SchemaResourceUtilizationReport): Self = StObject.set(x, "workerMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerMetricsUndefined: Self = StObject.set(x, "workerMetrics", js.undefined)
    
    @scala.inline
    def setWorkerShutdownNotice(value: SchemaWorkerShutdownNotice): Self = StObject.set(x, "workerShutdownNotice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerShutdownNoticeUndefined: Self = StObject.set(x, "workerShutdownNotice", js.undefined)
  }
}
