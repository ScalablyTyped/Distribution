package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CreateNodePoolRequest creates a node pool for a cluster.
  */
trait SchemaCreateNodePoolRequest extends StObject {
  
  /**
    * Deprecated. The name of the cluster. This field has been deprecated and
    * replaced by the parent field.
    */
  var clusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The node pool to create.
    */
  var nodePool: js.UndefOr[SchemaNodePool] = js.undefined
  
  /**
    * The parent (project, location, cluster id) where the node pool will be
    * created. Specified in the format
    * &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://developers.google.com/console/help/new/#projectnumber).
    * This field has been deprecated and replaced by the parent field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the parent field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaCreateNodePoolRequest {
  
  inline def apply(): SchemaCreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateNodePoolRequest]
  }
  
  extension [Self <: SchemaCreateNodePoolRequest](x: Self) {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
    
    inline def setNodePool(value: SchemaNodePool): Self = StObject.set(x, "nodePool", value.asInstanceOf[js.Any])
    
    inline def setNodePoolUndefined: Self = StObject.set(x, "nodePool", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
