package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashLayer extends StObject {
  
  var color: Any
  
  var frameCount: Double
  
  var frames: js.Array[FlashFrame]
  
  var height: Double
  
  var layerType: String
  
  var locked: Boolean
  
  var name: String
  
  var outline: Boolean
  
  var parentLayer: FlashLayer
  
  var visible: Boolean
}
object FlashLayer {
  
  inline def apply(
    color: Any,
    frameCount: Double,
    frames: js.Array[FlashFrame],
    height: Double,
    layerType: String,
    locked: Boolean,
    name: String,
    outline: Boolean,
    parentLayer: FlashLayer,
    visible: Boolean
  ): FlashLayer = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layerType = layerType.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], parentLayer = parentLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashLayer] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setFrames(value: js.Array[FlashFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesVarargs(value: FlashFrame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setParentLayer(value: FlashLayer): Self = StObject.set(x, "parentLayer", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
