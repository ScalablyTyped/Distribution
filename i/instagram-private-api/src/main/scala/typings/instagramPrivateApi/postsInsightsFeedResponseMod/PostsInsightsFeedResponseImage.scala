package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseImage extends StObject {
  
  var uri: String
}
object PostsInsightsFeedResponseImage {
  
  inline def apply(uri: String): PostsInsightsFeedResponseImage = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseImage]
  }
  
  extension [Self <: PostsInsightsFeedResponseImage](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
