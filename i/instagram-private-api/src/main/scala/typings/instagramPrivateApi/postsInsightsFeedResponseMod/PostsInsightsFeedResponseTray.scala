package typings.instagramPrivateApi.postsInsightsFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostsInsightsFeedResponseTray extends StObject {
  
  var value: Double
}
object PostsInsightsFeedResponseTray {
  
  inline def apply(value: Double): PostsInsightsFeedResponseTray = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseTray]
  }
  
  extension [Self <: PostsInsightsFeedResponseTray](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
