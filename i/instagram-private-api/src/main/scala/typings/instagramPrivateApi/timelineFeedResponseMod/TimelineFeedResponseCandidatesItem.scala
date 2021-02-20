package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseCandidatesItem extends StObject {
  
  var height: Double = js.native
  
  var url: String = js.native
  
  var width: Double = js.native
}
object TimelineFeedResponseCandidatesItem {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): TimelineFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseCandidatesItem]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseCandidatesItemMutableBuilder[Self <: TimelineFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
