package typings.inboxsdk.inboxsdkMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoleButtonDescriptor extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var title: String
  def onClick(): Unit
}

object MoleButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: () => Unit, title: String, iconClass: String = null): MoleButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = js.Any.fromFunction0(onClick), title = title)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[MoleButtonDescriptor]
  }
}

