package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageViewToolbarButtonDescriptor extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var orderHint: scala.Double
  var section: inboxsdkLib.inboxsdkLibStrings.MORE
  var title: java.lang.String
  def onClick(): scala.Unit
}

object MessageViewToolbarButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: js.Function0[scala.Unit],
    orderHint: scala.Double,
    section: inboxsdkLib.inboxsdkLibStrings.MORE,
    title: java.lang.String,
    iconClass: java.lang.String = null
  ): MessageViewToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("orderHint")(orderHint)
    __obj.updateDynamic("section")(section)
    __obj.updateDynamic("title")(title)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[MessageViewToolbarButtonDescriptor]
  }
}

