package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListNodes.
  */
trait SchemaListNodesResponse extends StObject {
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The listed nodes.
    */
  var nodes: js.UndefOr[js.Array[SchemaNode]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaListNodesResponse {
  
  @scala.inline
  def apply(): SchemaListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNodesResponse]
  }
  
  @scala.inline
  implicit class SchemaListNodesResponseMutableBuilder[Self <: SchemaListNodesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[SchemaNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: SchemaNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
