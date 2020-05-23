package typings.jquery.anon

import typings.jquery.JQuery.Event
import typings.jquery.JQuery._SpecialEventHook
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: Event): `false` | Unit
}

object PreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: Event => `false` | Unit): PreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[PreDispatch[TTarget]]
  }
}

