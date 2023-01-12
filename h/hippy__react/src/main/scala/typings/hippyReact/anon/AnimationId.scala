package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationId extends StObject {
  
  var animationId: Double
}
object AnimationId {
  
  inline def apply(animationId: Double): AnimationId = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationId] (val x: Self) extends AnyVal {
    
    inline def setAnimationId(value: Double): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
  }
}
