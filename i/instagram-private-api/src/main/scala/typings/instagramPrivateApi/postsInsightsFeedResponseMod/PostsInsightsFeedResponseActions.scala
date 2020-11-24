package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseActions extends js.Object {
  
  var edges: js.Array[PostsInsightsFeedResponseEdgesItem] = js.native
}
object PostsInsightsFeedResponseActions {
  
  @scala.inline
  def apply(edges: js.Array[PostsInsightsFeedResponseEdgesItem]): PostsInsightsFeedResponseActions = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseActions]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseActionsOps[Self <: PostsInsightsFeedResponseActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgesVarargs(value: PostsInsightsFeedResponseEdgesItem*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[PostsInsightsFeedResponseEdgesItem]): Self = this.set("edges", value.asInstanceOf[js.Any])
  }
}
