package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ComposeButtonDescriptor extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var hasDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var `type`: js.UndefOr[
    inboxsdkLib.inboxsdkLibStrings.MODIFIER | inboxsdkLib.inboxsdkLibStrings.SEND_ACTION
  ] = js.undefined
  def onClick(event: ComposeButtonClickEvent): scala.Unit
}

