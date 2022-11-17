package typings.jquery.anon

import typings.jquery.JQuery.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDispatch[TTarget] extends StObject {
  
  def postDispatch(event: Event): Unit
}
object PostDispatch {
  
  inline def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
  
  extension [Self <: PostDispatch[?], TTarget](x: Self & PostDispatch[TTarget]) {
    
    inline def setPostDispatch(value: Event => Unit): Self = StObject.set(x, "postDispatch", js.Any.fromFunction1(value))
  }
}
