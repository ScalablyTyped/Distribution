package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponsePost extends StObject {
  
  var nodes: js.Array[InsightsServicePostResponseNodesItem]
  
  var value: Double
}
object InsightsServicePostResponsePost {
  
  inline def apply(nodes: js.Array[InsightsServicePostResponseNodesItem], value: Double): InsightsServicePostResponsePost = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponsePost]
  }
  
  extension [Self <: InsightsServicePostResponsePost](x: Self) {
    
    inline def setNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: InsightsServicePostResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
