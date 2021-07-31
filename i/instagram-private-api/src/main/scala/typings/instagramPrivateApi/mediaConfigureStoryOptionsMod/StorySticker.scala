package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorySticker extends StObject {
  
  var height: Double
  
  var rotation: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object StorySticker {
  
  @scala.inline
  def apply(height: Double, rotation: Double, width: Double, x: Double, y: Double): StorySticker = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySticker]
  }
  
  @scala.inline
  implicit class StoryStickerMutableBuilder[Self <: StorySticker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
