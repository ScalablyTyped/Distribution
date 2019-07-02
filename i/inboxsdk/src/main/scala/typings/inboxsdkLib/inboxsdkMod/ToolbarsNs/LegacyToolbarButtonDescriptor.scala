package typings
package inboxsdkLib.inboxsdkMod.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var hideFor: js.UndefOr[
    js.Function1[/* routeView */ inboxsdkLib.inboxsdkMod.RouterNs.RouteView, scala.Unit]
  ] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var keyboardShortcutHandle: js.UndefOr[inboxsdkLib.inboxsdkMod.KeyboardNs.KeyboardShortcutHandle] = js.undefined
  var section: SectionNames
  var title: java.lang.String
  def onClick(event: LegacyToolbarButtonEvent): scala.Unit
}

object LegacyToolbarButtonDescriptor {
  @scala.inline
  def apply(
    onClick: LegacyToolbarButtonEvent => scala.Unit,
    section: SectionNames,
    title: java.lang.String,
    hasDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    hideFor: /* routeView */ inboxsdkLib.inboxsdkMod.RouterNs.RouteView => scala.Unit = null,
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    keyboardShortcutHandle: inboxsdkLib.inboxsdkMod.KeyboardNs.KeyboardShortcutHandle = null
  ): LegacyToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), section = section, title = title)
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown)
    if (hideFor != null) __obj.updateDynamic("hideFor")(js.Any.fromFunction1(hideFor))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (keyboardShortcutHandle != null) __obj.updateDynamic("keyboardShortcutHandle")(keyboardShortcutHandle)
    __obj.asInstanceOf[LegacyToolbarButtonDescriptor]
  }
}

