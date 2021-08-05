package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseEdgesItem extends StObject {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var node: PostsInsightsFeedResponseNode
}
object PostsInsightsFeedResponseEdgesItem {
  
  inline def apply(node: PostsInsightsFeedResponseNode): PostsInsightsFeedResponseEdgesItem = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseEdgesItem]
  }
  
  extension [Self <: PostsInsightsFeedResponseEdgesItem](x: Self) {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setNode(value: PostsInsightsFeedResponseNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
