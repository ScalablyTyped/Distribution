package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseAccountHashtags extends StObject {
  
  var count: Double
  
  var nodes: js.Array[js.Any]
}
object InsightsServiceAccountResponseAccountHashtags {
  
  @scala.inline
  def apply(count: Double, nodes: js.Array[js.Any]): InsightsServiceAccountResponseAccountHashtags = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountHashtags]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountHashtagsMutableBuilder[Self <: InsightsServiceAccountResponseAccountHashtags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[js.Any]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Any*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
