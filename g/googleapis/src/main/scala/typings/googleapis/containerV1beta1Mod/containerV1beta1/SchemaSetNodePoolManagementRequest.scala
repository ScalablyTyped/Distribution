package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SetNodePoolManagementRequest sets the node management properties of a node
  * pool.
  */
trait SchemaSetNodePoolManagementRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster to update. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * NodeManagement configuration for the node pool.
    */
  var management: js.UndefOr[SchemaNodeManagement] = js.undefined
  
  /**
    * The name (project, location, cluster, node pool id) of the node pool to
    * set management properties. Specified in the format
    * &#39;projects/x/locations/x/clusters/x/nodePools/ *&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the node pool to update. This field has been
    * deprecated and replaced by the name field.
    */
  var nodePoolId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaSetNodePoolManagementRequest {
  
  @scala.inline
  def apply(): SchemaSetNodePoolManagementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetNodePoolManagementRequest]
  }
  
  @scala.inline
  implicit class SchemaSetNodePoolManagementRequestMutableBuilder[Self <: SchemaSetNodePoolManagementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setManagement(value: SchemaNodeManagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
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
