package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerMessage provides information to the backend about a worker.
  */
@js.native
trait SchemaWorkerMessage extends js.Object {
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
  implicit class SchemaWorkerMessageOps[Self <: SchemaWorkerMessage] (val x: Self) extends AnyVal {
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
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setWorkerHealthReport(value: SchemaWorkerHealthReport): Self = this.set("workerHealthReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerHealthReport: Self = this.set("workerHealthReport", js.undefined)
    @scala.inline
    def setWorkerLifecycleEvent(value: SchemaWorkerLifecycleEvent): Self = this.set("workerLifecycleEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerLifecycleEvent: Self = this.set("workerLifecycleEvent", js.undefined)
    @scala.inline
    def setWorkerMessageCode(value: SchemaWorkerMessageCode): Self = this.set("workerMessageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMessageCode: Self = this.set("workerMessageCode", js.undefined)
    @scala.inline
    def setWorkerMetrics(value: SchemaResourceUtilizationReport): Self = this.set("workerMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerMetrics: Self = this.set("workerMetrics", js.undefined)
    @scala.inline
    def setWorkerShutdownNotice(value: SchemaWorkerShutdownNotice): Self = this.set("workerShutdownNotice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerShutdownNotice: Self = this.set("workerShutdownNotice", js.undefined)
  }
  
}

