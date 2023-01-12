package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Keyframe extends StObject {
    
    var keyframe: FlashFrame
    
    var layer: FlashLayer
    
    var parent: Any
    
    var timeline: FlashTimeline
  }
  object Keyframe {
    
    inline def apply(keyframe: FlashFrame, layer: FlashLayer, parent: Any, timeline: FlashTimeline): Keyframe = {
      val __obj = js.Dynamic.literal(keyframe = keyframe.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyframe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Keyframe] (val x: Self) extends AnyVal {
      
      inline def setKeyframe(value: FlashFrame): Self = StObject.set(x, "keyframe", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: FlashLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: FlashTimeline): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
}
