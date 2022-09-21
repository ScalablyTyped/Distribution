package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplyParametersRequest extends StObject {
  
  /**
    * Whether to apply instance-level parameter group to all nodes. If set to true, users are restricted from specifying individual nodes, and `ApplyParameters` updates all nodes within the instance.
    */
  var applyAll: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Nodes to which the instance-level parameter group is applied.
    */
  var nodeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApplyParametersRequest {
  
  inline def apply(): SchemaApplyParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplyParametersRequest]
  }
  
  extension [Self <: SchemaApplyParametersRequest](x: Self) {
    
    inline def setApplyAll(value: Boolean): Self = StObject.set(x, "applyAll", value.asInstanceOf[js.Any])
    
    inline def setApplyAllNull: Self = StObject.set(x, "applyAll", null)
    
    inline def setApplyAllUndefined: Self = StObject.set(x, "applyAll", js.undefined)
    
    inline def setNodeIds(value: js.Array[String]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsNull: Self = StObject.set(x, "nodeIds", null)
    
    inline def setNodeIdsUndefined: Self = StObject.set(x, "nodeIds", js.undefined)
    
    inline def setNodeIdsVarargs(value: String*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
