package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeMatcher extends StObject {
  
  /**
    * Specifies match criteria on the node id.
    */
  var nodeId: js.UndefOr[SchemaStringMatcher] = js.undefined
  
  /**
    * Specifies match criteria on the node metadata.
    */
  var nodeMetadatas: js.UndefOr[js.Array[SchemaStructMatcher]] = js.undefined
}
object SchemaNodeMatcher {
  
  inline def apply(): SchemaNodeMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeMatcher]
  }
  
  extension [Self <: SchemaNodeMatcher](x: Self) {
    
    inline def setNodeId(value: SchemaStringMatcher): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodeMetadatas(value: js.Array[SchemaStructMatcher]): Self = StObject.set(x, "nodeMetadatas", value.asInstanceOf[js.Any])
    
    inline def setNodeMetadatasUndefined: Self = StObject.set(x, "nodeMetadatas", js.undefined)
    
    inline def setNodeMetadatasVarargs(value: SchemaStructMatcher*): Self = StObject.set(x, "nodeMetadatas", js.Array(value*))
  }
}
