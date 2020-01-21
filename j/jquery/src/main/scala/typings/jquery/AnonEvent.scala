package typings.jquery

import typings.jquery.JQuery_._SpecialEventHook
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: typings.jquery.JQuery_.Event): `false` | Unit
}

object AnonEvent {
  @scala.inline
  def apply[TTarget](preDispatch: typings.jquery.JQuery_.Event => `false` | Unit): AnonEvent[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
  
    __obj.asInstanceOf[AnonEvent[TTarget]]
  }
}

