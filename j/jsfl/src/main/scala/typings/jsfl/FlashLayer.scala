package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashLayer extends js.Object {
  
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
  implicit class FlashLayerOps[Self <: FlashLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCount(value: Double): Self = this.set("frameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesVarargs(value: FlashFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[FlashFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerType(value: String): Self = this.set("layerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLayer(value: FlashLayer): Self = this.set("parentLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
