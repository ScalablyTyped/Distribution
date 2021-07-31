package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseReelMentionsItem extends StObject {
  
  var height: Double | String
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var rotation: Double
  
  var user: TagFeedResponseUser
  
  var width: Double | String
  
  var x: Double | String
  
  var y: Double | String
  
  var z: Double
}
object TagFeedResponseReelMentionsItem {
  
  @scala.inline
  def apply(
    height: Double | String,
    is_hidden: Double,
    is_pinned: Double,
    rotation: Double,
    user: TagFeedResponseUser,
    width: Double | String,
    x: Double | String,
    y: Double | String,
    z: Double
  ): TagFeedResponseReelMentionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseReelMentionsItem]
  }
  
  @scala.inline
  implicit class TagFeedResponseReelMentionsItemMutableBuilder[Self <: TagFeedResponseReelMentionsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TagFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
