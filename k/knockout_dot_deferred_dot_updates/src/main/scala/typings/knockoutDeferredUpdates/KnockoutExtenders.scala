package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Deferred extender
trait KnockoutExtenders extends StObject {
  
  def deferred(target: js.Any, value: Boolean): js.Any
}
object KnockoutExtenders {
  
  @scala.inline
  def apply(deferred: (js.Any, Boolean) => js.Any): KnockoutExtenders = {
    val __obj = js.Dynamic.literal(deferred = js.Any.fromFunction2(deferred))
    __obj.asInstanceOf[KnockoutExtenders]
  }
  
  @scala.inline
  implicit class KnockoutExtendersMutableBuilder[Self <: KnockoutExtenders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferred(value: (js.Any, Boolean) => js.Any): Self = StObject.set(x, "deferred", js.Any.fromFunction2(value))
  }
}
