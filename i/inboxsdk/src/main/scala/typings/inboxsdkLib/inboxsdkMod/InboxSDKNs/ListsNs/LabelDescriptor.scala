package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  var iconBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var title: java.lang.String
}

object LabelDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    title: java.lang.String,
    backgroundColor: java.lang.String = null,
    foregroundColor: java.lang.String = null,
    iconBackgroundColor: java.lang.String = null,
    iconClass: java.lang.String = null
  ): LabelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("title")(title)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[LabelDescriptor]
  }
}

