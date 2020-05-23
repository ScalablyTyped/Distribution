package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: Event): Unit
}

object PostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
}

