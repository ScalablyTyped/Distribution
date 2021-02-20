package typings.jquery.anon

import typings.jquery.JQuery.HandleObject
import typings.jquery.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  
  /**
    * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
    */
  def add(handleObj: HandleObject[TTarget, TData]): Unit = js.native
}
object Add {
  
  @scala.inline
  def apply[TTarget, TData](add: HandleObject[TTarget, TData] => Unit): Add[TTarget, TData] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    __obj.asInstanceOf[Add[TTarget, TData]]
  }
  
  @scala.inline
  implicit class AddMutableBuilder[Self <: Add[_, _], TTarget, TData] (val x: Self with (Add[TTarget, TData])) extends AnyVal {
    
    @scala.inline
    def setAdd(value: HandleObject[TTarget, TData] => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
  }
}
