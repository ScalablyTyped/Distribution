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
  def apply(
    conditions: js.Array[SchemaRevisionCondition] = null,
    imageDigest: String = null,
    logUrl: String = null,
    observedGeneration: js.UndefOr[Double] = js.undefined,
    serviceName: String = null
  ): SchemaRevisionStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(observedGeneration)) __obj.updateDynamic("observedGeneration")(observedGeneration.get.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevisionStatus]
  }
}

