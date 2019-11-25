package typings.inboxsdk.inboxsdkMod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptorBase extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var foregroundColor: js.UndefOr[String] = js.undefined
  var iconBackgroundColor: js.UndefOr[String] = js.undefined
  var title: String
}

object LabelDescriptorBase {
  @scala.inline
  def apply(
    title: String,
    backgroundColor: String = null,
    foregroundColor: String = null,
    iconBackgroundColor: String = null
  ): LabelDescriptorBase = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorBase]
  }
}

