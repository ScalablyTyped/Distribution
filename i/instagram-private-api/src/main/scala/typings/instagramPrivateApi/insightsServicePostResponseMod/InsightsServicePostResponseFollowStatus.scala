package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseFollowStatus extends StObject {
  
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
}
object InsightsServicePostResponseFollowStatus {
  
  inline def apply(nodes: js.Array[InsightsServicePostResponseNodesItem]): InsightsServicePostResponseFollowStatus = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseFollowStatus]
  }
  
  extension [Self <: InsightsServicePostResponseFollowStatus](x: Self) {
    
    inline def setNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: InsightsServicePostResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
