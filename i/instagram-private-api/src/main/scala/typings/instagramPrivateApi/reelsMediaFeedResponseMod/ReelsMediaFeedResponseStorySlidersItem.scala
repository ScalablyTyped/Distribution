package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseStorySlidersItem extends StObject {
  
  var height: Double
  
  var is_hidden: Double
  
  var is_pinned: Double
  
  var is_sticker: Double
  
  var rotation: Double
  
  var slider_sticker: ReelsMediaFeedResponseSliderSticker
  
  var width: Double
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object ReelsMediaFeedResponseStorySlidersItem {
  
  @scala.inline
  def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    rotation: Double,
    slider_sticker: ReelsMediaFeedResponseSliderSticker,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ReelsMediaFeedResponseStorySlidersItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], slider_sticker = slider_sticker.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseStorySlidersItem]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseStorySlidersItemMutableBuilder[Self <: ReelsMediaFeedResponseStorySlidersItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_hidden(value: Double): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pinned(value: Double): Self = StObject.set(x, "is_pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_sticker(value: Double): Self = StObject.set(x, "is_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider_sticker(value: ReelsMediaFeedResponseSliderSticker): Self = StObject.set(x, "slider_sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
