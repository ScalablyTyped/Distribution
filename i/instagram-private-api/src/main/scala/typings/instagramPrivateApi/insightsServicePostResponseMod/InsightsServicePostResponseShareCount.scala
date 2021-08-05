package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServicePostResponseShareCount extends StObject {
  
  var post: InsightsServicePostResponsePost
  
  var tray: InsightsServicePostResponseTray
}
object InsightsServicePostResponseShareCount {
  
  inline def apply(post: InsightsServicePostResponsePost, tray: InsightsServicePostResponseTray): InsightsServicePostResponseShareCount = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseShareCount]
  }
  
  extension [Self <: InsightsServicePostResponseShareCount](x: Self) {
    
    inline def setPost(value: InsightsServicePostResponsePost): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setTray(value: InsightsServicePostResponseTray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
  }
}
