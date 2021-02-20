package typings.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseShareCount extends StObject {
  
  var post: InsightsServicePostResponsePost = js.native
  
  var tray: InsightsServicePostResponseTray = js.native
}
object InsightsServicePostResponseShareCount {
  
  @scala.inline
  def apply(post: InsightsServicePostResponsePost, tray: InsightsServicePostResponseTray): InsightsServicePostResponseShareCount = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseShareCount]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseShareCountMutableBuilder[Self <: InsightsServicePostResponseShareCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPost(value: InsightsServicePostResponsePost): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTray(value: InsightsServicePostResponseTray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
  }
}
