package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalListNodesResponse extends StObject {
  
  /**
    * A pagination token returned from a previous call to ListNodes that indicates from where listing should continue. If the field is missing or empty, it means there is no more nodes.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The nodes that match the request.
    */
  var nodes: js.UndefOr[js.Array[SchemaSasPortalNode]] = js.undefined
}
object SchemaSasPortalListNodesResponse {
  
  inline def apply(): SchemaSasPortalListNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalListNodesResponse]
  }
  
  extension [Self <: SchemaSasPortalListNodesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNodes(value: js.Array[SchemaSasPortalNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SchemaSasPortalNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
