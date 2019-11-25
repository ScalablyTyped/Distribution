package typings.inboxsdk.inboxsdkMod.Conversations

import typings.inboxsdk.inboxsdkStrings.MORE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageViewToolbarButtonDescriptor extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var orderHint: Double
  var section: MORE
  var title: String
  def onClick(): Unit
}

object MessageViewToolbarButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    onClick: () => Unit,
    orderHint: Double,
    section: MORE,
    title: String,
    iconClass: String = null
  ): MessageViewToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), orderHint = orderHint.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewToolbarButtonDescriptor]
  }
}

