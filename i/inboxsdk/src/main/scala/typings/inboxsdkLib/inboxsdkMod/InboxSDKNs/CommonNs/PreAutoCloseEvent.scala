package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PreAutoCloseEvent extends js.Object {
  var cause: stdLib.Event
  var `type`: inboxsdkLib.inboxsdkLibStrings.outsideInteraction | inboxsdkLib.inboxsdkLibStrings.escape
  def cancel(): scala.Unit
}

