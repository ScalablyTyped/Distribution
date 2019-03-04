package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDefault[TTarget, TData]
  extends jqueryLib.JQueryNs._SpecialEventHook[TTarget, TData] {
  /**
    * When the `.trigger()` method finishes running all the event handlers for an event, it also looks for and runs any method on the target object by the same name unless of the handlers called `event.preventDefault()`. So, `.trigger( "submit" )` will execute the `submit()` method on the element if one exists. When a `_default` hook is specified, the hook is called just prior to checking for and executing the element's default method. If this hook returns the value `false` the element's default method will be called; otherwise it is not.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#_default-function-event-jquery-event-data-object }\`
    */
  def _default(event: jqueryLib.JQueryNs.TriggeredEvent[TTarget, TData, _, _], data: TData): scala.Unit | jqueryLib.jqueryLibNumbers.`false`
}

object Anon_DataDefault {
  @scala.inline
  def apply[TTarget, TData](
    _default: js.Function2[
      jqueryLib.JQueryNs.TriggeredEvent[TTarget, TData, _, _], 
      TData, 
      scala.Unit | jqueryLib.jqueryLibNumbers.`false`
    ]
  ): Anon_DataDefault[TTarget, TData] = {
    val __obj = js.Dynamic.literal(_default = _default)
  
    __obj.asInstanceOf[Anon_DataDefault[TTarget, TData]]
  }
}

