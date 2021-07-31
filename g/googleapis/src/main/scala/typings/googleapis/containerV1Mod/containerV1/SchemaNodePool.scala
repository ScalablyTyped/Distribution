package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodePool contains the name and configuration for a cluster&#39;s node pool.
  * Node pools are a set of nodes (i.e. VM&#39;s), with a common configuration
  * and specification, under the control of the cluster master. They may have a
  * set of Kubernetes labels applied to them, which may be used to reference
  * them during pod scheduling. They may also be resized up or down, to
  * accommodate the workload.
  */
trait SchemaNodePool extends StObject {
  
  /**
    * Autoscaler configuration for this NodePool. Autoscaler is enabled only if
    * a valid configuration is present.
    */
  var autoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.undefined
  
  /**
    * Which conditions caused the current node pool state.
    */
  var conditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.undefined
  
  /**
    * The node configuration of the pool.
    */
  var config: js.UndefOr[SchemaNodeConfig] = js.undefined
  
  /**
    * The initial node count for the pool. You must ensure that your Compute
    * Engine &lt;a href=&quot;/compute/docs/resource-quotas&quot;&gt;resource
    * quota&lt;/a&gt; is sufficient for this number of instances. You must also
    * have available firewall and routes quota.
    */
  var initialNodeCount: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output only] The resource URLs of the [managed instance
    * groups](/compute/docs/instance-groups/creating-groups-of-managed-instances)
    * associated with this node pool.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * NodeManagement configuration for this NodePool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.undefined
  
  /**
    * The name of the node pool.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] The status of the nodes in this pool instance.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] Additional information about the current status of this
    * node pool instance, if available.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the Kubernetes of this node.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaNodePool {
  
  @scala.inline
  def apply(): SchemaNodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePool]
  }
  
  @scala.inline
  implicit class SchemaNodePoolMutableBuilder[Self <: SchemaNodePool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscaling(value: SchemaNodePoolAutoscaling): Self = StObject.set(x, "autoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingUndefined: Self = StObject.set(x, "autoscaling", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[SchemaStatusCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaStatusCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: SchemaNodeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setInitialNodeCount(value: Double): Self = StObject.set(x, "initialNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialNodeCountUndefined: Self = StObject.set(x, "initialNodeCount", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = StObject.set(x, "instanceGroupUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupUrlsUndefined: Self = StObject.set(x, "instanceGroupUrls", js.undefined)
    
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = StObject.set(x, "instanceGroupUrls", js.Array(value :_*))
    
    @scala.inline
    def setManagement(value: SchemaNodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
