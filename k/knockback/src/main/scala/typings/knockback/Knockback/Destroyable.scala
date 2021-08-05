package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroyable extends StObject {
  
  def destroy(): js.Any
}
object Destroyable {
  
  inline def apply(destroy: () => js.Any): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyable]
  }
  
  extension [Self <: Destroyable](x: Self) {
    
    inline def setDestroy(value: () => js.Any): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
