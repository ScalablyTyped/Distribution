package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsAddNodesRequest extends StObject {
  
  /**
    * Count of additional nodes to be added to the node group.
    */
  var additionalNodeCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNodeGroupsAddNodesRequest {
  
  inline def apply(): SchemaNodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsAddNodesRequest]
  }
  
  extension [Self <: SchemaNodeGroupsAddNodesRequest](x: Self) {
    
    inline def setAdditionalNodeCount(value: Double): Self = StObject.set(x, "additionalNodeCount", value.asInstanceOf[js.Any])
    
    inline def setAdditionalNodeCountNull: Self = StObject.set(x, "additionalNodeCount", null)
    
    inline def setAdditionalNodeCountUndefined: Self = StObject.set(x, "additionalNodeCount", js.undefined)
  }
}
