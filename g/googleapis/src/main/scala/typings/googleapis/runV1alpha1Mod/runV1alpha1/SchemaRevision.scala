package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Revision is an immutable snapshot of code and configuration.  A revision
  * references a container image. Revisions are created by updates to a
  * Configuration.  Cloud Run does not currently support referencing a build
  * that is responsible for materializing the container image from source.  See
  * also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#revision
  */
@js.native
trait SchemaRevision extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of this resource, in this case &quot;Revision&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Revision, including name, namespace,
    * labels, and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Revision (from the client).
    */
  var spec: js.UndefOr[SchemaRevisionSpec] = js.native
  /**
    * Status communicates the observed state of the Revision (from the
    * controller).
    */
  var status: js.UndefOr[SchemaRevisionStatus] = js.native
}

object SchemaRevision {
  @scala.inline
  def apply(
    apiVersion: String = null,
    kind: String = null,
    metadata: SchemaObjectMeta = null,
    spec: SchemaRevisionSpec = null,
    status: SchemaRevisionStatus = null
  ): SchemaRevision = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRevision]
  }
}

