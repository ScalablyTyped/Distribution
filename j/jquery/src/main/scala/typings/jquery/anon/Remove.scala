package typings.jquery.anon

import typings.jquery.JQuery.HandleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remove[TTarget, TData] extends StObject {
  
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(handleObj: HandleObject[TTarget, TData]): Unit
}
object Remove {
  
  inline def apply[TTarget, TData](remove: HandleObject[TTarget, TData] => Unit): Remove[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Remove[TTarget, TData]]
  }
  
  extension [Self <: Remove[?, ?], TTarget, TData](x: Self & (Remove[TTarget, TData])) {
    
    inline def setRemove(value: HandleObject[TTarget, TData] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
