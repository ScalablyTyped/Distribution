package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseTopPosts extends StObject {
  
  var edges: js.Array[_] = js.native
}
object InsightsServiceAccountResponseTopPosts {
  
  @scala.inline
  def apply(edges: js.Array[_]): InsightsServiceAccountResponseTopPosts = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseTopPosts]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseTopPostsMutableBuilder[Self <: InsightsServiceAccountResponseTopPosts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdges(value: js.Array[_]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: js.Any*): Self = StObject.set(x, "edges", js.Array(value :_*))
  }
}
