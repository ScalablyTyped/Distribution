package typings
package inboxsdkLib.inboxsdkMod.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var hideFor: js.UndefOr[
    js.Function1[/* routeView */ inboxsdkLib.inboxsdkMod.RouterNs.RouteView, scala.Unit]
  ] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var keyboardShortcutHandle: js.UndefOr[inboxsdkLib.inboxsdkMod.KeyboardNs.KeyboardShortcutHandle] = js.undefined
  var listSection: js.UndefOr[SectionNames] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.undefined
  var threadSection: js.UndefOr[SectionNames] = js.undefined
  var title: java.lang.String
  def onClick(event: ToolbarButtonEvent): scala.Unit
}

object ToolbarButtonDescriptor {
  @scala.inline
  def apply(
    onClick: ToolbarButtonEvent => scala.Unit,
    title: java.lang.String,
    hasDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    hideFor: /* routeView */ inboxsdkLib.inboxsdkMod.RouterNs.RouteView => scala.Unit = null,
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    keyboardShortcutHandle: inboxsdkLib.inboxsdkMod.KeyboardNs.KeyboardShortcutHandle = null,
    listSection: SectionNames = null,
    orderHint: scala.Int | scala.Double = null,
    positions: js.Array[ToolbarButtonPosition] = null,
    threadSection: SectionNames = null
  ): ToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title)
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown)
    if (hideFor != null) __obj.updateDynamic("hideFor")(js.Any.fromFunction1(hideFor))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (keyboardShortcutHandle != null) __obj.updateDynamic("keyboardShortcutHandle")(keyboardShortcutHandle)
    if (listSection != null) __obj.updateDynamic("listSection")(listSection)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions)
    if (threadSection != null) __obj.updateDynamic("threadSection")(threadSection)
    __obj.asInstanceOf[ToolbarButtonDescriptor]
  }
}

