package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group item.
  */
@js.native
trait SchemaGroupItem extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * The Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the group that contains the
    * item.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the `channel`, `video`,
    * `playlist`, or `asset` resource that is included in the group. Note that
    * this ID refers specifically to the inclusion of that resource in a
    * particular group and is different than the channel ID, video ID, playlist
    * ID, or asset ID that uniquely identifies the resource itself. The
    * `resource.id` property&#39;s value specifies the unique channel, video,
    * playlist, or asset ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the API resource&#39;s type. The value will be
    * `youtube#groupItem`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The `resource` object contains information that identifies the item being
    * added to the group.
    */
  var resource: js.UndefOr[SchemaGroupItemResource] = js.native
}

object SchemaGroupItem {
  @scala.inline
  def apply(): SchemaGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItem]
  }
  @scala.inline
  implicit class SchemaGroupItemOps[Self <: SchemaGroupItem] (val x: Self) extends AnyVal {
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
    def setErrors(value: SchemaErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setResource(value: SchemaGroupItemResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

