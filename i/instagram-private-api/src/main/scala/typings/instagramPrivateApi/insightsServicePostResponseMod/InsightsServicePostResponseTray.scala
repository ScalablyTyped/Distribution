package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseTray extends StObject {
  
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
}
object InsightsServicePostResponseTray {
  
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem]): InsightsServicePostResponseTray = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseTray]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseTrayMutableBuilder[Self <: InsightsServicePostResponseTray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: InsightsServicePostResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
