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
  def apply(): SchemaRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoute]
  }
  @scala.inline
  implicit class SchemaRouteOps[Self <: SchemaRoute] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setSpec(value: SchemaRouteSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setStatus(value: SchemaRouteStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

