package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedObservable extends StObject {
  
  def destroy(): Any
  
  def observedValue(value: Any): Any
  
  def resetToCurrent(): Any
}
object LocalizedObservable {
  
  inline def apply(destroy: () => Any, observedValue: Any => Any, resetToCurrent: () => Any): LocalizedObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), observedValue = js.Any.fromFunction1(observedValue), resetToCurrent = js.Any.fromFunction0(resetToCurrent))
    __obj.asInstanceOf[LocalizedObservable]
  }
  
  extension [Self <: LocalizedObservable](x: Self) {
    
    inline def setDestroy(value: () => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setObservedValue(value: Any => Any): Self = StObject.set(x, "observedValue", js.Any.fromFunction1(value))
    
    inline def setResetToCurrent(value: () => Any): Self = StObject.set(x, "resetToCurrent", js.Any.fromFunction0(value))
  }
}
