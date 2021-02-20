package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseHashtags extends StObject {
  
  var count: Double = js.native
  
  var nodes: js.Array[_] = js.native
}
object InsightsServicePostResponseHashtags {
  
  @scala.inline
  def apply(count: Double, nodes: js.Array[_]): InsightsServicePostResponseHashtags = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseHashtags]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseHashtagsMutableBuilder[Self <: InsightsServicePostResponseHashtags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[_]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: js.Any*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
