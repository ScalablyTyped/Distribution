package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SetNodePoolSizeRequest sets the size a node pool.
  */
trait SchemaSetNodePoolSizeRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster to update. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The name (project, location, cluster, node pool id) of the node pool to
    * set size. Specified in the format
    * &#39;projects/x/locations/x/clusters/x/nodePools/ *&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The desired node count for the pool.
    */
  var nodeCount: js.UndefOr[Double] = js.undefined
  
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
object SchemaSetNodePoolSizeRequest {
  
  inline def apply(): SchemaSetNodePoolSizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetNodePoolSizeRequest]
  }
  
  extension [Self <: SchemaSetNodePoolSizeRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    inline def setNodePoolId(value: String): Self = StObject.set(x, "nodePoolId", value.asInstanceOf[js.Any])
    
    inline def setNodePoolIdUndefined: Self = StObject.set(x, "nodePoolId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
