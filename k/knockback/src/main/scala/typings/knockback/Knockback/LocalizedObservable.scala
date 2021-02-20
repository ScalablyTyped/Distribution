package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizedObservable extends StObject {
  
  def destroy(): js.Any = js.native
  
  def observedValue(value: js.Any): js.Any = js.native
  
  def resetToCurrent(): js.Any = js.native
}
object LocalizedObservable {
  
  @scala.inline
  def apply(destroy: () => js.Any, observedValue: js.Any => js.Any, resetToCurrent: () => js.Any): LocalizedObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), observedValue = js.Any.fromFunction1(observedValue), resetToCurrent = js.Any.fromFunction0(resetToCurrent))
    __obj.asInstanceOf[LocalizedObservable]
  }
  
  @scala.inline
  implicit class LocalizedObservableMutableBuilder[Self <: LocalizedObservable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObservedValue(value: js.Any => js.Any): Self = StObject.set(x, "observedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetToCurrent(value: () => js.Any): Self = StObject.set(x, "resetToCurrent", js.Any.fromFunction0(value))
  }
}
