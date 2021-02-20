package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseVideoVersionsItem extends StObject {
  
  var height: Double = js.native
  
  var id: String = js.native
  
  var `type`: Double = js.native
  
  var url: String = js.native
  
  var width: Double = js.native
}
object ReelsMediaFeedResponseVideoVersionsItem {
  
  @scala.inline
  def apply(height: Double, id: String, `type`: Double, url: String, width: Double): ReelsMediaFeedResponseVideoVersionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseVideoVersionsItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseVideoVersionsItemMutableBuilder[Self <: ReelsMediaFeedResponseVideoVersionsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
