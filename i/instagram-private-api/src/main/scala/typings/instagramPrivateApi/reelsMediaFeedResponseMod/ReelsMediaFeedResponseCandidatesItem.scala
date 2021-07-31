package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseCandidatesItem extends StObject {
  
  var height: Double
  
  var url: String
  
  var width: Double
}
object ReelsMediaFeedResponseCandidatesItem {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): ReelsMediaFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseCandidatesItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseCandidatesItemMutableBuilder[Self <: ReelsMediaFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
