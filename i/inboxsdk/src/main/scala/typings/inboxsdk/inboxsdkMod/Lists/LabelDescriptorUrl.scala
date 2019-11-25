package typings.inboxsdk.inboxsdkMod.Lists

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
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
}

