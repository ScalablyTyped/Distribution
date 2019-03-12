package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleObj[TTarget, TData]
  extends jqueryLib.JQueryNs._SpecialEventHook[TTarget, TData] {
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(`this`: TTarget, handleObj: jqueryLib.JQueryNs.HandleObject[TTarget, TData]): scala.Unit
}

object Anon_HandleObj {
  @scala.inline
  def apply[TTarget, TData](remove: (TTarget, jqueryLib.JQueryNs.HandleObject[TTarget, TData]) => scala.Unit): Anon_HandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[Anon_HandleObj[TTarget, TData]]
  }
}

