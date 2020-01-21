package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typings.inboxsdk.mod.Router.RouteView
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
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.asInstanceOf[js.Any])
    if (hideFor != null) __obj.updateDynamic("hideFor")(js.Any.fromFunction1(hideFor))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (keyboardShortcutHandle != null) __obj.updateDynamic("keyboardShortcutHandle")(keyboardShortcutHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyToolbarButtonDescriptor]
  }
}

