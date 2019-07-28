package typings.inboxsdk.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptorUrl
  extends LabelDescriptorBase
     with LabelDescriptor {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
}

object LabelDescriptorUrl {
  @scala.inline
  def apply(
    iconUrl: String,
    title: String,
    backgroundColor: String = null,
    foregroundColor: String = null,
    iconBackgroundColor: String = null,
    iconClass: String = null
  ): LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, title = title)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
}

