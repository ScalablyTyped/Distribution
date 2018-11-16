package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Add[TTarget, TData] extends js.Object {
  /**
           * Each time an event handler is added to an element through an API such as `.on()`, jQuery calls this hook. The `this` keyword will be the element to which the event handler is being added, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
           * @see \`{@link https://learn.jquery.com/events/event-extensions/#add-function-handleobj }\`
           */
  def add(`this`: TTarget, handleObj: jqueryLib.JQueryNs.HandleObject[TTarget, TData]): scala.Unit
}

