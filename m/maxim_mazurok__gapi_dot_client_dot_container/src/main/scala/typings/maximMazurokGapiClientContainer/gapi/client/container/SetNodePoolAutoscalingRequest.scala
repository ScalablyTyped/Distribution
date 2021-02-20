package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetNodePoolAutoscalingRequest extends StObject {
  
  /** Required. Autoscaling configuration for the node pool. */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  
  /** Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field. */
  var clusterId: js.UndefOr[String] = js.native
  
  /** The name (project, location, cluster, node pool) of the node pool to set autoscaler settings. Specified in the format `projects/∗/locations/∗/clusters/∗/nodePools/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Deprecated. The name of the node pool to upgrade. This field has been deprecated and replaced by the name field. */
  var nodePoolId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name
    * field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and
    * replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}
object SetNodePoolAutoscalingRequest {
  
  @scala.inline
  def apply(): SetNodePoolAutoscalingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNodePoolAutoscalingRequest]
  }
  
  @scala.inline
  implicit class SetNodePoolAutoscalingRequestMutableBuilder[Self <: SetNodePoolAutoscalingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscaling(value: NodePoolAutoscaling): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodePoolId(value: String): Self = StObject.set(x, "nodePoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePoolIdUndefined: Self = StObject.set(x, "nodePoolId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
