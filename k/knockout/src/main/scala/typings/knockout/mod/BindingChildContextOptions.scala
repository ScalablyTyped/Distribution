package typings.knockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingChildContextOptions[T] extends StObject {
  
  var as: js.UndefOr[String] = js.undefined
  
  var extend: js.UndefOr[BindingContextExtendCallback[T]] = js.undefined
  
  var noChildContext: js.UndefOr[Boolean] = js.undefined
}
object BindingChildContextOptions {
  
  @scala.inline
  def apply[T](): BindingChildContextOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingChildContextOptions[T]]
  }
  
  @scala.inline
  implicit class BindingChildContextOptionsMutableBuilder[Self <: BindingChildContextOptions[?], T] (val x: Self & BindingChildContextOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setExtend(value: (/* self */ BindingContext[T], /* parentContext */ BindingContext[T] | Null, T) => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setNoChildContext(value: Boolean): Self = StObject.set(x, "noChildContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoChildContextUndefined: Self = StObject.set(x, "noChildContext", js.undefined)
  }
}
