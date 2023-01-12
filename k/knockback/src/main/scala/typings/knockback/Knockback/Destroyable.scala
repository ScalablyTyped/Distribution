package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroyable extends StObject {
  
  def destroy(): Any
}
object Destroyable {
  
  inline def apply(destroy: () => Any): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Destroyable] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
