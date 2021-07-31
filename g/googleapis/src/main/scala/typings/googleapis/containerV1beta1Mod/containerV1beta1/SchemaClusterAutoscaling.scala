package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ClusterAutoscaling contains global, per-cluster information required by
  * Cluster Autoscaler to automatically adjust the size of the cluster and
  * create/delete node pools based on the current needs.
  */
trait SchemaClusterAutoscaling extends StObject {
  
  /**
    * Enables automatic node pool creation and deletion.
    */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains global constraints regarding minimum and maximum amount of
    * resources in the cluster.
    */
  var resourceLimits: js.UndefOr[js.Array[SchemaResourceLimit]] = js.undefined
}
object SchemaClusterAutoscaling {
  
  @scala.inline
  def apply(): SchemaClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterAutoscaling]
  }
  
  @scala.inline
  implicit class SchemaClusterAutoscalingMutableBuilder[Self <: SchemaClusterAutoscaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableNodeAutoprovisioning(value: Boolean): Self = StObject.set(x, "enableNodeAutoprovisioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNodeAutoprovisioningUndefined: Self = StObject.set(x, "enableNodeAutoprovisioning", js.undefined)
    
    @scala.inline
    def setResourceLimits(value: js.Array[SchemaResourceLimit]): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
    
    @scala.inline
    def setResourceLimitsVarargs(value: SchemaResourceLimit*): Self = StObject.set(x, "resourceLimits", js.Array(value :_*))
  }
}
