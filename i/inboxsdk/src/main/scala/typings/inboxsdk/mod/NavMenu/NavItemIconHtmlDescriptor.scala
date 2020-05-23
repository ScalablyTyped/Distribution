package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.anon.PreventDefault
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemIconHtmlDescriptor
  extends NavItemDescriptorBase
     with NavItemDescriptor {
  var iconElement: js.UndefOr[HTMLElement] = js.undefined
}

object NavItemIconHtmlDescriptor {
  @scala.inline
  def apply(
    name: String,
    accessory: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor = null,
    backgroundColor: String = null,
    expanderForegroundColor: String = null,
    iconElement: HTMLElement = null,
    onClick: /* event */ PreventDefault => Unit = null,
    orderHint: js.UndefOr[Double] = js.undefined,
    routeID: String = null,
    routeParams: js.Object = null,
    `type`: NavItemTypes = null
  ): NavItemIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (accessory != null) __obj.updateDynamic("accessory")(accessory.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (expanderForegroundColor != null) __obj.updateDynamic("expanderForegroundColor")(expanderForegroundColor.asInstanceOf[js.Any])
    if (iconElement != null) __obj.updateDynamic("iconElement")(iconElement.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(orderHint)) __obj.updateDynamic("orderHint")(orderHint.get.asInstanceOf[js.Any])
    if (routeID != null) __obj.updateDynamic("routeID")(routeID.asInstanceOf[js.Any])
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemIconHtmlDescriptor]
  }
}

