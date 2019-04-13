package typings
package inboxsdkLib.inboxsdkMod.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAutoCloseEvent extends js.Object {
  var cause: stdLib.Event
  var `type`: inboxsdkLib.inboxsdkLibStrings.outsideInteraction | inboxsdkLib.inboxsdkLibStrings.escape
  def cancel(): scala.Unit
}

object PreAutoCloseEvent {
  @scala.inline
  def apply(
    cancel: () => scala.Unit,
    cause: stdLib.Event,
    `type`: inboxsdkLib.inboxsdkLibStrings.outsideInteraction | inboxsdkLib.inboxsdkLibStrings.escape
  ): PreAutoCloseEvent = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cause = cause)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAutoCloseEvent]
  }
}

