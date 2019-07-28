package typings.inboxsdk.inboxsdkMod.NavMenuNs

import typings.inboxsdk.inboxsdkStrings.ICON_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonAccessoryDescriptor extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var `type`: ICON_BUTTON
  def onClick(): Unit
}

object IconButtonAccessoryDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: () => Unit, `type`: ICON_BUTTON, iconClass: String = null): IconButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = js.Any.fromFunction0(onClick))
    __obj.updateDynamic("type")(`type`)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[IconButtonAccessoryDescriptor]
  }
}

