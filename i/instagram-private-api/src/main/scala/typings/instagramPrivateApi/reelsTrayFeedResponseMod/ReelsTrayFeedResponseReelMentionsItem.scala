package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseReelMentionsItem extends StObject {
  
  var display_type: String
  
  var height: Double | String
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var is_sticker: Double
  
  var rotation: String | Double
  
  var user: ReelsTrayFeedResponseUser
  
  var width: Double
  
  var x: Double
  
  var y: String | Double
  
  var z: Double
}
object ReelsTrayFeedResponseReelMentionsItem {
  
  inline def apply(
    display_type: String,
    height: Double | String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: String | Double,
    user: ReelsTrayFeedResponseUser,
    width: Double,
    x: Double,
    y: String | Double,
    z: Double
  ): ReelsTrayFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(display_type = display_type.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseReelMentionsItem]
  }
  
  extension [Self <: ReelsTrayFeedResponseReelMentionsItem](x: Self) {
    
    inline def setDisplay_type(value: String): Self = StObject.set(x, "display_type", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    inline def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    inline def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: String | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setUser(value: ReelsTrayFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
