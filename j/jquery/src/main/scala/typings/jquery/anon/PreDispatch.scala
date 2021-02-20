package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import typings.jquery.jqueryBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  
  def preDispatch(event: Event): `false` | Unit = js.native
}
object PreDispatch {
  
  @scala.inline
  def apply[TTarget](preDispatch: Event => `false` | Unit): PreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[PreDispatch[TTarget]]
  }
  
  @scala.inline
  implicit class PreDispatchMutableBuilder[Self <: PreDispatch[_], TTarget] (val x: Self with PreDispatch[TTarget]) extends AnyVal {
    
    @scala.inline
    def setPreDispatch(value: Event => `false` | Unit): Self = StObject.set(x, "preDispatch", js.Any.fromFunction1(value))
  }
}
