package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetNodePoolVersionRequest updates the version of a node pool.
  */
@js.native
trait SchemaUpdateNodePoolRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The desired image type for the node pool.
    */
  var imageType: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster, node pool) of the node pool to
    * update. Specified in the format
    * &#39;projects/x/locations/x/clusters/x/nodePools/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the node pool to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var nodePoolId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade).
    * Users may specify either explicit versions offered by Kubernetes Engine
    * or version aliases, which have the following behavior:  -
    * &quot;latest&quot;: picks the highest valid Kubernetes version -
    * &quot;1.X&quot;: picks the highest valid patch+gke.N patch in the 1.X
    * version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch in
    * the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit Kubernetes
    * version - &quot;-&quot;: picks the Kubernetes master version
    */
  var nodeVersion: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaUpdateNodePoolRequest {
  @scala.inline
  def apply(): SchemaUpdateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateNodePoolRequest]
  }
  @scala.inline
  implicit class SchemaUpdateNodePoolRequestOps[Self <: SchemaUpdateNodePoolRequest] (val x: Self) extends AnyVal {
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
    def setClusterId(value: String): Self = this.set("clusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterId: Self = this.set("clusterId", js.undefined)
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNodePoolId(value: String): Self = this.set("nodePoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePoolId: Self = this.set("nodePoolId", js.undefined)
    @scala.inline
    def setNodeVersion(value: String): Self = this.set("nodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeVersion: Self = this.set("nodeVersion", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

