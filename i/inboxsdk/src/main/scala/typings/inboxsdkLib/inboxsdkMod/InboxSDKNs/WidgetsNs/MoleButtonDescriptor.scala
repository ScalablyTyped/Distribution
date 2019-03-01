package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoleButtonDescriptor extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var title: java.lang.String
  def onClick(): scala.Unit
}

object MoleButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: js.Function0[scala.Unit],
    title: java.lang.String,
    iconClass: java.lang.String = null
  ): MoleButtonDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("title")(title)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[MoleButtonDescriptor]
  }
}

