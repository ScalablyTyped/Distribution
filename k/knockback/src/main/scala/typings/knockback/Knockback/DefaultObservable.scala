package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultObservable extends Destroyable {
  
  def setToDefault(): js.Any = js.native
}
object DefaultObservable {
  
  @scala.inline
  def apply(destroy: () => js.Any, setToDefault: () => js.Any): DefaultObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setToDefault = js.Any.fromFunction0(setToDefault))
    __obj.asInstanceOf[DefaultObservable]
  }
  
  @scala.inline
  implicit class DefaultObservableMutableBuilder[Self <: DefaultObservable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetToDefault(value: () => js.Any): Self = StObject.set(x, "setToDefault", js.Any.fromFunction0(value))
  }
}
