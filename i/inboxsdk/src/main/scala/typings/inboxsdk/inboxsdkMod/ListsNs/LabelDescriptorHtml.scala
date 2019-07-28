package typings.inboxsdk.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptorHtml
  extends LabelDescriptorBase
     with LabelDescriptor {
  var iconHtml: String
}

object LabelDescriptorHtml {
  @scala.inline
  def apply(
    iconHtml: String,
    title: String,
    backgroundColor: String = null,
    foregroundColor: String = null,
    iconBackgroundColor: String = null
  ): LabelDescriptorHtml = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml, title = title)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor)
    __obj.asInstanceOf[LabelDescriptorHtml]
  }
}

