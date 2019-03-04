package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonDescriptor extends js.Object {
  var arrowColor: js.UndefOr[java.lang.String] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var title: java.lang.String
  var titleClass: js.UndefOr[java.lang.String] = js.undefined
  def onClick(event: AppToolbarButtonEvent): scala.Unit
}

object AppToolbarButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: js.Function1[AppToolbarButtonEvent, scala.Unit],
    title: java.lang.String,
    arrowColor: java.lang.String = null,
    iconClass: java.lang.String = null,
    titleClass: java.lang.String = null
  ): AppToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = onClick, title = title)
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass)
    __obj.asInstanceOf[AppToolbarButtonDescriptor]
  }
}

