package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostsInsightsFeedResponseShareCount extends StObject {
  
  var tray: PostsInsightsFeedResponseTray = js.native
}
object PostsInsightsFeedResponseShareCount {
  
  @scala.inline
  def apply(tray: PostsInsightsFeedResponseTray): PostsInsightsFeedResponseShareCount = {
    val __obj = js.Dynamic.literal(tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseShareCount]
  }
  
  @scala.inline
  implicit class PostsInsightsFeedResponseShareCountMutableBuilder[Self <: PostsInsightsFeedResponseShareCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTray(value: PostsInsightsFeedResponseTray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
  }
}
