package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListNodePoolsResponse is the result of ListNodePoolsRequest.
  */
@js.native
trait SchemaListNodePoolsResponse extends StObject {
  
  /**
    * A list of node pools for a cluster.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.native
}
object SchemaListNodePoolsResponse {
  
  @scala.inline
  def apply(): SchemaListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNodePoolsResponse]
  }
  
  @scala.inline
  implicit class SchemaListNodePoolsResponseMutableBuilder[Self <: SchemaListNodePoolsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodePools(value: js.Array[SchemaNodePool]): Self = StObject.set(x, "nodePools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePoolsUndefined: Self = StObject.set(x, "nodePools", js.undefined)
    
    @scala.inline
    def setNodePoolsVarargs(value: SchemaNodePool*): Self = StObject.set(x, "nodePools", js.Array(value :_*))
  }
}
