package typings.instagramPrivateApi.locationRepositoryStoryResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRepositoryStoryResponseStoryLocationsItem extends StObject {
  
  var height: String
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var is_sticker: Double
  
  var location: LocationRepositoryStoryResponseLocation
  
  var rotation: Double | String
  
  var width: String | Double
  
  var x: String | Double
  
  var y: String
  
  var z: Double
}
object LocationRepositoryStoryResponseStoryLocationsItem {
  
  inline def apply(
    height: String,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    location: LocationRepositoryStoryResponseLocation,
    rotation: Double | String,
    width: String | Double,
    x: String | Double,
    y: String,
    z: Double
  ): LocationRepositoryStoryResponseStoryLocationsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRepositoryStoryResponseStoryLocationsItem]
  }
  
  extension [Self <: LocationRepositoryStoryResponseStoryLocationsItem](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    inline def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    inline def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationRepositoryStoryResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double | String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: String | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
