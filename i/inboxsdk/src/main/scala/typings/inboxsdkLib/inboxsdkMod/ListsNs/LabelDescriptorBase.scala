package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDescriptorBase extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var foregroundColor: js.UndefOr[java.lang.String] = js.undefined
  var iconBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object LabelDescriptorBase {
  @scala.inline
  def apply(
    title: java.lang.String,
    backgroundColor: java.lang.String = null,
    foregroundColor: java.lang.String = null,
    iconBackgroundColor: java.lang.String = null
  ): LabelDescriptorBase = {
    val __obj = js.Dynamic.literal(title = title)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (iconBackgroundColor != null) __obj.updateDynamic("iconBackgroundColor")(iconBackgroundColor)
    __obj.asInstanceOf[LabelDescriptorBase]
  }
}

