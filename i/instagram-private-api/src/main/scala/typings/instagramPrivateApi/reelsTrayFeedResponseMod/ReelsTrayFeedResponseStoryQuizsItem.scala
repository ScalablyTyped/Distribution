package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseStoryQuizsItem extends StObject {
  
  var height: Double
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var is_sticker: Double
  
  var quiz_sticker: ReelsTrayFeedResponseQuizSticker
  
  var rotation: String
  
  var width: Double
  
  var x: String
  
  var y: Double
  
  var z: Double
}
object ReelsTrayFeedResponseStoryQuizsItem {
  
  inline def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    quiz_sticker: ReelsTrayFeedResponseQuizSticker,
    rotation: String,
    width: Double,
    x: String,
    y: Double,
    z: Double
  ): ReelsTrayFeedResponseStoryQuizsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], quiz_sticker = quiz_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseStoryQuizsItem]
  }
  
  extension [Self <: ReelsTrayFeedResponseStoryQuizsItem](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    inline def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    inline def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    inline def setQuiz_sticker(value: ReelsTrayFeedResponseQuizSticker): Self = StObject.set(x, "quiz_sticker", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
