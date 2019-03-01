package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccessoryDescriptor extends js.Object {
  var `type`: inboxsdkLib.inboxsdkLibStrings.CREATE
  def onClick(): scala.Unit
}

object CreateAccessoryDescriptor {
  @scala.inline
  def apply(onClick: js.Function0[scala.Unit], `type`: inboxsdkLib.inboxsdkLibStrings.CREATE): CreateAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[CreateAccessoryDescriptor]
  }
}

