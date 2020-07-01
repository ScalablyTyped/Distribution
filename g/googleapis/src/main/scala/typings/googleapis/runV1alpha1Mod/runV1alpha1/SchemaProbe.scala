package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Probe describes a health check to be performed against a container to
  * determine whether it is alive or ready to receive traffic.
  */
@js.native
trait SchemaProbe extends js.Object {
  /**
    * Minimum consecutive failures for the probe to be considered failed after
    * having succeeded. Defaults to 3. Minimum value is 1. +optional
    */
  var failureThreshold: js.UndefOr[Double] = js.native
  /**
    * The action taken to determine the health of a container
    */
  var handler: js.UndefOr[SchemaHandler] = js.native
  /**
    * Number of seconds after the container has started before liveness probes
    * are initiated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var initialDelaySeconds: js.UndefOr[Double] = js.native
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds.
    * Minimum value is 1. +optional
    */
  var periodSeconds: js.UndefOr[Double] = js.native
  /**
    * Minimum consecutive successes for the probe to be considered successful
    * after having failed. Defaults to 1. Must be 1 for liveness. Minimum value
    * is 1. +optional
    */
  var successThreshold: js.UndefOr[Double] = js.native
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second.
    * Minimum value is 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var timeoutSeconds: js.UndefOr[Double] = js.native
}

object SchemaProbe {
  @scala.inline
  def apply(
    failureThreshold: js.UndefOr[Double] = js.undefined,
    handler: SchemaHandler = null,
    initialDelaySeconds: js.UndefOr[Double] = js.undefined,
    periodSeconds: js.UndefOr[Double] = js.undefined,
    successThreshold: js.UndefOr[Double] = js.undefined,
    timeoutSeconds: js.UndefOr[Double] = js.undefined
  ): SchemaProbe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failureThreshold)) __obj.updateDynamic("failureThreshold")(failureThreshold.get.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDelaySeconds)) __obj.updateDynamic("initialDelaySeconds")(initialDelaySeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(periodSeconds)) __obj.updateDynamic("periodSeconds")(periodSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(successThreshold)) __obj.updateDynamic("successThreshold")(successThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutSeconds)) __obj.updateDynamic("timeoutSeconds")(timeoutSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProbe]
  }
}

