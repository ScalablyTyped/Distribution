package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationChild extends StObject {
  
  var animation: Animation
  
  var follow: Boolean
}
object AnimationChild {
  
  inline def apply(animation: Animation, follow: Boolean): AnimationChild = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], follow = follow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationChild]
  }
  
  extension [Self <: AnimationChild](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
  }
}
