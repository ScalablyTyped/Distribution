package typings.inboxsdk.inboxsdkMod.Common

import typings.inboxsdk.inboxsdkStrings.escape
import typings.inboxsdk.inboxsdkStrings.outsideInteraction
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAutoCloseEvent extends js.Object {
  var cause: Event
  var `type`: outsideInteraction | escape
  def cancel(): Unit
}

object PreAutoCloseEvent {
  @scala.inline
  def apply(cancel: () => Unit, cause: Event, `type`: outsideInteraction | escape): PreAutoCloseEvent = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cause = cause.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAutoCloseEvent]
  }
}

