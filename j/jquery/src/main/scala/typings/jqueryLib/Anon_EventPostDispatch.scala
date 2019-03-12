package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventPostDispatch[TTarget]
  extends jqueryLib.JQueryNs._SpecialEventHook[TTarget, js.Any] {
  def postDispatch(`this`: TTarget, event: jqueryLib.JQueryNs.Event): scala.Unit
}

object Anon_EventPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: (TTarget, jqueryLib.JQueryNs.Event) => scala.Unit): Anon_EventPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction2(postDispatch))
  
    __obj.asInstanceOf[Anon_EventPostDispatch[TTarget]]
  }
}

