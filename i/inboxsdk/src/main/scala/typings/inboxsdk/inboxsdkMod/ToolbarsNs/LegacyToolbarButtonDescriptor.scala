package typings.inboxsdk.inboxsdkMod.ToolbarsNs

import typings.inboxsdk.inboxsdkMod.KeyboardNs.KeyboardShortcutHandle
import typings.inboxsdk.inboxsdkMod.RouterNs.RouteView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.undefined
  var section: SectionNames
  var title: String
  def onClick(event: LegacyToolbarButtonEvent): Unit
}

object LegacyToolbarButtonDescriptor {
  @scala.inline
  def apply(
    onClick: LegacyToolbarButtonEvent => Unit,
    section: SectionNames,
    title: String,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    hideFor: /* routeView */ RouteView => Unit = null,
    iconClass: String = null,
    iconUrl: String = null,
    keyboardShortcutHandle: KeyboardShortcutHandle = null
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

