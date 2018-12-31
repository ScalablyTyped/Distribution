package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var hideFor: js.UndefOr[
    js.Function1[/* routeView */ inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs.RouteView, scala.Unit]
  ] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var keyboardShortcutHandle: js.UndefOr[inboxsdkLib.inboxsdkMod.InboxSDKNs.KeyboardNs.KeyboardShortcutHandle] = js.undefined
  var listSection: js.UndefOr[SectionNames] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.undefined
  var threadSection: js.UndefOr[SectionNames] = js.undefined
  var title: java.lang.String
  def onClick(event: ToolbarButtonEvent): scala.Unit
}

