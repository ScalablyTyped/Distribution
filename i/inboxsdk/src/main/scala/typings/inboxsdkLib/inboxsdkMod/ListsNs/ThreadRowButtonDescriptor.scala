package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var title: java.lang.String
  def onClick(event: ThreadRowButtonClickEvent): scala.Unit
}

object ThreadRowButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: ThreadRowButtonClickEvent => scala.Unit,
    title: java.lang.String,
    hasDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    iconClass: java.lang.String = null
  ): ThreadRowButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = js.Any.fromFunction1(onClick), title = title)
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    __obj.asInstanceOf[ThreadRowButtonDescriptor]
  }
}

