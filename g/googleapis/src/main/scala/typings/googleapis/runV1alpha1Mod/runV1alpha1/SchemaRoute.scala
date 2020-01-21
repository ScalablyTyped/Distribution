package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Route is responsible for configuring ingress over a collection of
  * Revisions. Some of the Revisions a Route distributes traffic over may be
  * specified by referencing the Configuration responsible for creating them;
  * in these cases the Route is additionally responsible for monitoring the
  * Configuration for &quot;latest ready&quot; revision changes, and smoothly
  * rolling out latest revisions. See also:
  * https://github.com/knative/serving/blob/master/docs/spec/overview.md#route
  * Cloud Run currently supports referencing a single Configuration to
  * automatically deploy the &quot;latest ready&quot; Revision from that
  * Configuration.
  */
@js.native
trait SchemaRoute extends js.Object {
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * The kind of this resource, in this case always &quot;Route&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metadata associated with this Route, including name, namespace, labels,
    * and annotations.
    */
  var metadata: js.UndefOr[SchemaObjectMeta] = js.native
  /**
    * Spec holds the desired state of the Route (from the client).
    */
  var spec: js.UndefOr[SchemaRouteSpec] = js.native
  /**
    * Status communicates the observed state of the Route (from the
    * controller).
    */
  var status: js.UndefOr[SchemaRouteStatus] = js.native
}

object SchemaRoute {
  @scala.inline
  def apply(
    apiVersion: String = null,
    kind: String = null,
    metadata: SchemaObjectMeta = null,
    spec: SchemaRouteSpec = null,
    status: SchemaRouteStatus = null
  ): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoute]
  }
}

