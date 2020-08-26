package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaChannelSectionListResponse extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Serialized EventId of the request which produced this response.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * A list of ChannelSections that match the request criteria.
    */
  var items: js.UndefOr[js.Array[SchemaChannelSection]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelSectionListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The visitorId identifies the visitor.
    */
  var visitorId: js.UndefOr[String] = js.native
}

object SchemaChannelSectionListResponse {
  @scala.inline
  def apply(): SchemaChannelSectionListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionListResponse]
  }
  @scala.inline
  implicit class SchemaChannelSectionListResponseOps[Self <: SchemaChannelSectionListResponse] (val x: Self) extends AnyVal {
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
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaChannelSection*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaChannelSection]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setVisitorId(value: String): Self = this.set("visitorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisitorId: Self = this.set("visitorId", js.undefined)
  }
  
}

