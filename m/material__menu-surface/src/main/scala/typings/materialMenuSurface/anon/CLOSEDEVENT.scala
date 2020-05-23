package typings.materialMenuSurface.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLOSEDEVENT extends js.Object {
  var CLOSED_EVENT: String
  var FOCUSABLE_ELEMENTS: String
  var OPENED_EVENT: String
}

object CLOSEDEVENT {
  @scala.inline
  def apply(CLOSED_EVENT: String, FOCUSABLE_ELEMENTS: String, OPENED_EVENT: String): CLOSEDEVENT = {
    val __obj = js.Dynamic.literal(CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], FOCUSABLE_ELEMENTS = FOCUSABLE_ELEMENTS.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLOSEDEVENT]
  }
}

