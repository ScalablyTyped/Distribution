package typings.knockoutDeferredUpdates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Observables
@js.native
trait KnockoutSubscribableFunctions[T] extends StObject {
  
  var deferUpdates: Boolean = js.native
}
object KnockoutSubscribableFunctions {
  
  @scala.inline
  def apply[T](deferUpdates: Boolean): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(deferUpdates = deferUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutSubscribableFunctionsMutableBuilder[Self <: KnockoutSubscribableFunctions[_], T] (val x: Self with KnockoutSubscribableFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setDeferUpdates(value: Boolean): Self = StObject.set(x, "deferUpdates", value.asInstanceOf[js.Any])
  }
}
