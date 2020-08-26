package typings.inboxsdk.mod.Router

import typings.inboxsdk.mod.Lists.LabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowDescriptor extends js.Object {
  var body: String = js.native
  var iconClass: js.UndefOr[String] = js.native
  var iconHtml: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var isRead: String = js.native
  var labels: js.Array[LabelDescriptor] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var routeID: js.UndefOr[String] = js.native
  var routeParams: js.UndefOr[js.Array[String]] = js.native
  var shortDetailText: String = js.native
  var title: String = js.native
}

object RowDescriptor {
  @scala.inline
  def apply(
    body: String,
    isRead: String,
    labels: js.Array[LabelDescriptor],
    shortDetailText: String,
    title: String
  ): RowDescriptor = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isRead = isRead.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], shortDetailText = shortDetailText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDescriptor]
  }
  @scala.inline
  implicit class RowDescriptorOps[Self <: RowDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRead(value: String): Self = this.set("isRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsVarargs(value: LabelDescriptor*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[LabelDescriptor]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDetailText(value: String): Self = this.set("shortDetailText", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setIconHtml(value: String): Self = this.set("iconHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHtml: Self = this.set("iconHtml", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRouteID(value: String): Self = this.set("routeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteID: Self = this.set("routeID", js.undefined)
    @scala.inline
    def setRouteParamsVarargs(value: String*): Self = this.set("routeParams", js.Array(value :_*))
    @scala.inline
    def setRouteParams(value: js.Array[String]): Self = this.set("routeParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteParams: Self = this.set("routeParams", js.undefined)
  }
  
}

