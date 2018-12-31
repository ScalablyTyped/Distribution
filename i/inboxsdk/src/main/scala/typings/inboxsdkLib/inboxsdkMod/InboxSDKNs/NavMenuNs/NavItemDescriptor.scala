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

