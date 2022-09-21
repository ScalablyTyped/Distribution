package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodePool extends StObject {
  
  /**
    * Kubernetes Node pool name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Nodes associated with the finding.
    */
  var nodes: js.UndefOr[js.Array[SchemaNode]] = js.undefined
}
object SchemaNodePool {
  
  inline def apply(): SchemaNodePool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodePool]
  }
  
  extension [Self <: SchemaNodePool](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodes(value: js.Array[SchemaNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: SchemaNode*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
