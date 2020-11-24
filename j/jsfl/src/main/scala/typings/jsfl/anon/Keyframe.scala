package typings.jsfl.anon

import typings.jsfl.FlashFrame
import typings.jsfl.FlashLayer
import typings.jsfl.FlashTimeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyframe extends js.Object {
  
  var keyframe: FlashFrame = js.native
  
  var layer: FlashLayer = js.native
  
  var parent: js.Any = js.native
  
  var timeline: FlashTimeline = js.native
}
object Keyframe {
  
  @scala.inline
  def apply(keyframe: FlashFrame, layer: FlashLayer, parent: js.Any, timeline: FlashTimeline): Keyframe = {
    val __obj = js.Dynamic.literal(keyframe = keyframe.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframe]
  }
  
  @scala.inline
  implicit class KeyframeOps[Self <: Keyframe] (val x: Self) extends AnyVal {
    
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
    def setKeyframe(value: FlashFrame): Self = this.set("keyframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: FlashLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline(value: FlashTimeline): Self = this.set("timeline", value.asInstanceOf[js.Any])
  }
}
