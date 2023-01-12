package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Observables
trait KnockoutSubscribableFunctions[T] extends StObject {
  
  var deferUpdates: Boolean
}
object KnockoutSubscribableFunctions {
  
  inline def apply[T](deferUpdates: Boolean): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutSubscribableFunctions[?], T] (val x: Self & KnockoutSubscribableFunctions[T]) extends AnyVal {
    
    inline def setDeferUpdates(value: Boolean): Self = StObject.set(x, "deferUpdates", value.asInstanceOf[js.Any])
  }
}
