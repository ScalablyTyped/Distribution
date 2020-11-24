package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ClusterAutoscaling contains global, per-cluster information required by
  * Cluster Autoscaler to automatically adjust the size of the cluster and
  * create/delete node pools based on the current needs.
  */
@js.native
trait SchemaClusterAutoscaling extends js.Object {
  
  /**
    * Enables automatic node pool creation and deletion.
    */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.native
  
  /**
    * Contains global constraints regarding minimum and maximum amount of
    * resources in the cluster.
    */
  var resourceLimits: js.UndefOr[js.Array[SchemaResourceLimit]] = js.native
}
object SchemaClusterAutoscaling {
  
  @scala.inline
  def apply(): SchemaClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterAutoscaling]
  }
  
  @scala.inline
  implicit class SchemaClusterAutoscalingOps[Self <: SchemaClusterAutoscaling] (val x: Self) extends AnyVal {
    
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
    def setEnableNodeAutoprovisioning(value: Boolean): Self = this.set("enableNodeAutoprovisioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNodeAutoprovisioning: Self = this.set("enableNodeAutoprovisioning", js.undefined)
    
    @scala.inline
    def setResourceLimitsVarargs(value: SchemaResourceLimit*): Self = this.set("resourceLimits", js.Array(value :_*))
    
    @scala.inline
    def setResourceLimits(value: js.Array[SchemaResourceLimit]): Self = this.set("resourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceLimits: Self = this.set("resourceLimits", js.undefined)
  }
}
