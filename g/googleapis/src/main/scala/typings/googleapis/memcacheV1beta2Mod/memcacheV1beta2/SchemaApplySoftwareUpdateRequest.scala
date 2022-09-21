package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplySoftwareUpdateRequest extends StObject {
  
  /**
    * Whether to apply the update to all nodes. If set to true, will explicitly restrict users from specifying any nodes, and apply software update to all nodes (where applicable) within the instance.
    */
  var applyAll: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Nodes to which we should apply the update to. Note all the selected nodes are updated in parallel.
    */
  var nodeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApplySoftwareUpdateRequest {
  
  inline def apply(): SchemaApplySoftwareUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplySoftwareUpdateRequest]
  }
  
  extension [Self <: SchemaApplySoftwareUpdateRequest](x: Self) {
    
    inline def setApplyAll(value: Boolean): Self = StObject.set(x, "applyAll", value.asInstanceOf[js.Any])
    
    inline def setApplyAllNull: Self = StObject.set(x, "applyAll", null)
    
    inline def setApplyAllUndefined: Self = StObject.set(x, "applyAll", js.undefined)
    
    inline def setNodeIds(value: js.Array[String]): Self = StObject.set(x, "nodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsNull: Self = StObject.set(x, "nodeIds", null)
    
    inline def setNodeIdsUndefined: Self = StObject.set(x, "nodeIds", js.undefined)
    
    inline def setNodeIdsVarargs(value: String*): Self = StObject.set(x, "nodeIds", js.Array(value*))
  }
}
