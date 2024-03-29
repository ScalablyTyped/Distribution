package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseActions extends StObject {
  
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
  
  var value: Double
}
object InsightsServicePostResponseActions {
  
  inline def apply(nodes: js.Array[InsightsServicePostResponseNodesItem], value: Double): InsightsServicePostResponseActions = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseActions]
  }
  
  extension [Self <: InsightsServicePostResponseActions](x: Self) {
    
    inline def setNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: InsightsServicePostResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
