package typings
package inboxsdkLib.inboxsdkMod.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemIconUrlDescriptor
  extends NavItemDescriptorBase
     with NavItemDescriptor {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
}

object NavItemIconUrlDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    accessory: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor = null,
    backgroundColor: java.lang.String = null,
    expanderForegroundColor: java.lang.String = null,
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    onClick: /* event */ inboxsdkLib.Anon_PreventDefault => scala.Unit = null,
    orderHint: scala.Int | scala.Double = null,
    routeID: java.lang.String = null,
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

