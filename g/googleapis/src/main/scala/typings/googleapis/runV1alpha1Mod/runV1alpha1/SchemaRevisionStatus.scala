package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RevisionStatus communicates the observed state of the Revision (from the
  * controller).
  */
@js.native
trait SchemaRevisionStatus extends js.Object {
  /**
    * Conditions communicates information about ongoing/complete reconciliation
    * processes that bring the &quot;spec&quot; inline with the observed state
    * of the world.  As a Revision is being prepared, it will incrementally
    * update conditions &quot;ResourcesAvailable&quot;,
    * &quot;ContainerHealthy&quot;, and &quot;Active&quot;, which contribute to
    * the overall &quot;Ready&quot; condition.
    */
  var conditions: js.UndefOr[js.Array[SchemaRevisionCondition]] = js.native
  /**
    * ImageDigest holds the resolved digest for the image specified within
    * .Spec.Container.Image. The digest is resolved during the creation of
    * Revision. This field holds the digest value regardless of whether a tag
    * or digest was originally specified in the Container object.
    */
  var imageDigest: js.UndefOr[String] = js.native
  /**
    * Specifies the generated logging url for this particular revision based on
    * the revision url template specified in the controller&#39;s config.
    * +optional
    */
  var logUrl: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the Revision that was
    * last processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration =
    * metadata.generation, and the Ready condition&#39;s status is True or
    * False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  /**
    * Not currently used by Cloud Run.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object SchemaRevisionStatus {
  @scala.inline
  def apply(): SchemaRevisionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionStatus]
  }
  @scala.inline
  implicit class SchemaRevisionStatusOps[Self <: SchemaRevisionStatus] (val x: Self) extends AnyVal {
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
    def setConditionsVarargs(value: SchemaRevisionCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[SchemaRevisionCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setImageDigest(value: String): Self = this.set("imageDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDigest: Self = this.set("imageDigest", js.undefined)
    @scala.inline
    def setLogUrl(value: String): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUrl: Self = this.set("logUrl", js.undefined)
    @scala.inline
    def setObservedGeneration(value: Double): Self = this.set("observedGeneration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservedGeneration: Self = this.set("observedGeneration", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

