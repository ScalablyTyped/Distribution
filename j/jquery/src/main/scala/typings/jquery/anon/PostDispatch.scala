package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  
  def postDispatch(event: Event): Unit = js.native
}
object PostDispatch {
  
  @scala.inline
  def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
  
  @scala.inline
  implicit class PostDispatchMutableBuilder[Self <: PostDispatch[_], TTarget] (val x: Self with PostDispatch[TTarget]) extends AnyVal {
    
    @scala.inline
    def setPostDispatch(value: Event => Unit): Self = StObject.set(x, "postDispatch", js.Any.fromFunction1(value))
  }
}
