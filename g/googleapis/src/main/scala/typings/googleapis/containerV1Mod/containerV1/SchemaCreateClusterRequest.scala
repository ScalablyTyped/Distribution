package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreateClusterRequest creates a cluster.
  */
@js.native
trait SchemaCreateClusterRequest extends js.Object {
  /**
    * A [cluster
    * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
    */
  var cluster: js.UndefOr[SchemaCluster] = js.native
  /**
    * The parent (project and location) where the cluster will be created.
    * Specified in the format &#39;projects/x/locations/ *&#39;.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the parent field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaCreateClusterRequest {
  @scala.inline
  def apply(): SchemaCreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClusterRequest]
  }
  @scala.inline
  implicit class SchemaCreateClusterRequestOps[Self <: SchemaCreateClusterRequest] (val x: Self) extends AnyVal {
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
    def setCluster(value: SchemaCluster): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
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

