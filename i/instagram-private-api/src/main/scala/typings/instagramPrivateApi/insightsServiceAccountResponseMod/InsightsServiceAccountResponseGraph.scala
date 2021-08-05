package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseGraph extends StObject {
  
  var nodes: js.Array[InsightsServiceAccountResponseNodesItem]
}
object InsightsServiceAccountResponseGraph {
  
  inline def apply(nodes: js.Array[InsightsServiceAccountResponseNodesItem]): InsightsServiceAccountResponseGraph = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseGraph]
  }
  
  extension [Self <: InsightsServiceAccountResponseGraph](x: Self) {
    
    inline def setNodes(value: js.Array[InsightsServiceAccountResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: InsightsServiceAccountResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
