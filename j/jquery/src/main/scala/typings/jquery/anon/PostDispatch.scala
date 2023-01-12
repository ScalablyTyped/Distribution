package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDispatch[TTarget]
  extends StObject
     with _SpecialEventHook[TTarget, Any] {
  
  def postDispatch(event: Event): Unit
}
object PostDispatch {
  
  inline def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostDispatch[?], TTarget] (val x: Self & PostDispatch[TTarget]) extends AnyVal {
    
    inline def setPostDispatch(value: Event => Unit): Self = StObject.set(x, "postDispatch", js.Any.fromFunction1(value))
  }
}
