package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Default[TData] extends js.Object {
  /**
           * When the `.trigger()` method finishes running all the event handlers for an event, it also looks for and runs any method on the target object by the same name unless of the handlers called `event.preventDefault()`. So, `.trigger( "submit" )` will execute the `submit()` method on the element if one exists. When a `_default` hook is specified, the hook is called just prior to checking for and executing the element's default method. If this hook returns the value `false` the element's default method will be called; otherwise it is not.
           * @see \`{@link https://learn.jquery.com/events/event-extensions/#_default-function-event-jquery-event-data-object }\`
           */
  def _default(event: jqueryLib.JQueryNs.TriggeredEvent[_, TData, _, _], data: TData): scala.Unit | jqueryLib.jqueryLibNumbers.`false`
}

