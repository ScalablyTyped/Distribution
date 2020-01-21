package typings.inboxsdk.mod.Widgets

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
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoleButtonDescriptor]
  }
}

