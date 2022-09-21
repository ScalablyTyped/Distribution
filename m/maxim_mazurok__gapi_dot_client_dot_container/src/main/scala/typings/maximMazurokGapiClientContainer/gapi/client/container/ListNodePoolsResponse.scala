package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodePoolsResponse extends StObject {
  
  /** A list of node pools for a cluster. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.undefined
}
object ListNodePoolsResponse {
  
  inline def apply(): ListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodePoolsResponse]
  }
  
  extension [Self <: ListNodePoolsResponse](x: Self) {
    
    inline def setNodePools(value: js.Array[NodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: NodePool*): Self = StObject.set(x, "nodePools", js.Array(value*))
  }
}
