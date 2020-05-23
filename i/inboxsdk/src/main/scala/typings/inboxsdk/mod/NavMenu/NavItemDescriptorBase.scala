package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.anon.PreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemDescriptorBase extends js.Object {
  var accessory: js.UndefOr[
    CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
  ] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var expanderForegroundColor: js.UndefOr[String] = js.undefined
  var name: String
  var onClick: js.UndefOr[js.Function1[/* event */ PreventDefault, Unit]] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
  var routeID: js.UndefOr[String] = js.undefined
  var routeParams: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[NavItemTypes] = js.undefined
}

object NavItemDescriptorBase {
  @scala.inline
  def apply(
    name: String,
    accessory: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor = null,
    backgroundColor: String = null,
    expanderForegroundColor: String = null,
    onClick: /* event */ PreventDefault => Unit = null,
    orderHint: js.UndefOr[Double] = js.undefined,
    routeID: String = null,
    routeParams: js.Object = null,
    `type`: NavItemTypes = null
  ): NavItemDescriptorBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (accessory != null) __obj.updateDynamic("accessory")(accessory.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (expanderForegroundColor != null) __obj.updateDynamic("expanderForegroundColor")(expanderForegroundColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(orderHint)) __obj.updateDynamic("orderHint")(orderHint.get.asInstanceOf[js.Any])
    if (routeID != null) __obj.updateDynamic("routeID")(routeID.asInstanceOf[js.Any])
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemDescriptorBase]
  }
}

