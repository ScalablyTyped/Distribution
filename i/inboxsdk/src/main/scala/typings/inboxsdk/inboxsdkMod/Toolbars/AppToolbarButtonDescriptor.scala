package typings.inboxsdk.inboxsdkMod.Toolbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonDescriptor extends js.Object {
  var arrowColor: js.UndefOr[String] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var title: String
  var titleClass: js.UndefOr[String] = js.undefined
  def onClick(event: AppToolbarButtonEvent): Unit
}

object AppToolbarButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    onClick: AppToolbarButtonEvent => Unit,
    title: String,
    arrowColor: String = null,
    iconClass: String = null,
    titleClass: String = null
  ): AppToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = js.Any.fromFunction1(onClick), title = title)
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass)
    __obj.asInstanceOf[AppToolbarButtonDescriptor]
  }
}

