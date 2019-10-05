package typings.inboxsdk.inboxsdkMod.Router

import typings.inboxsdk.inboxsdkMod.Lists.LabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDescriptor extends js.Object {
  var body: String
  var iconClass: js.UndefOr[String] = js.undefined
  var iconHtml: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var isRead: String
  var labels: js.Array[LabelDescriptor]
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var routeID: js.UndefOr[String] = js.undefined
  var routeParams: js.UndefOr[js.Array[String]] = js.undefined
  var shortDetailText: String
  var title: String
}

object RowDescriptor {
  @scala.inline
  def apply(
    body: String,
    isRead: String,
    labels: js.Array[LabelDescriptor],
    shortDetailText: String,
    title: String,
    iconClass: String = null,
    iconHtml: String = null,
    iconUrl: String = null,
    onClick: () => Unit = null,
    routeID: String = null,
    routeParams: js.Array[String] = null
  ): RowDescriptor = {
    val __obj = js.Dynamic.literal(body = body, isRead = isRead, labels = labels, shortDetailText = shortDetailText, title = title)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconHtml != null) __obj.updateDynamic("iconHtml")(iconHtml)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (routeID != null) __obj.updateDynamic("routeID")(routeID)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[RowDescriptor]
  }
}

