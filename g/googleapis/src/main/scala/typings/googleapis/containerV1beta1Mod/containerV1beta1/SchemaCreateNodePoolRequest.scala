package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CreateNodePoolRequest creates a node pool for a cluster.
  */
@js.native
trait SchemaCreateNodePoolRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster. This field has been deprecated and
    * replaced by the parent field.
    */
  var clusterId: js.UndefOr[String] = js.native
  
  /**
    * The node pool to create.
    */
  var nodePool: js.UndefOr[SchemaNodePool] = js.native
  
  /**
    * The parent (project, location, cluster id) where the node pool will be
    * created. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://developers.google.com/console/help/new/#projectnumber).
    * This field has been deprecated and replaced by the parent field.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaCreateNodePoolRequest {
  
  @scala.inline
  def apply(): SchemaCreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNodePoolRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateNodePoolRequestMutableBuilder[Self <: SchemaCreateNodePoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    @scala.inline
    def setNodePool(value: SchemaNodePool): Self = StObject.set(x, "nodePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePoolUndefined: Self = StObject.set(x, "nodePool", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
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
