package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typings.inboxsdk.mod.Router.RouteView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.undefined
  var listSection: js.UndefOr[SectionNames] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
  var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.undefined
  var threadSection: js.UndefOr[SectionNames] = js.undefined
  var title: String
  def onClick(event: ToolbarButtonEvent): Unit
}

object ToolbarButtonDescriptor {
  @scala.inline
  def apply(
    onClick: ToolbarButtonEvent => Unit,
    title: String,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    hideFor: /* routeView */ RouteView => Unit = null,
    iconClass: String = null,
    iconUrl: String = null,
    keyboardShortcutHandle: KeyboardShortcutHandle = null,
    listSection: SectionNames = null,
    orderHint: js.UndefOr[Double] = js.undefined,
    positions: js.Array[ToolbarButtonPosition] = null,
    threadSection: SectionNames = null
  ): ToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.get.asInstanceOf[js.Any])
    if (hideFor != null) __obj.updateDynamic("hideFor")(js.Any.fromFunction1(hideFor))
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (keyboardShortcutHandle != null) __obj.updateDynamic("keyboardShortcutHandle")(keyboardShortcutHandle.asInstanceOf[js.Any])
    if (listSection != null) __obj.updateDynamic("listSection")(listSection.asInstanceOf[js.Any])
    if (!js.isUndefined(orderHint)) __obj.updateDynamic("orderHint")(orderHint.get.asInstanceOf[js.Any])
    if (positions != null) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (threadSection != null) __obj.updateDynamic("threadSection")(threadSection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonDescriptor]
  }
}

