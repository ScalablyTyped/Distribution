package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerHealthReport contains information about the health of a worker.  The
  * VM should be identified by the labels attached to the WorkerMessage that
  * this health ping belongs to.
  */
@js.native
trait SchemaWorkerHealthReport extends js.Object {
  /**
    * The pods running on the worker. See:
    * http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod
    * This field is used by the worker to send the status of the indvidual
    * containers running on each worker.
    */
  var pods: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * The interval at which the worker is sending health reports. The default
    * value of 0 should be interpreted as the field is not being explicitly set
    * by the worker.
    */
  var reportInterval: js.UndefOr[String] = js.native
  /**
    * Whether the VM is healthy.
    */
  var vmIsHealthy: js.UndefOr[Boolean] = js.native
  /**
    * The time the VM was booted.
    */
  var vmStartupTime: js.UndefOr[String] = js.native
}

object SchemaWorkerHealthReport {
  @scala.inline
  def apply(
    pods: js.Array[StringDictionary[_]] = null,
    reportInterval: String = null,
    vmIsHealthy: js.UndefOr[Boolean] = js.undefined,
    vmStartupTime: String = null
  ): SchemaWorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    if (pods != null) __obj.updateDynamic("pods")(pods.asInstanceOf[js.Any])
    if (reportInterval != null) __obj.updateDynamic("reportInterval")(reportInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(vmIsHealthy)) __obj.updateDynamic("vmIsHealthy")(vmIsHealthy.asInstanceOf[js.Any])
    if (vmStartupTime != null) __obj.updateDynamic("vmStartupTime")(vmStartupTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWorkerHealthReport]
  }
}

