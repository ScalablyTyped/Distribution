package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the horizontal pod autoscaling feature, which
  * increases or decreases the number of replica pods a replication controller
  * has based on the resource usage of the existing pods.
  */
@js.native
trait SchemaHorizontalPodAutoscaling extends js.Object {
  /**
    * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster.
    * When enabled, it ensures that a Heapster pod is running in the cluster,
    * which is also used by the Cloud Monitoring service.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}

object SchemaHorizontalPodAutoscaling {
  @scala.inline
  def apply(): SchemaHorizontalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHorizontalPodAutoscaling]
  }
  @scala.inline
  implicit class SchemaHorizontalPodAutoscalingOps[Self <: SchemaHorizontalPodAutoscaling] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
  
}

