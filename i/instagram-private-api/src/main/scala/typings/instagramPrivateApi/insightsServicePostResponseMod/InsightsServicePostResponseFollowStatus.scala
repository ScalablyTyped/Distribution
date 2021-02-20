package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseFollowStatus extends StObject {
  
  var nodes: js.Array[InsightsServicePostResponseNodesItem] = js.native
}
object InsightsServicePostResponseFollowStatus {
  
  @scala.inline
  def apply(nodes: js.Array[InsightsServicePostResponseNodesItem]): InsightsServicePostResponseFollowStatus = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseFollowStatus]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseFollowStatusMutableBuilder[Self <: InsightsServicePostResponseFollowStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodes(value: js.Array[InsightsServicePostResponseNodesItem]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: InsightsServicePostResponseNodesItem*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
