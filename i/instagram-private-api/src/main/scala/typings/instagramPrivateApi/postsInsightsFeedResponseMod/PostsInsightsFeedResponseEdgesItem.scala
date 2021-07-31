package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseEdgesItem extends StObject {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var node: PostsInsightsFeedResponseNode
}
object PostsInsightsFeedResponseEdgesItem {
  
  @scala.inline
  def apply(node: PostsInsightsFeedResponseNode): PostsInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseEdgesItem]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseEdgesItemMutableBuilder[Self <: PostsInsightsFeedResponseEdgesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setNode(value: PostsInsightsFeedResponseNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
