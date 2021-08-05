package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListNodePoolsResponse is the result of ListNodePoolsRequest.
  */
trait SchemaListNodePoolsResponse extends StObject {
  
  /**
    * A list of node pools for a cluster.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.undefined
}
object SchemaListNodePoolsResponse {
  
  inline def apply(): SchemaListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNodePoolsResponse]
  }
  
  extension [Self <: SchemaListNodePoolsResponse](x: Self) {
    
    inline def setNodePools(value: js.Array[SchemaNodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    inline def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    inline def setNodePoolsVarargs(value: SchemaNodePool*): Self = StObject.set(x, "nodePools", js.Array(value :_*))
  }
}
