package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemDescriptor extends js.Object {
  var accessory: js.UndefOr[
    CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
  ] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var expanderForegroundColor: js.UndefOr[java.lang.String] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var onClick: js.UndefOr[js.Function1[/* event */ inboxsdkLib.Anon_PreventDefault, scala.Unit]] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var routeID: js.UndefOr[java.lang.String] = js.undefined
  var routeParams: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[NavItemTypes] = js.undefined
}

object NavItemDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    accessory: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor = null,
    backgroundColor: java.lang.String = null,
    expanderForegroundColor: java.lang.String = null,
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    onClick: js.Function1[/* event */ inboxsdkLib.Anon_PreventDefault, scala.Unit] = null,
    orderHint: scala.Int | scala.Double = null,
    routeID: java.lang.String = null,
    routeParams: js.Object = null,
    `type`: NavItemTypes = null
  ): NavItemDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (accessory != null) __obj.updateDynamic("accessory")(accessory.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (expanderForegroundColor != null) __obj.updateDynamic("expanderForegroundColor")(expanderForegroundColor)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    if (routeID != null) __obj.updateDynamic("routeID")(routeID)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavItemDescriptor]
  }
}

