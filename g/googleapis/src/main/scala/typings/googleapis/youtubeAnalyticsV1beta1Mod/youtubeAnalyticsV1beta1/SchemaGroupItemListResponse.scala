package typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paginated list of grouList resources returned in response to a
  * youtubeAnalytics.groupApi.list request.
  */
@js.native
trait SchemaGroupItemListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[SchemaGroupItem]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object SchemaGroupItemListResponse {
  @scala.inline
  def apply(): SchemaGroupItemListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItemListResponse]
  }
  @scala.inline
  implicit class SchemaGroupItemListResponseOps[Self <: SchemaGroupItemListResponse] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaGroupItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaGroupItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

