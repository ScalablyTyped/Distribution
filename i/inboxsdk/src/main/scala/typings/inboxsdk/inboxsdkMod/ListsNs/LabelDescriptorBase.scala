package typings.inboxsdk.inboxsdkMod.ListsNs

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
    val __obj = js.Dynamic.literal(title = title)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor)
    __obj.asInstanceOf[LabelDescriptorBase]
  }
}

