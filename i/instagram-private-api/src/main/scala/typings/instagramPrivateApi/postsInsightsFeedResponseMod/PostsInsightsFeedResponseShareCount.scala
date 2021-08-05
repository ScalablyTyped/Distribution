package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseShareCount extends StObject {
  
  var tray: PostsInsightsFeedResponseTray
}
object PostsInsightsFeedResponseShareCount {
  
  inline def apply(tray: PostsInsightsFeedResponseTray): PostsInsightsFeedResponseShareCount = {
    val __obj = js.Dynamic.literal(tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseShareCount]
  }
  
  extension [Self <: PostsInsightsFeedResponseShareCount](x: Self) {
    
    inline def setTray(value: PostsInsightsFeedResponseTray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
  }
}
