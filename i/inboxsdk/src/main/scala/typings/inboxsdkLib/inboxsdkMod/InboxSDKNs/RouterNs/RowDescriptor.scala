package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDescriptor extends js.Object {
  var body: java.lang.String
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var isRead: java.lang.String
  var labels: js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs.LabelDescriptor]
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var routeID: js.UndefOr[java.lang.String] = js.undefined
  var routeParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var shortDetailText: java.lang.String
  var title: java.lang.String
}

object RowDescriptor {
  @scala.inline
  def apply(
    body: java.lang.String,
    isRead: java.lang.String,
    labels: js.Array[inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs.LabelDescriptor],
    shortDetailText: java.lang.String,
    title: java.lang.String,
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    onClick: js.Function0[scala.Unit] = null,
    routeID: java.lang.String = null,
    routeParams: js.Array[java.lang.String] = null
  ): RowDescriptor = {
    val __obj = js.Dynamic.literal(body = body, isRead = isRead, labels = labels, shortDetailText = shortDetailText, title = title)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (routeID != null) __obj.updateDynamic("routeID")(routeID)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[RowDescriptor]
  }
}

