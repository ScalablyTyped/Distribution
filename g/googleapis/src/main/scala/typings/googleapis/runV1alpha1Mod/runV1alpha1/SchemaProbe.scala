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
  def apply(): SchemaProbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProbe]
  }
  @scala.inline
  implicit class SchemaProbeOps[Self <: SchemaProbe] (val x: Self) extends AnyVal {
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
    def setFailureThreshold(value: Double): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    @scala.inline
    def setHandler(value: SchemaHandler): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    @scala.inline
    def setInitialDelaySeconds(value: Double): Self = this.set("initialDelaySeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDelaySeconds: Self = this.set("initialDelaySeconds", js.undefined)
    @scala.inline
    def setPeriodSeconds(value: Double): Self = this.set("periodSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodSeconds: Self = this.set("periodSeconds", js.undefined)
    @scala.inline
    def setSuccessThreshold(value: Double): Self = this.set("successThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessThreshold: Self = this.set("successThreshold", js.undefined)
    @scala.inline
    def setTimeoutSeconds(value: Double): Self = this.set("timeoutSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutSeconds: Self = this.set("timeoutSeconds", js.undefined)
  }
  
}

