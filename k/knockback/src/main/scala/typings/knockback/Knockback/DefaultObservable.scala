package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultObservable
  extends StObject
     with Destroyable {
  
  def setToDefault(): Any
}
object DefaultObservable {
  
  inline def apply(destroy: () => Any, setToDefault: () => Any): DefaultObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setToDefault = js.Any.fromFunction0(setToDefault))
    __obj.asInstanceOf[DefaultObservable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultObservable] (val x: Self) extends AnyVal {
    
    inline def setSetToDefault(value: () => Any): Self = StObject.set(x, "setToDefault", js.Any.fromFunction0(value))
  }
}
