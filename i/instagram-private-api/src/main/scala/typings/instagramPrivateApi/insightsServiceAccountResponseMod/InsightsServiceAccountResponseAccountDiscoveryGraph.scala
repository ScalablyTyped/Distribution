package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseAccountDiscoveryGraph extends StObject {
  
  var nodes: js.Array[InsightsServiceAccountResponseNodesItem]
}
object InsightsServiceAccountResponseAccountDiscoveryGraph {
  
  @scala.inline
  def apply(nodes: js.Array[InsightsServiceAccountResponseNodesItem]): InsightsServiceAccountResponseAccountDiscoveryGraph = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountDiscoveryGraph]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountDiscoveryGraphMutableBuilder[Self <: InsightsServiceAccountResponseAccountDiscoveryGraph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[InsightsServiceAccountResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: InsightsServiceAccountResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
