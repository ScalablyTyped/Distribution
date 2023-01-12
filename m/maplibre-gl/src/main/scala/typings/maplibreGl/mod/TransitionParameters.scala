package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionParameters extends StObject {
  
  var now: TimePoint
  
  var transition: TransitionSpecification
}
object TransitionParameters {
  
  inline def apply(now: TimePoint, transition: TransitionSpecification): TransitionParameters = {
    val __obj = js.Dynamic.literal(now = now.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionParameters] (val x: Self) extends AnyVal {
    
    inline def setNow(value: TimePoint): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: TransitionSpecification): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
