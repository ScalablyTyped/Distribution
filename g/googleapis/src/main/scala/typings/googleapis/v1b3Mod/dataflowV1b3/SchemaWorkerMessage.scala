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
  def apply(
    labels: StringDictionary[String] = null,
    time: String = null,
    workerHealthReport: SchemaWorkerHealthReport = null,
    workerLifecycleEvent: SchemaWorkerLifecycleEvent = null,
    workerMessageCode: SchemaWorkerMessageCode = null,
    workerMetrics: SchemaResourceUtilizationReport = null,
    workerShutdownNotice: SchemaWorkerShutdownNotice = null
  ): SchemaWorkerMessage = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (workerHealthReport != null) __obj.updateDynamic("workerHealthReport")(workerHealthReport.asInstanceOf[js.Any])
    if (workerLifecycleEvent != null) __obj.updateDynamic("workerLifecycleEvent")(workerLifecycleEvent.asInstanceOf[js.Any])
    if (workerMessageCode != null) __obj.updateDynamic("workerMessageCode")(workerMessageCode.asInstanceOf[js.Any])
    if (workerMetrics != null) __obj.updateDynamic("workerMetrics")(workerMetrics.asInstanceOf[js.Any])
    if (workerShutdownNotice != null) __obj.updateDynamic("workerShutdownNotice")(workerShutdownNotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkerMessage]
  }
}

