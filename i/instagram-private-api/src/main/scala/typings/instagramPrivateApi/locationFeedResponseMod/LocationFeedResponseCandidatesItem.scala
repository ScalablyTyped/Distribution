package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseCandidatesItem extends StObject {
  
  var height: Double
  
  var url: String
  
  var width: Double
}
object LocationFeedResponseCandidatesItem {
  
  @scala.inline
  def apply(height: Double, url: String, width: Double): LocationFeedResponseCandidatesItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationFeedResponseCandidatesItem]
  }
  
  @scala.inline
  implicit class LocationFeedResponseCandidatesItemMutableBuilder[Self <: LocationFeedResponseCandidatesItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
