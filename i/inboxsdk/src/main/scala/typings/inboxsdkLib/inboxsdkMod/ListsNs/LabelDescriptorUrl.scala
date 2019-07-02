package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptorUrl
  extends LabelDescriptorBase
     with LabelDescriptor {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
}

object LabelDescriptorUrl {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    title: java.lang.String,
    backgroundColor: java.lang.String = null,
    foregroundColor: java.lang.String = null,
    iconBackgroundColor: java.lang.String = null,
    iconClass: java.lang.String = null
  ): LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, title = title)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[LabelDescriptorUrl]
  }
}

