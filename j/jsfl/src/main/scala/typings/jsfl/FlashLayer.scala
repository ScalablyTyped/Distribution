package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashLayer extends StObject {
  
  var color: js.Any = js.native
  
  var frameCount: Double = js.native
  
  var frames: js.Array[FlashFrame] = js.native
  
  var height: Double = js.native
  
  var layerType: String = js.native
  
  var locked: Boolean = js.native
  
  var name: String = js.native
  
  var outline: Boolean = js.native
  
  var parentLayer: FlashLayer = js.native
  
  var visible: Boolean = js.native
}
object FlashLayer {
  
  @scala.inline
  def apply(
    color: js.Any,
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
  implicit class FlashLayerMutableBuilder[Self <: FlashLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrames(value: js.Array[FlashFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: FlashFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerType(value: String): Self = StObject.set(x, "layerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLayer(value: FlashLayer): Self = StObject.set(x, "parentLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
