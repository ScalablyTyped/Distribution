package typings.inboxsdk.mod.Router

import typings.inboxsdk.mod.Lists.LabelDescriptor
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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], shortDetailText = shortDetailText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconHtml != null) __obj.updateDynamic("iconHtml")(iconHtml.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (routeID != null) __obj.updateDynamic("routeID")(routeID.asInstanceOf[js.Any])
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDescriptor]
  }
}

