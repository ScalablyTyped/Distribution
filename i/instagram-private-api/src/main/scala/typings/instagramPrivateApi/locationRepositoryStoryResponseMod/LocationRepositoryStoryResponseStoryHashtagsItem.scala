package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseStoryHashtagsItem extends StObject {
  
  var hashtag: LocationRepositoryStoryResponseHashtag
  
  var height: String
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var is_sticker: Double
  
  var rotation: Double
  
  var width: String
  
  var x: String
  
  var y: String
  
  var z: Double
}
object LocationRepositoryStoryResponseStoryHashtagsItem {
  
  inline def apply(
    hashtag: LocationRepositoryStoryResponseHashtag,
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    width: String,
    x: String,
    y: String,
    z: Double
  ): LocationRepositoryStoryResponseStoryHashtagsItem = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseStoryHashtagsItem]
  }
  
  extension [Self <: LocationRepositoryStoryResponseStoryHashtagsItem](x: Self) {
    
    inline def setHashtag(value: LocationRepositoryStoryResponseHashtag): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    inline def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    inline def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
