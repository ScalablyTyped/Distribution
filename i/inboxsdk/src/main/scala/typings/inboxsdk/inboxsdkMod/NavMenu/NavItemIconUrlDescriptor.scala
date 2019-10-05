package typings.inboxsdk.inboxsdkMod.NavMenu

import typings.inboxsdk.Anon_PreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemIconUrlDescriptor
  extends NavItemDescriptorBase
     with NavItemDescriptor {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
}

object NavItemIconUrlDescriptor {
  @scala.inline
  def apply(
    name: String,
    accessory: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor = null,
    backgroundColor: String = null,
    expanderForegroundColor: String = null,
    iconClass: String = null,
    iconUrl: String = null,
    onClick: /* event */ Anon_PreventDefault => Unit = null,
    orderHint: Int | Double = null,
    routeID: String = null,
    routeParams: js.Object = null,
    `type`: NavItemTypes = null
  ): NavItemIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (accessory != null) __obj.updateDynamic("accessory")(accessory.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (expanderForegroundColor != null) __obj.updateDynamic("expanderForegroundColor")(expanderForegroundColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (routeID != null) __obj.updateDynamic("routeID")(routeID)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavItemIconUrlDescriptor]
  }
}

