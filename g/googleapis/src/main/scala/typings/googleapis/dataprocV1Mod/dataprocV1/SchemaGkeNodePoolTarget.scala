package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGkeNodePoolTarget extends StObject {
  
  /**
    * Required. The target GKE node pool. Format: 'projects/{project\}/locations/{location\}/clusters/{cluster\}/nodePools/{node_pool\}'
    */
  var nodePool: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The configuration for the GKE node pool.If specified, Dataproc attempts to create a node pool with the specified shape. If one with the same name already exists, it is verified against all specified fields. If a field differs, the virtual cluster creation will fail.If omitted, any node pool with the specified name is used. If a node pool with the specified name does not exist, Dataproc create a node pool with default values.This is an input only field. It will not be returned by the API.
    */
  var nodePoolConfig: js.UndefOr[SchemaGkeNodePoolConfig] = js.undefined
  
  /**
    * Required. The roles associated with the GKE node pool.
    */
  var roles: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGkeNodePoolTarget {
  
  inline def apply(): SchemaGkeNodePoolTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGkeNodePoolTarget]
  }
  
  extension [Self <: SchemaGkeNodePoolTarget](x: Self) {
    
    inline def setNodePool(value: String): Self = StObject.set(x, "nodePool", value.asInstanceOf[js.Any])
    
    inline def setNodePoolConfig(value: SchemaGkeNodePoolConfig): Self = StObject.set(x, "nodePoolConfig", value.asInstanceOf[js.Any])
    
    inline def setNodePoolConfigUndefined: Self = StObject.set(x, "nodePoolConfig", js.undefined)
    
    inline def setNodePoolNull: Self = StObject.set(x, "nodePool", null)
    
    inline def setNodePoolUndefined: Self = StObject.set(x, "nodePool", js.undefined)
    
    inline def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesNull: Self = StObject.set(x, "roles", null)
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value*))
  }
}
