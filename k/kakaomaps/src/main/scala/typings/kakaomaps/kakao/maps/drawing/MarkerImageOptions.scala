package typings.kakaomaps.kakao.maps.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerImageOptions extends StObject {
  
  var coords: String
  
  var dragImage: js.Object
  
  var height: Double
  
  var hoverImage: js.Object
  
  var offsetX: Double
  
  var offsetY: Double
  
  var shape: String
  
  var spriteHeight: Double
  
  var spriteOriginX: Double
  
  var spriteOriginY: Double
  
  var spriteWidth: Double
  
  var src: String
  
  var width: Double
}
object MarkerImageOptions {
  
  inline def apply(
    coords: String,
    dragImage: js.Object,
    height: Double,
    hoverImage: js.Object,
    offsetX: Double,
    offsetY: Double,
    shape: String,
    spriteHeight: Double,
    spriteOriginX: Double,
    spriteOriginY: Double,
    spriteWidth: Double,
    src: String,
    width: Double
  ): MarkerImageOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], dragImage = dragImage.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hoverImage = hoverImage.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spriteHeight = spriteHeight.asInstanceOf[js.Any], spriteOriginX = spriteOriginX.asInstanceOf[js.Any], spriteOriginY = spriteOriginY.asInstanceOf[js.Any], spriteWidth = spriteWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerImageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerImageOptions] (val x: Self) extends AnyVal {
    
    inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setDragImage(value: js.Object): Self = StObject.set(x, "dragImage", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHoverImage(value: js.Object): Self = StObject.set(x, "hoverImage", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSpriteHeight(value: Double): Self = StObject.set(x, "spriteHeight", value.asInstanceOf[js.Any])
    
    inline def setSpriteOriginX(value: Double): Self = StObject.set(x, "spriteOriginX", value.asInstanceOf[js.Any])
    
    inline def setSpriteOriginY(value: Double): Self = StObject.set(x, "spriteOriginY", value.asInstanceOf[js.Any])
    
    inline def setSpriteWidth(value: Double): Self = StObject.set(x, "spriteWidth", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
