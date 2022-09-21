package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Deferred extender
trait KnockoutExtenders extends StObject {
  
  def deferred(target: Any, value: Boolean): Any
}
object KnockoutExtenders {
  
  inline def apply(deferred: (Any, Boolean) => Any): KnockoutExtenders = {
    val __obj = js.Dynamic.literal(deferred = js.Any.fromFunction2(deferred))
    __obj.asInstanceOf[KnockoutExtenders]
  }
  
  extension [Self <: KnockoutExtenders](x: Self) {
    
    inline def setDeferred(value: (Any, Boolean) => Any): Self = StObject.set(x, "deferred", js.Any.fromFunction2(value))
  }
}
