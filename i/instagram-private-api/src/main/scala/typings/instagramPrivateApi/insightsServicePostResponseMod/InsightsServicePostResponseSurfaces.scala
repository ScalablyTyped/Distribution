package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseSurfaces extends StObject {
  
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
}
object InsightsServicePostResponseSurfaces {
  
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem]): InsightsServicePostResponseSurfaces = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseSurfaces]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseSurfacesMutableBuilder[Self <: InsightsServicePostResponseSurfaces] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: InsightsServicePostResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
