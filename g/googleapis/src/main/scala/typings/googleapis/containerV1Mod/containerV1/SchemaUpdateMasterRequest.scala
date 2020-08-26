package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UpdateMasterRequest updates the master of the cluster.
  */
@js.native
trait SchemaUpdateMasterRequest extends js.Object {
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the master to.  Users may specify either
    * explicit versions offered by Kubernetes Engine or version aliases, which
    * have the following behavior:  - &quot;latest&quot;: picks the highest
    * valid Kubernetes version - &quot;1.X&quot;: picks the highest valid
    * patch+gke.N patch in the 1.X version - &quot;1.X.Y&quot;: picks the
    * highest valid gke.N patch in the 1.X.Y version - &quot;1.X.Y-gke.N&quot;:
    * picks an explicit Kubernetes version - &quot;-&quot;: picks the default
    * Kubernetes version
    */
  var masterVersion: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster) of the cluster to update. Specified
    * in the format &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
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

object SchemaUpdateMasterRequest {
  @scala.inline
  def apply(): SchemaUpdateMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateMasterRequest]
  }
  @scala.inline
  implicit class SchemaUpdateMasterRequestOps[Self <: SchemaUpdateMasterRequest] (val x: Self) extends AnyVal {
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
    def setMasterVersion(value: String): Self = this.set("masterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterVersion: Self = this.set("masterVersion", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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

